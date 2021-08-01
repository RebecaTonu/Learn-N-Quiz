package com.example.learnnquiz.Profesor;

import android.net.Uri;
import android.provider.BaseColumns;


public class DbContract {

    public static final String AUTHORITY = "com.example.learnnquiz.Profesor";
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);
    public static final Uri CLASA_ZI_TITLU_ORA_ID= BASE_CONTENT_URI.buildUpon().appendPath("CLASA_ZI_TITLU_ORA_ID").build();
    public static final String PATH_PARTICIPANT = "participant";
    public static final String PATH_PARTICIPANT_WITH_FOREIGNKEY = "participantWithForeignKey";
    public static final String PATH_CLASA = "clasa";
    public static final String PATH_CLASACONTINUT = "clasaContinut";
    public static final String PATH_CLASACONTINUT_WITH_FOREIGNKEY = "clasaContinutWithForeignKey";
    public static final String PATH_PARTICIPANT_PARTI ="participantparti";
    public static final String PATH_PARTICIPANT_PARTI_WITH_CLASACONTINUT_ID ="participantpartiWithClasaContinuttId";
    public static final String PATH_PARTICIPANT_PARTI_WITH_PARTI_ID ="participantpartiWithParticipantId";
<<<<<<< HEAD

    public static final class Participant implements BaseColumns {

=======
    public static final class Participant implements BaseColumns {
>>>>>>> 2c82b41... LNQ
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT).build();
        public static final Uri CONTENT_URI_WITH_FOREIGNKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_WITH_FOREIGNKEY).build();
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + AUTHORITY + "/" + PATH_PARTICIPANT;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + AUTHORITY + "/" + PATH_PARTICIPANT;
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        public static final String TABLE_NAME="participant";
        public static final String COLUMN_PARTICIPANT_NUME ="participantNume";
        public static final String COLUMN_EMAIL="email";
        public static final String COLUMN_FOREIGN_KEY_CLASA ="clasaID";
    }
    public static final class Clasa implements BaseColumns {
<<<<<<< HEAD

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASA).build();

=======
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASA).build();
>>>>>>> 2c82b41... LNQ
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + AUTHORITY + "/" + PATH_CLASA;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + AUTHORITY + "/" + PATH_CLASA;
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        public static final String TABLE_NAME="clasa";
        public static final String COLUMN_TITLU ="titlu";
        public static final String COLUMN_METODA ="metoda";
        public static final String COLUMN_DATA ="data";
        public static final String COLUMN_TIMP ="timp";
        public static final String COLUMN_DURATA ="durata";
        public static final String COLUMN_DIFICULTATE ="dificultate";
        public static final String COLUMN_MENTIUNI_PARTICIPANT ="mentiunipp";
    }
    public static final class ClasaContinut implements BaseColumns {
<<<<<<< HEAD

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASACONTINUT).build();
    public static final Uri CONTENT_URI_WITH_FOREIGNKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASACONTINUT_WITH_FOREIGNKEY).build();

=======
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASACONTINUT).build();
    public static final Uri CONTENT_URI_WITH_FOREIGNKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_CLASACONTINUT_WITH_FOREIGNKEY).build();
>>>>>>> 2c82b41... LNQ
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + AUTHORITY + "/" + PATH_CLASACONTINUT;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + AUTHORITY + "/" + PATH_CLASACONTINUT;
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        public static final String TABLE_NAME="clasacontinut";
        public static final String COLUMN_DATA ="data";
        public static final String COLUMN_TIMESTAMP="timestamp";
        public static final String COLUMN_MATERIE ="materie";
        public static final String COLUMN_DIFICULTATE ="dificultate";
        public static final String COLUMN_PRECIZARI ="precizari";
        public static final String COLUMN_FOREIGN_KEY_CLASA ="clasaID";
    }
<<<<<<< HEAD

    public static final class ParticipantParti implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI).build();
        public static final Uri CONTENT_URI_WITH_PARTICIPANTKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI_WITH_PARTI_ID).build();
        public static final Uri CONTENT_URI_WITH_CLASACONTINUTKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI_WITH_CLASACONTINUT_ID).build();


=======
    public static final class ParticipantParti implements BaseColumns {
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI).build();
        public static final Uri CONTENT_URI_WITH_PARTICIPANTKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI_WITH_PARTI_ID).build();
        public static final Uri CONTENT_URI_WITH_CLASACONTINUTKEY = BASE_CONTENT_URI.buildUpon().appendPath(PATH_PARTICIPANT_PARTI_WITH_CLASACONTINUT_ID).build();
>>>>>>> 2c82b41... LNQ
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + AUTHORITY + "/" + PATH_PARTICIPANT_PARTI;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + AUTHORITY + "/" + PATH_PARTICIPANT_PARTI;
<<<<<<< HEAD


=======
>>>>>>> 2c82b41... LNQ
        public static final String TABLE_NAME="participantparti";
        public static final String COLUMN_STATUS="participantStatus";
        public static final String COLUMN_FOREIGN_KEY_PARTICIPANT ="participantId";
        public static final String COLUMN_FOREIGN_KEY_CLASACONTINUT ="clasaContinutID";
    }
<<<<<<< HEAD

=======
>>>>>>> 2c82b41... LNQ
}
