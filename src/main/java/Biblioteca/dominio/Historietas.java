package Biblioteca.dominio;

public class Historietas extends Recurso implements Prestable{

    public Historietas(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public String toString() {
        return "Biblioteca.dominio.Historietas{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
