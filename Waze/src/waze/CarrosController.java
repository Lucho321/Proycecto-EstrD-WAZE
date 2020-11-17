/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class CarrosController implements Initializable {

    @FXML
    private ImageView imhFerrari;
    @FXML
    private ImageView imgLandRober;
    @FXML
    private ImageView imgLexuz;
    @FXML
    private ImageView imgBUGATTI;
    @FXML
    private ImageView imgBMW;
    @FXML
    private Button btnCerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public String carroSeleccionado;
    Alert alert = new Alert(AlertType.INFORMATION);
    
    
    @FXML
    private void actFerrari(MouseEvent event) {
        carroSeleccionado="ferrari";
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("Auto seleccionado: Ferrari");
        alert.showAndWait();
    }

    @FXML
    private void actLandRober(MouseEvent event) {
        carroSeleccionado="landrober";
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("Auto seleccionado: Land Rober");
        alert.showAndWait();
    }

    @FXML
    private void actLexuz(MouseEvent event) {
        carroSeleccionado="lexuz";
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("Auto seleccionado: Lexuz");
        alert.showAndWait();
    }

    @FXML
    private void actBugatti(MouseEvent event) {
        carroSeleccionado="nugatti";
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("Auto seleccionado: Bugatti");
        alert.showAndWait();
    }

    @FXML
    private void actBMW(MouseEvent event) {
        carroSeleccionado="bmw";
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("Auto seleccionado: BMW");
        alert.showAndWait();
    }

    @FXML
    private void actCerrar(ActionEvent event) {
    Stage stage = (Stage) btnCerrar.getScene().getWindow();
    stage.close();
}
    public String getCarro(){
        return carroSeleccionado;
    }
    
}
