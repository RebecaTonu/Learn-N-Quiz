package com.example.learnnquiz.Activitati;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.learnnquiz.Conturi.Login;
import com.example.learnnquiz.Conturi.Sesiune;
import com.example.learnnquiz.LNQDB;
import com.example.learnnquiz.R;
import com.example.learnnquiz.Layout.ExpGridView;
import com.example.learnnquiz.Layout.FitDoughnut;
import com.example.learnnquiz.Layout.ProgCurs;
import com.example.learnnquiz.Obiecte.Curs;
import com.example.learnnquiz.Obiecte.Level;

import java.util.ArrayList;
import java.util.List;


public class Profil  extends AppCompatActivity {
 Sesiune sesiune;
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {

                case R.id.navigation_acasa:
                    intent = new Intent(Profil.this, Acasa.class);
                    startActivity(intent);
                    return true;

                case R.id.navigation_profil:

                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_titletext_layout, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView textviewTitle = viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText("Profil");
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_profil);

        LNQDB lnqdb = LNQDB.getInstance(this);
        Level level = lnqdb.getNivel();

        FitDoughnut doughnut = findViewById(R.id.doughnuttot);
        doughnut.animateSetPercent((float) level.getProctot());
        TextView proctottextview = findViewById(R.id.proctextview);
        String p = level.getProctot() + "%";
        proctottextview.setText(p);
        TextView niveltextview = findViewById(R.id.niveltextview);
        niveltextview.setText(level.getLiv());
        TextView progtextview = findViewById(R.id.progtextview);
        String prog = level.getProg() + " / " + level.getTot();
        progtextview.setText(prog);
        ExpGridView gridCurs = findViewById(R.id.gridCursprog);
        List<Curs> curs = new ArrayList<>();
        List<String> Titlucurs = lnqdb.getNumeCurs();
        for (int i = 0; i < Titlucurs.size(); i++) {
            curs.add(new Curs(Titlucurs.get(i), level.getProcurs()[i]));
        }
        ProgCurs cursAdapter = new ProgCurs(curs);
        gridCurs.setAdapter(cursAdapter);
        gridCurs.setExpanded(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout, menu);
        return true;
    }
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

    private void logout(){
        sesiune.setLoggedin(false);
        finish();
        startActivity(new Intent(Profil.this,Login.class));
    }

}







