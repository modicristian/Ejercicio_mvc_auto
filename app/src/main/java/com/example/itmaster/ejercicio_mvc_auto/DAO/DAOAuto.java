package com.example.itmaster.ejercicio_mvc_auto.DAO;

import com.example.itmaster.ejercicio_mvc_auto.models.Auto;

import java.util.ArrayList;

public class DAOAuto
{
    ArrayList<Auto> arrayListAuto = new ArrayList<>();


    public void addAuto(Auto unAuto)
    {
        arrayListAuto.add(unAuto);
    }

    public ArrayList<Auto> getArrayListAuto() {
        return arrayListAuto;
    }

    public void setArrayListAuto(ArrayList<Auto> arrayListAuto) {
        this.arrayListAuto = arrayListAuto;
    }
}
