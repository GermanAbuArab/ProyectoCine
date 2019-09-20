package main.edu.um.labtic.server.servicios.entidades;

import javax.persistence.*;
        import javax.validation.constraints.NotBlank;

@Entity
public class Movie {

    @Id
    private long id;

    @NotBlank
    @Column(name = "Nombre", nullable = false, length = 196)
    private String Nombre;

    @NotBlank
    @Column (name = "Descripción", nullable = false)
    private String Descripcion;

    public Movie(long id, @NotBlank String nombre, @NotBlank String descripcion) {
        Nombre = nombre;
        Descripcion = descripcion;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}