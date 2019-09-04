package main.edu.um.labtic.server.negocios.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CINES")
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "Nombre", nullable = false, length = 40) //nullable false = notblank
    private String Nombre;

}
