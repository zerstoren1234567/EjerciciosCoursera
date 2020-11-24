package com.curso.coursera.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class BaseDatos extends SQLiteOpenHelper {

    private Context context;
    public BaseDatos(@Nullable Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String queryCrearTablaContacto =
                "CREATE TABLE " + ConstantesBaseDatos.TABLE_PERROS + "(" +
                ConstantesBaseDatos.TABLE_PERROS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ConstantesBaseDatos.TABLE_PERROS_NOMBRE + " TEXT, "
                + ConstantesBaseDatos.TABLE_PERROS_RANKING + " TEXT, "
                + ConstantesBaseDatos.TABLE_PERROS_FOTO + " INTEGER"
                + ")";


        String queryCrearTablaCincoPerros =
                "CREATE TABLE " + ConstantesBaseDatos.TABLE_CINCO_PERROS + "(" +
                ConstantesBaseDatos.TABLE_CINCO_PERROS_ID + " INTEGER, "
                + ConstantesBaseDatos.TABLE_CINCO_PERROS_NOMBRE + " TEXT, "
                + ConstantesBaseDatos.TABLE_CINCO_PERROS_RANKING + " TEXT, "
                + ConstantesBaseDatos.TABLE_CINCO_PERROS_FOTO + " INTEGER"
                + ")";

        sqLiteDatabase.execSQL(queryCrearTablaContacto);
        sqLiteDatabase.execSQL(queryCrearTablaCincoPerros);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ConstantesBaseDatos.TABLE_PERROS);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ConstantesBaseDatos.TABLE_CINCO_PERROS);
        onCreate(sqLiteDatabase);
    }

    public ArrayList<Perro> obtenerTodosLosPerros(){
        ArrayList<Perro> perros = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_PERROS;
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        while (cursor.moveToNext()){
            /*Perro perro = new Perro();
            perro.setId(cursor.getInt(0));
            perro.setNombre(cursor.getString(1));
            perro.setRank(cursor.getString(2));
            perro.setFoto(cursor.getInt(3));

            perros.add(perro);*/
        }
        sqLiteDatabase.close();
        return perros;
    }

    public void insertarPerro(ContentValues contentValues){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(ConstantesBaseDatos.TABLE_PERROS, null, contentValues);
        sqLiteDatabase.close();
    }

    public void insertarRank(ContentValues contentValues){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(ConstantesBaseDatos.TABLE_PERROS, null, contentValues);
        sqLiteDatabase.close();
    }

}
