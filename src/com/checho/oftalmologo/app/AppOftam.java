package com.checho.oftalmologo.app;

import com.checho.oftalmologo.dominio.Oftanmolgo;
import com.checho.oftalmologo.dominio.Paciente;
import com.checho.oftalmologo.dominio.PacienteNopApto;

public class AppOftam {
    public static void main(String[] args) {
        Oftanmolgo oftamilogo1 =  new Oftanmolgo();
        oftamilogo1.revisarPaciente("Andrés", 36);
        oftamilogo1.revisarPaciente("Carlos", 45);

        oftamilogo1.operarPaciente();
    }
    }