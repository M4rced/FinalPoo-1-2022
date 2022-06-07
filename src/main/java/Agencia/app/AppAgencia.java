package Agencia.app;

import Agencia.dominio.*;

import java.util.Arrays;
import java.util.List;

public class AppAgencia {
   public static void main(String[] args) {
        Inmueble casa1 = new Casa("cr 32B #60-48", true);
        Inmueble casa2 = new Casa("cr 21 #22-33", false);
        Inmueble apartamento1 = new Apartamento("calle 3A #5-32 apar 202",true);
        Inmueble apartamento2 = new Apartamento("calle 25 #22-36 apar 501",false);
        Inmueble lote1 = new Lote("cr 51 #48-38",false);
        List<Inmueble> age =  Arrays.asList(casa1,casa2,apartamento1, apartamento2, lote1);
        Agencia casaSAS = new Agencia("casaSAS", age);

        Inmueble casa3 = new Casa("cr 30 #20-20",false);


        boolean a =casaSAS.arrendar((Inmueble) apartamento2);
        System.out.println(a);

        boolean b = casaSAS.devolver((Inmueble) apartamento1);
        System.out.println(b);


        boolean c = casaSAS.vender(casa1);
        System.out.println(c);

        List<Inmueble> arren = casaSAS.getArrendablesDisponibles();
        System.out.println("DISPONIBLES:");
        System.out.println("--------------------------------");
        for (Inmueble g : arren){
            System.out.println(g);
        }
        System.out.println("-------------------------");

        List<Inmueble> arrend = casaSAS.getArrendados();
        System.out.println("ARRENDADOS :");
        System.out.println("----------------------------");
        for(Inmueble h :arrend){
            System.out.println(h);
        }


    }
}
