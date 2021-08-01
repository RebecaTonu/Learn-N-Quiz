

package com.example.learnnquiz.adapters;


import android.content.Context;
import android.support.v17.leanback.widget.HorizontalGridView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.learnnquiz.R;
import com.example.learnnquiz.obiecte.Curs;

import java.util.List;

public class ListaCurs extends BaseAdapter {

    private final Context context;
    private final List<Curs> curs;

    public ListaCurs(Context context, List<Curs> curs) {
        this.context = context;
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
        View view = inflater.inflate(R.layout.curs, parent, false);

        TextView Titlucurstextview = view.findViewById(R.id.titlu_curs);
        Titlucurstextview.setText(curs.get(position).getTitlu());

    ListaLectie lectieAdapter = new ListaLectie(context, curs.get(position).getLectie(), curs.get(position).getId());
        HorizontalGridView lectieView = view.findViewById(R.id.gridlectie);
        lectieView.setAdapter(lectieAdapter);

        return view;
    }
}