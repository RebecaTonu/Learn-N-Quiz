package com.example.learnnquiz.Profesor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;

import com.example.learnnquiz.R;


public class ClasaFrag extends Fragment {

    
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 ="id";
<<<<<<< HEAD


    public static final String TAG="ClasaFrag";
    private int pozitie;
    private int nID;

    private View rootView;

=======
    public static final String TAG="ClasaFrag";
    private int pozitie;
    private int nID;
    private View rootView;
>>>>>>> 2c82b41... LNQ
    private String nTitlu;
    private String nDays;
    private String nMetoda;
    private String nHour;
    private String nEndTime;
    private String nDificultate;
    private String nPrecizari;
<<<<<<< HEAD

    private ArrayList<ClasaContinutAdapt.ClasaContinutAdaptVal> nClasaContinutList;
    private ArrayList<ParticipantAdapt.ParticipantAdaptVal> nParticipantList;

    private ParticipantAdapt nParticipantAdapt;
    private ClasaContinutAdapt nclasaContinutAdapt;

    private OnDeleteListener nListener;


=======
    private ArrayList<ClasaContinutAdapt.ClasaContinutAdaptVal> nClasaContinutList;
    private ArrayList<ParticipantAdapt.ParticipantAdaptVal> nParticipantList;
    private ParticipantAdapt nParticipantAdapt;
    private ClasaContinutAdapt nclasaContinutAdapt;
    private OnDeleteListener nListener;
>>>>>>> 2c82b41... LNQ
    public static ClasaFrag newInstance(int param2, int param3) {
        ClasaFrag fragment = new ClasaFrag();
        Bundle args = new Bundle();
        
        args.putInt(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3,param3);
        fragment.setArguments(args);
        return fragment;
    }
<<<<<<< HEAD

    public ClasaFrag() {

    }

=======
    public ClasaFrag() {
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            pozitie =savedInstanceState.getInt("poz");
            nID =savedInstanceState.getInt("id");
            nClasaContinutList = savedInstanceState.getParcelableArrayList("ClasaContinutList");
            nParticipantList = savedInstanceState.getParcelableArrayList("ParticipantList");
            nclasaContinutAdapt =new ClasaContinutAdapt(getActivity(), nClasaContinutList);
            nParticipantAdapt =new ParticipantAdapt(getActivity(), nParticipantList);

        }
        else if (getArguments() != null) {
            
            pozitie = getArguments().getInt(ARG_PARAM2);
            nID =getArguments().getInt(ARG_PARAM3);
        }
        setHasOptionsMenu(true);
        getData(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_clasa,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
<<<<<<< HEAD
            case R.id.UpdateClass:
                Fragment updateFrag= ModifClasaFrag.newInstance(nID, nTitlu, nDays, nMetoda, nHour, nEndTime, nDificultate, nPrecizari);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, updateFrag, ModifClasaFrag.TAG);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.DeleteClass:
                showAlertDialog();
                break;
            case R.id.AddContent:
                Fragment newClassContentFragment = ClasaNouContinutFrag.newInstance(nID, nParticipantList);
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, newClassContentFragment, ClasaNouContinutFrag.TAG);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.AddStudent:
                Fragment newStudentFragment= ParticipantNouFrag.newInstance(nID);
                transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer,newStudentFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.NotifyAllStudents:
=======
            case R.id.ModifClasa:
                Fragment modifFrag= ModifClasaFrag.newInstance(nID, nTitlu, nDays, nMetoda, nHour, nEndTime, nDificultate, nPrecizari);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, modifFrag, ModifClasaFrag.TAG);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.StergeClasa:
                showAlertDialog();
                break;
            case R.id.AdaugaContinut:
                Fragment nouClasaContinutFrag = ClasaNouContinutFrag.newInstance(nID, nParticipantList);
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, nouClasaContinutFrag, ClasaNouContinutFrag.TAG);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.AdaugaParticipant:
                Fragment nouParticipantFrag= ParticipantNouFrag.newInstance(nID);
                transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer,nouParticipantFrag);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.TrimiteEmail:
>>>>>>> 2c82b41... LNQ
                String emails="";
                for(int i = 0; i< nParticipantList.size(); i++)
                    emails+= nParticipantList.get(i).email+";";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto",emails,null));
                startActivity(emailIntent);
                break;
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView =inflater.inflate(R.layout.clasa_frag, container, false);
<<<<<<< HEAD

        addStudents();
        addClassContent();
=======
        adaugaParticipant();
        adaugaClasaContinut();
>>>>>>> 2c82b41... LNQ
        TextView titlu=(TextView)rootView.findViewById(R.id.clasafrag_titlu);
        titlu.setText(nTitlu);
        TextView days=(TextView)rootView.findViewById(R.id.clasafrag_zile);
        days.setText(nDays);
        TextView endTime=(TextView)rootView.findViewById(R.id.clasafrag_durata);
        endTime.setText(nEndTime);
        TextView precizari=(TextView)rootView.findViewById(R.id.clasafrag_precizari);
        precizari.setText(nPrecizari);
        TextView dificultate=(TextView)rootView.findViewById(R.id.clasafrag_dificultate);
        dificultate.setText(nDificultate);
        TextView metoda=(TextView)rootView.findViewById(R.id.clasafrag_metoda);
        metoda.setText(nMetoda);
        TextView hour=(TextView)rootView.findViewById(R.id.clasafrag_ora);
        hour.setText(nHour);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            nListener = (OnDeleteListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
<<<<<<< HEAD
                    + " must implement OnDeleteListener");
=======
                    + " ");
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        nListener = null;
    }

    public interface OnDeleteListener {
<<<<<<< HEAD
        public void onDelete(int id);
    }

public void updateMemberVars(String titlu,String days,String metoda,String hour,String endTime,String dificultate,String precizari){
=======
        public void onSterge(int id);
    }

public void modifPartiV(String titlu, String days, String metoda, String hour, String endTime, String dificultate, String precizari){
>>>>>>> 2c82b41... LNQ
    nTitlu =titlu;
    nDays =days;
    nMetoda =metoda;
    nHour =hour;
    nEndTime =endTime;
    nDificultate =dificultate;
    nPrecizari =precizari;
}

<<<<<<< HEAD
    public void updateStudents(ParticipantAdapt.ParticipantAdaptVal vals, int position){
=======
    public void ModifParti(ParticipantAdapt.ParticipantAdaptVal vals, int position){
>>>>>>> 2c82b41... LNQ
        if(nParticipantAdapt !=null) {

            if (position != -1)
                nParticipantAdapt.remove(position);
            if (vals != null)
                nParticipantAdapt.add(vals);
            nParticipantAdapt.notifyDataSetChanged();
        }
    }

<<<<<<< HEAD
    private void addStudents(){
=======
    private void adaugaParticipant(){
>>>>>>> 2c82b41... LNQ

        TwoWayView list = (TwoWayView)rootView.findViewById(R.id.participantListView);
        nParticipantAdapt =new ParticipantAdapt(getActivity(), nParticipantList);
        list.setAdapter(nParticipantAdapt);

        list.setOnItemClickListener(new TwoWayView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
<<<<<<< HEAD
                Fragment updateStudentFragment= ModifParticipantFrag.newInstance(nParticipantList.get(position),position);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, updateStudentFragment);
=======
                Fragment modifParticipantFrag= ModifParticipantFrag.newInstance(nParticipantList.get(position),position);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, modifParticipantFrag);
>>>>>>> 2c82b41... LNQ
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }

<<<<<<< HEAD
    public void newClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal vals){
=======
    public void nouClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal vals){
>>>>>>> 2c82b41... LNQ
        if(nclasaContinutAdapt !=null) {
            nclasaContinutAdapt.add(vals);
            nclasaContinutAdapt.notifyDataSetChanged();
        }
    }

<<<<<<< HEAD
    public void deleteClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj){
=======
    public void stergeClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj){
>>>>>>> 2c82b41... LNQ
        if(nclasaContinutAdapt !=null) {
            for(int i = 0; i< nclasaContinutAdapt.getCount(); i++){
                ClasaContinutAdapt.ClasaContinutAdaptVal val=(ClasaContinutAdapt.ClasaContinutAdaptVal) nclasaContinutAdapt.getItem(i);
                if(val.id== deletedObj.id){
                    nclasaContinutAdapt.remove(i);
                    nclasaContinutAdapt.notifyDataSetChanged();
                }
            }
        }
    }

<<<<<<< HEAD
    public void upDateClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal vals){
=======
    public void modifClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal vals){
>>>>>>> 2c82b41... LNQ
        if(nclasaContinutAdapt !=null) {
            for(int i = 0; i< nclasaContinutAdapt.getCount(); i++){
                ClasaContinutAdapt.ClasaContinutAdaptVal val=(ClasaContinutAdapt.ClasaContinutAdaptVal) nclasaContinutAdapt.getItem(i);
                if(val.id== vals.id){
                    nclasaContinutAdapt.remove(i);
                    nclasaContinutAdapt.insert(vals, i);
                }
            }
            nclasaContinutAdapt.notifyDataSetChanged();
        }
    }

<<<<<<< HEAD
    private void addClassContent(){
=======
    private void adaugaClasaContinut(){
>>>>>>> 2c82b41... LNQ

        TwoWayView list = (TwoWayView)rootView.findViewById(R.id.clasaContinutListView);
        nclasaContinutAdapt = new ClasaContinutAdapt(getActivity(), nClasaContinutList);
        list.setAdapter(nclasaContinutAdapt);

        list.setOnItemClickListener(new TwoWayView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Fragment frag = ModifClasaContinutFrag.newInstance(nClasaContinutList.get(position).data,
                        nClasaContinutList.get(position).materie, nClasaContinutList.get(position).dificultate, nClasaContinutList.get(position).precizari,
                        nClasaContinutList.get(position).id, nClasaContinutList.get(position).timestamp);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer, frag, ModifClasaContinutFrag.TAG);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }

    private void getData(Bundle savedInstanceState){
        if(savedInstanceState!=null) {
            nDays =savedInstanceState.getString("zi");
            nEndTime =savedInstanceState.getString("endTime");
            nPrecizari =savedInstanceState.getString("precizari");
            nDificultate =savedInstanceState.getString("dif");
            nMetoda =savedInstanceState.getString("met");
            nHour =savedInstanceState.getString("hour");
            nTitlu =savedInstanceState.getString("titlu");
        }
        else {
            ContentResolver resolver = getActivity().getContentResolver();
            Uri uri = DbContract.Clasa.CONTENT_URI.buildUpon().appendPath(Integer.toString(nID)).build();
            Log.v("ClasaFrag", "Uri: " + uri.toString());
            Cursor cursor = resolver.query(uri, null, null, null, null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                nDays = toDays(cursor.getString(0));
                nEndTime = cursor.getString(1);
                nPrecizari = cursor.getString(2);
                nDificultate = cursor.getString(3);
                nMetoda = cursor.getString(4);
                nHour = cursor.getString(5);
                nTitlu = cursor.getString(6);
                cursor.moveToNext();
            }

            nClasaContinutList = new ArrayList<>();
            resolver = getActivity().getContentResolver();
            uri = DbContract.ClasaContinut.CONTENT_URI_WITH_FOREIGNKEY.buildUpon().appendPath(Integer.toString(nID)).build();
            cursor = resolver.query(uri, null, null, null, null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                nClasaContinutList.add(new ClasaContinutAdapt.ClasaContinutAdaptVal(cursor.getInt(5), cursor.getString(1),cursor.getInt(2), cursor.getString(0), cursor.getString(3), cursor.getString(4)));
                cursor.moveToNext();
            }

            nParticipantList = new ArrayList<>();
            resolver=getActivity().getContentResolver();
            uri= DbContract.Participant.CONTENT_URI_WITH_FOREIGNKEY.buildUpon().appendPath(Integer.toString(nID)).build();
            cursor=resolver.query(uri,null,null,null,null);
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                nParticipantList.add(new ParticipantAdapt.ParticipantAdaptVal(cursor.getInt(0),cursor.getString(1),cursor.getString(2)));
                cursor.moveToNext();
            }
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("ClasaContinutList", nClasaContinutList);
        outState.putParcelableArrayList("ParticipantList", nParticipantList);
        outState.putInt("id", nID);
        outState.putInt("poz", pozitie);
        outState.putString("zi", nDays);
        outState.putString("endTime", nEndTime);
        outState.putString("precizari", nPrecizari);
        outState.putString("dificultate", nDificultate);
        outState.putString("met", nMetoda);
        outState.putString("hour", nHour);
        outState.putString("titlu", nTitlu);

    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public String toDays(String jsonFormattedString) {
        String humanReadableString="";
        try {
            JSONObject json = new JSONObject(jsonFormattedString);
<<<<<<< HEAD
            JSONArray jarr=json.optJSONArray("selectedDays");
=======
            JSONArray jarr=json.optJSONArray("zile");
>>>>>>> 2c82b41... LNQ
            if (jarr != null) {
                for (int i=0;i<jarr.length();i++){
                    switch(jarr.getInt(i)){
                        case 0:
                            humanReadableString+=getActivity().getResources().getString(R.string.luni);
                            break;
                        case 1:
                            humanReadableString+=getActivity().getResources().getString(R.string.marti);
                            break;
                        case 2:
                            humanReadableString+=getActivity().getResources().getString(R.string.miercuri);
                            break;
                        case 3:
                            humanReadableString+=getActivity().getResources().getString(R.string.joi);
                            break;
                        case 4:
                            humanReadableString+=getActivity().getResources().getString(R.string.vineri);
                            break;
                        case 5:
                            humanReadableString+=getActivity().getResources().getString(R.string.sambata);
                            break;
                        case 6:
                            humanReadableString+=getActivity().getResources().getString(R.string.duminica);
                            break;
                    }
                    if(i!=jarr.length()-1)
                        humanReadableString+= ", ";
                }
            }
        }catch (JSONException e){}
        return  humanReadableString;
    }
<<<<<<< HEAD

    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());


        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergecls));


=======
    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());
        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergecls));
>>>>>>> 2c82b41... LNQ
        alertDialogBuilder
                .setCancelable(true)
                .setPositiveButton(this.getActivity().getResources().getString(R.string.stergecls),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        if (nListener != null) {
<<<<<<< HEAD
                            nListener.onDelete(nID);
=======
                            nListener.onSterge(nID);
                            nListener.onSterge(nID);
>>>>>>> 2c82b41... LNQ
                        }
                        FragmentManager fm=getActivity().getSupportFragmentManager();
                        fm.popBackStack();
                    }
                })
                .setNegativeButton(this.getActivity().getResources().getString(R.string.cancel),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                        dialog.cancel();
                    }
                });

<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }

}
