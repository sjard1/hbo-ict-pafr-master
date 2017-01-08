package assignment2.userinterface;

/**
 * Created by sjard on 8-1-2017.
 */
import assignment2.domain.Train;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    ComboBox<String> SelectTrain;
    @FXML
    Label SelectedTrain;
    @FXML
    private TextField Text1;
    @FXML
    private TextField NewTrain;

    @FXML
    TextArea NieuweTreinNaam;

    @FXML Label NieuweTreinMessage;

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println("View is now loaded!");
//    }



    ObservableList<String>  treinen = FXCollections.observableArrayList(
        "Value 1", " value 2");

    @FXML
    private void ShowTrain(ActionEvent event){
        SelectedTrain.setText("Selected:" + SelectTrain.getValue());
    }


    public void NieuweTrein() {
        String y = NieuweTreinNaam.getText();
        if(!y.isEmpty())
        {
        Train trein = new Train(y);
        NieuweTreinMessage.setText("Nieuwe trein succesvol aangemaakt: \n " + y);
        }else{
            NieuweTreinMessage.setText("Voer text in");
        }
    }

    public void NieuwScherm() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       SelectTrain.setItems(treinen);
    }
}
