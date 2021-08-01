package com.example.learnnquiz.Profesor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.learnnquiz.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class ClasaAdapt extends ArrayAdapter {
    private final Context context;
    private final ArrayList<ClasaAdaptVal> val;

    public ClasaAdapt(Context context, ArrayList<ClasaAdaptVal> val) {
        super(context, R.layout.clasa_item, val);
        this.context = context;
        this.val = val;

<<<<<<< HEAD
        Collections.sort(val,new ClassAdapterValuesTimeComparator());
=======
        Collections.sort(val,new ClasaAdaptValTimeComparator());
>>>>>>> 2c82b41... LNQ
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.clasa_item, parent, false);
        TextView titlu = (TextView) rowView.findViewById(R.id.clasatitlu);
        titlu.setText(val.get(position).titlu);
        TextView startTime = (TextView) rowView.findViewById(R.id.clasaInceput);
        startTime.setText(val.get(position).startTime);
        TextView endTime = (TextView) rowView.findViewById(R.id.clasaSfarsit);
        endTime.setText(val.get(position).endTime);


        return rowView;
    }

    public void remove(int position){

        val.remove(position);
        this.notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetChanged() {
<<<<<<< HEAD
        Collections.sort(val,new ClassAdapterValuesTimeComparator());
=======
        Collections.sort(val,new ClasaAdaptValTimeComparator());
>>>>>>> 2c82b41... LNQ
        super.notifyDataSetChanged();
    }


    static class ClasaAdaptVal implements Parcelable{
        String titlu;
        String startTime;
        String endTime;
        int _id;

        public ClasaAdaptVal(String titlu, String startTime, String endTime, int _id){
            this._id=_id;
            this.startTime=startTime;
            this.endTime=endTime;
            this.titlu = titlu;
        }

        private ClasaAdaptVal(Parcel in){
            titlu =in.readString();
            startTime=in.readString();
            endTime=in.readString();
            _id=in.readInt();
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(titlu);
            dest.writeString(startTime);
            dest.writeString(endTime);
            dest.writeInt(_id);

        }
        public static final Parcelable.Creator<ClasaAdaptVal> CREATOR
                = new Parcelable.Creator<ClasaAdaptVal>() {
            public ClasaAdaptVal createFromParcel(Parcel in) {
                return new ClasaAdaptVal(in);
            }

            public ClasaAdaptVal[] newArray(int size) {
                return new ClasaAdaptVal[size];
            }
        };
    }

<<<<<<< HEAD
    class ClassAdapterValuesTimeComparator implements Comparator<ClasaAdaptVal> {
=======
    class ClasaAdaptValTimeComparator implements Comparator<ClasaAdaptVal> {
>>>>>>> 2c82b41... LNQ
        @Override
        public int compare(ClasaAdaptVal lhs, ClasaAdaptVal rhs) {
            int hour1=Integer.parseInt(lhs.startTime.substring(0,2));
            int hour2=Integer.parseInt(rhs.startTime.substring(0,2));
            return hour1-hour2;
        }
    }
}
