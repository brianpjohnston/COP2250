package Johnston14;

/**
 * Brian Johnston
 * 2019405
 * Chapter134
 * Assignment in text document labeled requirements
 * Collaborators: None
 */

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.Pane;

import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExerciseOne extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //creating pane and setting padding
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        //creating objects and adding them as children to the pane
        primaryStage.setTitle("Everything is Awesome");
        // Image img = new Image("file:image.jpg");
        //ImageView imgView = new ImageView(img);
        ImageView image = new ImageView(new Image("http://www.cs.armstrong.edu/liang/image/us.gif"));
        Text txt = new Text(250, 450, "Everything is Awesome");
        pane.getChildren().add(image);
        pane.getChildren().add(txt);

        //Adding HBox to the scene
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
