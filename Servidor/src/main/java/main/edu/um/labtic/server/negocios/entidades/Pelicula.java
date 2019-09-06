package main.edu.um.labtic.server.negocios.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



public class Pelicula {
    @Id
    private long id;

    @NotBlank
    @Column (name = "Nombre", nullable = false, length = 196)
    private String Nombre;
}
