package org.example.project_6_new;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Pane root;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws IOException {

        root = new Pane();
        root.setPrefSize(800,500);
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(600, 400); // Set the size of the gridPane

        // Add some elements to the GridPane
        Rectangle rect1 = new Rectangle(50, 50); // Example element
        Rectangle rect2 = new Rectangle(50, 50); // Another example element
        gridPane.add(rect1, 1, 0); // Add the first rectangle to the GridPane at position (0, 0)

        // Position the GridPane within the root Pane
        double gridPaneX = (root.getPrefWidth() - gridPane.getPrefWidth()) / 2;
        double gridPaneY = (root.getPrefHeight() - gridPane.getPrefHeight()) / 2;
        gridPane.setLayoutX(gridPaneX);
        gridPane.setLayoutY(gridPaneY);

        // Add the GridPane to the root Pane
        root.getChildren().add(gridPane);

        Scene scene = new Scene(root, 800,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application");
        primaryStage.show();
    }
}