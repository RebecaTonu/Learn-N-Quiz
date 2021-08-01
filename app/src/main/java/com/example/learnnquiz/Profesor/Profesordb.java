package com.example.learnnquiz.Profesor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.learnnquiz.Conturi.Admin;
public class Profesordb extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 8;
    private static final String DATABASE_NAME = "Profesor.db";
    private static final String TABLE_PROFESOR = "profesor";
    private static final String COLUMN_PROFESOR_ID = "profesor_id";
    private static final String COLUMN_PROFESOR_NUME = "profesor_nume";
    private static final String COLUMN_PROFESOR_EMAIL = "profesor_email";
    private static final String COLUMN_PROFESOR_PAROLA = "profesor_password";
<<<<<<< HEAD


    private String CREATE_PROFESOR_TABLE = "CREATE TABLE " + TABLE_PROFESOR + "("
            + COLUMN_PROFESOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_PROFESOR_NUME + " TEXT,"
            + COLUMN_PROFESOR_EMAIL + " TEXT," + COLUMN_PROFESOR_PAROLA + ")";

    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_PROFESOR;

    public Profesordb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

=======
    private String CREATE_PROFESOR_TABLE = "CREATE TABLE " + TABLE_PROFESOR + "("
            + COLUMN_PROFESOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_PROFESOR_NUME + " TEXT,"
            + COLUMN_PROFESOR_EMAIL + " TEXT," + COLUMN_PROFESOR_PAROLA + ")";
    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_PROFESOR;
    public Profesordb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROFESOR_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_USER_TABLE);
        onCreate(db);
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public void addProfesor(Admin admin) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_PROFESOR_NUME, admin.getNume());
        values.put(COLUMN_PROFESOR_EMAIL, admin.getEmail());
        values.put(COLUMN_PROFESOR_PAROLA, admin.getParola());
<<<<<<< HEAD



        db.insert(TABLE_PROFESOR, null, values);
        db.close();
    }

=======
        db.insert(TABLE_PROFESOR, null, values);
        db.close();
    }
>>>>>>> 2c82b41... LNQ
    public boolean checkProfesor(String email) {
        String[] columns = {
                COLUMN_PROFESOR_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = COLUMN_PROFESOR_EMAIL + " = ?";
        String[] selectionArgs = {email};
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        Cursor cursor = db.query(TABLE_PROFESOR,
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
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
    public boolean checkProfesor(String email, String password) {
        String[] columns = {
                COLUMN_PROFESOR_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = COLUMN_PROFESOR_EMAIL + " = ?" + " AND " + COLUMN_PROFESOR_PAROLA + " =?";
        String[] selectionArgs = {email, password};
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
        Cursor cursor = db.query(TABLE_PROFESOR,
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
