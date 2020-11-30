package com.curso.coursera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnEjercicio2;
    private Button btnEjercicio3;
    private Button btnEjercicioNotificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio2 = findViewById(R.id.btEjercicio2);
        btnEjercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ejercicio2Activity.class);
                startActivity(intent);
            }
        });

        btnEjercicio3 = findViewById(R.id.btEjercicio3);
        btnEjercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainEjercicio3Activity.class);
                startActivity(intent);
            }
        });

        btnEjercicioNotificacion = findViewById(R.id.btNotificacion);
        btnEjercicioNotificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotificacionActivity.class);
                startActivity(intent);
            }
        });
    }
}