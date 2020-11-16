package com.curso.coursera;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.PerroViewHolder>{

    ArrayList<Perro> perros;

    public PerroAdaptador(ArrayList<Perro> perros) {
        this.perros = perros;
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

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvRank = itemView.findViewById(R.id.tvRanking);

            //itemView.setOnClickListener(this);
        }

        /*
        @Override
        public void onClick(View view) {
            int ranking = Integer.parseInt(tvRank.getText().toString());

            tvRank.setText(tvRank.getText()+ "cerdonio");
        }*/
    }
}
