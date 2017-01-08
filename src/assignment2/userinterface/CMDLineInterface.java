package assignment2.userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/**
 * Created by sjard on 7-1-2017.
 */

public class CMDLineInterface extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("new.fxml"));
        primaryStage.setTitle("CMDLineinterface");
        primaryStage.setScene(new Scene(root, 800, 200));
        primaryStage.show();
    }
}
//    static boolean answer;
//
//    public static boolean pizza(){
//        System.out.print("asjldf");
//
//    Stage window = new Stage();
//    window.setTitle("Command Line Interface");
//    window.setMinWidth(250);
//    Label label = new Label();
//    label.setText("test");
//
//        Button yesButton = new Button("Yes");
//        yesButton.setOnAction(e -> {
//            answer = true;
//            window.close();
//        });
//
//
//
//    VBox layout = new VBox(10);
//
//    layout.getChildren().addAll(label, yesButton);
//    Scene scene = new Scene(layout);
//    window.setScene(scene);
//    window.show();
//
//    return answer;
//
//
//    }
//}
