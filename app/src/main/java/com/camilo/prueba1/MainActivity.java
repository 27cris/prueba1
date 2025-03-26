package com.camilo.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView btnInicio;
    ImageView btnBanquetes;
    ImageView btncategorias;
    ImageView btnPlanalimentario;
    ImageView btnComunidad;
    ImageView imgreceta;
    ImageView imgreceta2;
    ImageView imgreceta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicio = findViewById(R.id.btnInicio);
        btnBanquetes = findViewById(R.id.btnBanquete);
        btncategorias = findViewById(R.id.btnCategoria);
        btnPlanalimentario = findViewById(R.id.btnPlan);
        btnComunidad = findViewById(R.id.btnComunidad);
        imgreceta = findViewById(R.id.imgReceta);
        imgreceta2 = findViewById(R.id.imgReceta2);
        imgreceta3 = findViewById(R.id.imgReceta3);

        btnInicio.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, inicio.class);
            startActivity(intent);

        });

        btnBanquetes.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Banquetes.class);
            startActivity(intent);
        });


        btncategorias.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Categorias.class);
            startActivity(intent);
        });

        btnPlanalimentario.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Planalimentario.class);
            startActivity(intent);
        });

        btnComunidad.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Comunidad.class);
            startActivity(intent);
        });
        imgreceta.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Receta.class);
            startActivity(intent);
        });
        imgreceta2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Receta2.class);
            startActivity(intent);
        });
        imgreceta3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Receta3.class);
            startActivity(intent);
        });


    }
}

