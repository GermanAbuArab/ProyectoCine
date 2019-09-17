package sample.addMovie;

public class Pelicula {

    private String nombre,descripcion;

    public Pelicula(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
