package Oftamologo.app;

import Oftamologo.dominio.Oftamologo;
import Oftamologo.dominio.PacienteApto;
import Oftamologo.dominio.PacienteNoApto;

public class AppOftamologo {
    public static void main(String[] args) {
        Oftamologo oftamologo = new Oftamologo("hkdkd",null,null);
        PacienteNoApto pacienteApto = new PacienteNoApto("Alejandro",35,false);
        PacienteNoApto pacienteNoApto = new PacienteNoApto("Ana ",55,false);
        PacienteApto pacienteApto2 = new PacienteApto("Jorge",60,false);
        PacienteNoApto pacienteNoApto2 = new PacienteNoApto("Marcela",23,true);
    }
}
