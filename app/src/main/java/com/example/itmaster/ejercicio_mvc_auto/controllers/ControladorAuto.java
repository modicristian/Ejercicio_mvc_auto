package com.example.itmaster.ejercicio_mvc_auto.controllers;

import com.example.itmaster.ejercicio_mvc_auto.DAO.DAOAuto;
import com.example.itmaster.ejercicio_mvc_auto.models.Auto;

public class ControladorAuto
{
    private DAOAuto daoAuto = new DAOAuto();

    public void guardarAuto(Auto unAuto)
    {
        daoAuto.addAuto(unAuto);
    }
}

