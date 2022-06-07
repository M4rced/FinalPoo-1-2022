package Oftamologo.dominio;

public abstract class Paciente  {
    private String nombre;
    private int edad;
    private boolean NecesitaCirugia;

    public Paciente(String nombre, int edad, boolean necesitaCirugia) {
        this.nombre = nombre;
        this.edad = edad;
        this.NecesitaCirugia = necesitaCirugia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isnecesitaCirugua(){
        return NecesitaCirugia;
    }

    public void necesitaCirugua(PacienteApto paciente) {
    }
}
