package com.example.learnnquiz.Adapt;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.learnnquiz.R;

import com.example.learnnquiz.Activitati.Sectiuni;
import com.example.learnnquiz.Layout.FitDoughnut;
import com.example.learnnquiz.Obiecte.Lectie;


import java.util.ArrayList;
import java.util.List;

public class ListaLectie extends RecyclerView.Adapter<ListaLectie.SimpleViewHolder> {

    private final Context context;
    private List<Lectie> lectie;
    private final int idcurs;

    public ListaLectie(Context context, List<Lectie> elemente, int idcurs) {
        this.context = context;
        this.lectie = elemente;
        this.idcurs = idcurs;
        if (lectie == null) {
            lectie = new ArrayList<>();
        }
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        public final TextView Titlulectietextview;
        public final RelativeLayout allView;
        public final ImageView imglectie;
        public final FitDoughnut doughnut;

        public SimpleViewHolder(View view) {
            super(view);
            Titlulectietextview = view.findViewById(R.id.titlu_lectie);
            allView = view.findViewById(R.id.allview);
            doughnut = view.findViewById(R.id.doughnutres);
            imglectie = view.findViewById(R.id.img_lectie);
        }
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.lectie, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SimpleViewHolder holder, final int position) {
        holder.Titlulectietextview.setText(lectie.get(position).getTitlu());

        String backrnume = "course" + idcurs;
        holder.imglectie.setBackgroundResource(context.getResources().getIdentifier(backrnume,
                "drawable", context.getPackageName()));

        String poznume = "z" + lectie.get(position).getId();
        holder.imglectie.setImageResource(context.getResources().getIdentifier(poznume,
                "drawable", context.getPackageName()));

        if (lectie.get(position).getRezultat() > 0) {
            holder.doughnut.setVisibility(View.VISIBLE);
            holder.doughnut.animateSetPercent(((float) lectie.get(position).getRezultat() * 10) - 0.01f);
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lectie.get(position).getSectiuniNr() == 0) {

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                    alertDialog.setPositiveButton("OK",    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();
                } else {
                    Intent intent = new Intent(context, Sectiuni.class);
                    intent.putExtra("nrsectiune", 0);
                    intent.putExtra("lectieid", lectie.get(position).getId());
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return this.lectie.size();
    }
}