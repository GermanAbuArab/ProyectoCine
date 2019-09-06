package main.edu.um.labtic.server.negocios.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name ="SALAS")
public class Sala {

    @Id
    private Long id; // Could change

    @NotBlank
    @Column(name = "Nombre", nullable = false, length = 60)
    private String Nombre;
}
