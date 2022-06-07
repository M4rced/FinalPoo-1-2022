package Biblioteca.dominio;

public class Revista extends Recurso implements Prestable{

    public Revista(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
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
        return "Biblioteca.dominio.Revista{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
