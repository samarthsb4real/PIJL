package com.example.javademo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.io.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class ImgPattern extends Application {

    public void start(Stage s) throws Exception {

        s.setTitle("Demo Image Pattern");

        FileInputStream input = new FileInputStream("N:\\SIT\\4th-Sem\\PIJL\\JavaDemo\\src\\main\\java\\com\\example\\javademo\\demo.png");

        Image image = new Image(input);

        ImagePattern image_pattern = new ImagePattern(image);

        // Create Rectangle with dynamic size
        Rectangle rect = new Rectangle(800, 450);
        rect.setFill(image_pattern);

        // Use StackPane to center the Rectangle
        StackPane stackPane = new StackPane(rect);
        stackPane.setPrefSize(800, 450);

        // Create scene
        Scene sc = new Scene(stackPane, 800, 450);

        // Set resizing behavior
        sc.widthProperty().addListener((obs, oldVal, newVal) -> rect.setWidth(newVal.doubleValue()));
        sc.heightProperty().addListener((obs, oldVal, newVal) -> rect.setHeight(newVal.doubleValue()));

        s.setScene(sc);
        s.setMaximized(true); // Start maximized
        s.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
