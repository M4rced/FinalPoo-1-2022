package Biblioteca.dominio;

public class Albumes extends Recurso implements Copiable{
    public Albumes(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {

    }

    @Override
    public String toString() {
        return "Biblioteca.dominio.Albumes{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
