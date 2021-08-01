package com.example.learnnquiz.Profesor;
<<<<<<< HEAD

=======
//https://github.com/lucasr/twoway-view - folosit pentru grid view-ul perspectiva profesorului
>>>>>>> 2c82b41... LNQ
import android.app.Activity;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnnquiz.R;

import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;

public class ClasaContinutFrag extends Fragment {
<<<<<<< HEAD
    private static final String ARG_CLASS_ID = "clasaID";
    public static final String TAG="ClasaContinutFrag";
    private int mClassId;

    public static ClasaContinutFrag newInstance(int classId) {
        ClasaContinutFrag fragment = new ClasaContinutFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASS_ID, classId);
=======
    private static final String ARG_CLASA_ID = "clasaID";
    public static final String TAG="ClasaContinutFrag";
    private int nClasaid;

    public static ClasaContinutFrag newInstance(int clasaId) {
        ClasaContinutFrag fragment = new ClasaContinutFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASA_ID, clasaId);
>>>>>>> 2c82b41... LNQ
        fragment.setArguments(args);
        return fragment;
    }

    public ClasaContinutFrag() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
<<<<<<< HEAD
            mClassId = getArguments().getInt(ARG_CLASS_ID);
=======
            nClasaid = getArguments().getInt(ARG_CLASA_ID);
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        TwoWayView list=(TwoWayView)inflater.inflate(R.layout.clasa_continut_frag, container, false);
        ArrayList<ClasaContinutAdapt.ClasaContinutAdaptVal> values=new ArrayList<>();
<<<<<<< HEAD
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(0,"01.10.1981",13,"12-133","something special", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(1,"01.10.1981",20,"12-133","something special", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(2,"01.10.1981",15,"12-133","something special", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(3,"01.10.1981",12,"12-133","something special", "ceva"));
=======
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(0,"03.12.1999",13,"12-133","altceva", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(1,"03.12.1999",20,"12-133","altceva", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(2,"03.12.1999",15,"12-133","altceva", "ceva"));
        values.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(3,"03.12.1999",12,"12-133","altceva", "ceva"));
>>>>>>> 2c82b41... LNQ

        ClasaContinutAdapt adapter=new ClasaContinutAdapt(getActivity(),values);
        list.setAdapter(adapter);
        return list;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
