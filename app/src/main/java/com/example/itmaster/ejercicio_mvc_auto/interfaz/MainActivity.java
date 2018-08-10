package com.example.itmaster.ejercicio_mvc_auto.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.ejercicio_mvc_auto.R;
import com.example.itmaster.ejercicio_mvc_auto.listeners.ListenerOnclickGuardar;
import com.example.itmaster.ejercicio_mvc_auto.listeners.ListenerOnclickVer;

public class MainActivity extends AppCompatActivity
{
    private EditText txtmarca, txtmodelo, txtaño, txtkilometros, txtid;
    private Button btnguardar, btnver;
    private ListenerOnclickGuardar listenerOnclickGuardar;
    private ListenerOnclickVer listenerOnclickVer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmarca = findViewById(R.id.marca);
        txtmodelo = findViewById(R.id.modelo);
        txtaño = findViewById(R.id.año);
        txtkilometros = findViewById(R.id.kilometros);
        txtid = findViewById(R.id.ingresarId);
        btnguardar = findViewById(R.id.botonGuardar);
        btnver = findViewById(R.id.botonVer);

        listenerOnclickGuardar = new ListenerOnclickGuardar(this);
        btnguardar.setOnClickListener(listenerOnclickGuardar);

        listenerOnclickVer = new ListenerOnclickVer(this);
        btnver.setOnClickListener(listenerOnclickVer);

    }
}
