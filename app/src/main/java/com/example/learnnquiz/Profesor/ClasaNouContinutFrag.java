package com.example.learnnquiz.Profesor;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ContentResolver;
import android.content.ContentValues;
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
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;


import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.learnnquiz.R;


public class ClasaNouContinutFrag extends Fragment {
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
    public static String DATE_FORMAT = "EUR";
    public static final String TAG="ClasaNouContinutFrag ";
    private static final String ARG_CLASA_ID = "clasaId";
    private static final String ARG_PARTICIPANT = "participant";
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    private int nClasaId;
    private String nData;
    private String sMaterie;
    private String sDificultate;
    private String sPrecizari;
    private int nTimestamp;
    private ArrayList<ParticipantAdapt.ParticipantAdaptVal> nParticipant;
<<<<<<< HEAD

    private PartiAdapt nAdapt;
    private ArrayList<PartiAdapt.PartiAdaptVal> nPartiParti;

    private OnNewClassContentListener nListener;
    private View nRootView;
    private AutoCompleteTextView nMaterie;


    public static ClasaNouContinutFrag newInstance(int classId, ArrayList<ParticipantAdapt.ParticipantAdaptVal> students) {
        ClasaNouContinutFrag fragment = new ClasaNouContinutFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASA_ID,classId);
        args.putParcelableArrayList(ARG_PARTICIPANT,students);
        fragment.setArguments(args);
        return fragment;
    }

    public ClasaNouContinutFrag() {

    }

=======
    private PartiAdapt nAdapt;
    private ArrayList<PartiAdapt.PartiAdaptVal> nPartiParti;
    private OnClasaNouaContinutListener nListener;
    private View nRootView;
    private AutoCompleteTextView nMaterie;
    public static ClasaNouContinutFrag newInstance(int clasaId, ArrayList<ParticipantAdapt.ParticipantAdaptVal> participant) {
        ClasaNouContinutFrag fragment = new ClasaNouContinutFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_CLASA_ID,clasaId);
        args.putParcelableArrayList(ARG_PARTICIPANT,participant);
        fragment.setArguments(args);
        return fragment;
    }
    public ClasaNouContinutFrag() {
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            nClasaId =savedInstanceState.getInt("clasaId");
            nData =savedInstanceState.getString("data");
            sMaterie =savedInstanceState.getString("materie");
            sDificultate =savedInstanceState.getString("dif");
            sPrecizari =savedInstanceState.getString("prec");
            nParticipant =savedInstanceState.getParcelableArrayList("parti");
            nPartiParti =savedInstanceState.getParcelableArrayList("partiparti");
            nTimestamp =savedInstanceState.getInt("timestamp");
        }
        else if (getArguments() != null) {
            nClasaId = getArguments().getInt(ARG_CLASA_ID);
            nParticipant =getArguments().getParcelableArrayList(ARG_PARTICIPANT);

            nPartiParti =new ArrayList(nParticipant.size());
            for (int i = 0; i< nParticipant.size(); i++) {

                nPartiParti.add(new PartiAdapt.PartiAdaptVal(
                        nParticipant.get(i).id,
                        nParticipant.get(i).nume,
                        getActivity().getResources().getIntArray(R.array.status).toString()));
            }
            Calendar c = Calendar.getInstance();
            nTimestamp =c.get(Calendar.DAY_OF_MONTH)+c.get(Calendar.MONTH)*30+c.get(Calendar.YEAR)*365;
            if (DATE_FORMAT == "EUR")
                nData = Integer.toString(c.get(Calendar.DAY_OF_MONTH)) + "." + Integer.toString(c.get(Calendar.MONTH) + 1) + "." + Integer.toString(c.get(Calendar.YEAR));
            else if (DATE_FORMAT == "US")
                nData = Integer.toString(c.get(Calendar.MONTH) + 1) + "/" + Integer.toString(c.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(c.get(Calendar.YEAR));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("clasaId", nClasaId);
        outState.putString("data", nData);
        outState.putString("materie", sMaterie);
        outState.putString("dif", sDificultate);
        outState.putString("prec", sPrecizari);
        outState.putInt("timestamp", nTimestamp);
        outState.putParcelableArrayList("parti", nParticipant);
        outState.putParcelableArrayList("partiparti", nAdapt.nVals);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        nRootView =inflater.inflate(R.layout.clasanoua_continut_frag, container, false);
<<<<<<< HEAD
        createStudentsList();

        nMaterie =(AutoCompleteTextView) nRootView.findViewById(R.id.nouClasaContinutFragMaterie);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line, getBookselection());
        nMaterie.setAdapter(adapter);

=======
        creeazaPartiList();

        nMaterie =(AutoCompleteTextView) nRootView.findViewById(R.id.nouClasaContinutFragMaterie);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line, getMaterieSelection());
        nMaterie.setAdapter(adapter);
>>>>>>> 2c82b41... LNQ
        Button dateBtn=(Button) nRootView.findViewById(R.id.nouClasaContinutFragData);
        dateBtn.setText(nData);
        dateBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new AddDateFragment();
                newFragment.show(getActivity().getFragmentManager(),"Data");
            }
        });
        Button btn=(Button) nRootView.findViewById(R.id.nouClasaContinutFragNouContinut);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
                sMaterie = nMaterie.getText().toString();
                TextView pages=(TextView) nRootView.findViewById(R.id.nouClasaContinutFragDificultate);
                sDificultate =pages.getText().toString();
                TextView info=(TextView) nRootView.findViewById(R.id.nouClasaContinutFragPrecizari);
                sPrecizari =info.getText().toString();
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                ContentValues vals = new ContentValues(5);
                vals.put(DbContract.ClasaContinut.COLUMN_MATERIE, sMaterie);
                vals.put(DbContract.ClasaContinut.COLUMN_PRECIZARI, sPrecizari);
                vals.put(DbContract.ClasaContinut.COLUMN_FOREIGN_KEY_CLASA, nClasaId);
                vals.put(DbContract.ClasaContinut.COLUMN_DIFICULTATE, sDificultate);
                vals.put(DbContract.ClasaContinut.COLUMN_DATA, nData);
                vals.put(DbContract.ClasaContinut.COLUMN_TIMESTAMP, nTimestamp);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                ContentResolver resolver=getActivity().getContentResolver();
                Uri returnUri=resolver.insert(DbContract.ClasaContinut.CONTENT_URI,vals);
                int id = Integer.parseInt(returnUri.getLastPathSegment());
                if(nParticipant.size()>0) {
                    nPartiParti = nAdapt.nVals;
                }
                for(int i = 0; i< nPartiParti.size(); i++){
                    vals=new ContentValues();
                    vals.put(DbContract.ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT,id);
                    vals.put(DbContract.ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT, nPartiParti.get(i).id);
                    vals.put(DbContract.ParticipantParti.COLUMN_STATUS, nPartiParti.get(i).status);
                    returnUri=resolver.insert(DbContract.ParticipantParti.CONTENT_URI,vals);
<<<<<<< HEAD

                }
                ClasaContinutAdapt.ClasaContinutAdaptVal newVals=new ClasaContinutAdapt.ClasaContinutAdaptVal(id, nData, nTimestamp, sMaterie, sDificultate, sPrecizari);
                nListener.OnNewClassContent(newVals);
=======
                }
                ClasaContinutAdapt.ClasaContinutAdaptVal newVals=new ClasaContinutAdapt.ClasaContinutAdaptVal(id, nData, nTimestamp, sMaterie, sDificultate, sPrecizari);
                nListener.ClasaNouaContinut(newVals);
>>>>>>> 2c82b41... LNQ
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.popBackStack();
                Toast.makeText(getActivity(),getActivity().getResources().getText(R.string.continutAdaugatAlert),Toast.LENGTH_LONG).show();

            }
        });
        return nRootView;
    }
<<<<<<< HEAD

    private void createStudentsList(){
        if(nParticipant.size()>0) {
            TwoWayView studentsList = (TwoWayView) nRootView.findViewById(R.id.participantListView);
            nAdapt = new PartiAdapt(getActivity(), nPartiParti);
            studentsList.setAdapter(nAdapt);
=======
    private void creeazaPartiList(){
        if(nParticipant.size()>0) {
            TwoWayView participantList = (TwoWayView) nRootView.findViewById(R.id.participantListView);
            nAdapt = new PartiAdapt(getActivity(), nPartiParti);
            participantList.setAdapter(nAdapt);
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
<<<<<<< HEAD
            nListener = (OnNewClassContentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
=======
            nListener = (OnClasaNouaContinutListener) activity;
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
    public interface OnNewClassContentListener {
        public void OnNewClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal values);
    }

=======
    public interface OnClasaNouaContinutListener {
        public void ClasaNouaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal values);
    }
>>>>>>> 2c82b41... LNQ
    public void setDate(String date, int timestamp){
        nData =date;
        nTimestamp =timestamp;
        Button dateBtn=(Button) nRootView.findViewById(R.id.nouClasaContinutFragData);
        dateBtn.setText(nData);
    }
<<<<<<< HEAD

    private String[] getBookselection(){

        ArrayList<String> books=new ArrayList<>();
=======
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

    public static class AddDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

        int day,month,year;
        int timestamp;

=======
            if(!materie.contains(cursor.getString(0)))
                materie.add(cursor.getString(0));
            cursor.moveToNext();
        }
        String[] string=new String[materie.size()];
        return materie.toArray(string);
    }
    public static class AddDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{
        int day,month,year;
        int timestamp;
>>>>>>> 2c82b41... LNQ
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            if(savedInstanceState!=null){
                day=savedInstanceState.getInt("day");
                month=savedInstanceState.getInt("month");
                year=savedInstanceState.getInt("year");
                timestamp=savedInstanceState.getInt("timestamp");
            }
            else {
                final Calendar c = Calendar.getInstance();
                day = c.get(Calendar.DAY_OF_MONTH);
                month = c.get(Calendar.MONTH);
                year = c.get(Calendar.YEAR);
<<<<<<< HEAD

            }
            return new DatePickerDialog(getActivity(),this,year,month,day);
        }

=======
            }
            return new DatePickerDialog(getActivity(),this,year,month,day);
        }
>>>>>>> 2c82b41... LNQ
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            String date="";
            if(DATE_FORMAT=="EUR")
                date=Integer.toString(dayOfMonth)+"."+Integer.toString(monthOfYear+1)+"."+Integer.toString(year);
            else if(DATE_FORMAT=="US")
                date=Integer.toString(monthOfYear+1)+"/"+Integer.toString(dayOfMonth)+"/"+Integer.toString(year);
            timestamp=dayOfMonth+(monthOfYear+1)*30+year*365;
<<<<<<< HEAD
            ((MainProfesor)getActivity()).forwardDatetoNewClassContentFragment(date,timestamp);
=======
            ((MainProfesor)getActivity()).forwardDatetoClasaNouaContinutFrag(date,timestamp);
>>>>>>> 2c82b41... LNQ

        }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("day",day);
            outState.putInt("month",month);
            outState.putInt("year",year);
            outState.putInt("timestamp",timestamp);
        }

    }
}
