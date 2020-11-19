package com.curso.coursera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallePerroActivity extends AppCompatActivity {
    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_RANK = "rank";

    private ImageView ivFotoDetalle;
    private TextView tvRankDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_perro);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString(KEY_EXTRA_URL);
        String rank = bundle.getString(KEY_EXTRA_RANK);

        tvRankDetalle = findViewById(R.id.tvRankDetalle);
        tvRankDetalle.setText(String.valueOf(rank));
    }
}