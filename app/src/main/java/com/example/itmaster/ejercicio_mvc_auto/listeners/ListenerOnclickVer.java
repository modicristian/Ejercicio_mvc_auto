package com.example.itmaster.ejercicio_mvc_auto.listeners;

import android.view.View;
import android.widget.Toast;

import com.example.itmaster.ejercicio_mvc_auto.interfaz.MainActivity;

public class ListenerOnclickVer implements View.OnClickListener
{
    private MainActivity context;

    public ListenerOnclickVer(MainActivity context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view)
    {
        Integer id = Integer.valueOf(context.getTxtid().getText().toString());

        if (id < context.getControladorAuto().cantidadAuto())
        {
            if (context.getControladorAuto().cantidadAuto() != 0)
                {
                context.setUnAuto(context.getControladorAuto().getAuto(id));
                context.getTxtmarca().setText(context.getUnAuto().getMarca());
                context.getTxtmodelo().setText(context.getUnAuto().getModelo());
                context.getTxtanio().setText(context.getUnAuto().getAnio().toString());
                context.getTxtkilometros().setText(context.getUnAuto().getKilometros().toString());
                }
            else
                {
                Toast.makeText(context, "No hay Autos", Toast.LENGTH_SHORT).show();
                }
        }
        else
        {
            Toast.makeText(context, "Fuera de rango", Toast.LENGTH_SHORT).show();
        }

    }
}
