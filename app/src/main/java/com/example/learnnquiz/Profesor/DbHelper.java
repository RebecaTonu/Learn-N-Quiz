package com.example.learnnquiz.Profesor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.learnnquiz.Profesor.DbContract.*;

public class DbHelper extends SQLiteOpenHelper {
<<<<<<< HEAD

    private static final int DATABASE_VERSION = 25;

    public static final String DATABASE_NAME ="Adminview.db";

    public DbHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);

=======
    private static final int DATABASE_VERSION = 25;
    public static final String DATABASE_NAME ="Adminview.db";
    public DbHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
>>>>>>> 2c82b41... LNQ
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        final String SQL_CREATE_PARTICIPANT_TABLE="create table "+ Participant.TABLE_NAME+" ("+
               Participant._ID+" integer primary key autoincrement,"+
               Participant.COLUMN_FOREIGN_KEY_CLASA + " integer not null,"+
               Participant.COLUMN_PARTICIPANT_NUME +" text not null, "+
               Participant.COLUMN_EMAIL+" text, "+
               " foreign key (" + Participant.COLUMN_FOREIGN_KEY_CLASA + ") references "+
                Clasa.TABLE_NAME+" ("+ Clasa._ID+"));";
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        final String SQL_CREATE_CLASACONTINUT_TABLE="create table "+ ClasaContinut.TABLE_NAME+" ("+
                ClasaContinut._ID+" integer primary key autoincrement,"+
                ClasaContinut.COLUMN_FOREIGN_KEY_CLASA + " integer not null,"+
                ClasaContinut.COLUMN_DATA +" text not null, "+
                ClasaContinut.COLUMN_TIMESTAMP+" integer not null, "+
                ClasaContinut.COLUMN_MATERIE +" text, "+
                ClasaContinut.COLUMN_DIFICULTATE +" text, "+
                ClasaContinut.COLUMN_PRECIZARI +" text, "+
                " foreign key (" + ClasaContinut.COLUMN_FOREIGN_KEY_CLASA + ") references "+
                Clasa.TABLE_NAME+" ("+ Clasa._ID+"));";
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        final String SQL_CREATE_CLASA_TABLE="create table "+ Clasa.TABLE_NAME+" ("+
                Clasa._ID+" integer primary key autoincrement,"+
                Clasa.COLUMN_TITLU +" text not null, "+
                Clasa.COLUMN_METODA +" text not null, "+
                Clasa.COLUMN_DATA +" text not null, "+
                Clasa.COLUMN_TIMP +" text not null, "+
                Clasa.COLUMN_DURATA +" text not null, "+
                Clasa.COLUMN_DIFICULTATE +" text, "+
                Clasa.COLUMN_MENTIUNI_PARTICIPANT +" text);";
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        final String SQL_CREATE_PARTICIPANTPARTI_TABLE="create table "+ ParticipantParti.TABLE_NAME+" ("+
                ParticipantParti._ID+" integer primary key autoincrement,"+
                ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT + " integer, "
                + ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT + " integer, "
                + ParticipantParti.COLUMN_STATUS+" text, "
                +"foreign key("+ ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT +") references "
                + Participant.TABLE_NAME+"("+ Participant._ID+"), "
                +"foreign key("+ ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT +") references "
                + ClasaContinut.TABLE_NAME+"("+ ClasaContinut._ID+"));";
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        db.execSQL(SQL_CREATE_CLASA_TABLE);
        db.execSQL(SQL_CREATE_CLASACONTINUT_TABLE);
        db.execSQL(SQL_CREATE_PARTICIPANT_TABLE);
        db.execSQL(SQL_CREATE_PARTICIPANTPARTI_TABLE);
<<<<<<< HEAD

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


=======
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
>>>>>>> 2c82b41... LNQ
        db.execSQL("DROP TABLE IF EXISTS " + Clasa.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + ClasaContinut.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Participant.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + ParticipantParti.TABLE_NAME);

        onCreate(db);
    }
}
