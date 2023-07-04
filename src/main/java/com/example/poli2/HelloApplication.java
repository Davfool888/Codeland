package com.example.poli2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    // Objetos de uno.fxml
    private Rectangle correctaRect;
    private Rectangle incorrec1Rect;
    private Rectangle incorrec2Rect;
    private Rectangle incorrec3Rect;
    private Label respuestaCorrec;
    private Label respuestaIncorrec;

    @Override
    public void start(Stage stage) throws IOException {
        // Cargar uno.fxml
        FXMLLoader unoLoader = new FXMLLoader(HelloApplication.class.getResource("uno.fxml"));
        Parent unoRoot = unoLoader.load();
        correctaRect = (Rectangle) unoLoader.getNamespace().get("correctaRect");
        incorrec1Rect = (Rectangle) unoLoader.getNamespace().get("Incorrec1");
        incorrec2Rect = (Rectangle) unoLoader.getNamespace().get("Incorrec2");
        incorrec3Rect = (Rectangle) unoLoader.getNamespace().get("Incorrec3");
        respuestaCorrec = (Label) unoLoader.getNamespace().get("RespuestaCorrec");
        respuestaIncorrec = (Label) unoLoader.getNamespace().get("RespuestaIncorrec");

        // Combinar los elementos en una escena
        Group root = new Group(unoRoot);
        Scene scene = new Scene(root, 1000, 650);
        stage.setScene(scene);
        stage.setTitle("PoliGame");

        correctaRect.setOnMouseClicked(this::onRectClick);
        incorrec1Rect.setOnMouseClicked(this::onIncorrec1Click);
        incorrec2Rect.setOnMouseClicked(this::onIncorrec2Click);
        incorrec3Rect.setOnMouseClicked(this::onIncorrec3Click);

        stage.show();
    }

    private void onRectClick(MouseEvent event) {
        correctaRect.setFill(Color.GREEN);
        respuestaCorrec.setTextFill(Color.GREEN);
    }

    private void onIncorrec1Click(MouseEvent event) {
        incorrec1Rect.setFill(Color.RED);
        respuestaIncorrec.setTextFill(Color.RED);
    }

    private void onIncorrec2Click(MouseEvent event) {
        incorrec2Rect.setFill(Color.RED);
        respuestaIncorrec.setTextFill(Color.RED);
    }

    private void onIncorrec3Click(MouseEvent event) {
        incorrec3Rect.setFill(Color.RED);
        respuestaIncorrec.setTextFill(Color.RED);
    }

    public static void main(String[] args) {
        launch();
    }
}