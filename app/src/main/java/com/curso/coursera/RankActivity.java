package com.curso.coursera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.curso.coursera.adaptador.PerroAdaptador;
import com.curso.coursera.model.Perro;

import java.util.ArrayList;

public class RankActivity extends AppCompatActivity {

    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        listaPerros = findViewById(R.id.rvRecycler);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPerros.setLayoutManager(llm);

        perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "Chandoso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Pulgoso", "0"));
        perros.add(new Perro(R.drawable.perro3, "Sarnoso", "0"));
        perros.add(new Perro(R.drawable.perro1, "Mugroso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Garrapatozo", "0"));


        PerroAdaptador perroAdaptador = new PerroAdaptador(perros, this);
        listaPerros.setAdapter(perroAdaptador);
    }
}