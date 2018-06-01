package pt.ipg.marcaoconsultas;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class DbTablePacientes implements BaseColumns {
    private static final String FIELD_ID = "idPacientes";
    private static final String FIELD_NAME = "nome";
    private static final String FIELD_SEXO = "sexo";
    private static final String FIELD_MOVEL = "Telemovel";
    private static final String FIELD_ENDERECO_ELETRON = "email";

    private SQLiteDatabase db;

    public DbTablePacientes(SQLiteDatabase db) {
        this.db = db;
    }
    
}
