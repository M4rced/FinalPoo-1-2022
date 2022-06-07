package Biblioteca.dominio;

public class Libro extends Recurso implements Copiable,Prestable {

    public Libro(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {

    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Biblioteca.dominio.Libro{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
