package Oftamologo.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Oftamologo {
    private String nombre;

    private List<Paciente> pacientes;
    private List<PacienteApto> paceintesAptos;

    public static final int edadPermitida = 40;

    public Oftamologo(String nombre, List<Paciente> pecientes, List<PacienteApto> paceintesAptos) {
        this.nombre = nombre;
        this.pacientes = pecientes;
        this.paceintesAptos = paceintesAptos;
    }

    public Paciente revisarPaciente(String nombre, int edad) {
        Paciente paciente = null;
        if (nombre.toLowerCase(Locale.ROOT).contains("a")) {
            System.out.println(paciente.getNombre() + " Necesita cirugia");
            if (edad < edadPermitida) {
                System.out.println(paciente.getNombre() + " El paciente es Apto");
                paciente = new PacienteApto(nombre, edad, true);
            } else {
                paciente = new PacienteNoApto(nombre, edad, true);
            }
        } else {
            System.out.println(paciente.getNombre() + " El paciente no cumple los requisitos para ser operado");
            paciente = new PacienteNoApto(nombre, edad, false);
        }
        pacientes.add(paciente);
        return paciente;
    }

    public void operarPacientes() {
        pacientes.stream().filter(p -> p instanceof Operable && p.isnecesitaCirugua()).forEach(paciente -> {
            ((Operable) paciente).operar();
        });
    }

    public List<PacienteApto> getPaceintesAptos() {
        pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            if (paciente.isnecesitaCirugua() == false) {
                paciente.necesitaCirugua((PacienteApto) paciente);
            } else {
                System.out.println("El paciente ya fue operado");
            }
            System.out.println("Los pacientes que seran operados son: " + paciente.getNombre());
        });
        return paceintesAptos;
    }
}