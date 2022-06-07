package Agencia.dominio;

public class Lote extends Inmueble {
    public Lote(String direccion, boolean arrendado) {
        super(direccion, arrendado);
    }

    @Override
    public String toString() {
        return "Lote" + this.getDireccion();
    }
}
