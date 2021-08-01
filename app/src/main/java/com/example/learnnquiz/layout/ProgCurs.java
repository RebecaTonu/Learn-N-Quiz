package com.example.learnnquiz.Layout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.learnnquiz.R;
import com.example.learnnquiz.Obiecte.Curs;

import java.util.List;

public class ProgCurs extends BaseAdapter {

    private final List<Curs> curs;

    public ProgCurs(List<Curs> curs) {
        this.curs = curs;
    }

    @Override
    public int getCount() {
        return curs.size();
    }

    @Override
    public Object getItem(int position) {
        return curs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cursprog, parent, false);

        TextView Titlucurstextview = view.findViewById(R.id.titlutextview);
        Titlucurstextview.setText(curs.get(position).getTitlu());

        FitDoughnut dCurs = view.findViewById(R.id.doughnut);
        TextView ProcCurstextview = view.findViewById(R.id.proctextview);


        dCurs.animateSetPercent((float) curs.get(position).getProgproc());
        String t = curs.get(position).getProgproc() + "%";
        ProcCurstextview.setText(t);



        return view;
    }
}