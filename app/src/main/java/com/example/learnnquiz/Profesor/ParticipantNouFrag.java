package com.example.learnnquiz.Profesor;


import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learnnquiz.R;

public class ParticipantNouFrag extends Fragment {
<<<<<<< HEAD
    private static final String ARG_CLASA = "classId";


    private int nClasaId;
    private String nume;
    private String email;


    private View nRootView;
    private OnStudentAddedListener nListener;
=======
    private static final String ARG_CLASA = "clasaId";
    private int nClasaId;
    private String nume;
    private String email;
    private View nRootView;
    private OnParticipantAdaugatListener nListener;
>>>>>>> 2c82b41... LNQ

    public static ParticipantNouFrag newInstance(int clasaId) {
        ParticipantNouFrag fragment = new ParticipantNouFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASA, clasaId);
        fragment.setArguments(args);
        return fragment;
    }
<<<<<<< HEAD

    public ParticipantNouFrag() {

    }
    public interface OnStudentAddedListener {
        public void onStudentAdded(ParticipantAdapt.ParticipantAdaptVal nouParticipant);
=======
    public ParticipantNouFrag() {
    }
    public interface OnParticipantAdaugatListener {
        public void onParticipantAdaugat(ParticipantAdapt.ParticipantAdaptVal nouParticipant);
>>>>>>> 2c82b41... LNQ
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null) {
            nClasaId =savedInstanceState.getInt("clasaId");
            nume =savedInstanceState.getString("nume");
            email=savedInstanceState.getString("email");
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        }
        else if (getArguments() != null) {
            nClasaId = getArguments().getInt(ARG_CLASA);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("clasaId", nClasaId);
        outState.putString("nume", nume);
        outState.putString("email",email);

    }
<<<<<<< HEAD

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

=======
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
>>>>>>> 2c82b41... LNQ
        nRootView = inflater.inflate(R.layout.participantnou_frag, container, false);
        Button btn=(Button) nRootView.findViewById(R.id.nouParticipantAdaugaParticipant);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvName=(TextView) nRootView.findViewById(R.id.nouParticipantNume);
                nume =tvName.getText().toString();
                TextView tvEmail=(TextView) nRootView.findViewById(R.id.nouParticipantEmail);
                email=tvEmail.getText().toString();
                ContentValues vals = new ContentValues(4);
                vals.put(DbContract.Participant.COLUMN_PARTICIPANT_NUME, nume);
                vals.put(DbContract.Participant.COLUMN_EMAIL, email);
                vals.put(DbContract.Participant.COLUMN_FOREIGN_KEY_CLASA, nClasaId);
                ContentResolver resolver = getActivity().getContentResolver();
                Uri returnUri = resolver.insert(DbContract.Participant.CONTENT_URI, vals);
                int id=Integer.parseInt(returnUri.getLastPathSegment());
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.popBackStack();
                Toast.makeText(getActivity(),getActivity().getResources().getText(R.string.partiAdaugatAlert),Toast.LENGTH_LONG).show();
<<<<<<< HEAD
                nListener.onStudentAdded(new ParticipantAdapt.ParticipantAdaptVal(id, nume,email));
=======
                nListener.onParticipantAdaugat(new ParticipantAdapt.ParticipantAdaptVal(id, nume,email));
>>>>>>> 2c82b41... LNQ
                InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);

            }
        });
        
        return nRootView;
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
<<<<<<< HEAD
            nListener = (OnStudentAddedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnStudentAddedListener");
=======
            nListener = (OnParticipantAdaugatListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "");
>>>>>>> 2c82b41... LNQ
        }
    }
    public void onDetach(){
        super.onDetach();
        nListener =null;
    }

}
