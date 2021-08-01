package com.example.learnnquiz;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


<<<<<<< HEAD
import com.example.learnnquiz.obiecte.Curs;
import com.example.learnnquiz.obiecte.Lectie;

import com.example.learnnquiz.obiecte.Level;
import com.example.learnnquiz.obiecte.Sectiune;
=======
import com.example.learnnquiz.Obiecte.Curs;
import com.example.learnnquiz.Obiecte.Lectie;

import com.example.learnnquiz.Obiecte.Level;
import com.example.learnnquiz.Obiecte.Sectiune;
>>>>>>> 2c82b41... LNQ

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import static com.example.learnnquiz.Preferinte.BOUNDARIES;
import static com.example.learnnquiz.Preferinte.LEVELS;

public class LNQDB extends Contract {

    private static final int DATABASE_VERSION = 200;
    private static final String DATABASE_NAME = "lessons.db";
    private static final String TABLE_NAME_LESSONS = "lesson";
    private static final String TABLE_NAME_COURSES = "course";
    private static final String SQL_CHECK = "SELECT count(*) FROM sqlite_master WHERE type = 'table' AND name != 'android_metadata' AND name != 'sqlite_sequence';";

    private static final String LESSON_COLUMN_ID = "_id";
    private static final String LESSON_COLUMN_TITLE = "title";
    private static final String LESSON_COLUMN_COURSEID = "courseid";
    private static final String[] LESSON_COLUMN_SECTIONS = {"section0", "section1", "section2", "section3", "section4", "section5", "section6", "section7", "section8", "section9"};
    private static final String LESSON_COLUMN_QUESTIONS = "questions";
    private static final String LESSON_COLUMN_RESULT = "result";
    private static final String LESSON_COLUMN_NSECTIONS = "nsections";

    private static final String COURSE_COLUMN_ID = "_id";
    private static final String COURSE_COLUMN_TITLE = "title";
=======
import static com.example.learnnquiz.Preferinte.PUNCTAJE;
import static com.example.learnnquiz.Preferinte.NIVEL;

public class LNQDB extends Contract {

    private static final int DATABASE_VERSION = 268;
    private static final String DATABASE_NAME = "lectii.db";
    private static final String TABLE_NAME_LECTIE = "lectie";
    private static final String TABLE_NAME_CURS = "curs";
    private static final String SQL_CHECK = "SELECT count(*) FROM sqlite_master WHERE type = 'table' AND name != 'android_metadata' AND name != 'sqlite_sequence';";
    private static final String LECTIE_COLUMN_ID = "_id";
    private static final String LECTIE_COLUMN_TITLU = "titlu";
    private static final String LECTIE_COLUMN_CURSID = "cursid";
    private static final String[] LECTIE_COLUMN_PARTE = {"partea0", "partea1", "partea2", "partea3", "partea4", "partea5", "partea6", "partea7", "partea8", "partea9"};
    private static final String LECTIE_COLUMN_INTREBARE = "intrebare";
    private static final String LECTIE_COLUMN_REZULTATE = "rezultate";
    private static final String LECTIE_COLUMN_PARTINR = "partinr";
    private static final String CURS_COLUMN_ID = "_id";
    private static final String CURS_COLUMN_TITLU = "titlu";
>>>>>>> 2c82b41... LNQ

    private LNQDBOpenHelper openHelper;
    private final SQLiteDatabase database;

    private static LNQDB instance = null;

    private LNQDB(Context context){
        openHelper = new LNQDBOpenHelper(context);
        database = openHelper.getReadableDatabase();

        Cursor cursor = database.rawQuery(SQL_CHECK, null);
        cursor.moveToFirst();
        int tables = cursor.getInt(0);
        cursor.close();

        if(tables < 2){
<<<<<<< HEAD
            Log.w("Database","Populating database");
=======
            Log.w("BD","Populeaza BD");
>>>>>>> 2c82b41... LNQ
            populeazaDB(context);
        }
    }

    public static LNQDB getInstance(Context context){
        if(instance == null){
            instance = new LNQDB(context);
        }
        return instance;
    }
    @Override
    protected void populeazaDB(Context context){
        AssetManager assetManager = context.getAssets();

        InputStream input;
        try {
<<<<<<< HEAD
            input = assetManager.open("lessonsdb.sql");
=======
            input = assetManager.open("lnqdb.sql");
>>>>>>> 2c82b41... LNQ

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();
            String SQL_CREATE_TABLE_BAZA = new String(buffer);

            String[] comenzi = SQL_CREATE_TABLE_BAZA.split(";");

            for(String com : comenzi){
                if(com.length()>4 && (!(com.toLowerCase().contains("commit") && com.length() < 15))
                        && (!(com.toLowerCase().contains("begin transaction") && com.length() < 30))){
                    database.execSQL(com);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public LNQDBOpenHelper getOpenHelper (Context context){
        openHelper = new LNQDBOpenHelper(context);
        return openHelper;
    }

    public SQLiteDatabase getWritableDatabase (Context context){
        openHelper = new LNQDBOpenHelper(context);
        SQLiteDatabase db = openHelper.getReadableDatabase();
        return db;
    }

    @Override
    public List<String> getNumeCurs(){
        openHelper.getWritableDatabase();
        Cursor cursor = database.rawQuery(
<<<<<<< HEAD
                "SELECT " + COURSE_COLUMN_TITLE + " FROM " + TABLE_NAME_COURSES + " ORDER BY " + COURSE_COLUMN_ID,
=======
                "SELECT " + CURS_COLUMN_TITLU + " FROM " + TABLE_NAME_CURS + " ORDER BY " + CURS_COLUMN_ID,
>>>>>>> 2c82b41... LNQ
                null
        );

        List<String> list = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String str = cursor.getString(0);
            list.add(str);
            cursor.moveToNext();
        }

        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        return list;
    }

    @Override
    public List<Curs> getCurs(){
        openHelper.getWritableDatabase();
        Cursor cursor = database.rawQuery(
<<<<<<< HEAD
                "SELECT " + COURSE_COLUMN_ID + ", " + COURSE_COLUMN_TITLE + " FROM " + TABLE_NAME_COURSES,
=======
                "SELECT " + CURS_COLUMN_ID + ", " + CURS_COLUMN_TITLU + " FROM " + TABLE_NAME_CURS,
>>>>>>> 2c82b41... LNQ
                null
        );

        List<Curs> list = new ArrayList<>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Curs curs = new Curs(cursor.getInt(0), cursor.getString(1));
            List<Lectie> lectie = new ArrayList<>();
<<<<<<< HEAD
            Cursor curles = database.rawQuery( "SELECT _id, title, result, nsections FROM lesson WHERE courseid = " + curs.getId(), null);
=======
            Cursor curles = database.rawQuery( "SELECT _id, titlu, rezultate, partinr FROM lectie WHERE cursid = " + curs.getId(), null);
>>>>>>> 2c82b41... LNQ
            curles.moveToFirst();
            while (!curles.isAfterLast()){
                Lectie lectie1 = new Lectie(curles.getInt(0), curles.getString(1), curles.getInt(2),curles.getInt(3));
                lectie.add(lectie1);
                curles.moveToNext();
            }
            if (curles != null && !curles.isClosed()) {
                curles.close();
            }
            curs.setLectie(lectie);
            list.add(curs);
            cursor.moveToNext();
        }

        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        return list;
    }

    @Override
    public Sectiune getSectiune(int lectieid, int nrsectiune){
<<<<<<< HEAD
        String sql = "SELECT title, nsections, " + LESSON_COLUMN_SECTIONS[nrsectiune] + " FROM lesson WHERE _id = " + lectieid;
=======
        String sql = "SELECT titlu, partinr, " + LECTIE_COLUMN_PARTE[nrsectiune] + " FROM lectie WHERE _id = " + lectieid;
>>>>>>> 2c82b41... LNQ
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        if(!cursor.isAfterLast()){
            String Titlulectie = cursor.getString(0);
            int Sectiunelectie = cursor.getInt(1);
            String sec = cursor.getString(2);
            String titlu = sec.split("<<-->>")[0];
            String text = sec.split("<<-->>")[1];

            cursor.close();

            return new Sectiune(lectieid, nrsectiune, titlu, text, Titlulectie, Sectiunelectie);
        } else {

            cursor.close();
            return null;
        }
    }

    @Override
    public String getIntrebare(int lectieid){
<<<<<<< HEAD
        String sql = "SELECT questions FROM lesson WHERE _id = " + lectieid;
=======
        String sql = "SELECT intrebare FROM lectie WHERE _id = " + lectieid;
>>>>>>> 2c82b41... LNQ
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        if(!cursor.isAfterLast()){
<<<<<<< HEAD
            String questions = cursor.getString(0);
            cursor.close();
            return questions;
=======
            String intrebare = cursor.getString(0);
            cursor.close();
            return intrebare;
>>>>>>> 2c82b41... LNQ
        } else {

            cursor.close();
            return "";
        }
    }

    @Override
    public String getTitlulectie(int lectieid){
<<<<<<< HEAD
        String sql = "SELECT title FROM lesson WHERE _id = " + lectieid;
=======
        String sql = "SELECT titlu FROM lectie WHERE _id = " + lectieid;
>>>>>>> 2c82b41... LNQ
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        if(!cursor.isAfterLast()) {
            String titlu = cursor.getString(0);
            cursor.close();
            return titlu;
        } else {

            cursor.close();
            return "";
        }
    }
    @Override
<<<<<<< HEAD
    public Level getLevel(){
        String sql = "SELECT SUM(result), COUNT(nsections), COUNT(DISTINCT courseid) FROM lesson";
=======
    public Level getNivel(){
        String sql = "SELECT SUM(rezultate), COUNT(partinr), COUNT(DISTINCT cursid) FROM lectie";
>>>>>>> 2c82b41... LNQ
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        if(cursor.isAfterLast()){

            cursor.close();
            return null;
        }

        int totintrebari = cursor.getInt(0) * 5;
        int totpuncte = cursor.getInt(1) * 50;
        int nrcurs = cursor.getInt(2);
        cursor.close();
        int liv = 0;
<<<<<<< HEAD
        for(int i = LEVELS.length-1; i>=0; i--){
            if(totintrebari >= BOUNDARIES[i]){
=======
        for(int i = NIVEL.length-1; i>=0; i--){
            if(totintrebari >= PUNCTAJE[i]){
>>>>>>> 2c82b41... LNQ
                liv = i;
                break;
            }
        }

<<<<<<< HEAD
        int prog = totintrebari - BOUNDARIES[liv];
        int tot;
        if(liv == LEVELS.length-1){
            tot = totpuncte;
        } else {
            tot = BOUNDARIES[liv+1] - BOUNDARIES[liv];
=======
        int prog = totintrebari - PUNCTAJE[liv];
        int tot;
        if(liv == NIVEL.length-1){
            tot = totpuncte;
        } else {
            tot = PUNCTAJE[liv+1] - PUNCTAJE[liv];
>>>>>>> 2c82b41... LNQ
        }
        int proc = prog*100/tot;

        int[] procCurs = new int[nrcurs];
<<<<<<< HEAD
        String sql2 = "SELECT SUM(result), COUNT(_id) FROM lesson GROUP BY courseid ORDER BY courseid";
=======
        String sql2 = "SELECT SUM(rezultate), COUNT(_id) FROM lectie GROUP BY cursid ORDER BY cursid";
>>>>>>> 2c82b41... LNQ
        cursor = database.rawQuery(sql2, null);
        cursor.moveToFirst();
        int idx = 0;
        while (!cursor.isAfterLast()){
            procCurs[idx] = cursor.getInt(0) * 10 / cursor.getInt(1);
            idx++;
            cursor.moveToNext();
        }
        cursor.close();

<<<<<<< HEAD
        return new Level(proc, LEVELS[liv], prog, tot, procCurs);
=======
        return new Level(proc, NIVEL [liv], prog, tot, procCurs);
>>>>>>> 2c82b41... LNQ
    }


    @Override
    public int updateRezultate(int lectieid, int newResult){
<<<<<<< HEAD
        String sql = "SELECT result FROM lesson WHERE _id = " + lectieid;
=======
        String sql = "SELECT rezultate FROM lectie WHERE _id = " + lectieid;
>>>>>>> 2c82b41... LNQ
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        int oldResult = cursor.getInt(0);
        cursor.close();

        if(newResult > oldResult){
<<<<<<< HEAD
            String update = "UPDATE lesson SET result = " + newResult + " WHERE _id = " + lectieid;
=======
            String update = "UPDATE lectie SET rezultate = " + newResult + " WHERE _id = " + lectieid;
>>>>>>> 2c82b41... LNQ
            database.execSQL(update);
            return newResult - oldResult;
        }
        return 0;
    }

    private class LNQDBOpenHelper extends SQLiteOpenHelper {

        public LNQDBOpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
<<<<<<< HEAD
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_COURSES);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_LESSONS);
=======
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_CURS);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_LECTIE);
>>>>>>> 2c82b41... LNQ

            onCreate(db);
        }
    }
}
