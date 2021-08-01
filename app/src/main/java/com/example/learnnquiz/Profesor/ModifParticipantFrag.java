package com.example.learnnquiz.Profesor;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
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


public class ModifParticipantFrag extends Fragment {

    private static final String ARG_PARTICIPANTADAPTERVAL = "param1";
    private static final String ARG_POZITIE = "param2";
    int nPozition;
    View nRootView;
    TextView nNume, nEmail;
<<<<<<< HEAD


    private ParticipantAdapt.ParticipantAdaptVal participantAdaptVal;


    private OnStudentUpdatedListener nListener;


=======
    private ParticipantAdapt.ParticipantAdaptVal participantAdaptVal;
    private OnParticipantModifListener nListener;
>>>>>>> 2c82b41... LNQ
    public static ModifParticipantFrag newInstance(ParticipantAdapt.ParticipantAdaptVal param1, int position) {
        ModifParticipantFrag fragment = new ModifParticipantFrag();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARTICIPANTADAPTERVAL,param1);
        args.putInt(ARG_POZITIE,position);
        fragment.setArguments(args);
        return fragment;
    }
<<<<<<< HEAD

    public ModifParticipantFrag() {

=======
    public ModifParticipantFrag() {
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            participantAdaptVal =savedInstanceState.getParcelable("participantAdapterVal");
            nPozition =savedInstanceState.getInt("position");
        }
        else if (getArguments() != null) {
            participantAdaptVal = getArguments().getParcelable(ARG_PARTICIPANTADAPTERVAL);
            nPozition =getArguments().getInt(ARG_POZITIE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
<<<<<<< HEAD
        outState.putParcelable("studentAdapterVal", participantAdaptVal);
        outState.putInt("position", nPozition);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        nRootView = inflater.inflate(R.layout.modif_participant_frag, container, false);

=======
        outState.putParcelable("participantAdapterVal", participantAdaptVal);
        outState.putInt("position", nPozition);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nRootView = inflater.inflate(R.layout.modif_participant_frag, container, false);
>>>>>>> 2c82b41... LNQ
        nNume =(TextView) nRootView.findViewById(R.id.nouParticipantNume);
        nNume.setText(participantAdaptVal.nume);
        nEmail =(TextView) nRootView.findViewById(R.id.nouParticipantEmail);
        nEmail.setText(participantAdaptVal.email);
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        Button deleteBtn=(Button) nRootView.findViewById(R.id.participantItem_stergeParticipantData);
        deleteBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
<<<<<<< HEAD

        Button btn=(Button) nRootView.findViewById(R.id.modifParticipantFragModifParti);

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nume= nNume.getText().toString();
                String email= nEmail.getText().toString();

                participantAdaptVal.nume =nume;
                participantAdaptVal.email=email;


                ContentValues vals = new ContentValues(3);
                vals.put(DbContract.Participant.COLUMN_PARTICIPANT_NUME, nume);
                vals.put(DbContract.Participant.COLUMN_EMAIL, email);


                ContentResolver resolver=getActivity().getContentResolver();
                Uri uri= DbContract.Participant.CONTENT_URI.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();
                if(resolver.update(uri,vals,null,null)>0) {
                    nListener.onStudentUpdated(participantAdaptVal, nPozition);
=======
        Button btn=(Button) nRootView.findViewById(R.id.modifParticipantFragModifParti);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nume= nNume.getText().toString();
                String email= nEmail.getText().toString();
                participantAdaptVal.nume =nume;
                participantAdaptVal.email=email;
                ContentValues vals = new ContentValues(3);
                vals.put(DbContract.Participant.COLUMN_PARTICIPANT_NUME, nume);
                vals.put(DbContract.Participant.COLUMN_EMAIL, email);
                ContentResolver resolver=getActivity().getContentResolver();
                Uri uri= DbContract.Participant.CONTENT_URI.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();
                if(resolver.update(uri,vals,null,null)>0) {
                    nListener.onParticipantModif(participantAdaptVal, nPozition);
>>>>>>> 2c82b41... LNQ
                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    fm.popBackStack();
                    Toast.makeText(getActivity(), getActivity().getResources().getText(R.string.participantModifAlert), Toast.LENGTH_LONG).show();
                    InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
<<<<<<< HEAD
                    mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });

        return nRootView;
    }

=======
                    mgr.hideSoftInputFromWindow(v.getWindowToken(), 0); }
            }
        });
        return nRootView;
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
<<<<<<< HEAD
            nListener = (OnStudentUpdatedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
=======
            nListener = (OnParticipantModifListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "");
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        nListener = null;
    }
<<<<<<< HEAD


    public interface OnStudentUpdatedListener {

        public void onStudentUpdated(ParticipantAdapt.ParticipantAdaptVal vals, int position);
    }

    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());


        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergeparticipant));

=======
    public interface OnParticipantModifListener {
        public void onParticipantModif(ParticipantAdapt.ParticipantAdaptVal vals, int position);
    }
    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this.getActivity());
        alertDialogBuilder.setTitle(this.getActivity().getResources().getString(R.string.stergeparticipant));
>>>>>>> 2c82b41... LNQ
        alertDialogBuilder
                .setCancelable(true)
                .setPositiveButton(this.getActivity().getResources().getString(R.string.stergeparticipant),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
<<<<<<< HEAD

                        ContentResolver resolver = getActivity().getContentResolver();
                        Uri uri = DbContract.Participant.CONTENT_URI.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();


                        if (resolver.delete(uri, null, null) > 0) {

                            uri= DbContract.ParticipantParti.CONTENT_URI_WITH_PARTICIPANTKEY.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();
                            resolver.delete(uri,null,null);
                            nListener.onStudentUpdated(null, nPozition);
=======
                        ContentResolver resolver = getActivity().getContentResolver();
                        Uri uri = DbContract.Participant.CONTENT_URI.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();
                        if (resolver.delete(uri, null, null) > 0) {
                            uri= DbContract.ParticipantParti.CONTENT_URI_WITH_PARTICIPANTKEY.buildUpon().appendPath(Integer.toString(participantAdaptVal.id)).build();
                            resolver.delete(uri,null,null);
                            nListener.onParticipantModif(null, nPozition);
>>>>>>> 2c82b41... LNQ
                            FragmentManager fm = getActivity().getSupportFragmentManager();
                            fm.popBackStack();
                            Toast.makeText(getActivity(), getActivity().getResources().getText(R.string.participantstersAlert), Toast.LENGTH_LONG).show();
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
