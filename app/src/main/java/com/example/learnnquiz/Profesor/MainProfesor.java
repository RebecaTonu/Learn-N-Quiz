package com.example.learnnquiz.Profesor;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 2c82b41... LNQ
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

<<<<<<< HEAD
import com.example.learnnquiz.R;


public class MainProfesor extends AppCompatActivity implements ClasaNouaFrag.OnAddNewClassListener, ClasaFrag.OnDeleteListener,
       ModifParticipantFrag.OnStudentUpdatedListener, ClasaNouContinutFrag.OnNewClassContentListener,
        ParticipantNouFrag.OnStudentAddedListener, ModifClasaFrag.OnClassUpdatedListener,
        ModifClasaContinutFrag.OnUpdateClassContentListener {
=======
import com.example.learnnquiz.Conturi.Login;
import com.example.learnnquiz.R;


public class MainProfesor extends AppCompatActivity implements ClasaNouaFrag.OnAdaugaClasaNouaListener, ClasaFrag.OnDeleteListener,
        ModifParticipantFrag.OnParticipantModifListener, ClasaNouContinutFrag.OnClasaNouaContinutListener,
        ParticipantNouFrag.OnParticipantAdaugatListener, ModifClasaFrag.OnClasaModifListener,
        ModifClasaContinutFrag.OnModifClasaContinutListener {
>>>>>>> 2c82b41... LNQ

  MainFrag mainFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFrag =new MainFrag();
        if(savedInstanceState!=null)
            mainFrag =(MainFrag)getSupportFragmentManager().getFragment(savedInstanceState,"mainFrag");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.FragmentContainer, mainFrag)
                    .commit();
        }

    }
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
<<<<<<< HEAD

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

=======
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int i = item.getItemId();
        if (i == R.id.action_logout) {
            startActivity(new Intent(this, Login.class));
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }



>>>>>>> 2c82b41... LNQ
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        getSupportFragmentManager().putFragment(outState,"mainFrag", mainFrag);
    }
<<<<<<< HEAD

    @Override
    public void onAddNewClass(ArrayList days,String titlu, String startTime,String endTime, int id) {

        mainFrag.addNewClassToAdapter(days,titlu,startTime,endTime,id);
    }

    @Override
    public void onDelete(int id) {
        try {
            mainFrag.deleteClassfromAdapter(id);
=======
    @Override
    public void onAdaugaClasaNoua(ArrayList days, String titlu, String startTime, String endTime, int id) {

        mainFrag.adaugaClasaNouaAdapt(days,titlu,startTime,endTime,id);
    }
    @Override
    public void onSterge(int id) {
        try {
            mainFrag.stergeClasaAdapt(id);
>>>>>>> 2c82b41... LNQ
        }catch(Exception e){

            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
    }

    public void forwardDataFromDialogFragmentToFragment(String TAG, ArrayList data){
        switch (TAG){
            case ClasaNouaFrag.TAG:
                ClasaNouaFrag frag=(ClasaNouaFrag)getSupportFragmentManager().findFragmentByTag(TAG);
<<<<<<< HEAD
                frag.setSelectedWeekdays(data);
                break;
            case ModifClasaFrag.TAG:
                ModifClasaFrag updateFrag=(ModifClasaFrag)getSupportFragmentManager().findFragmentByTag(TAG);
                updateFrag.setSelectedWeekdays(data);
=======
                frag.setSelZile(data);
                break;
            case ModifClasaFrag.TAG:
                ModifClasaFrag modifclasaFrag=(ModifClasaFrag)getSupportFragmentManager().findFragmentByTag(TAG);
                modifclasaFrag.setZileSel(data);
>>>>>>> 2c82b41... LNQ
            default:

        }
    }

    public void forwardTimeFromDialogFragmentToFragment(String TAG, String time){
        switch (TAG){
            case ClasaNouaFrag.TAG:
            case ClasaNouaFrag.TAG+"END":
                ClasaNouaFrag frag=(ClasaNouaFrag)getSupportFragmentManager().findFragmentByTag(ClasaNouaFrag.TAG);
<<<<<<< HEAD
                frag.setSelectedTime(TAG,time);
=======
                frag.setSelTimp(TAG,time);
>>>>>>> 2c82b41... LNQ
                break;
            case ModifClasaFrag.TAG:
            case ModifClasaFrag.TAG+"END":
                ModifClasaFrag upFrag=(ModifClasaFrag)getSupportFragmentManager().findFragmentByTag(ModifClasaFrag.TAG);
<<<<<<< HEAD
                upFrag.setSelectedTime(TAG,time);
=======
                upFrag.setTimpSel(TAG,time);
>>>>>>> 2c82b41... LNQ
                break;
            default:

        }
    }
<<<<<<< HEAD

    public void forwardDatetoNewClassContentFragment(String date, int timestamp){

=======
    public void forwardDatetoClasaNouaContinutFrag(String date, int timestamp){
>>>>>>> 2c82b41... LNQ
        ClasaNouContinutFrag frag=(ClasaNouContinutFrag)getSupportFragmentManager().findFragmentByTag(ClasaNouContinutFrag.TAG);
        frag.setDate(date,timestamp);
    }

    @Override
<<<<<<< HEAD
    public void onStudentUpdated(ParticipantAdapt.ParticipantAdaptVal vals, int position) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.updateStudents(vals, position);
=======
    public void onParticipantModif(ParticipantAdapt.ParticipantAdaptVal vals, int position) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.ModifParti(vals, position);
>>>>>>> 2c82b41... LNQ

    }

    @Override
<<<<<<< HEAD
    public void OnNewClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal values) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.newClassContent(values);
    }

    @Override
    public void OnUpdateClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal values) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.upDateClassContent(values);
    }

    @Override
    public void onDeleteClassContent(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.deleteClassContent(deletedObj);
    }

    @Override
    public void onStudentAdded(ParticipantAdapt.ParticipantAdaptVal nouParticipant) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.updateStudents(nouParticipant,-1);
    }

    @Override
    public void OnClassUpdated(int id, String titlu, String days, String metoda, String startTime, String endTime, String dificultate, String precizari) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.updateMemberVars(titlu,days,metoda,startTime,endTime,dificultate,precizari);
        mainFrag.updateClassinAdapter(days,titlu,startTime,endTime,id);
=======
    public void ClasaNouaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal values) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.nouClasaContinut(values);
    }

    @Override
    public void OnModifClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal values) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.modifClasaContinut(values);
    }

    @Override
    public void onStergeClasaContinut(ClasaContinutAdapt.ClasaContinutAdaptVal deletedObj) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.stergeClasaContinut(deletedObj);
    }

    @Override
    public void onParticipantAdaugat(ParticipantAdapt.ParticipantAdaptVal nouParticipant) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.ModifParti(nouParticipant,-1);
    }

    @Override
    public void onClasaModif(int id, String titlu, String days, String metoda, String startTime, String endTime, String dificultate, String precizari) {
        ClasaFrag frag=(ClasaFrag)getSupportFragmentManager().findFragmentByTag(ClasaFrag.TAG);
        frag.modifPartiV(titlu,days,metoda,startTime,endTime,dificultate,precizari);
        mainFrag.ModificaClasaAdapt(days,titlu,startTime,endTime,id);
>>>>>>> 2c82b41... LNQ
    }
}
