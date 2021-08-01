package com.example.learnnquiz;
import android.content.Context;
<<<<<<< HEAD
import com.example.learnnquiz.obiecte.Curs;
import com.example.learnnquiz.obiecte.Level;
import com.example.learnnquiz.obiecte.Sectiune;
=======
import com.example.learnnquiz.Obiecte.Curs;
import com.example.learnnquiz.Obiecte.Level;
import com.example.learnnquiz.Obiecte.Sectiune;
>>>>>>> 2c82b41... LNQ

import java.util.List;


public abstract class Contract {
    protected abstract void populeazaDB(Context context);
    protected abstract List<String> getNumeCurs();
    protected abstract List<Curs> getCurs();
    protected abstract Sectiune getSectiune(int lectieid, int nrsectiune);
    protected abstract String getIntrebare(int lectieid);
    protected abstract String getTitlulectie(int lectieid);
<<<<<<< HEAD
    protected abstract Level getLevel();
=======
    protected abstract Level getNivel();
>>>>>>> 2c82b41... LNQ
    protected abstract int updateRezultate(int lectieid, int newResult);

}
