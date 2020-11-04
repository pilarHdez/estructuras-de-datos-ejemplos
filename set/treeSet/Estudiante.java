package treeSet;

import java.time.LocalDate;

public class Estudiante implements Comparable<Estudiante> {
 
    private Long id;
    private String nombre;
    private LocalDate fechaRegistro;
 
    public Estudiante(Long id, String nombre, LocalDate fechaRegistro) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
    }
     
    @Override
    public int compareTo(Estudiante emp) {
        // Orden natural: por id
        return this.getId().compareTo(emp.getId());
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public LocalDate getFechaRegistro(){
        return this.fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
 
    @Override
    public String toString() {
        return "Estudiante [id=" + this.id 
            + ", nombre=" + this.nombre 
            + ", fechaRegistro=" + fechaRegistro + "]";
    }
}