package com.example.learnnquiz.Conturi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Participantdb extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =8;
    private static final String DATABASE_NAME = "participant.db";
    private static final String TABLE_PARTICIPANT = "participant";
    private static final String COLUMN_PARTICIPANT_ID = "participant_id";
    private static final String COLUMN_PARTICIPANT_NUME = "participant_nume";
    private static final String COLUMN_PARTICIPANT_EMAIL = "participant_email";
    private static final String COLUMN_PARTICIPANT_PAROLA = "participant_parola";


    private String CREATE_PARTICIPANT_TABLE = "CREATE TABLE " + TABLE_PARTICIPANT + "("
            + COLUMN_PARTICIPANT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_PARTICIPANT_NUME + " TEXT,"
            + COLUMN_PARTICIPANT_EMAIL + " TEXT," + COLUMN_PARTICIPANT_PAROLA + ")";

    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_PARTICIPANT;

    public Participantdb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PARTICIPANT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_USER_TABLE);
        onCreate(db);
    }

    public void addUtilizator(Admin admin) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_PARTICIPANT_NUME, admin.getNume());
        values.put(COLUMN_PARTICIPANT_EMAIL, admin.getEmail());
        values.put(COLUMN_PARTICIPANT_PAROLA, admin.getParola());



        db.insert(TABLE_PARTICIPANT, null, values);
        db.close();
    }

    public boolean checkUtilizator(String email) {
        String[] columns = {
                COLUMN_PARTICIPANT_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = COLUMN_PARTICIPANT_EMAIL + " = ?";
        String[] selectionArgs = {email};

        Cursor cursor = db.query(TABLE_PARTICIPANT,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {
            return true;
        }
        return false;
    }

    public boolean checkUtilizator(String email, String password) {
        String[] columns = {
                COLUMN_PARTICIPANT_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = COLUMN_PARTICIPANT_EMAIL + " = ?" + " AND " + COLUMN_PARTICIPANT_PAROLA + " =?";
        String[] selectionArgs = {email, password};

        Cursor cursor = db.query(TABLE_PARTICIPANT,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {
            return true;
        }
        return false;
    }
}
