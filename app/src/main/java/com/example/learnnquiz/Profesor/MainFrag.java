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
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lucasr.twowayview.TwoWayView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.example.learnnquiz.R;


public class MainFrag extends Fragment {

    private final String TAG="MainFrag";
    View nRootView;
    ClasaAdapt[] nAdapt;
    LinearLayout[] nWeekdays;
    TwoWayView[] nListView;
<<<<<<< HEAD

    private VelocityTracker nVelocityTracker = null;


    public MainFrag() {
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main_fragment,menu);
=======
    private VelocityTracker nVelocityTracker = null;
    public MainFrag() {
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main_frag,menu);
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

<<<<<<< HEAD
        if(id==R.id.addClass_setting){
            Fragment newClassFragment= ClasaNouaFrag.newInstance("zi");
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.FragmentContainer,newClassFragment, ClasaNouaFrag.TAG);
=======
        if(id==R.id.adaugaClasa_menu){
            Fragment nouClasaFrag= ClasaNouaFrag.newInstance("zi");
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.FragmentContainer,nouClasaFrag, ClasaNouaFrag.TAG);
>>>>>>> 2c82b41... LNQ
            transaction.addToBackStack(null);
            transaction.commit();
        }

<<<<<<< HEAD
        else if (id == R.id.action_settings) {
            return true;
        }
=======
        
>>>>>>> 2c82b41... LNQ

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHasOptionsMenu(true);
        this.createAdapters(savedInstanceState);
        nWeekdays =new LinearLayout[7];
        nListView =new TwoWayView[7];

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        nRootView = inflater.inflate(R.layout.main_frag, container, false);

        Calendar calendar=Calendar.getInstance();
        int weekDay=calendar.get(Calendar.DAY_OF_WEEK);
        if(weekDay==1){
            LinearLayout sunday=(LinearLayout) nRootView.findViewById(R.id.duminica);
            sunday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==2){
            LinearLayout monday=(LinearLayout) nRootView.findViewById(R.id.luni);
            monday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==3){
            LinearLayout tuesday=(LinearLayout) nRootView.findViewById(R.id.marti);
            tuesday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==4){
            LinearLayout wednesday=(LinearLayout) nRootView.findViewById(R.id.miercuri);
            wednesday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==5){
            LinearLayout thursday=(LinearLayout) nRootView.findViewById(R.id.joi);
            thursday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==6){
            LinearLayout friday=(LinearLayout) nRootView.findViewById(R.id.vineri);
            friday.setBackgroundColor(getResources().getColor(R.color.White));
        }
        else if(weekDay==7){
            LinearLayout saturday=(LinearLayout) nRootView.findViewById(R.id.sambata);
            saturday.setBackgroundColor(getResources().getColor(R.color.White));
        }



        for (int i = 0; i < 7; i++) {

            if (i == 0) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.luni);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.mondayListView);
            } else if (i == 1) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.marti);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.tuesdayListView);
            } else if (i == 2) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.miercuri);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.wednesdayListView);
            } else if (i == 3) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.joi);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.thursdayListView);
            } else if (i == 4) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.vineri);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.fridayListView);
            } else if (i == 5) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.sambata);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.saturdayListView);
            } else if (i == 6) {
                nWeekdays[i] = (LinearLayout) nRootView.findViewById(R.id.duminica);
                nListView[i] = (TwoWayView) nRootView.findViewById(R.id.sundayListView);
            }
           
        }
        this.setListeners();
        return nRootView;
    }

    public void onSaveInstanceState(Bundle savedState){
        super.onSaveInstanceState(savedState);


        for (int i = 0; i < 7; i++) {
            try {
                ArrayList<ClasaAdapt.ClasaAdaptVal> values=new ArrayList<ClasaAdapt.ClasaAdaptVal>();
                for (int u = 0; u < nAdapt[i].getCount(); u++)
                    values.add((ClasaAdapt.ClasaAdaptVal) nAdapt[i].getItem(u));
                savedState.putParcelableArrayList("Day"+i,values);
            }catch(Exception e){}
        }
    }

    @Override
    public void onPause()
    {
        super.onPause();
    }

    private void createAdapters(Bundle savedInstanceState){
        if(nAdapt ==null) {
            ArrayList<ClasaAdapt.ClasaAdaptVal> list = new ArrayList<ClasaAdapt.ClasaAdaptVal>();
            nAdapt = new ClasaAdapt[7];
            if (savedInstanceState != null) {
                for (int i = 0; i < 7; i++) {
                    list = savedInstanceState.getParcelableArrayList("Day" + i);
                    nAdapt[i] = new ClasaAdapt(getActivity(), list);
                }
            }else {
                ContentResolver resolver = getActivity().getContentResolver();
                Cursor cursor= resolver.query(DbContract.CLASA_ZI_TITLU_ORA_ID,null, null, null, null);
                cursor.moveToFirst();

                ArrayList<List<ClasaAdapt.ClasaAdaptVal>> listGroup= new ArrayList<List<ClasaAdapt.ClasaAdaptVal>>(7);
                for(int i=0;i<7;i++) {
                    listGroup.add(new ArrayList<ClasaAdapt.ClasaAdaptVal>());
                }

                while(!cursor.isAfterLast()){
                    int id=cursor.getInt(0);
                    String title=cursor.getString(1);
                    String startTime=cursor.getString(2);
                    String endTime=cursor.getString(3);

                    try {
                        JSONObject json = new JSONObject(cursor.getString(4));
                        JSONArray jarr=json.optJSONArray("selectedDays");
                        if (jarr != null) {
                            for (int i=0;i<jarr.length();i++){
                                ClasaAdapt.ClasaAdaptVal obj = new ClasaAdapt.ClasaAdaptVal(title,startTime,endTime,id);
                                ArrayList<ClasaAdapt.ClasaAdaptVal> tempList=(ArrayList)listGroup.get(jarr.getInt(i));
                                tempList.add(obj);
                                listGroup.set(jarr.getInt(i),tempList);
                            }
                        }
                    }catch (JSONException e){}

                    cursor.moveToNext();
                }
                for (int i=0;i<7;i++) {
                    nAdapt[i] = new ClasaAdapt(getActivity(), (ArrayList)listGroup.get(i));
                }
            }
        }
        else{

        }
    }

    private void setListeners(){
        for (int i = 0; i < 7; i++) {

            nListView[i].setAdapter(nAdapt[i]);
            nListView[i].setOnItemClickListener(new TwoWayView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ClasaAdapt.ClasaAdaptVal vals=(ClasaAdapt.ClasaAdaptVal)parent.getAdapter().getItem(position);
<<<<<<< HEAD
                    Fragment classFragment= ClasaFrag.newInstance(position,vals._id);
                    FragmentTransaction transaction=getFragmentManager().beginTransaction();
                    transaction.replace(R.id.FragmentContainer,classFragment, ClasaFrag.TAG);
=======
                    Fragment clasaFrag= ClasaFrag.newInstance(position,vals._id);
                    FragmentTransaction transaction=getFragmentManager().beginTransaction();
                    transaction.replace(R.id.FragmentContainer,clasaFrag, ClasaFrag.TAG);
>>>>>>> 2c82b41... LNQ
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });

        }
    }

<<<<<<< HEAD
    public void addNewClassToAdapter(ArrayList<Integer>days,String titlu,String startTime,String endTime, int id){
=======
    public void adaugaClasaNouaAdapt(ArrayList<Integer>days, String titlu, String startTime, String endTime, int id){
>>>>>>> 2c82b41... LNQ
        for(int i=0;i<days.size();i++){
            if (nAdapt[days.get(i)] != null) {
                ClasaAdapt.ClasaAdaptVal obj=new ClasaAdapt.ClasaAdaptVal(titlu,startTime,endTime,id);
                nAdapt[days.get(i)].add(obj);
                nAdapt[days.get(i)].notifyDataSetChanged();
            }
        }

    }

<<<<<<< HEAD
    public void updateClassinAdapter(String days,String titlu,String startTime, String endTime, int id){
=======
    public void ModificaClasaAdapt(String days, String titlu, String startTime, String endTime, int id){
>>>>>>> 2c82b41... LNQ
        String[]weekDays=getActivity().getResources().getStringArray(R.array.zile);
        for (int i = 0; i < weekDays.length; i++) {
            if (nAdapt[i] != null) {
                if (days.contains(weekDays[i])) {
                    boolean isOnNewDay = true;
                    for (int u = 0; u < nAdapt[i].getCount(); u++) {
                        ClasaAdapt.ClasaAdaptVal obj = (ClasaAdapt.ClasaAdaptVal) nAdapt[i].getItem(u);

                        if (obj._id == id) {
                            obj.titlu = titlu;
                            obj.startTime = startTime;
                            obj.endTime=endTime;
                            nAdapt[i].remove(u);
                            nAdapt[i].add(obj);
                            isOnNewDay = false;
                        }
                    }

                    if (isOnNewDay) {
                        ClasaAdapt.ClasaAdaptVal obj = new ClasaAdapt.ClasaAdaptVal(titlu, startTime, endTime, id);
                        nAdapt[i].add(obj);
                    }
                    nAdapt[i].notifyDataSetChanged();
                }

                else{
                    for (int u = 0; u < nAdapt[i].getCount(); u++) {
                        ClasaAdapt.ClasaAdaptVal obj = (ClasaAdapt.ClasaAdaptVal) nAdapt[i].getItem(u);
                        if (obj._id == id) {
                            nAdapt[i].remove(u);
                        }
                    }
                    nAdapt[i].notifyDataSetChanged();
                }
            }
        }
    }

<<<<<<< HEAD
    public void deleteClassfromAdapter(int id){
=======
    public void stergeClasaAdapt(int id){
>>>>>>> 2c82b41... LNQ
        ContentResolver resolver=getActivity().getContentResolver();
        Uri uri= DbContract.Clasa.CONTENT_URI.buildUpon().appendPath(Integer.toString(id)).build();
        resolver.delete(uri,null,null);
        for (int i=0;i<7;i++) {
            if(nAdapt[i]!=null) {
                for (int u = 0; u < nAdapt[i].getCount(); u++) {
                    ClasaAdapt.ClasaAdaptVal val = (ClasaAdapt.ClasaAdaptVal) nAdapt[i].getItem(u);
                    if (val._id == id) {
                        nAdapt[i].remove(u);
                    }
                }
            }
        }

    }
}

