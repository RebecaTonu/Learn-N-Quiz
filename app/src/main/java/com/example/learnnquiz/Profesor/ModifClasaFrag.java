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
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.learnnquiz.R;

public class ModifClasaFrag extends Fragment {

    public static final String TAG="ModifClasaFrag";
    private static final String ARG_ID = "id";
    private static final String ARG_TITLU = "titlu";
    private static final String ARG_ZI = "zi";
    private static final String ARG_METODA = "met";
    private static final String ARG_HOUR = "hour";
    private static final String ARG_ENDTIME = "endtime";
    private static final String ARG_DIFICULTATE = "dif";
    private static final String ARG_PRECIZARI = "prec";
<<<<<<< HEAD

    private String nSelectedDaysAsJson;


=======
    private String nSelectedDaysAsJson;
>>>>>>> 2c82b41... LNQ
    private int nId;
    private String nTitlu;
    private String nDays;
    private String nMetoda;
    private String mTime;
    private String mEndTime;
    private String nDificultate;
    private String nPrecizari;
<<<<<<< HEAD

    private View nRootView;

=======
    private View nRootView;
>>>>>>> 2c82b41... LNQ
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("id", nId);
        outState.putString("titlu", nTitlu);
        outState.putString("zi", nDays);
        outState.putString("met", nMetoda);
        outState.putString("timp",mTime);
        outState.putString("endTime",mEndTime);
        outState.putString("dif", nDificultate);
        outState.putString("prec", nPrecizari);
        outState.putString("selectedDaysAsJson", nSelectedDaysAsJson);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        super.onSaveInstanceState(outState);
    }

    private Button nTimeBtn, nEndTimeBtn;

<<<<<<< HEAD
    private OnClassUpdatedListener nListener;
=======
    private OnClasaModifListener nListener;
>>>>>>> 2c82b41... LNQ


    public static ModifClasaFrag newInstance(int id, String titlu, String days, String metoda, String hour, String endTime, String dificultate, String precizari) {
        ModifClasaFrag fragment = new ModifClasaFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_ID, id);
        args.putString(ARG_TITLU, titlu);
        args.putString(ARG_ZI, days);
        args.putString(ARG_METODA, metoda);
        args.putString(ARG_HOUR, hour);
        args.putString(ARG_ENDTIME, endTime);
        args.putString(ARG_DIFICULTATE, dificultate);
        args.putString(ARG_PRECIZARI, precizari);
        fragment.setArguments(args);
        return fragment;
    }

    public ModifClasaFrag() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null) {
            nId =savedInstanceState.getInt("id",0);
            nTitlu =savedInstanceState.getString("titlu","");
            nDays =savedInstanceState.getString("zi","");
            nMetoda =savedInstanceState.getString("met","");
            mTime=savedInstanceState.getString("time","");
            mEndTime=savedInstanceState.getString("endTime","");
            nDificultate =savedInstanceState.getString("dif","");
            nPrecizari =savedInstanceState.getString("prec","");
            nSelectedDaysAsJson =savedInstanceState.getString("selectedDaysAsJson","");
        }
        else if (getArguments() != null) {
            nId = getArguments().getInt(ARG_ID);
            nTitlu = getArguments().getString(ARG_TITLU);
            nDays = getArguments().getString(ARG_ZI);
            nMetoda = getArguments().getString(ARG_METODA);
            mTime = getArguments().getString(ARG_HOUR);
            mEndTime = getArguments().getString(ARG_ENDTIME);
            nDificultate = getArguments().getString(ARG_DIFICULTATE);
            nPrecizari = getArguments().getString(ARG_PRECIZARI);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        nRootView =inflater.inflate(R.layout.modifclasa_frag, container, false);


        EditText titlu=(EditText) nRootView.findViewById(R.id.nouClasaTitlu);
        titlu.setText(nTitlu);
        EditText metoda=(EditText) nRootView.findViewById(R.id.nouClasaMetoda);
        metoda.setText(nMetoda);
        EditText precizari=(EditText) nRootView.findViewById(R.id.nouClasaPrecizari);
        precizari.setText(nPrecizari);
        EditText dificultate=(EditText) nRootView.findViewById(R.id.modifClasaDif);
        dificultate.setText(nDificultate);
        Button daysBtn=(Button) nRootView.findViewById(R.id.nouClasaZile);
        daysBtn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                DaysDialogFragment dialogFragment= DaysDialogFragment.newInstance(nDays);
                dialogFragment.show(getActivity().getFragmentManager(),"dialog");
            }
        });

        nTimeBtn = (Button) nRootView.findViewById(R.id.nouClasaInceput);
        nTimeBtn.setText(mTime);
        nTimeBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timeFragment = TimeDialogFragment.newInstance(mTime);
                timeFragment.show(getActivity().getFragmentManager(), "Time");
            }
        });
        nEndTimeBtn = (Button) nRootView.findViewById(R.id.nouClasaSfarsit);
        nEndTimeBtn.setText(mEndTime);
        nEndTimeBtn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = EndTimeDialogFragment.newInstance(mEndTime);
                newFragment.show(getActivity().getFragmentManager(),"EndTime");
            }
        });
<<<<<<< HEAD
        Button updateBtn=(Button) nRootView.findViewById(R.id.updateClassBtn);
        updateBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

=======
        Button updateBtn=(Button) nRootView.findViewById(R.id.modifclasa);
        updateBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
>>>>>>> 2c82b41... LNQ
                EditText title=(EditText) nRootView.findViewById(R.id.nouClasaTitlu);
                nTitlu =title.getText().toString();
                EditText location=(EditText) nRootView.findViewById(R.id.nouClasaMetoda);
                nMetoda =location.getText().toString();
                EditText info=(EditText) nRootView.findViewById(R.id.nouClasaPrecizari);
                nPrecizari =info.getText().toString();
                EditText lvl=(EditText) nRootView.findViewById(R.id.modifClasaDif);
                nDificultate =lvl.getText().toString();
                ContentValues vals=new ContentValues();
                vals.put(DbContract.Clasa.COLUMN_TITLU, nTitlu);
                vals.put(DbContract.Clasa.COLUMN_TIMP, mTime);
                if(nSelectedDaysAsJson !=null && nSelectedDaysAsJson !="")
                    vals.put(DbContract.Clasa.COLUMN_DATA, nSelectedDaysAsJson);
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                vals.put(DbContract.Clasa.COLUMN_DURATA, mEndTime);
                vals.put(DbContract.Clasa.COLUMN_METODA, nMetoda);
                vals.put(DbContract.Clasa.COLUMN_DIFICULTATE, nDificultate);
                vals.put(DbContract.Clasa.COLUMN_MENTIUNI_PARTICIPANT, nPrecizari);
                Uri uri= DbContract.Clasa.CONTENT_URI.buildUpon().appendPath(Integer.toString(nId)).build();
                ContentResolver resolver=getActivity().getContentResolver();
                if(resolver.update(uri,vals,null,null)>0){

                    InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    mgr.hideSoftInputFromWindow(v.getWindowToken(), 0);

<<<<<<< HEAD
                    nListener.OnClassUpdated(nId, nTitlu, nDays, nMetoda,mTime,mEndTime, nDificultate, nPrecizari);
=======
                    nListener.onClasaModif(nId, nTitlu, nDays, nMetoda,mTime,mEndTime, nDificultate, nPrecizari);
>>>>>>> 2c82b41... LNQ
                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    fm.popBackStack();
                    Toast.makeText(getActivity(),R.string.clasamodif,Toast.LENGTH_LONG).show();
                }
                else{
<<<<<<< HEAD
                    Toast.makeText(getActivity(),"Could not update",Toast.LENGTH_LONG).show();
=======
                    Toast.makeText(getActivity(),"Nu am putut modifica",Toast.LENGTH_LONG).show();
>>>>>>> 2c82b41... LNQ
                }
            }
        });
        return nRootView;
    }

<<<<<<< HEAD
    public void setSelectedTime(String TAG,String time){
=======
    public void setTimpSel(String TAG, String time){
>>>>>>> 2c82b41... LNQ
        if(TAG.equals(this.TAG)) {
            nTimeBtn.setText(time);
            mTime = time;
        }
        else if(TAG.equals(this.TAG+"END")){
            nEndTimeBtn.setText(time);
            mEndTime=time;
        }
   }

<<<<<<< HEAD
    public void setSelectedWeekdays(ArrayList<Integer>data){
=======
    public void setZileSel(ArrayList<Integer>data){
>>>>>>> 2c82b41... LNQ
        JSONObject jDays=new JSONObject();
        JSONArray jarr=new JSONArray(data);
        try {
            jDays.put("selectedDays", jarr);
        }catch(JSONException e){
<<<<<<< HEAD

        }
        nSelectedDaysAsJson = jDays.toString();
        nDays =toDays(nSelectedDaysAsJson);



=======
        }
        nSelectedDaysAsJson = jDays.toString();
        nDays =toDays(nSelectedDaysAsJson);
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

       try {
<<<<<<< HEAD
            nListener = (OnClassUpdatedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnClassUpdatedListener");
        }

    }

=======
            nListener = (OnClasaModifListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "");
        }
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onDetach() {
        super.onDetach();
        nListener = null;
    }
<<<<<<< HEAD

    public interface OnClassUpdatedListener {
        public void OnClassUpdated(int id,String titlu, String days,String metoda, String startTime, String endTime, String dificultate, String precizari);
    }

    public static class DaysDialogFragment extends DialogFragment {

        private String nSavedDays;
        public String[] ndays;
        public boolean[] nselections;

=======
    public interface OnClasaModifListener {
        public void onClasaModif(int id, String titlu, String days, String metoda, String startTime, String endTime, String dificultate, String precizari);
    }
    public static class DaysDialogFragment extends DialogFragment {
        private String nSavedDays;
        public String[] ndays;
        public boolean[] nselections;
>>>>>>> 2c82b41... LNQ
        public static DaysDialogFragment newInstance(String days) {
            DaysDialogFragment frag = new DaysDialogFragment();
            Bundle args = new Bundle();
            args.putString("days", days);
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
                nSavedDays =getArguments().getString("days");
                for(int i = 0; i< ndays.length; i++){
                    if(nSavedDays.contains(ndays[i]))
                        nselections[i]=true;
                }
            }
        }
<<<<<<< HEAD

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

=======
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
>>>>>>> 2c82b41... LNQ
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
                            ((MainProfesor) getActivity()).forwardDataFromDialogFragmentToFragment(ModifClasaFrag.TAG, selectedDays);
                        }
                    })
                    .create();
        }
    }
<<<<<<< HEAD

    public static class TimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

        String nTime;
        Calendar nCalendar;

=======
    public static class TimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        String nTime;
        Calendar nCalendar;
>>>>>>> 2c82b41... LNQ
        public static TimeDialogFragment newInstance(String time){
            TimeDialogFragment fragment = new TimeDialogFragment();
            Bundle args = new Bundle();
            args.putString("TIME",time);
            fragment.setArguments(args);
            return fragment;
        }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                nTime =getArguments().getString("TIME","");
                int dividerPos= nTime.indexOf(":");
                int hour= Integer.parseInt(nTime.substring(0,dividerPos));
                int minute=Integer.parseInt(nTime.substring(dividerPos+1));
                nCalendar =Calendar.getInstance();
                nCalendar.set(Calendar.HOUR_OF_DAY,hour);
                nCalendar.set(Calendar.MINUTE,minute);
            }
        }
<<<<<<< HEAD

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            int hour = nCalendar.get(Calendar.HOUR_OF_DAY);
            int minute = nCalendar.get(Calendar.MINUTE);

            return new TimePickerDialog(getActivity(),this,hour,minute,true);
        }

=======
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            int hour = nCalendar.get(Calendar.HOUR_OF_DAY);
            int minute = nCalendar.get(Calendar.MINUTE);
            return new TimePickerDialog(getActivity(),this,hour,minute,true);
        }
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

    public static class EndTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        String mTime;
        Calendar mCalendar;

=======
    public static class EndTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
        String nTime;
        Calendar nCalendar;
>>>>>>> 2c82b41... LNQ
        public static EndTimeDialogFragment newInstance(String time){
            EndTimeDialogFragment fragment = new EndTimeDialogFragment();
            Bundle args = new Bundle();
            args.putString("TIME",time);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
<<<<<<< HEAD
                mTime=getArguments().getString("TIME","");
                int dividerPos=mTime.indexOf(":");
                int hour= Integer.parseInt(mTime.substring(0,dividerPos));
                int minute=Integer.parseInt(mTime.substring(dividerPos+1));
                mCalendar=Calendar.getInstance();
                mCalendar.set(Calendar.HOUR_OF_DAY,hour);
                mCalendar.set(Calendar.MINUTE,minute);
=======
                nTime =getArguments().getString("TIME","");
                int dividerPos= nTime.indexOf(":");
                int hour= Integer.parseInt(nTime.substring(0,dividerPos));
                int minute=Integer.parseInt(nTime.substring(dividerPos+1));
                nCalendar =Calendar.getInstance();
                nCalendar.set(Calendar.HOUR_OF_DAY,hour);
                nCalendar.set(Calendar.MINUTE,minute);
>>>>>>> 2c82b41... LNQ
            }
        }
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

<<<<<<< HEAD
            int hour = mCalendar.get(Calendar.HOUR_OF_DAY);
            int minute = mCalendar.get(Calendar.MINUTE);
=======
            int hour = nCalendar.get(Calendar.HOUR_OF_DAY);
            int minute = nCalendar.get(Calendar.MINUTE);
>>>>>>> 2c82b41... LNQ

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

            ((MainProfesor)getActivity()).forwardTimeFromDialogFragmentToFragment(TAG + "END", time);
        }
    }

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

}
