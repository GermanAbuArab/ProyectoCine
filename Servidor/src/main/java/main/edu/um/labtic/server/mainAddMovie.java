package main.edu.um.labtic.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class mainAddMovie extends Application {

    private static ConfigurableApplicationContext context;

    @Override
    public void init() {mainAddMovie.context = SpringApplication.run(mainAddMovie.class);}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/addMovie.fxml"));
        primaryStage.setTitle("MovieFast");
        primaryStage.setScene( new Scene(root,600,500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static ConfigurableApplicationContext getContext() { return context; }




    @Override
    public void stop() {
        mainAddMovie.getContext().close();
    }

}