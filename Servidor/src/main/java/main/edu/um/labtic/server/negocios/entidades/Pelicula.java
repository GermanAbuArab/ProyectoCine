package main.edu.um.labtic.server.negocios.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PELICULAS")

public class Pelicula {
    @Id
    private long id;

    @NotBlank
    @Column (name = "Nombre", nullable = false, length = 196)
    private String Nombre;

    @NotBlank
    @Column (name = "Descripción", nullable = false)
    private String Descripcion;

    public Pelicula(@NotBlank String nombre, @NotBlank String descripcion) {
        Nombre = nombre;
        Descripcion = descripcion;
    }
}
