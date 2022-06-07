package Agencia.dominio;

public abstract class Inmueble {
    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

  /*  public Inmueble(String direccion, long valorVenta, long valorArriendo) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
    }*/

    public Inmueble(String direccion, boolean arrendado) {
        this.direccion = direccion;
        this.arrendado = arrendado;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setValorVenta(long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public void setValorArriendo(long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
