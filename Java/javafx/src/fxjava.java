package javafx.src;

import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  
public class fxjava extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  

        Button btn1=new Button("you are gay");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {    
                System.out.println("you are gay");  
            }  
        });  
        StackPane root=new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene=new Scene(root,600,400);      
        primaryStage.setTitle("Nigga What ??");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
    public static void main (String[] args)  
    {  
        launch(args);  
    }  
  
} 