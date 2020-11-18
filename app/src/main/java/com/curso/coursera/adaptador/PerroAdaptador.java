package com.curso.coursera.adaptador;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.curso.coursera.R;
import com.curso.coursera.db.ConstructorPerros;
import com.curso.coursera.model.Perro;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.PerroViewHolder>{

    ArrayList<Perro> perros;
    Activity activity;
    int flag = 1;

    public PerroAdaptador(ArrayList<Perro> perros, Activity activity) {
        this.perros = perros;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_descripcion, parent, false);
        return new PerroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerroViewHolder holder, int position) {
        Perro perro = perros.get(position);
        holder.ivFoto.setImageResource(perro.getFoto());
        holder.tvNombre.setText(perro.getNombre());
        holder.tvRank.setText(perro.getRank());

        holder.ivHuesoHuesoBlanco.setOnClickListener(view -> {
            int ranking = Integer.parseInt(holder.tvRank.getText().toString()) + 1;
            holder.tvRank.setText(String.valueOf(ranking));


            if (flag <= 5){
                ConstructorPerros constructorPerros = new ConstructorPerros(activity);
                constructorPerros.insertarPerro(perro);

                Snackbar.make(view, "Se ha guardado en la posición: " + flag, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                flag++;
                if (flag > 5){
                    flag = 1;
                }
            }

        });
    }

    @Override
    public int getItemCount() {
        return perros.size();
    }

    //public static class PerroViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public static class PerroViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFoto;
        private TextView tvNombre;
        private TextView tvRank;

        private ImageView ivHuesoHuesoBlanco;

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvRank = itemView.findViewById(R.id.tvRanking);
            ivHuesoHuesoBlanco = itemView.findViewById(R.id.ivHuesoBlanco);

            //onclick
            //itemView.setOnClickListener(this);
        }

        //onclick
        /*@Override
        public void onClick(View view) {
            int ranking = Integer.parseInt(tvRank.getText().toString()) + 1;
            tvRank.setText(String.valueOf(ranking));
        }*/


    }
}
