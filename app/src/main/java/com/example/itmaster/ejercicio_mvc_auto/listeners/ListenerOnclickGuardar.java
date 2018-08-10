package com.example.itmaster.ejercicio_mvc_auto.listeners;

import android.view.View;
import android.widget.Toast;

import com.example.itmaster.ejercicio_mvc_auto.interfaz.MainActivity;
import com.example.itmaster.ejercicio_mvc_auto.models.Auto;

public class ListenerOnclickGuardar implements View.OnClickListener
{
    private MainActivity context;

    public ListenerOnclickGuardar(MainActivity context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view)
    {
        context.setUnAuto(new Auto());

        context.getUnAuto().setMarca(context.getTxtmarca().getText().toString());
        context.getUnAuto().setModelo(context.getTxtmodelo().getText().toString());
        context.getUnAuto().setAnio(Integer.valueOf(context.getTxtanio().getText().toString()));
        context.getUnAuto().setKilometros(Integer.valueOf(context.getTxtkilometros().getText().toString()));

        context.getControladorAuto().guardarAuto(context.getUnAuto());

        Toast.makeText(context, "ALMACENADO", Toast.LENGTH_SHORT).show();
    }
}
