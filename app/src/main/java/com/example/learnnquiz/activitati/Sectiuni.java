
package com.example.learnnquiz.Activitati;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnnquiz.LNQDB;
import com.example.learnnquiz.R;
import com.example.learnnquiz.Obiecte.Sectiune;


public class Sectiuni extends AppCompatActivity {

    TextView pagtextview;
    ImageView inapoiBt;
    ImageView inainteBt;
    ImageView inchideBt;
    ImageView skipbt;
    TextView Titlusectiunetextview;
    ImageView imaginesectiune;
    TextView Textsectiunetextview;
    Sectiune sectiune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sectiune);

        Intent intent = getIntent();
        final int lectieid = intent.getIntExtra("lectieid", 0);
        final int nrsectiune = intent.getIntExtra("nrsectiune", 0);
        LNQDB lnqdb = LNQDB.getInstance(this);
        sectiune = lnqdb.getSectiune(lectieid, nrsectiune);
        pagtextview = findViewById(R.id.pag);
        inapoiBt  = findViewById(R.id.inapoi);
        inainteBt = findViewById(R.id.inainte);
        inchideBt = findViewById(R.id.inchidebt);
        skipbt=findViewById(R.id.skipbt);
        Titlusectiunetextview = findViewById(R.id.titlusectiune);
        imaginesectiune=findViewById(R.id.imaginesectiune);
        Textsectiunetextview = findViewById(R.id.textsectiune);
        Titlusectiunetextview.setText(sectiune.getTitlu());
        Textsectiunetextview.setText(sectiune.getText());
        String numeimg = "s" + lectieid + nrsectiune;
        imaginesectiune.setImageResource(getResources().getIdentifier(numeimg,
                "drawable", getPackageName()));
        Textsectiunetextview.setText(sectiune.getText());

        String pag = sectiune.getTitlulectie() + "  " + (nrsectiune + 1)
                + "/" + sectiune.getSectiunelectie();
        pagtextview.setText(pag);

        skipbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(nrsectiune<sectiune.getSectiunelectie()-1){
                    startQuiz(lectieid);
                }
            }
        });
        inchideBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sectiuni.this, Acasa.class);
                startActivity(intent);
            }
        });

        if(nrsectiune == 0){
            inapoiBt.setVisibility(View.GONE);
        } else {
            inapoiBt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SchimbaSectiune(lectieid, nrsectiune-1);
                }
            });
        }

        inainteBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nrsectiune<sectiune.getSectiunelectie()-1){
                    SchimbaSectiune(lectieid, nrsectiune+1);
                } else {
                    startQuiz(lectieid);
                }
            }
        });
    }

    void SchimbaSectiune(int lectieid, int nrsectiune){
        Intent intent = new Intent(Sectiuni.this, Sectiuni.class);
        intent.putExtra("nrsectiune", nrsectiune);
        intent.putExtra("lectieid", lectieid);
        startActivity(intent);
    }

    void startQuiz(int lectieid){
        Intent intent = new Intent(Sectiuni.this, com.example.learnnquiz.Activitati.Testare.class);
        intent.putExtra("lectieid", lectieid);
        startActivity(intent);
    }
}
