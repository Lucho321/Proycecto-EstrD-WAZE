/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import waze.algoritmos.Dijkstra;
import waze.algoritmos.Floyd;
import waze.util.Matriz;
import waze.util.Vertice;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class WazeController implements Initializable {

    
    @FXML
    private ImageView mapa;
    @FXML
    private CheckBox btnlineas;
    @FXML
    private CheckBox btnVerices;
    @FXML
    private Circle v33, v8, v9, v34, v10, v46, v48, v45, v35, v36, v32, v43, v11, v37, v39, v38, 
            v49, v7, v42, v54, v50, v65, v64, v6, v66, v30, v5, v4, v3, v29, v28, v2, v1, v12,
            v31, v41, v27, v26, v44, v47, v63, v72, v57, v55, v25, v60, v58, v59, v24, v61, v84,
            v62, v73, v74, v53, v83, v51, v40, v13, v14, v69, v52, v68, v67, v71, v76, v75, v23,
            v82, v21, v22, v20, v81, v80, v70, v77, v19, v79, v78, v18, v15, v16, v17, v56;
    @FXML
    private Line l24, l22, l21, l20, l19, l18, l14, l17, l15, l26, l25, l8, l7, l6, l5, l4, l3, l2, l1,
            l27, l11, l12, l10, l9, l13, l16, l30, l29, l28, l38, l35, l36, l31, l32, l33, l34, l42,
            l43, l41, l39, l37, l40, l44, l56, l69, l57, l49, l55, l46, l45, l47, l48, l58, l65, l59,
            l60, l61, l71, l68, l70, l52, l53, l51, l50, l54, l74, l62, l63, l64, l73, l72, l66, l67,
            l75, l76, l85, l86, l81, l84, l83, l82, l77, l90, l94, l102, l99, l107, l110, l112, l113,
            l111, l117, l114, l118, l121, l120, l115, l119, l122, l91, l95, l92, l100, l108, l123, l124,
            l80, l96, l101, l104, l97, l105, l109, l106, l98, l93, l87, l88, l89, l78, l79, l116, l103, l125, l128;
    
    @FXML
    private Button btnChoque;
    @FXML
    private Button btnTrafico;
    @FXML
    private Button btnCerrarCalle;
    
    

    private List<Object> lineasSeleccionadas = new ArrayList<Object>();
    private List<Object> verticesSeleccionados = new ArrayList<Object>();
    
    @FXML
    private CheckBox cbxFloyd;
    @FXML
    private CheckBox cbxDijkstra;
   
    
    @FXML
    private Line l126;
    @FXML
    private Line l1261;
    @FXML
    private Line l12611;
    @FXML
    private Line l1261111;
    @FXML
    private Line l126111;
    @FXML
    private Circle v110;
    @FXML
    private Line line128;
    private Circle v112;
    @FXML
    private Circle v1121;
    private Circle v1122;
    @FXML
    private Circle v111;
    @FXML
    private Circle v11211;
    
    private Circle v112111;

    
    private List<Vertice> vertices = new ArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image image = new Image(getClass().getResourceAsStream("/imagenes/choque.png"));
        ImageView imgView = new ImageView(image);
        imgView.setFitHeight(50);
        imgView.setFitWidth(50);
        btnChoque.setGraphic(imgView);
        
        image = new Image(getClass().getResourceAsStream("/imagenes/trafico.png"));
        imgView = new ImageView(image);
        imgView.setFitHeight(50);
        imgView.setFitWidth(50);
        btnTrafico.setGraphic(imgView);
        
        image = new Image(getClass().getResourceAsStream("/imagenes/calleCerrada.png"));
        imgView = new ImageView(image);
        imgView.setFitHeight(50);
        imgView.setFitWidth(50);
        btnCerrarCalle.setGraphic(imgView);
        
        btnlineas.setSelected(true);
        btnVerices.setSelected(true);
        setLineasVisible();
        setVerticesVisible();
    }    
    
    

    @FXML
    private void clickLine(MouseEvent event) {
        Line l = (Line)(event.getSource());
        l.setStroke(Color.ORANGE);
    }
    @FXML
    private void clickCircle(MouseEvent event) {
        Circle c = (Circle)event.getSource();
        c.setFill(Color.ORANGE);
        
    }
    @FXML
    private void actLineas(ActionEvent event) {
        setLineasVisible();
    } 
    @FXML
    private void actVertices(ActionEvent event) {
        setVerticesVisible();
    }
    private void setLineasVisible(){
        l1.setVisible(btnlineas.isSelected());
        l2.setVisible(btnlineas.isSelected());
        l3.setVisible(btnlineas.isSelected());
        l4.setVisible(btnlineas.isSelected());
        l5.setVisible(btnlineas.isSelected());
        l6.setVisible(btnlineas.isSelected());
        l7.setVisible(btnlineas.isSelected());
        l8.setVisible(btnlineas.isSelected());
        l9.setVisible(btnlineas.isSelected());
        l10.setVisible(btnlineas.isSelected());
        l11.setVisible(btnlineas.isSelected());
        l12.setVisible(btnlineas.isSelected());
        l13.setVisible(btnlineas.isSelected());
        l14.setVisible(btnlineas.isSelected());
        l15.setVisible(btnlineas.isSelected());
        l16.setVisible(btnlineas.isSelected());
        l17.setVisible(btnlineas.isSelected());
        l18.setVisible(btnlineas.isSelected());
        l19.setVisible(btnlineas.isSelected());
        l20.setVisible(btnlineas.isSelected());
        l21.setVisible(btnlineas.isSelected());
        l22.setVisible(btnlineas.isSelected());
        l24.setVisible(btnlineas.isSelected());
        l25.setVisible(btnlineas.isSelected());
        l26.setVisible(btnlineas.isSelected());
        l27.setVisible(btnlineas.isSelected());
        l28.setVisible(btnlineas.isSelected());
        l29.setVisible(btnlineas.isSelected());
        l30.setVisible(btnlineas.isSelected());
        l31.setVisible(btnlineas.isSelected());
        l32.setVisible(btnlineas.isSelected());
        l33.setVisible(btnlineas.isSelected());
        l34.setVisible(btnlineas.isSelected());
        l35.setVisible(btnlineas.isSelected());
        l36.setVisible(btnlineas.isSelected());
        l37.setVisible(btnlineas.isSelected());
        l38.setVisible(btnlineas.isSelected());
        l39.setVisible(btnlineas.isSelected());
        l40.setVisible(btnlineas.isSelected());
        l41.setVisible(btnlineas.isSelected());
        l42.setVisible(btnlineas.isSelected());
        l43.setVisible(btnlineas.isSelected());
        l44.setVisible(btnlineas.isSelected());
        l45.setVisible(btnlineas.isSelected());
        l46.setVisible(btnlineas.isSelected());
        l47.setVisible(btnlineas.isSelected());
        l48.setVisible(btnlineas.isSelected());
        l49.setVisible(btnlineas.isSelected());
        l50.setVisible(btnlineas.isSelected());
        l51.setVisible(btnlineas.isSelected());
        l52.setVisible(btnlineas.isSelected());
        l53.setVisible(btnlineas.isSelected());
        l54.setVisible(btnlineas.isSelected());
        l55.setVisible(btnlineas.isSelected());
        l56.setVisible(btnlineas.isSelected());
        l57.setVisible(btnlineas.isSelected());
        l58.setVisible(btnlineas.isSelected());
        l59.setVisible(btnlineas.isSelected());
        l60.setVisible(btnlineas.isSelected());
        l61.setVisible(btnlineas.isSelected());
        l62.setVisible(btnlineas.isSelected());
        l63.setVisible(btnlineas.isSelected());
        l64.setVisible(btnlineas.isSelected());
        l65.setVisible(btnlineas.isSelected());
        l66.setVisible(btnlineas.isSelected());
        l67.setVisible(btnlineas.isSelected());
        l68.setVisible(btnlineas.isSelected());
        l69.setVisible(btnlineas.isSelected());
        l70.setVisible(btnlineas.isSelected());
        l71.setVisible(btnlineas.isSelected());
        l72.setVisible(btnlineas.isSelected());
        l73.setVisible(btnlineas.isSelected());
        l74.setVisible(btnlineas.isSelected());
        l75.setVisible(btnlineas.isSelected());
        l76.setVisible(btnlineas.isSelected());
        l77.setVisible(btnlineas.isSelected());
        l78.setVisible(btnlineas.isSelected());
        l79.setVisible(btnlineas.isSelected());
        l80.setVisible(btnlineas.isSelected());
        l81.setVisible(btnlineas.isSelected());
        l82.setVisible(btnlineas.isSelected());
        l83.setVisible(btnlineas.isSelected());
        l84.setVisible(btnlineas.isSelected());
        l85.setVisible(btnlineas.isSelected());
        l86.setVisible(btnlineas.isSelected());
        l87.setVisible(btnlineas.isSelected());
        l88.setVisible(btnlineas.isSelected());
        l89.setVisible(btnlineas.isSelected());
        l90.setVisible(btnlineas.isSelected());
        l91.setVisible(btnlineas.isSelected());
        l92.setVisible(btnlineas.isSelected());
        l93.setVisible(btnlineas.isSelected());
        l94.setVisible(btnlineas.isSelected());
        l95.setVisible(btnlineas.isSelected());
        l96.setVisible(btnlineas.isSelected());
        l97.setVisible(btnlineas.isSelected());
        l98.setVisible(btnlineas.isSelected());
        l99.setVisible(btnlineas.isSelected());
        l100.setVisible(btnlineas.isSelected());
        l101.setVisible(btnlineas.isSelected());
        l102.setVisible(btnlineas.isSelected());
        l103.setVisible(btnlineas.isSelected());
        l104.setVisible(btnlineas.isSelected());
        l105.setVisible(btnlineas.isSelected());
        l106.setVisible(btnlineas.isSelected());
        l107.setVisible(btnlineas.isSelected());
        l108.setVisible(btnlineas.isSelected());
        l109.setVisible(btnlineas.isSelected());
        l110.setVisible(btnlineas.isSelected());
        l111.setVisible(btnlineas.isSelected());
        l112.setVisible(btnlineas.isSelected());
        l113.setVisible(btnlineas.isSelected());
        l114.setVisible(btnlineas.isSelected());
        l115.setVisible(btnlineas.isSelected());
        l116.setVisible(btnlineas.isSelected());
        l117.setVisible(btnlineas.isSelected());
        l118.setVisible(btnlineas.isSelected());
        l119.setVisible(btnlineas.isSelected());
        l120.setVisible(btnlineas.isSelected());
        l121.setVisible(btnlineas.isSelected());
        l122.setVisible(btnlineas.isSelected());
        l123.setVisible(btnlineas.isSelected());
        l124.setVisible(btnlineas.isSelected());
        l125.setVisible(btnlineas.isSelected());
        l128.setVisible(btnlineas.isSelected());
    }
    private void setVerticesVisible(){
        v1.setVisible(btnVerices.isSelected());
        v2.setVisible(btnVerices.isSelected());
        v3.setVisible(btnVerices.isSelected());
        v4.setVisible(btnVerices.isSelected());
        v5.setVisible(btnVerices.isSelected());
        v6.setVisible(btnVerices.isSelected());
        v7.setVisible(btnVerices.isSelected());
        v8.setVisible(btnVerices.isSelected());
        v9.setVisible(btnVerices.isSelected());
        v10.setVisible(btnVerices.isSelected());
        v11.setVisible(btnVerices.isSelected());
        v12.setVisible(btnVerices.isSelected());
        v13.setVisible(btnVerices.isSelected());
        v14.setVisible(btnVerices.isSelected());
        v15.setVisible(btnVerices.isSelected());
        v16.setVisible(btnVerices.isSelected());
        v17.setVisible(btnVerices.isSelected());
        v18.setVisible(btnVerices.isSelected());
        v19.setVisible(btnVerices.isSelected());
        v20.setVisible(btnVerices.isSelected());
        v21.setVisible(btnVerices.isSelected());
        v22.setVisible(btnVerices.isSelected());
        v23.setVisible(btnVerices.isSelected());
        v24.setVisible(btnVerices.isSelected());
        v25.setVisible(btnVerices.isSelected());
        v26.setVisible(btnVerices.isSelected());
        v27.setVisible(btnVerices.isSelected());
        v28.setVisible(btnVerices.isSelected());
        v29.setVisible(btnVerices.isSelected());
        v30.setVisible(btnVerices.isSelected());
        v31.setVisible(btnVerices.isSelected());
        v32.setVisible(btnVerices.isSelected());
        v33.setVisible(btnVerices.isSelected());
        v34.setVisible(btnVerices.isSelected());
        v35.setVisible(btnVerices.isSelected());
        v36.setVisible(btnVerices.isSelected());
        v37.setVisible(btnVerices.isSelected());
        v38.setVisible(btnVerices.isSelected());
        v39.setVisible(btnVerices.isSelected());
        v40.setVisible(btnVerices.isSelected());
        v41.setVisible(btnVerices.isSelected());
        v42.setVisible(btnVerices.isSelected());
        v43.setVisible(btnVerices.isSelected());
        v44.setVisible(btnVerices.isSelected());
        v45.setVisible(btnVerices.isSelected());
        v46.setVisible(btnVerices.isSelected());
        v47.setVisible(btnVerices.isSelected());
        v48.setVisible(btnVerices.isSelected());
        v49.setVisible(btnVerices.isSelected());
        v50.setVisible(btnVerices.isSelected());
        v51.setVisible(btnVerices.isSelected());
        v52.setVisible(btnVerices.isSelected());
        v53.setVisible(btnVerices.isSelected());
        v54.setVisible(btnVerices.isSelected());
        v55.setVisible(btnVerices.isSelected());
        v56.setVisible(btnVerices.isSelected());
        v57.setVisible(btnVerices.isSelected());
        v58.setVisible(btnVerices.isSelected());
        v59.setVisible(btnVerices.isSelected());
        v60.setVisible(btnVerices.isSelected());
        v61.setVisible(btnVerices.isSelected());
        v62.setVisible(btnVerices.isSelected());
        v63.setVisible(btnVerices.isSelected());
        v64.setVisible(btnVerices.isSelected());
        v65.setVisible(btnVerices.isSelected());
        v66.setVisible(btnVerices.isSelected());
        v67.setVisible(btnVerices.isSelected());
        v68.setVisible(btnVerices.isSelected());
        v69.setVisible(btnVerices.isSelected());
        v70.setVisible(btnVerices.isSelected());
        v71.setVisible(btnVerices.isSelected());
        v72.setVisible(btnVerices.isSelected());
        v73.setVisible(btnVerices.isSelected());
        v74.setVisible(btnVerices.isSelected());
        v75.setVisible(btnVerices.isSelected());
        v76.setVisible(btnVerices.isSelected());
        v77.setVisible(btnVerices.isSelected());
        v78.setVisible(btnVerices.isSelected());
        v79.setVisible(btnVerices.isSelected());
        v80.setVisible(btnVerices.isSelected());
        v81.setVisible(btnVerices.isSelected());
        v82.setVisible(btnVerices.isSelected());
        v83.setVisible(btnVerices.isSelected()); 
        v84.setVisible(btnVerices.isSelected());
    }
    
    Matriz m = new Matriz();
    Dijkstra d = new Dijkstra();
    Floyd f = new Floyd();
    GrafoMatriz g = new GrafoMatriz();
    @FXML
    private void actChoque(ActionEvent event) {
        //d.dijkstra(m.getMatriz(), 1, 10);
        f.floyd(91, g, 1, 10);
    }

    @FXML
    private void actTrafico(ActionEvent event) {
    }

    @FXML
    private void actCerrarCalle(ActionEvent event) {
    }
    
    @FXML
    private void actDijkstra(ActionEvent event){
        cbxFloyd.setSelected(false);
    }
    
    @FXML
    private void actFloyd(ActionEvent event){
        cbxDijkstra.setSelected(false);
    }
    
    
}
