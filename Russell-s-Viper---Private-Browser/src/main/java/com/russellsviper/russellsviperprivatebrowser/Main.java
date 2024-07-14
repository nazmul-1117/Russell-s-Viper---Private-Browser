package com.russellsviper.russellsviperprivatebrowser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = null;
        Scene scene = null;

        try{
            fxmlLoader = new FXMLLoader(Main.class.getResource("main-window.fxml"));


        }catch (Exception e){
            System.out.println("fxml failed");
        }

        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);

        }catch (Exception ex){
            System.out.println("load failed");
        }


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}