package com.example.learnnquiz.Profesor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.learnnquiz.R;

import java.util.ArrayList;


public class PartiAdapt extends ArrayAdapter {
    ArrayList<PartiAdaptVal> nVals;
    private final Context context;
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public PartiAdapt(Context context, ArrayList<PartiAdaptVal> values) {
        super(context, R.layout.participant_parti_item,values);
        this.nVals =values;
        this.context=context;
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
<<<<<<< HEAD

        View rowView = inflater.inflate(R.layout.participant_parti_item, parent, false);
        TextView name=(TextView)rowView.findViewById(R.id.parti_participantNume);
        name.setText(nVals.get(position).nume);

        final int listPos=position;

        Spinner spinner=(Spinner)rowView.findViewById(R.id.statusSpinner);

        ArrayAdapter<CharSequence>attendanceAdapter= ArrayAdapter.createFromResource(context,R.array.status,android.R.layout.simple_spinner_item);
        attendanceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(attendanceAdapter);
=======
        View rowView = inflater.inflate(R.layout.participant_parti_item, parent, false);
        TextView name=(TextView)rowView.findViewById(R.id.parti_participantNume);
        name.setText(nVals.get(position).nume);
        final int listPos=position;
        Spinner spinner=(Spinner)rowView.findViewById(R.id.statusSpinner);
        ArrayAdapter<CharSequence>statusAdapter= ArrayAdapter.createFromResource(context,R.array.status,android.R.layout.simple_spinner_item);
        statusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(statusAdapter);
>>>>>>> 2c82b41... LNQ
        for(int i=0;i<spinner.getCount();i++) {
            String spinnerVal=(String)spinner.getItemAtPosition(i);
            if (spinnerVal.contains(nVals.get(position).status)) {
                spinner.setSelection(i);
                break;
            }
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nVals.set(listPos,new PartiAdaptVal(nVals.get(listPos).id, nVals.get(listPos).nume,parent.getItemAtPosition(position).toString()));
            }
<<<<<<< HEAD

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

=======
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
>>>>>>> 2c82b41... LNQ
            }
        });

        return rowView;
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    static class PartiAdaptVal implements Parcelable {
        int id;
        String nume;
        String status;
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        public PartiAdaptVal(int id, String nume, String status){
            this.id=id;
            this.nume = nume;
            this.status=status;
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        private PartiAdaptVal(Parcel in){
            id=in.readInt();
            nume =in.readString();
            status=in.readString();
        }
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        @Override
        public int describeContents() {
            return 0;
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(id);
            dest.writeString(nume);
            dest.writeString(status);
        }
        public static final Parcelable.Creator<PartiAdaptVal> CREATOR
                = new Parcelable.Creator<PartiAdaptVal>() {
            public PartiAdaptVal createFromParcel(Parcel in) {
                return new PartiAdaptVal(in);
            }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
            public PartiAdaptVal[] newArray(int size) {
                return new PartiAdaptVal[size];
            }
        };
    }
}
