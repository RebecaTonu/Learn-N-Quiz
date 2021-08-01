
package com.example.learnnquiz.Activitati;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.learnnquiz.LNQDB;
import com.example.learnnquiz.R;
import com.example.learnnquiz.Adapt.ListaCurs;
import com.example.learnnquiz.Obiecte.Curs;


import java.util.List;

public class Acasa extends AppCompatActivity  {
    ListaCurs listaCurs;
LNQDB lnqdb;
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {

                case R.id.navigation_acasa:

                    return true;

                case R.id.navigation_profil:
                    intent = new Intent(Acasa.this,Profil.class);
                    startActivity(intent);
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acasa);
    lnqdb = LNQDB.getInstance(this);
        List<Curs> curs = lnqdb.getCurs();
        listaCurs = new ListaCurs(this, curs);
        ListView listaCursursi = findViewById(R.id.lista_curs);
        listaCursursi.setAdapter(listaCurs);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_titletext_layout, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView textviewTitle = viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText("Learn N Quiz");
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);


    }

}
