package com.curso.coursera.actividad3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.coursera.model.Perro;
import com.curso.coursera.adaptador.PerroAdaptador;
import com.curso.coursera.R;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        listaPerros = view.findViewById(R.id.rvRecycler);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //listaPerros.setLayoutManager(llm);
        listaPerros.setLayoutManager(new GridLayoutManager(getContext(), 3));

        perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "", "0"));
        perros.add(new Perro(R.drawable.perro2, "", "1"));
        perros.add(new Perro(R.drawable.perro3, "", "2"));
        perros.add(new Perro(R.drawable.perro1, "", "3"));
        perros.add(new Perro(R.drawable.perro2, "", "4"));
        perros.add(new Perro(R.drawable.perro3, "", "5"));


        PerroAdaptador perroAdaptador = new PerroAdaptador(perros, this.getActivity());
        listaPerros.setAdapter(perroAdaptador);
        return view;
    }
}