package Agencia.dominio;

public class Apartamento extends Inmueble implements Arrendable {


    /*public Apartamento(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }*/

    public Apartamento(String direccion, boolean b) {
        super(direccion,true);
    }

    @Override
    public boolean arrendar() {
        if(this.isArrendado() == false){
            this.setArrendado(false);
            return true;

        }
        return false;
    }

    @Override
    public boolean devolver() {
        if(this.isArrendado() == true){
            this.setArrendado(false);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Apartamento" + this.getDireccion();
    }
}
