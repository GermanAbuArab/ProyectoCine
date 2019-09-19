package main.edu.um.labtic.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainAddMovie extends Application {

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

}