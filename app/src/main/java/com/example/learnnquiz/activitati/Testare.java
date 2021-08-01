
package com.example.learnnquiz.Activitati;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.learnnquiz.LNQDB;
import com.example.learnnquiz.R;


import java.util.ArrayList;
import java.util.List;

public class Testare extends AppCompatActivity {
    String[] intrebare;
    String titlulectie;
    LNQDB lnqdb;
    int curs;
    int lectieid;
    ImageView[] count;
    public static final String I_SEP = "<<-->>";
    public static final String R_SEP = "<->";
    boolean[] rezultate;
    TextView titlulectietextview;
    TextView titluintrebaretextview;
    Button[] raspunsBt;
    RelativeLayout emptyview;
    ImageView inchideBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testare);

        Intent intent = getIntent();
        lectieid = intent.getIntExtra("lectieid", 0);
        lnqdb = LNQDB.getInstance(this);
        String i = lnqdb.getIntrebare(lectieid);
        titlulectie = lnqdb.getTitlulectie(lectieid);

        intrebare = i.split(I_SEP);
        curs = 0;

        titlulectietextview = findViewById(R.id.titlu_lectie);
        titluintrebaretextview = findViewById(R.id.titlu_intrebare);

        raspunsBt = new Button[]{findViewById(R.id.raspuns1),
                findViewById(R.id.raspuns2),
                findViewById(R.id.raspuns3),
                findViewById(R.id.raspuns4)};

        emptyview = findViewById(R.id.emptyview);
        emptyview.setVisibility(View.GONE);

        titlulectietextview.setText(titlulectie);
        count = new ImageView[]{findViewById(R.id.count0),
                findViewById(R.id.count1),
                findViewById(R.id.count2),
                findViewById(R.id.count3),
                findViewById(R.id.count4),
                findViewById(R.id.count5),
                findViewById(R.id.count6),
                findViewById(R.id.count7),
                findViewById(R.id.count8),
                findViewById(R.id.count9)};
        rezultate = new boolean[]{false, false, false, false, false, false, false, false, false, false};
        emptyview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntrebareUrmatoare();
            }
        });
        IntrebareCurenta();
        inchideBt = findViewById(R.id.inchidebt);
        inchideBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Testare.this, Acasa.class);
                startActivity(intent);
            }
        });
    }

    private void IntrebareUrmatoare(){
        if(curs == 9){
            int tot = 0;
            for(int i = 0; i<10; i++){
                if(rezultate[i]) {
                    tot++;
                }
            }

            int ch = 5*lnqdb.updateRezultate(lectieid, tot);

            LayoutInflater inflater = this.getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.result_dialog, null);
            final AlertDialog dialog = new AlertDialog.Builder(Testare.this).setView(dialogView).show();
            TextView tvResult = dialogView.findViewById(R.id.tvresult);
            String res = "Scor:\n" + tot + "/10";
            tvResult.setText(res);
            Button btIncearcadinnou = dialogView.findViewById(R.id.btIncearcadinnou);
            btIncearcadinnou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    Intent intent = new Intent(Testare.this,Testare.class);
                    intent.putExtra("nrsectiune", 0);
                    intent.putExtra("lectieid", lectieid);
                    startActivity(intent);
                }
            });

            Button btAcasa = dialogView.findViewById(R.id.btAcasa);
            btAcasa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    Intent intent = new Intent(Testare.this, Acasa.class);
                    startActivity(intent);
                }
            });

        } else {
            emptyview.setVisibility(View.GONE);
            curs++;
            IntrebareCurenta();
        }
    }
    private void IntrebareCurenta(){
        String[] parts = intrebare[curs].split(R_SEP);
        titluintrebaretextview.setText(parts[0]);
        final int raspunscorect;

        if(parts.length == 2){

            raspunsBt[0].setBackground(getResources().getDrawable(R.drawable.raspuns));
            raspunsBt[1].setBackground(getResources().getDrawable(R.drawable.raspuns));
            raspunsBt[0].setText("True");
            raspunsBt[1].setText("False");
            raspunsBt[2].setVisibility(View.GONE);
            raspunsBt[3].setVisibility(View.GONE);

            if(parts[1].charAt(0)== 'F'){
                raspunscorect = 1;
            } else {
                raspunscorect = 0;
            }
        } else {


            List<Integer> list = new ArrayList<Integer>();
            list.add(0);
            list.add(1);
            list.add(2);
            list.add(3);
            java.util.Collections.shuffle(list);

            raspunscorect = list.indexOf(0);
            for(int i = 0; i<4; i++){
                raspunsBt[i].setVisibility(View.VISIBLE);
                raspunsBt[i].setBackground(getResources().getDrawable(R.drawable.raspuns));
                raspunsBt[i].setText(parts[list.get(i)+1]);
            }
        }

        raspunsBt[raspunscorect].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                raspunsBt[raspunscorect].setBackground(getResources().getDrawable(R.drawable.raspunscorect));
                rezultate[curs] = true;
                count[curs].setBackground(getResources().getDrawable(R.drawable.counter));
                emptyview.setVisibility(View.VISIBLE);
            }
        });

        for(int i = 0; i<4; i++){
            if(i != raspunscorect){
                final int finalI = i;
                raspunsBt[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        raspunsBt[raspunscorect].setBackground(getResources().getDrawable(R.drawable.raspunscorect));
                        raspunsBt[finalI].setBackground(getResources().getDrawable(R.drawable.raspunsgresit));
                        count[curs].setBackground(getResources().getDrawable(R.drawable.counter));
                        emptyview.setVisibility(View.VISIBLE);
                    }
                });
            }
        }
    }
}
