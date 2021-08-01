package com.example.learnnquiz.Profesor;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> 2c82b41... LNQ

import static com.example.learnnquiz.Profesor.DbContract.*;


public class ClasaContinutProv extends ContentProvider {

    private static final int CLASA =1;
    private static final int CLASA_ID =2;
<<<<<<< HEAD
    private static final int CLASA_ZI_TITLU_ORA_ID =101;
    private static final int PARTICIPANT =3;
    private static final int PARTICIPANT_ID =4;
    private static final int PARTICIPANT_CLASA_ID =401;
    private static final int CLASACONTINUT =5;
    private static final int CLASACONTINUT_ID =6;
    private static final int CLASACONTINUT_CLASA_ID =601;
    private static final int PARTICIPANTPARTI =7;
    private static final int PARTICIPANTPARTI_ID =8;
    private static final int PARTICIPANTPARTI_PARTICIPANT_ID =801;
    private static final int PARTICIPANTPARTI_CLASACONTINUT_ID =802;

    private static final UriMatcher mUriMatcher=new UriMatcher(UriMatcher.NO_MATCH);

    static {
        mUriMatcher.addURI(AUTHORITY, PATH_CLASA, CLASA);
        mUriMatcher.addURI(AUTHORITY, PATH_CLASA +"/#", CLASA_ID);

        mUriMatcher.addURI(AUTHORITY,"CLASA_ZI_TITLU_ORA_ID", CLASA_ZI_TITLU_ORA_ID);

        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT, PARTICIPANT);
        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT +"/#", PARTICIPANT_ID);
        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_WITH_FOREIGNKEY +"/#", PARTICIPANT_CLASA_ID);

        mUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT, CLASACONTINUT);
        mUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT +"/#", CLASACONTINUT_ID);
        mUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT_WITH_FOREIGNKEY +"/#", CLASACONTINUT_CLASA_ID);

        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI, PARTICIPANTPARTI);
        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI_WITH_CLASACONTINUT_ID +"/#", PARTICIPANTPARTI_CLASACONTINUT_ID);
        mUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI_WITH_PARTI_ID +"/#", PARTICIPANTPARTI_PARTICIPANT_ID);
    }

    SQLiteDatabase mdataBase;
=======
    private static final int CLASA_ZI_TITLU_ORA_ID =11;
    private static final int PARTICIPANT =3;
    private static final int PARTICIPANT_ID =4;
    private static final int PARTICIPANT_CLASA_ID =41;
    private static final int CLASACONTINUT =5;
    private static final int CLASACONTINUT_ID =6;
    private static final int CLASACONTINUT_CLASA_ID =61;
    private static final int PARTICIPANTPARTI =7;
    private static final int PARTICIPANTPARTI_ID =8;
    private static final int PARTICIPANTPARTI_PARTICIPANT_ID =81;
    private static final int PARTICIPANTPARTI_CLASACONTINUT_ID =82;

    private static final UriMatcher nUriMatcher =new UriMatcher(UriMatcher.NO_MATCH);

    static {
        nUriMatcher.addURI(AUTHORITY, PATH_CLASA, CLASA);
        nUriMatcher.addURI(AUTHORITY, PATH_CLASA +"/#", CLASA_ID);

        nUriMatcher.addURI(AUTHORITY,"CLASA_ZI_TITLU_ORA_ID", CLASA_ZI_TITLU_ORA_ID);

        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT, PARTICIPANT);
        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT +"/#", PARTICIPANT_ID);
        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_WITH_FOREIGNKEY +"/#", PARTICIPANT_CLASA_ID);

        nUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT, CLASACONTINUT);
        nUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT +"/#", CLASACONTINUT_ID);
        nUriMatcher.addURI(AUTHORITY, PATH_CLASACONTINUT_WITH_FOREIGNKEY +"/#", CLASACONTINUT_CLASA_ID);

        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI, PARTICIPANTPARTI);
        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI_WITH_CLASACONTINUT_ID +"/#", PARTICIPANTPARTI_CLASACONTINUT_ID);
        nUriMatcher.addURI(AUTHORITY, PATH_PARTICIPANT_PARTI_WITH_PARTI_ID +"/#", PARTICIPANTPARTI_PARTICIPANT_ID);
    }

    SQLiteDatabase ndataBase;
>>>>>>> 2c82b41... LNQ
    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
<<<<<<< HEAD
        mdataBase=new DbHelper(getContext()).getReadableDatabase();
        Cursor cursor=null;
        switch(mUriMatcher.match(uri)) {
            case CLASA:
                cursor=mdataBase.query(Clasa.TABLE_NAME, new String[]{Clasa._ID,
=======
        ndataBase =new DbHelper(getContext()).getReadableDatabase();
        Cursor cursor=null;
        switch(nUriMatcher.match(uri)) {
            case CLASA:
                cursor= ndataBase.query(Clasa.TABLE_NAME, new String[]{Clasa._ID,
>>>>>>> 2c82b41... LNQ
                        Clasa.COLUMN_TITLU,
                        Clasa.COLUMN_METODA},null,null, null, null, null);
                break;
            case CLASA_ID:
                String id=uri.getLastPathSegment();
<<<<<<< HEAD
                cursor=mdataBase.query(Clasa.TABLE_NAME, new String[]{Clasa.COLUMN_DATA,
=======
                cursor= ndataBase.query(Clasa.TABLE_NAME, new String[]{Clasa.COLUMN_DATA,
>>>>>>> 2c82b41... LNQ
                        Clasa.COLUMN_DURATA,
                        Clasa.COLUMN_MENTIUNI_PARTICIPANT,
                        Clasa.COLUMN_DIFICULTATE,
                        Clasa.COLUMN_METODA,
                        Clasa.COLUMN_TIMP,
                        Clasa.COLUMN_TITLU}, Clasa._ID+" =?", new String[]{id}, null, null, null);
                break;
            case CLASA_ZI_TITLU_ORA_ID:
<<<<<<< HEAD
                cursor = mdataBase.query(Clasa.TABLE_NAME, new String[]{
=======
                cursor = ndataBase.query(Clasa.TABLE_NAME, new String[]{
>>>>>>> 2c82b41... LNQ
                        Clasa._ID, Clasa.COLUMN_TITLU,
                        Clasa.COLUMN_TIMP,
                        Clasa.COLUMN_DURATA,
                        Clasa.COLUMN_DATA}, null, null, null, null, null);
                break;
            case PARTICIPANT_CLASA_ID:
<<<<<<< HEAD
                String classId=uri.getLastPathSegment();
                cursor=mdataBase.query(Participant.TABLE_NAME, new String[]{
=======
                String clasaId=uri.getLastPathSegment();
                cursor= ndataBase.query(Participant.TABLE_NAME, new String[]{
>>>>>>> 2c82b41... LNQ
                        Participant._ID,
                        Participant.COLUMN_PARTICIPANT_NUME,
                        Participant.COLUMN_EMAIL

<<<<<<< HEAD
                }, Participant.COLUMN_FOREIGN_KEY_CLASA +" =?", new String[]{classId}, null, null, null);





                break;
            case CLASACONTINUT:
                cursor=mdataBase.query(ClasaContinut.TABLE_NAME,new String[]{
=======
                }, Participant.COLUMN_FOREIGN_KEY_CLASA +" =?", new String[]{clasaId}, null, null, null);
                break;
            case CLASACONTINUT:
                cursor= ndataBase.query(ClasaContinut.TABLE_NAME,new String[]{
>>>>>>> 2c82b41... LNQ
                        ClasaContinut.COLUMN_MATERIE,
                        ClasaContinut.COLUMN_DATA,
                        ClasaContinut.COLUMN_TIMESTAMP,
                        ClasaContinut.COLUMN_DIFICULTATE,
                        ClasaContinut.COLUMN_PRECIZARI,
                        ClasaContinut._ID},null,null,null,null,null);
                break;
            case CLASACONTINUT_CLASA_ID:
<<<<<<< HEAD
                classId=uri.getLastPathSegment();
                cursor=mdataBase.query(ClasaContinut.TABLE_NAME,new String[]{
=======
                clasaId=uri.getLastPathSegment();
                cursor= ndataBase.query(ClasaContinut.TABLE_NAME,new String[]{
>>>>>>> 2c82b41... LNQ
                        ClasaContinut.COLUMN_MATERIE,
                        ClasaContinut.COLUMN_DATA,
                        ClasaContinut.COLUMN_TIMESTAMP,
                        ClasaContinut.COLUMN_DIFICULTATE,
                        ClasaContinut.COLUMN_PRECIZARI,
<<<<<<< HEAD
                        ClasaContinut._ID}, ClasaContinut.COLUMN_FOREIGN_KEY_CLASA +" =?",new String[]{classId},null,null, ClasaContinut.COLUMN_TIMESTAMP+" desc");
=======
                        ClasaContinut._ID}, ClasaContinut.COLUMN_FOREIGN_KEY_CLASA +" =?",new String[]{clasaId},null,null, ClasaContinut.COLUMN_TIMESTAMP+" desc");
>>>>>>> 2c82b41... LNQ
                break;
            case PARTICIPANTPARTI_CLASACONTINUT_ID:
                String clasaContinutId=uri.getLastPathSegment();
                String query="Select "+ ParticipantParti.TABLE_NAME+"."+ ParticipantParti._ID+","
                        + ParticipantParti.TABLE_NAME+"."+ ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT +","
                        + ParticipantParti.TABLE_NAME+"."+ ParticipantParti.COLUMN_STATUS+","
                        + Participant.TABLE_NAME+"."+ Participant.COLUMN_PARTICIPANT_NUME
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
                        +" from "+ ParticipantParti.TABLE_NAME+" inner join "+ Participant.TABLE_NAME+" on "
                        + ParticipantParti.TABLE_NAME+"."+ ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT +" = "
                        + Participant.TABLE_NAME+"."+ Participant._ID+" where "
                        + ParticipantParti.TABLE_NAME+"."+ ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT +" = "+clasaContinutId+";";
<<<<<<< HEAD


                cursor=mdataBase.rawQuery(query,null);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
=======
                cursor= ndataBase.rawQuery(query,null);
                break;
>>>>>>> 2c82b41... LNQ
        }

        return cursor;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        ContentValues vals=values;

        if(vals==null)
            return null;

        String table="";
<<<<<<< HEAD
        mdataBase=new DbHelper(getContext()).getWritableDatabase();

        switch(mUriMatcher.match(uri)) {
=======
        ndataBase =new DbHelper(getContext()).getWritableDatabase();

        switch(nUriMatcher.match(uri)) {
>>>>>>> 2c82b41... LNQ
            case CLASA:

                table= Clasa.TABLE_NAME;
                break;
            case PARTICIPANT:

                table= Participant.TABLE_NAME;
                break;
            case CLASACONTINUT:

                table= ClasaContinut.TABLE_NAME;
                break;
            case PARTICIPANTPARTI:
                table= ParticipantParti.TABLE_NAME;
                break;
<<<<<<< HEAD
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);

        }
        long rowId=mdataBase.insert(table,null,values);
=======
        }
        long rowId= ndataBase.insert(table,null,values);
>>>>>>> 2c82b41... LNQ
        Uri noteUri=null;
        if(rowId>0)
            noteUri= ContentUris.withAppendedId(uri,rowId);

        return noteUri;

    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        int affectedRows=0;
<<<<<<< HEAD
        switch(mUriMatcher.match(uri)) {
            case CLASA_ID:
                String id=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.delete(Clasa.TABLE_NAME, Clasa._ID+"=?",new String[]{id});
=======
        switch(nUriMatcher.match(uri)) {
            case CLASA_ID:
                String id=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.delete(Clasa.TABLE_NAME, Clasa._ID+"=?",new String[]{id});
>>>>>>> 2c82b41... LNQ
                break;
            case PARTICIPANT:
                break;
            case PARTICIPANT_ID:
                id=uri.getLastPathSegment();
<<<<<<< HEAD
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.delete(Participant.TABLE_NAME, Participant._ID+"=?",new String[]{id});
=======
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.delete(Participant.TABLE_NAME, Participant._ID+"=?",new String[]{id});
>>>>>>> 2c82b41... LNQ
                break;
            case CLASACONTINUT:
                break;
            case CLASACONTINUT_ID:
<<<<<<< HEAD
                String classId=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.delete(ClasaContinut.TABLE_NAME,selection,selectionArgs);
                break;
            case PARTICIPANTPARTI_PARTICIPANT_ID:
                String participantId=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.delete(ParticipantParti.TABLE_NAME, ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT +"=?",new String[]{participantId});
                break;
            case PARTICIPANTPARTI_CLASACONTINUT_ID:
                String clasaContinutId=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.delete(ParticipantParti.TABLE_NAME, ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT +"=?",new String[]{clasaContinutId});
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        return affectedRows;
    }

=======
                String clasaId=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.delete(ClasaContinut.TABLE_NAME,selection,selectionArgs);
                break;
            case PARTICIPANTPARTI_PARTICIPANT_ID:
                String participantId=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.delete(ParticipantParti.TABLE_NAME, ParticipantParti.COLUMN_FOREIGN_KEY_PARTICIPANT +"=?",new String[]{participantId});
                break;
            case PARTICIPANTPARTI_CLASACONTINUT_ID:
                String clasaContinutId=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.delete(ParticipantParti.TABLE_NAME, ParticipantParti.COLUMN_FOREIGN_KEY_CLASACONTINUT +"=?",new String[]{clasaContinutId});
                break;
        }
        return affectedRows;
    }
>>>>>>> 2c82b41... LNQ
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        String id="";
        int affectedRows=0;
<<<<<<< HEAD
        switch(mUriMatcher.match(uri)) {
            case CLASA_ID:
                id=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.update(Clasa.TABLE_NAME,values, Clasa._ID+" = ?",new String[]{id});
=======
        switch(nUriMatcher.match(uri)) {
            case CLASA_ID:
                id=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.update(Clasa.TABLE_NAME,values, Clasa._ID+" = ?",new String[]{id});
>>>>>>> 2c82b41... LNQ
                break;
            case PARTICIPANT:
                break;
            case PARTICIPANT_ID:
                id=uri.getLastPathSegment();
<<<<<<< HEAD
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.update(Participant.TABLE_NAME,values, Participant._ID+"=?",new String[]{id});
=======
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.update(Participant.TABLE_NAME,values, Participant._ID+"=?",new String[]{id});
>>>>>>> 2c82b41... LNQ
                break;
            case CLASACONTINUT:
                break;
            case CLASACONTINUT_ID:
<<<<<<< HEAD
                String classId=uri.getLastPathSegment();
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.update(ClasaContinut.TABLE_NAME,values,selection,selectionArgs);
                break;
            case PARTICIPANTPARTI_PARTICIPANT_ID:
                mdataBase=new DbHelper(getContext()).getWritableDatabase();
                affectedRows=mdataBase.update(ParticipantParti.TABLE_NAME,values,selection,selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
=======
                String clasaId=uri.getLastPathSegment();
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.update(ClasaContinut.TABLE_NAME,values,selection,selectionArgs);
                break;
            case PARTICIPANTPARTI_PARTICIPANT_ID:
                ndataBase =new DbHelper(getContext()).getWritableDatabase();
                affectedRows= ndataBase.update(ParticipantParti.TABLE_NAME,values,selection,selectionArgs);
                break;
>>>>>>> 2c82b41... LNQ
        }
        return affectedRows;
    }
}
