package com.example.learnnquiz.Profesor;


import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.learnnquiz.R;


public class ParticipantFrag extends Fragment {

    public static final String ARG_CLASA_ID ="clasaId";
    public static final String TAG="ParticipantFrag";
    int nClasaId;
    ListView nParticipantList;
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public static ParticipantFrag newInstance(int param_clasaID) {
        ParticipantFrag fragment = new ParticipantFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASA_ID, param_clasaID);
        fragment.setArguments(args);
        return fragment;
    }
<<<<<<< HEAD

    public ParticipantFrag() {

    }

=======
    public ParticipantFrag() {

    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nClasaId = getArguments().getInt(ARG_CLASA_ID);
        setHasOptionsMenu(true);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.participant_frag, container, false);
        nParticipantList = (ListView)rootView.findViewById(R.id.participantListView);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        ArrayList<ParticipantAdapt.ParticipantAdaptVal> vals=getData();
        if(vals==null)
            Toast.makeText(getActivity(),"Clasa goala",Toast.LENGTH_LONG).show();
        else {
            ParticipantAdapt adapter = new ParticipantAdapt(getActivity(), vals);
            nParticipantList.setAdapter(adapter);
        }
        return rootView;
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_participant,menu);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
<<<<<<< HEAD
            case R.id.addStudent:
                Fragment newStudentFragment= ParticipantNouFrag.newInstance(nClasaId);
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer,newStudentFragment);
=======
            case R.id.adaugaParticipant:
                Fragment nouParticipantFrag= ParticipantNouFrag.newInstance(nClasaId);
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.FragmentContainer,nouParticipantFrag);
>>>>>>> 2c82b41... LNQ
                transaction.addToBackStack(null);
                transaction.commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public void updateAdapter(ParticipantAdapt.ParticipantAdaptVal vals, int position){
        ParticipantAdapt adapter=(ParticipantAdapt) nParticipantList.getAdapter();
        adapter.remove(position);
        adapter.add(vals);
        adapter.notifyDataSetChanged();
    }
<<<<<<< HEAD

    private ArrayList<ParticipantAdapt.ParticipantAdaptVal> getData(){
        ArrayList<ParticipantAdapt.ParticipantAdaptVal> vals=new ArrayList<>();

=======
    private ArrayList<ParticipantAdapt.ParticipantAdaptVal> getData(){
        ArrayList<ParticipantAdapt.ParticipantAdaptVal> vals=new ArrayList<>();
>>>>>>> 2c82b41... LNQ
        ContentResolver resolver=getActivity().getContentResolver();
        Uri uri= DbContract.Participant.CONTENT_URI_WITH_FOREIGNKEY.buildUpon().appendPath(Integer.toString(nClasaId)).build();
        Cursor cursor=resolver.query(uri,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            vals.add(new ParticipantAdapt.ParticipantAdaptVal(cursor.getInt(0),cursor.getString(1),cursor.getString(2)));
            cursor.moveToNext();
        }
        return vals;
    }
}
