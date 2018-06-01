package pt.ipg.marcaoconsultas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDConsultasOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "consultas.db" ;
    private static final int DATABASE_VERSION = 1;


    public BDConsultasOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
