package com.curso.coursera.db;

import android.content.ContentValues;
import android.content.Context;


import com.curso.coursera.R;
import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class ConstructorPerros {
    private Context context;

    public ConstructorPerros(Context context) {
        this.context = context;
    }

    public ArrayList<Perro> obtenerDatos(){
        /*ArrayList<Perro> perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "Chandoso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Pulgoso", "0"));
        perros.add(new Perro(R.drawable.perro3, "Sarnoso", "0"));
        perros.add(new Perro(R.drawable.perro1, "Mugroso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Garrapatozo", "0"));
        return perros;*/

        BaseDatos baseDatos = new BaseDatos(context);
        insertarCincoPerros(baseDatos);
        return baseDatos.obtenerTodosLosPerros();
    }

    public void insertarCincoPerros(BaseDatos baseDatos){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_NOMBRE, "Chandoso");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_RANKING, "0");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_FOTO, R.drawable.perro1);

        baseDatos.insertarPerro(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_NOMBRE, "Pulgoso");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_RANKING, "0");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_FOTO, R.drawable.perro2);

        baseDatos.insertarPerro(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_NOMBRE, "Sarnoso");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_RANKING, "0");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_FOTO, R.drawable.perro3);

        baseDatos.insertarPerro(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_NOMBRE, "Mugroso");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_RANKING, "0");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_FOTO, R.drawable.perro1);

        baseDatos.insertarPerro(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_NOMBRE, "Garrapatozo");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_RANKING, "0");
        contentValues.put(ConstantesBaseDatos.TABLE_PERROS_FOTO, R.drawable.perro2);

        baseDatos.insertarPerro(contentValues);

    }

    public void insertarPerro(Perro perro){
        BaseDatos baseDatos = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CINCO_PERROS_ID, perro.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_CINCO_PERROS_NOMBRE, perro.getNombre());
        contentValues.put(ConstantesBaseDatos.TABLE_CINCO_PERROS_RANKING, perro.getRank());
        contentValues.put(ConstantesBaseDatos.TABLE_CINCO_PERROS_FOTO, perro.getUrlFoto());
        baseDatos.insertarRank(contentValues);

    }
}
