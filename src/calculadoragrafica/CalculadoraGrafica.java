
package calculadoragrafica;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CalculadoraGrafica extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(new Group(), 730, 450);
        scene.getStylesheets().add("style1.css");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MathFX");
        stage.show();
        
    }
    


    public static void main(String[] args) {
        launch(args);
    }
    
}
