package Biblioteca.dominio;

public abstract class Recurso {
    protected boolean prestado;
    private String nombre;
    protected int copias;

    public Recurso(boolean prestado, String nombre, int copias) {
        this.prestado = prestado;
        this.nombre = nombre;
        this.copias = copias;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCopias() {
        return copias;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

}
