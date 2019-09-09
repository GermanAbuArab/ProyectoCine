package main.edu.um.labtic.server.negocios.entidades;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name ="SALAS")
@Data //con lombok que por ahora nunca me ha funcionado
public class Sala {

    @Id
    private Long id; // Could change(LONG)

    @NotBlank
    @Column(name = "Nombre", nullable = false, length = 60)
    private String Nombre;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString(){
        return "id:"+id+", name:" + Nombre;
    }
}
