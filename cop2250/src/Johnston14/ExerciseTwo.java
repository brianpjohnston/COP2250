package Johnston14;

/**
 * Brian Johnston
 * 2019405
 * Chapter13
 * Assignment in text document labeled requirements
 * Collaborators: None
 */

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ExerciseTwo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        //creating walls to house
        Rectangle r1 = new Rectangle(300, 200);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        r1.setStrokeWidth(4);
        r1.setX(50);
        r1.setY(150);

        //creating door to house
        Rectangle r2 = new Rectangle(50, 100);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.WHITE);
        r2.setStrokeWidth(4);
        r2.setX(120);
        r2.setY(250);

        //creating window to house
        Rectangle r3 = new Rectangle(50, 50);
        r3.setStroke(Color.BLACK);
        r3.setFill(Color.BLUE);
        r3.setStrokeWidth(4);
        r3.setX(250);
        r3.setY(200);

        //calling create Triangle method to create triangle
        Polygon triangle = createTriangle();


        //adding elements to house
        pane.getChildren().add(r1);
        pane.getChildren().add(r2);
        pane.getChildren().add(r3);
        pane.getChildren().add(triangle);

        //creating scene
        Scene scene = new Scene(new BorderPane(pane), 500, 500);
        primaryStage.setTitle("House");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    //method creates triangle
    private Polygon createTriangle() {
        Polygon triangle = new Polygon();

        triangle.getPoints().setAll(
                30d, 150d,
                200d, 50d,
                370d, 150d
        );

        triangle.setStroke(Color.BLACK);
        triangle.setStrokeWidth(4);
        triangle.setStrokeLineCap(StrokeLineCap.ROUND);
        triangle.setFill(Color.WHITE);

        return triangle;

    }

}
