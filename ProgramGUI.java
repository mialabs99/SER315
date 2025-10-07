package SER315_GroupProject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//GUI implementation for our program
public class ProgramGUI extends Application {

    //Code for running the GUI
    public void start(Stage stage){
        //Screen 1: Welcome
        Button login = new Button("Login");
        Button signUp = new Button("Sign Up");
        Scene scene1 = createScene("Welcome!", login, signUp);

        stage.setScene(scene1);
        stage.show();
    }

    //Launches the GUI
    public static void main(String[] args){
        launch(args);
    }

    //Creates a scene with 1 line of text and multiple buttons
    public Scene createScene(String text, Button... buttons){
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(new Label(text));
        vbox.getChildren().addAll(buttons);
        return new Scene(vbox, 400, 300);
    }
}
