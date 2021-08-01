package com.example.learnnquiz.Profesor;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.learnnquiz.R;


public class ParticipantAdapt extends ArrayAdapter {
    private final Context context;
    private final ArrayList<ParticipantAdaptVal> values;

    public ParticipantAdapt(Context context, ArrayList<ParticipantAdaptVal> values) {
        super(context, R.layout.participant_item,values);
        this.values=values;
        this.context=context;
    }



    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.participant_item, parent, false);
        TextView nume = (TextView) rowView.findViewById(R.id.participantListItem_nume);
        nume.setText(values.get(position).nume);
        TextView email = (TextView) rowView.findViewById(R.id.participantListItem_email);
        email.setText(values.get(position).email);
        email.setLongClickable(true);
        email.setOnLongClickListener(new TextView.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto",values.get(position).email,null));
                context.startActivity(emailIntent);
                return true;
            }
        });



        return rowView;
    }

    public void remove(int position){
        Log.v("ClasaAdapt", "removing " + values.get(position));
        values.remove(position);
        this.notifyDataSetChanged();
    }


    static class ParticipantAdaptVal implements Parcelable {
        int id;
        String nume;
        String email;


        public ParticipantAdaptVal(int id, String nume, String email){
            this.id=id;
            this.nume = nume;
            this.email=email;

        }

        private ParticipantAdaptVal(Parcel in){
            id=in.readInt();
            nume =in.readString();
            email=in.readString();

        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(id);
            dest.writeString(nume);
            dest.writeString(email);


        }
        public static final Parcelable.Creator<ParticipantAdaptVal> CREATOR
                = new Parcelable.Creator<ParticipantAdaptVal>() {
            public ParticipantAdaptVal createFromParcel(Parcel in) {
                return new ParticipantAdaptVal(in);
            }

            public ParticipantAdaptVal[] newArray(int size) {
                return new ParticipantAdaptVal[size];
            }
        };
    }
}
