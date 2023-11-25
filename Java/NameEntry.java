import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameEntry extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label to display instructions
        Label nameLabel = new Label("Enter your name:");

        // Create a TextField for name entry
        TextField nameTextField = new TextField();

        // Create a layout (VBox) to organize the elements
        VBox vbox = new VBox(10); // 10 is the spacing between elements
        vbox.getChildren().addAll(nameLabel, nameTextField); // Add the label and TextField to the layout

        // Create a scene with the layout
        Scene scene = new Scene(vbox, 300, 150);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set the title of the window
        primaryStage.setTitle("Name Entry App");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
