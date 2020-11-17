package com.curso.coursera.actividad3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.coursera.Perro;
import com.curso.coursera.PerroAdaptador;
import com.curso.coursera.R;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    /*public RecyclerFragment() {
        // Required empty public constructor
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        listaPerros = view.findViewById(R.id.rvRecycler);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPerros.setLayoutManager(llm);

        perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "Chandoso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Pulgoso", "0"));
        perros.add(new Perro(R.drawable.perro3, "Sarnoso", "0"));
        perros.add(new Perro(R.drawable.perro1, "Mugroso", "0"));
        perros.add(new Perro(R.drawable.perro2, "Garrapatozo", "0"));


        PerroAdaptador perroAdaptador = new PerroAdaptador(perros);
        listaPerros.setAdapter(perroAdaptador);
        // Inflate the layout for this fragment
        return view;


    }
}