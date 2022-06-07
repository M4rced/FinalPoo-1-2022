package Agencia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;

    private List<Inmueble> inmuebles = new ArrayList<>();

    public Agencia(String nombre, List<Inmueble> inmuebles) {
        this.nombre = nombre;
        this.inmuebles = inmuebles;
    }

    /*public void agregarInmu(String tipo, String Direccion,long valorVenta,long valorArriendo ){
        if(tipo == "Apartamento") {
            if(valorArriendo == 0  ){
                Inmueble inmueble1 = new ApartamentoNoArrendable("afa12",0,0);
                this.inmuebles.add(inmueble1);
            }else if(valorArriendo > 0){
                Inmueble inmueble1 = new Apartamento("Calle 12B",12,5556);
                this.inmuebles.add(inmueble1);
            }
        }if(tipo == "Casa"){
            if(valorArriendo == 0){
                Inmueble inmueble2 = new CasaNoArrendable("cr13c",0,0);
                this.inmuebles.add(inmueble2);
            }else if(valorArriendo > 0){
                Inmueble inmueble2 = new Casa("cra156",12,11);
                this.inmuebles.add(inmueble2);
        }if(tipo == "Lote"){
                Inmueble inmueble3= new Lote("cra13e",false)
                        this.inmuebles.add(null);
            }
    }*/

    public boolean arrendar(Inmueble inmuebles){
        if(inmuebles instanceof Arrendable){
            return ((Arrendable) inmuebles).arrendar();
        }
        else return false;
    }

    public boolean devolver(Inmueble i){
        if(i instanceof Arrendable){
            return ((Arrendable) i).devolver();
        }
        else return false;
    }

    public boolean vender(Inmueble i){
        if(i.isArrendado() == false){
            this.inmuebles.remove(i);
            return true;
        }
        else return false;
    }

    public List<Inmueble> getArrendablesDisponibles() {
        List<Inmueble> aux = new ArrayList<>();
        for (Inmueble b : inmuebles){
            if(b instanceof  Arrendable){
                if (b.isArrendado() == false){
                    aux.add(b);
                }
            }
        }
        return aux;
    }

    public List<Inmueble> getArrendados(){
        List<Inmueble> aux2 = new ArrayList<>();
        for(Inmueble d: inmuebles){
            if(d instanceof  Arrendable){
                if(d.isArrendado() == true){
                    aux2.add(d);
                }
            }
        }
        return  aux2;
    }

    public List<Inmueble> getInmuebles(){
        return inmuebles;
    }
}
