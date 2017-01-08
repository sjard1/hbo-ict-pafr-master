package assignment2.userinterface;

/**
 * Created by sjard on 7-1-2017.
 */
import assignment2.domain.RailCompany;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
// deze class handeld de functionaliteiten voor de sample.fxml ( UI )
public class Controller implements Initializable{

    @FXML
    ComboBox<String> SelectTrain;
    @FXML
    Label SelectedTrain;
    @FXML
    ComboBox<String> SelectWagon;
    @FXML
    TextArea NieuweTreinNaam;

    @FXML Label NieuweTreinMessage;



    @Override // set de comboboxen naar  de ObservableList waarden
    public void initialize(URL location, ResourceBundle resources) {
      SelectTrain.setItems(treinen);
        SelectWagon.setItems(wagons);
    }



   // ObservableList<Train>  treinen = ObservableList(RailCompany.getTrains());


    ObservableList<String>  treinen = FXCollections.observableArrayList(
        "Value 1", " value 2", " dit moet nog verbonden worden met een Train Array ");

    // deze moet nog verbonden worden naar ?? > railcompany.trains? hoe? <
    ObservableList<String> wagons = FXCollections.observableArrayList(
            "Wagon 1", " Wagon 2", " dit moet nog verbonden worden met een Wagon Array"
    );


    @FXML // laat direct de selected train zien
    private void ShowTrain(ActionEvent event){

        if(SelectTrain.getValue() == null){
            SelectedTrain.setText("Selecteer een trein");
        }
                SelectedTrain.setText("Selected: " + SelectTrain.getValue());
    }

    @FXML // deze functie werkt niet, treinen.remove??
    public void DelTrain(ActionEvent event) throws IOException {
        if (SelectTrain.getValue() != null) {
            treinen.remove(SelectTrain.getId());
        }else{
            System.out.print("is al verwijderd");
        }
    }

    // Deze functie moet de ook combo box refreshen en nieuwe waardes weergeven ( indien mogelijk )
    public void NieuweTrein() {
        String y = NieuweTreinNaam.getText().toString();
        if(!y.isEmpty())
        {
        Train trein = new Train(y);
        NieuweTreinMessage.setText("Nieuwe trein succesvol aangemaakt: \n " + trein.toString());
        }else{
            NieuweTreinMessage.setText("Voer een naam voor de trein in");
        }
    }

    // opent de CMD Line Interface , moet ie waardes meegegven? hebben de schermen gedeelde items?
    public void NieuwScherm() throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CommandLineInterface.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }


}
