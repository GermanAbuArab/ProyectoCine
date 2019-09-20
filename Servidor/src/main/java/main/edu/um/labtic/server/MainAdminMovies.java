/*
package main.edu.um.labtic.server;


import main.edu.um.labtic.server.servicios.entidades.Pelicula11;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAdminMovies {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("main.edu.um.labtic.server.negocios.manager");
        context.refresh();
        PeliculaManager Spm = context.getBean(PeliculaManager.class);

        Pelicula11 pelicula= new Pelicula11("Felipe", "adasdasdasdasdas");
        Spm.save(pelicula   );
        context.close();


    }


}
*/