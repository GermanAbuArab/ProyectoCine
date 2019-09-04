package main.edu.um.labtic.server.negocios;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CINE")
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "Nombre", nullable = false, length = 40) //nullable false = notblank
    private String Nombre;

}
