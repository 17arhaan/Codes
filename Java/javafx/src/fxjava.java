package javafx.src;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fxjava extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Trap");

        Button btn1 = new Button("woman : press me daddy");
        Button btn2 = new Button("man : press me too daddy");
        Label response = new Label("Push it harder ");

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                response.setText("yea just like that yessssss !!");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                response.setText("ayoo thats gayy nigga");
            }
        });

        ImageView View = new ImageView();
        try {
            Image image = new Image(new FileInputStream("C:\\Users\\arhaa\\Downloads\\artworks-LWwUzZHkWYXVKNEA-gAeRyw-t500x500.jpg"));
            View.setImage(image);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(btn1, btn2, response, View);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
