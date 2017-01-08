package assignment2.userinterface;
// nieuwe test
import assignment2.parser.RichRailLexer;
import assignment2.parser.RichRailParser;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.awt.*;
import java.io.IOException;


public class Main extends Application  {

Button button = new Button();

    public Main() throws IOException {
    }

    public static void main(String[] args){
        launch(args);
    }

    @Override // open het eerste scherm ( primaryStage )
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("RichRail");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
    {
        // deze code word bij het runnen meteen gebruikt, deze moet weg voor de eindversie
        ANTLRInputStream input = new ANTLRInputStream("new wagon w3");
        RichRailLexer lex = new RichRailLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        RichRailParser parser = new RichRailParser(tokens);
        parser.command();

    }
}
  //  @Override
//       public void start(Stage primaryStage) throws Exception{
//        primaryStage.setTitle("Hello World");
//        StackPane layout = new StackPane();
//
//
//        // Button voor het openen van CMD line Interface
//        Button OpenCMD = new Button();
//        OpenCMD.setText("Open CMD line interface");
//        OpenCMD.setOnAction((event) -> {
//           boolean result = CMDLineInterface.pizza();
//           System.out.print("knop naar interface is gebruikt");
//        });
//
//        BorderPane border = new BorderPane();
//        VBox vbox = new VBox();
//        border.setLeft(vbox);
//        Button b1 = new Button();
//        b1.setOnAction(event -> System.out.print("deze knop print deze system text: deze text"));
//        border.getChildren().add(b1);
//
//        // toevoegen van alle objecten aan de layout
//        layout.getChildren().addAll(border, OpenCMD);
//
//        Scene scene = new Scene (layout, 300, 250);
//
//        // wat moet er gebeuren in de stage
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

