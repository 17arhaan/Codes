package javafx.src;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.FlowPane;
// import javafx.stage.Stage;
// import javafx.geometry.Pos;

// public class fxjava extends Application {
//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         primaryStage.setTitle("Trap");

//         Button btn1 = new Button("woman : press me daddy");
//         Button btn2 = new Button("man : press me too daddy");
//         Label response = new Label("Push it harder ");

//         btn1.setOnAction(new EventHandler<ActionEvent>() {
//             @Override
//             public void handle(ActionEvent ae) {
//                 response.setText("yea just like that yessssss !!");
//             }
//         });

//         btn2.setOnAction(new EventHandler<ActionEvent>() {
//             @Override
//             public void handle(ActionEvent ae) {
//                 response.setText("ayoo thats gayy nigga");
//             }
//         });
//         FlowPane root = new FlowPane(10, 10);
//         root.getChildren().addAll(btn1, btn2, response);
//         root.setAlignment(Pos.CENTER);

//         Scene scene = new Scene(root, 500, 400);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
// }

import javafx.scene.control.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class fxjava extends Application{
    public void start(Stage mystage){
        
        mystage.setTitle("aDD");
        Label lbl = new Label("Enter integer : ");
        Label lbl2 = new Label("Result : ");
        Label lbl3 = new Label();
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        FlowPane root = new FlowPane(10,10);
        Scene myScene = new Scene(root,800,500);
        RadioButton btn= new RadioButton("Press me pwease...");
        RadioButton btn2= new RadioButton("Press me pwease...");
        RadioButton btn3= new RadioButton("Press me pwease...");
        ToggleButton tglbtn= new ToggleButton("Press me pwease...");
        ComboBox cb = new ComboBox<>();
        ObservableList<String> ls = FXCollections.observableArrayList(
                "Option 1",
                "Option 2",
                "Option 3"
        );
    
        cb.setItems(ls);
        cb.setValue("Option 1");
        cb.setOnAction(e -> {
            String selectedValue = (String) cb.getValue();
            System.out.println("Selected Option: " + selectedValue);
            if(selectedValue=="Option 2"){
                System.out.println("op2");
            };
        });
        HBox hb = new HBox(lbl,t1,t2);
        VBox vb= new VBox(hb,lbl2,lbl3,btn,btn2,btn3,tglbtn,cb);
        ToggleGroup tg = new ToggleGroup();
        btn.setToggleGroup(tg);
        btn2.setToggleGroup(tg);
        btn3.setToggleGroup(tg);
        mystage.setScene(myScene);
        
        hb.setSpacing(10);
        vb.setSpacing(5);
        root.getChildren().addAll(vb);
        root.setAlignment(Pos.CENTER);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent a){
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                String sum =""+(n1+n2);

                lbl3.setText(sum);
            }
        });
        tglbtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent a){
                if(tglbtn.isSelected()){
                    lbl3.setText("it is");
                }
                else{
                    lbl3.setText("IT ISNT");
                }
                
            }
        });
        mystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}