package Agencia.dominio;

public class Casa extends Inmueble implements Arrendable {


   /* public Casa(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }*/

    public Casa(String direccion, boolean b) {
        super(direccion,true);
    }

    @Override
    public boolean arrendar() {
        if(this.isArrendado() == false){
            this.setArrendado(false);
            return true;
        }
        else return false;
    }

    @Override
    public boolean devolver() {
        if(this.isArrendado() == true){
            this.setArrendado(false);
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Casa" + this.getDireccion();
    }
}

