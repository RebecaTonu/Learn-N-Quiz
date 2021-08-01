package com.example.learnnquiz.Profesor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> 2c82b41... LNQ
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.learnnquiz.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ClasaContinutAdapt extends ArrayAdapter {
    private final Context context;
    private final ArrayList<ClasaContinutAdaptVal> val;

    public ClasaContinutAdapt(Context context, ArrayList<ClasaContinutAdaptVal> val) {
        super(context, R.layout.clasa_continut_item, val);
        this.val = val;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        View rowView = inflater.inflate(R.layout.clasa_continut_item, parent, false);
        TextView data=(TextView)rowView.findViewById(R.id.clasaContinutItemData);
        data.setText(val.get(position).data);
        TextView materie=(TextView)rowView.findViewById(R.id.clasaContinutItemMateria);
        materie.setText(val.get(position).materie);
        TextView dificultate=(TextView)rowView.findViewById(R.id.clasaContinutItemDificultate);
        dificultate.setText(val.get(position).dificultate);
        TextView precizari=(TextView)rowView.findViewById(R.id.clasaContinutItemPrecizari);
        precizari.setText(val.get(position).precizari);

        if (precizari.getLineCount()>6)
            precizari.setMaxLines(6);

        return rowView;
    }

    public void remove(int position){
        val.remove(position);
        this.notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetChanged() {
<<<<<<< HEAD
        Collections.sort(val, new ClassContentAdapterValuesIDComparator());
=======
        Collections.sort(val, new ClasaContinutAdaptValIDComparator());
>>>>>>> 2c82b41... LNQ
        super.notifyDataSetChanged();
    }

    static class ClasaContinutAdaptVal implements Parcelable {
        int id;
        String materie;
        String dificultate;
        String precizari;
        String data;
        int timestamp;

        public ClasaContinutAdaptVal(int id, String data, int timeStamp, String materie, String pages, String precizari){
            this.id=id;
            this.data = data;
            this.timestamp=timeStamp;
            this.materie = materie;
            this.dificultate =pages;
            this.precizari = precizari;
        }

        private ClasaContinutAdaptVal(Parcel in){
            id=in.readInt();
            data =in.readString();
            timestamp=in.readInt();
            materie =in.readString();
            dificultate =in.readString();
            precizari =in.readString();
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(id);
            dest.writeString(data);
            dest.writeInt(timestamp);
            dest.writeString(materie);
            dest.writeString(dificultate);
            dest.writeString(precizari);

        }
        public static final Parcelable.Creator<ClasaContinutAdaptVal> CREATOR
                = new Parcelable.Creator<ClasaContinutAdaptVal>() {
            public ClasaContinutAdaptVal createFromParcel(Parcel in) {
                return new ClasaContinutAdaptVal(in);
            }

            public ClasaContinutAdaptVal[] newArray(int size) {
                return new ClasaContinutAdaptVal[size];
            }
        };
    }

<<<<<<< HEAD
    class ClassContentAdapterValuesIDComparator implements Comparator<ClasaContinutAdaptVal> {
=======
    class ClasaContinutAdaptValIDComparator implements Comparator<ClasaContinutAdaptVal> {
>>>>>>> 2c82b41... LNQ
        @Override
        public int compare(ClasaContinutAdaptVal lhs, ClasaContinutAdaptVal rhs) {
            return rhs.timestamp - lhs.timestamp;
        }
    }
}
