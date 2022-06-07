package Biblioteca.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Biblioteca {
    private String nombre;
    private List<Recurso> recursos = new ArrayList<>();

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso r, Revista revista){
        this.recursos.addAll(Arrays.asList(r));
    }

    public boolean prestarRecurso(Recurso r) {
        if (r instanceof Prestable) {
            if (!r.getPrestado()) {
                ((Prestable) r).prestar();
                System.out.println("EL recurso se ha prestado correctamente!");
                return true;
            } else {
                System.out.println("Este recurso ya ha sido prestado");
            }
        } else {
            System.out.println("El recurso que desea prestar no es prestable");
        }
        return false;
    }

    public boolean devolverRecurso(Recurso r){
        if(r instanceof Prestable){
            if(r.getPrestado()== true){
                ((Prestable)r).devolver();
                return false;
            }else{
                System.out.println("Este recurso ya ha sido devuelto");
                return true;
            }
        }else{
            System.out.println("Este recurso es Biblioteca.dominio.Prestable");
            return true;
        }
    }

    public boolean fotocopiarRecurso(Recurso r) {
        if (r instanceof Copiable) {
            if (r.getPrestado() == false) {
                ((Copiable) r).fotocopiar();
                return true;
            } else {
                System.out.println("El recurso se ha fotocopiado con exito!");
                return false;
            }
        } else {
            System.out.println("Es un recurso fotocopiable");
            return false;
        }
    }

    public void listarPrestados(){
        AtomicInteger cantidadPrestados = new AtomicInteger();

        recursos.stream().filter(r -> r instanceof Prestable).forEach(recurso -> {
            cantidadPrestados.incrementAndGet();
            System.out.println("Los recursos prestados son: " + recurso.getNombre());
        });
        System.out.println("La cantidad de recursos prestados es: " + cantidadPrestados);
    }

    public void listarCopiasPorRecurso(){
        AtomicInteger cantidadCopiados = new AtomicInteger();

        recursos.forEach(recurso -> {
            if(recurso.getCopias() > 0){
                cantidadCopiados.incrementAndGet();
                System.out.println("Los recursos fotocopiados son: " + recurso.getNombre()+
                        " la catidad de copias es: " + recurso.getCopias());
            }
        });
        System.out.println("La cantidad de fotocopias es: "+ cantidadCopiados);
    }

    public void addRecurso(Libro libro, Revista revista, Historietas historietas, Comics comics) {
    }
}

