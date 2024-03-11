package com.example.pruebarecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> listado = new ArrayList<>();
        listado.add( new Persona("Oscar", "Loaiza", "90", "M", "Carrera 8va", "3333333", "default.png") );
        listado.add( new Persona("Ana", "Lopez", "40", "F", "Carrera 2da", "3333334", "default.png") );
        listado.add( new Persona("Gregorio", "Perez", "56", "M", "Carrera 4ta", "3333335", "default.png") );
        listado.add( new Persona("Carolina", "Soto", "34", "F", "Carrera 9na", "3333336", "default.png") );

        recycler = findViewById(R.id.recycler_contactos);

        AdaptadorContacto adaptador = new AdaptadorContacto( listado );
        recycler.setAdapter( adaptador );
        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext()) );
    }
}