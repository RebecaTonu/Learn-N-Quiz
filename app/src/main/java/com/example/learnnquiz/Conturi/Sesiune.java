package com.example.learnnquiz.Conturi;

import android.content.Context;
import android.content.SharedPreferences;

public class Sesiune {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;

    public Sesiune(Context ctx){
        this.ctx = ctx;
        prefs = ctx.getSharedPreferences("myapp", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void setLoggedin(boolean logggedin){
        editor.putBoolean("loggedInmode",logggedin);
        editor.commit();
    }

    public boolean loggedin(){
        return prefs.getBoolean("loggedInmode", false);
    }
}


