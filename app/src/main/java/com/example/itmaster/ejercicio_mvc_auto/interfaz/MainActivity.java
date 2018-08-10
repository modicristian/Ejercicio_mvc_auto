package com.example.itmaster.ejercicio_mvc_auto.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.itmaster.ejercicio_mvc_auto.R;
import com.example.itmaster.ejercicio_mvc_auto.controllers.ControladorAuto;
import com.example.itmaster.ejercicio_mvc_auto.listeners.ListenerOnclickGuardar;
import com.example.itmaster.ejercicio_mvc_auto.listeners.ListenerOnclickVer;
import com.example.itmaster.ejercicio_mvc_auto.models.Auto;

public class MainActivity extends AppCompatActivity
{
    public EditText getTxtmarca() {
        return txtmarca;
    }

    public void setTxtmarca(EditText txtmarca) {
        this.txtmarca = txtmarca;
    }

    public EditText getTxtmodelo() {
        return txtmodelo;
    }

    public void setTxtmodelo(EditText txtmodelo) {
        this.txtmodelo = txtmodelo;
    }

    public EditText getTxtanio() {
        return txtanio;
    }

    public void setTxtanio(EditText txtanio) {
        this.txtanio = txtanio;
    }

    public EditText getTxtkilometros() {
        return txtkilometros;
    }

    public void setTxtkilometros(EditText txtkilometros) {
        this.txtkilometros = txtkilometros;
    }

    public EditText getTxtid() {
        return txtid;
    }

    public void setTxtid(EditText txtid) {
        this.txtid = txtid;
    }

    public Button getBtnguardar() {
        return btnguardar;
    }

    public void setBtnguardar(Button btnguardar) {
        this.btnguardar = btnguardar;
    }

    public Button getBtnver() {
        return btnver;
    }

    public void setBtnver(Button btnver) {
        this.btnver = btnver;
    }

    public ListenerOnclickGuardar getListenerOnclickGuardar() {
        return listenerOnclickGuardar;
    }

    public void setListenerOnclickGuardar(ListenerOnclickGuardar listenerOnclickGuardar) {
        this.listenerOnclickGuardar = listenerOnclickGuardar;
    }

    public ListenerOnclickVer getListenerOnclickVer() {
        return listenerOnclickVer;
    }

    public void setListenerOnclickVer(ListenerOnclickVer listenerOnclickVer) {
        this.listenerOnclickVer = listenerOnclickVer;
    }

    public Auto getUnAuto() {
        return UnAuto;
    }

    public void setUnAuto(Auto unAuto) {
        UnAuto = unAuto;
    }

    public ControladorAuto getControladorAuto() {
        return controladorAuto;
    }

    private EditText txtmarca, txtmodelo, txtanio, txtkilometros, txtid;
    private Button btnguardar, btnver;
    private ListenerOnclickGuardar listenerOnclickGuardar;
    private ListenerOnclickVer listenerOnclickVer;
    private Auto UnAuto;
    private ControladorAuto controladorAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmarca = findViewById(R.id.marca);
        txtmodelo = findViewById(R.id.modelo);
        txtanio = findViewById(R.id.anio);
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
