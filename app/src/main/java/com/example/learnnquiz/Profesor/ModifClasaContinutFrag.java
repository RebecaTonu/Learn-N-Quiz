package com.example.learnnquiz.Profesor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;

import com.example.learnnquiz.R;


public class ModifClasaContinutFrag extends Fragment {

    public static final String TAG="ModifClasaContinutFrag";
<<<<<<< HEAD

    public static String DATE_FORMAT = "EUR";

=======
    public static String DATE_FORMAT = "EUR";
>>>>>>> 2c82b41... LNQ
    private static final String ARG_DATA = "data";
    private static final String ARG_DIFICULTATE = "dif";
    private static final String ARG_MATERIE = "mat";
    private static final String ARG_PRECIZARI = "prec";
    private static final String ARG_ID = "clasaId";
    private static final String ARG_TIMESTAMP = "timestamp";
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private String nSData;
    private String nSMaterie;
    private String nSDificultate;
    private String nSPrecizari;
    private int nId, nTimestamp;
<<<<<<< HEAD

    private View nRootView;
    private TextView nData, nDificultate, nPrecizari;
    private AutoCompleteTextView nMaterie;

    private PartiAdapt nAdapt;
    private ArrayList<PartiAdapt.PartiAdaptVal> nPartiparti;

    private OnUpdateClassContentListener nListener;
=======
    private View nRootView;
    private TextView nData, nDificultate, nPrecizari;
    private AutoCompleteTextView nMaterie;
    private PartiAdapt nAdapt;
    private ArrayList<PartiAdapt.PartiAdaptVal> nPartiparti;
    private OnModifClasaContinutListener nListener;
>>>>>>> 2c82b41... LNQ

    public static ModifClasaContinutFrag newInstance(String data, String materie, String dificultate, String precizari, int id, int timestamp) {
        ModifClasaContinutFrag fragment = new ModifClasaContinutFrag();
        Bundle args = new Bundle();
        args.putString(ARG_DATA,data);
        args.putString(ARG_DIFICULTATE, dificultate);
        args.putString(ARG_MATERIE, materie);
        args.putString(ARG_PRECIZARI, precizari);
        args.putInt(ARG_ID, id);
        args.putInt(ARG_TIMESTAMP,timestamp);
<<<<<<< HEAD

        fragment.setArguments(args);
        return fragment;
    }

    public ModifClasaContinutFrag() {

=======
        fragment.setArguments(args);
        return fragment;
    }
    public ModifClasaContinutFrag() {
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            nSData = savedInstanceState.getString("data");
            nSMaterie = savedInstanceState.getString("mat");
            nSDificultate = savedInstanceState.getString("dif");
            nSPrecizari = savedInstanceState.getString("prec");
            nId = savedInstanceState.getInt("id");
            nPartiparti =savedInstanceState.getParcelableArrayList("partiparti");
        }
        else if (getArguments() != null) {
            nSData = getArguments().getString(ARG_DATA);
            nSMaterie = getArguments().getString(ARG_MATERIE);
            nSDificultate = getArguments().getString(ARG_DIFICULTATE);
            nSPrecizari = getArguments().getString(ARG_PRECIZARI);
            nId = getArguments().getInt(ARG_ID);
            nTimestamp = getArguments().getInt(ARG_TIMESTAMP);

            getData();
        }
    }

    private void getData() {
        nPartiparti =new ArrayList<>();
        ContentResolver resolver=getActivity().getContentResolver();
        Uri uri= DbContract.ParticipantParti.CONTENT_URI_WITH_CLASACONTINUTKEY.buildUpon().appendPath(Integer.toString(nId)).build();
        Cursor cursor=resolver.query(uri,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            int id=cursor.getInt(1);
            String status=cursor.getString(2);
            String name=cursor.getString(3);
            nPartiparti.add(new PartiAdapt.PartiAdaptVal(id,name,status));
            cursor.moveToNext();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data", nSData);
        outState.putString("mat", nSMaterie);
        outState.putString("dif", nSDificultate);
        outState.putString("prec", nSPrecizari);
        outState.putInt("id", nId);
        outState.putParcelableArrayList("partiparti", nAdapt.nVals);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nRootView = inflater.inflate(R.layout.modif_clasacontinut_frag, container, false);
        nData = (TextView) nRootView.findViewById(R.id.modifClasaContinutFragNouData);
        nData.setText(nSData);
        nMaterie = (AutoCompleteTextView) nRootView.findViewById(R.id.modifClasaContinutFragNouMaterie);
        nMaterie.setText(nSMaterie);
<<<<<<< HEAD
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line, getBookselection());
=======
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line, getMaterieSelection());
>>>>>>> 2c82b41... LNQ
        nMaterie.setAdapter(adapter);
        nDificultate = (TextView) nRootView.findViewById(R.id.modifClasaContinutFragNouDificultate);
        nDificultate.setText(nSDificultate);
        nPrecizari = (TextView) nRootView.findViewById(R.id.modifClasaContinutFragNouPrecizari);
        nPrecizari.setText(nSPrecizari);
<<<<<<< HEAD

        TwoWayView studentsList = (TwoWayView) nRootView.findViewById(R.id.participantListView);
        nAdapt = new PartiAdapt(getActivity(), nPartiparti);
        studentsList.setAdapter(nAdapt);
        Button updateBtn = (Button) nRootView.findViewById(R.id.modifClasaContinutFragNouModif);
        updateBtn.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("LongLogTag")
=======
        TwoWayView participantList = (TwoWayView) nRootView.findViewById(R.id.participantListView);
        nAdapt = new PartiAdapt(getActivity(), nPartiparti);
        participantList.setAdapter(nAdapt);
        Button updateBtn = (Button) nRootView.findViewById(R.id.modifClasaContinutFragNouModif);
        updateBtn.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("")
>>>>>>> 2c82b41... LNQ
            @Override
            public void onClick(View v) {
                nSData = nData.getText().toString();
                nSMaterie = nMaterie.getText().toString();
                nSDificultate = nDificultate.getText().toString();
                nSPrecizari = nPrecizari.getText().toString();
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                if (DATE_FORMAT == "EUR") {
                    try {
                        int dividerPos = nSData.indexOf(".");
                        int day = Integer.parseInt(nSData.substring(0, dividerPos));
                        String sub = nSData.substring(dividerPos + 1);
                        dividerPos = sub.indexOf(".");
                        int month = Integer.parseInt(sub.substring(0, dividerPos));
                        int year = Integer.parseInt(sub.substring(dividerPos + 1));
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                        nTimestamp =day+month*30+year*365;
                    }catch(Exception e){}
                }
                else if (DATE_FORMAT == "US"){
                    try {
                        int dividerPos = nSData.indexOf("/");
                        int month = Integer.parseInt(nSData.substring(0, dividerPos));
                        String sub = nSData.substring(dividerPos + 1);
                        dividerPos = sub.indexOf("/");
                        int day = Integer.parseInt(sub.substring(0, dividerPos));
                        int year = Integer.parseInt(sub.substring(dividerPos + 1));

                        nTimestamp =day+month*30+year*365;
                    }catch(Exception e){}
                }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                ContentValues vals = new ContentValues(4);
                vals.put(DbContract.ClasaContinut.COLUMN_MATERIE, nSMaterie);
                vals.put(DbContract.ClasaContinut.COLUMN_PRECIZARI, nSPrecizari);
                vals.put(DbContract.ClasaContinut.COLUMN_DIFICULTATE, nSDificultate);
                vals.put(DbContract.ClasaContinut.COLUMN_DATA, nSData);
                vals.put(DbContract.ClasaContinut.COLUMN_TIMESTAMP, nTimestamp);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                Uri uri = DbContract.ClasaContinut.CONTENT_URI.buildUpon().appendPath(Integer.toString(nId)).build();
                ContentResolver resolver = getActivity().getContentResolver();
                if (resolver.update(uri, vals, DbContract.ClasaContinut._ID + " = ?", new String[]{Integer.toString(nId)}) > 0) {
                    nPartiparti = nAdapt.nVals;
                    for (int i = 0; i < nPartiparti.size(); i++) {
                        uri = DbContract.ParticipantParti.CONTENT_URI_WITH_PARTICIPANTKEY.buildUpon().appendPath(Integer.toString(nId)).build();
                        vals = new ContentValues();
                        vals.put(DbContract.ParticipantParti.COLUMN_STATUS, nPartiparti.get(i).status);
                        resolver.update(uri, vals, DbContract.ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT + " =? and "
                                + DbContract.ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT +" =?",
                                new String[]{Integer.toString(nPartiparti.get(i).id),Integer.toString(nId)});
                    }
                    ClasaContinutAdapt.ClasaContinutAdaptVal updatedObj = new ClasaContinutAdapt.ClasaContinutAdaptVal(nId, nSData, nTimestamp, nSMaterie, nSDificultate, nSPrecizari);
<<<<<<< HEAD
                    nListener.OnUpdateClassContent(updatedObj);
=======
                    nListener.OnModifClasaContinut(updatedObj);
>>>>>>> 2c82b41... LNQ
                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    fm.popBackStack();
                    Toast.makeText(getActivity(), getActivity().getResources().getText(R.string.continutModificatAlert), Toast.LENGTH_LONG).show();
                }
            }
        });
<<<<<<< HEAD



=======
>>>>>>> 2c82b41... LNQ
        Button deleteBtn = (Button) nRootView.findViewById(R.id.modifClasaContinutFragSterge);
        deleteBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });

        return nRootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
<<<<<<< HEAD
            nListener = (OnUpdateClassContentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnUpdateClassContentListener");
=======
            nListener = (OnModifClasaContinutListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " ");
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        nListener = null;
    }
<<<<<<< HEAD
    public interface OnUpdateClassContentListener {
        public void OnUpdateClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal updatedObj);
        public void onDeleteClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj);
    }


    private String[] getBookselection(){

        ArrayList<String> books=new ArrayList<>();
=======
    public interface OnModifClasaContinutListener {
        public void OnModifClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal updatedObj);
        public void onStergeClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj);
    }


    private String[] getMaterieSelection(){

        ArrayList<String> materie=new ArrayList<>();
>>>>>>> 2c82b41... LNQ
        ContentResolver resolver=getActivity().getContentResolver();
        Cursor cursor=resolver.query(DbContract.ClasaContinut.CONTENT_URI,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
<<<<<<< HEAD
            if(!books.contains(cursor.getString(0)))
                books.add(cursor.getString(0));
            cursor.moveToNext();
        }
        String[] string=new String[books.size()];
        return books.toArray(string);
    }

    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());

        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergecontinut));

=======
            if(!materie.contains(cursor.getString(0)))
                materie.add(cursor.getString(0));
            cursor.moveToNext();
        }
        String[] string=new String[materie.size()];
        return materie.toArray(string);
    }
    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());
        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergecontinut));
>>>>>>> 2c82b41... LNQ
        alertDialogBuilder
                .setCancelable(true)
                .setPositiveButton(this.getActivity().getResources().getString(R.string.stergecontinut),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
<<<<<<< HEAD

                        Uri uri = DbContract.ClasaContinut.CONTENT_URI.buildUpon().appendPath(Integer.toString(nId)).build();
                        ContentResolver resolver = getActivity().getContentResolver();
                        if (resolver.delete(uri, DbContract.ClasaContinut._ID + " = ?", new String[]{Integer.toString(nId)}) > 0) {

                            uri = DbContract.ParticipantParti.CONTENT_URI_WITH_CLASACONTINUTKEY.buildUpon().appendPath(Integer.toString(nId)).build();
                            resolver.delete(uri, null, null);
                            ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj = new ClasaContinutAdapt.ClasaContinutAdaptVal(nId, nSData, nTimestamp, nSMaterie, nSDificultate, nSPrecizari);
                            nListener.onDeleteClassContent(deletedObj);
=======
                        Uri uri = DbContract.ClasaContinut.CONTENT_URI.buildUpon().appendPath(Integer.toString(nId)).build();
                        ContentResolver resolver = getActivity().getContentResolver();
                        if (resolver.delete(uri, DbContract.ClasaContinut._ID + " = ?", new String[]{Integer.toString(nId)}) > 0) {
                            uri = DbContract.ParticipantParti.CONTENT_URI_WITH_CLASACONTINUTKEY.buildUpon().appendPath(Integer.toString(nId)).build();
                            resolver.delete(uri, null, null);
                            ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj = new ClasaContinutAdapt.ClasaContinutAdaptVal(nId, nSData, nTimestamp, nSMaterie, nSDificultate, nSPrecizari);
                            nListener.onStergeClasaContinut(deletedObj);
>>>>>>> 2c82b41... LNQ
                            FragmentManager fm = getActivity().getSupportFragmentManager();
                            fm.popBackStack();
                            Toast.makeText(getActivity(), getActivity().getResources().getText(R.string.continutStersAlert), Toast.LENGTH_LONG).show();
                        }
                    }
                })
                .setNegativeButton(this.getActivity().getResources().getString(R.string.cancel),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
<<<<<<< HEAD

                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.create();


=======
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
>>>>>>> 2c82b41... LNQ
        alertDialog.show();
    }

}
