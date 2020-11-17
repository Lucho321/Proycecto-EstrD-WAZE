/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import waze.util.AppContext;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class TipoTraficoController implements Initializable {

    @FXML
    private Button btnAtras;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public int tipoTrafico;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    private void actModerado(MouseEvent event) {
        tipoTrafico=2;
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("tráfico seleccionado: Moderado");
        alert.showAndWait();
    }

    @FXML
    private void actNormal(MouseEvent event) {
        tipoTrafico=1;
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("tráfico seleccionado: Normal");
        alert.showAndWait();
    }

    @FXML
    private void actLento(MouseEvent event) {
        tipoTrafico=3;
        alert.setTitle("Auto seleccionado");
        alert.setHeaderText(null);
        alert.setContentText("tráfico seleccionado: Lento");
        alert.showAndWait();
    }

    @FXML
    private void actAtras(ActionEvent event) {
        Stage stage = (Stage) btnAtras.getScene().getWindow();
        AppContext.getInstance().set("tipoTrafico", tipoTrafico);
        stage.close();
    }
    
}
