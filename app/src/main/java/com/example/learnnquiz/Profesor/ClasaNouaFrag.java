package com.example.learnnquiz.Profesor;

import android.app.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.learnnquiz.R;


public class ClasaNouaFrag extends Fragment implements AdapterView.OnItemSelectedListener {
<<<<<<< HEAD


    private static final String ARG_PARAM1 = "param1";
    public static final String TAG= "ClasaNouaFrag";
    private String nDay;

=======
    private static final String ARG_PARAM1 = "param1";
    public static final String TAG= "ClasaNouaFrag";
    private String nDay;
>>>>>>> 2c82b41... LNQ
    private String nSelectedDays;
    private ArrayList<Integer> nSelectedDaysAsArray;
    private String Dificultate;
    private String nTime, nEndTime;
<<<<<<< HEAD

    private OnAddNewClassListener nListener;
    private Button nBtn, nTimeBtn, nEndTimeBtn;
    private AutoCompleteTextView nMetoda;
    View nRootView;

=======
    private OnAdaugaClasaNouaListener nListener;
    private Button nBtn, nTimeBtn, nEndTimeBtn;
    private AutoCompleteTextView nMetoda;
    View nRootView;
>>>>>>> 2c82b41... LNQ
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Dificultate =(String)parent.getItemAtPosition(position);

    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Dificultate ="-";
    }

<<<<<<< HEAD
    public interface OnAddNewClassListener {
        public void onAddNewClass(ArrayList days,String title,String startTime,String endTime, int id);
    }


=======
    public interface OnAdaugaClasaNouaListener {
        public void onAdaugaClasaNoua(ArrayList days, String title, String startTime, String endTime, int id);
    }
>>>>>>> 2c82b41... LNQ
    public static ClasaNouaFrag newInstance(String param1) {
        ClasaNouaFrag fragment = new ClasaNouaFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public ClasaNouaFrag() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("zi", nDay);
        outState.putString("selectedDays", nSelectedDays);
        outState.putIntegerArrayList("selectedDaysAsArray", nSelectedDaysAsArray);
        outState.putString("dif", Dificultate);
        outState.putString("startTime", nTime);
        outState.putString("endTime", nEndTime);
        super.onSaveInstanceState(outState);
    }
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if(savedInstanceState!=null) {
            nDay =savedInstanceState.getString("zi");
            nSelectedDays =savedInstanceState.getString("selectedDays");
            nSelectedDaysAsArray =savedInstanceState.getIntegerArrayList("selectedDaysAsArray");
            Dificultate =savedInstanceState.getString("dif");
            nTime =savedInstanceState.getString("startTime");
            nEndTime =savedInstanceState.getString("endTime");
        }
        else if (getArguments() != null) {
            nDay = getArguments().getString(ARG_PARAM1);
            nTime = nEndTime ="00:00";
            nSelectedDays ="";
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        nRootView =inflater.inflate(R.layout.clasa_noua_frag, container, false);
<<<<<<< HEAD

        nMetoda =(AutoCompleteTextView) nRootView.findViewById(R.id.nouClasaMetoda);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line, getLocationSelection());
        nMetoda.setAdapter(adapter);

=======
        nMetoda =(AutoCompleteTextView) nRootView.findViewById(R.id.nouClasaMetoda);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line);
        nMetoda.setAdapter(adapter);
>>>>>>> 2c82b41... LNQ
        setSpinners();
        Button daysBtn=(Button) nRootView.findViewById(R.id.nouClasaZile);
        daysBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                DaysDialogFragment dialogFragment= DaysDialogFragment.newInstance(nSelectedDaysAsArray);
                dialogFragment.show(getActivity().getFragmentManager(),"dialog");
            }
        });
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        nTimeBtn = (Button) nRootView.findViewById(R.id.nouClasaInceput);
        nTimeBtn.setText(nTime);
        nTimeBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimeDialogFragment();
                newFragment.show(getActivity().getFragmentManager(), "Time");
            }
        });
        nEndTimeBtn = (Button) nRootView.findViewById(R.id.nouClasaSfarsit);
        nEndTimeBtn.setText(nEndTime);
        nEndTimeBtn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new EndTimeDialogFragment();
                newFragment.show(getActivity().getFragmentManager(),"EndTime");
            }
        });

        nBtn =(Button) nRootView.findViewById(R.id.creeazaClasaBtn);
        nBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
<<<<<<< HEAD

                EditText title=(EditText) nRootView.findViewById(R.id.nouClasaTitlu);
                EditText info=(EditText) nRootView.findViewById(R.id.nouClasaPrecizari);

                if(title.getText().toString().matches("")|| nSelectedDaysAsArray ==null|| nMetoda.getText().toString().matches(""))
                    Toast.makeText(getActivity(),R.string.notAllFieldsFilledOutWarning,Toast.LENGTH_LONG).show();
                else {
                    ContentValues vals = new ContentValues(7);
                    vals.put(DbContract.Clasa.COLUMN_TITLU, title.getText().toString());
=======
                EditText titlu=(EditText) nRootView.findViewById(R.id.nouClasaTitlu);
                EditText precizari=(EditText) nRootView.findViewById(R.id.nouClasaPrecizari);
                if(titlu.getText().toString().matches("")|| nSelectedDaysAsArray ==null|| nMetoda.getText().toString().matches(""))
                    Toast.makeText(getActivity(),R.string.notAllFieldsFilledOutWarning,Toast.LENGTH_LONG).show();
                else {
                    ContentValues vals = new ContentValues(7);
                    vals.put(DbContract.Clasa.COLUMN_TITLU, titlu.getText().toString());
>>>>>>> 2c82b41... LNQ
                    vals.put(DbContract.Clasa.COLUMN_TIMP, nTime);
                    vals.put(DbContract.Clasa.COLUMN_DATA, nSelectedDays);
                    vals.put(DbContract.Clasa.COLUMN_DURATA, nEndTime);
                    vals.put(DbContract.Clasa.COLUMN_METODA, nMetoda.getText().toString());
                    vals.put(DbContract.Clasa.COLUMN_DIFICULTATE, Dificultate);
<<<<<<< HEAD
                    vals.put(DbContract.Clasa.COLUMN_MENTIUNI_PARTICIPANT, info.getText().toString());
=======
                    vals.put(DbContract.Clasa.COLUMN_MENTIUNI_PARTICIPANT, precizari.getText().toString());
>>>>>>> 2c82b41... LNQ
                    ContentResolver resolver = getActivity().getContentResolver();
                    Uri returnUri = resolver.insert(DbContract.Clasa.CONTENT_URI, vals);
                    int id=Integer.parseInt(returnUri.getLastPathSegment());
                    InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);
<<<<<<< HEAD
                    nListener.onAddNewClass(nSelectedDaysAsArray, title.getText().toString(), nTime, nEndTime,id);
=======
                    nListener.onAdaugaClasaNoua(nSelectedDaysAsArray, titlu.getText().toString(), nTime, nEndTime,id);
>>>>>>> 2c82b41... LNQ
                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    fm.popBackStack();
                }
            }
        });
        return nRootView;

    }

<<<<<<< HEAD
    public void setSelectedTime(String TAG,String time){
=======
    public void setSelTimp(String TAG, String time){
>>>>>>> 2c82b41... LNQ
        if(TAG.equals(this.TAG)) {
            nTimeBtn.setText(time);
            nTime = time;
        }
        else if(TAG.equals(this.TAG+"END")){
            nEndTimeBtn.setText(time);
            nEndTime =time;
        }
    }

<<<<<<< HEAD
    public void setSelectedWeekdays(ArrayList<Integer>data){
        JSONObject jDays=new JSONObject();
        JSONArray jarr=new JSONArray(data);
        try {
            jDays.put("selectedDays", jarr);
=======
    public void setSelZile(ArrayList<Integer>data){
        JSONObject jDays=new JSONObject();
        JSONArray jarr=new JSONArray(data);
        try {
            jDays.put("zile", jarr);
>>>>>>> 2c82b41... LNQ
        }catch(JSONException e){

        }
        nSelectedDaysAsArray =data;
        nSelectedDays = jDays.toString();
<<<<<<< HEAD



=======
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
<<<<<<< HEAD
            nListener = (OnAddNewClassListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
=======
            nListener = (OnAdaugaClasaNouaListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    +"");
>>>>>>> 2c82b41... LNQ
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        nListener = null;
    }

    public void setSpinners(){
        Spinner difSpinner=(Spinner) nRootView.findViewById(R.id.nouClasaDificultate);
        ArrayAdapter<CharSequence>difAdapter= ArrayAdapter.createFromResource(getActivity(),R.array.dificultate,android.R.layout.simple_spinner_item);
        difAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        difSpinner.setAdapter(difAdapter);
        difSpinner.setOnItemSelectedListener(this);

    }
<<<<<<< HEAD

    private String[] getLocationSelection(){

        ArrayList<String> locations=new ArrayList<>();
        ContentResolver resolver=getActivity().getContentResolver();
        Cursor cursor=resolver.query(DbContract.Clasa.CONTENT_URI,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            if(!locations.contains(cursor.getString(2)))
                locations.add(cursor.getString(2));

            cursor.moveToNext();
        }
        String[] string=new String[locations.size()];
        return locations.toArray(string);
    }

    public static class DaysDialogFragment extends DialogFragment{

        public String[] ndays;
        public boolean[] nselections;
        private ArrayList<Integer> nSavedDays;

=======
    public static class DaysDialogFragment extends DialogFragment{
        public String[] ndays;
        public boolean[] nselections;
        private ArrayList<Integer> nSavedDays;
>>>>>>> 2c82b41... LNQ
        public static DaysDialogFragment newInstance(ArrayList<Integer> days) {
            DaysDialogFragment frag = new DaysDialogFragment();
            Bundle args = new Bundle();
            args.putIntegerArrayList("days", days);
            frag.setArguments(args);
            return frag;
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ndays =getActivity().getResources().getStringArray(R.array.zile);
            nselections =new boolean[ndays.length];
            if (getArguments() != null) {
                nSavedDays =getArguments().getIntegerArrayList("days");
                if(nSavedDays !=null) {
                    for (int i = 0; i < nSavedDays.size(); i++) {
                        nselections[nSavedDays.get(i)] = true;
                    }
                }
            }
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog.Builder( getActivity() )
                    .setTitle(getActivity().getResources().getString(R.string.nouZile) )
                    .setMultiChoiceItems(ndays, nselections, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {}
                    })
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ArrayList<Integer> selectedDays= new ArrayList<Integer>();
                            for (int i = 0; i < ndays.length; i++) {
                                if (nselections[i])
                                    selectedDays.add(i);
                            }
                            ((MainProfesor) getActivity()).forwardDataFromDialogFragmentToFragment(ClasaNouaFrag.TAG, selectedDays);
                        }
                    })
                    .create();
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public static class TimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            return new TimePickerDialog(getActivity(),this,hour,minute,true);
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String hour=Integer.toString(hourOfDay);
            if (hour.length()==1)
                hour="0"+hour;
            String min=Integer.toString(minute);
            if(min.length()==1)
                min="0"+min;
            String time=hour+":"+min;
            ((MainProfesor)getActivity()).forwardTimeFromDialogFragmentToFragment(TAG,time);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public static class EndTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            return new TimePickerDialog(getActivity(),this,hour,minute,true);
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String hour=Integer.toString(hourOfDay);
            if (hour.length()==1)
                hour="0"+hour;
            String min=Integer.toString(minute);
            if(min.length()==1)
                min="0"+min;
            String time=hour+":"+min;
            ((MainProfesor)getActivity()).forwardTimeFromDialogFragmentToFragment(TAG+"END",time);
        }
    }

}
