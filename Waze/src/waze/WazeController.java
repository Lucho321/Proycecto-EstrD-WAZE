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
import javafx.scene.control.Label;
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
    private CheckBox btnVertices;
    @FXML
    private CheckBox btnlineas;
    @FXML
    private Circle v33, v8, v9, v34, v10, v46, v48, v45, v35, v36, v32, v43, v11, v37, v39, v38, 
            v49, v7, v42, v54, v50, v65, v64, v6, v66, v30, v5, v4, v3, v29, v28, v2, v1, v12,
            v31, v41, v27, v26, v44, v47, v63, v72, v57, v55, v25, v60, v58, v59, v24, v61, v84,
            v62, v73, v74, v53, v83, v51, v40, v13, v14, v69, v52, v68, v67, v71, v76, v75, v23,
            v82, v21, v22, v20, v81, v80, v70, v77, v19, v79, v78, v18, v15, v16, v17, v56, v85, 
            v86, v87, v88, v89, v90, v91;
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
    

    private List<Circle> circles = new ArrayList();
    private List<Circle> vertices = new ArrayList();
    @FXML
    private Label lblPunto;
    @FXML
    private Button btnCancelar;
    
    private String modo = "";
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addVertices();
        
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
        btnVertices.setSelected(true);
        setLineasVisible();
        setVerticesVisible();
        
        lblPunto.setVisible(false);
        btnCancelar.setVisible(false);
    }    
    
    

    @FXML
    private void clickLine(MouseEvent event) {
        Line l = (Line)(event.getSource());
        l.setStroke(Color.ORANGE);
    }
    @FXML
    private void clickCircle(MouseEvent event) {
        Circle c = (Circle)event.getSource();
        
        
        if(modo.equals("seleccionarRuta")){
            modo = "puntoInicio";
            vertices.add(c);
            c.setFill(Color.ORANGE);
            lblPunto.setText("Seleccione el punto de llegada");
            return;
        }
        if(modo.equals("puntoInicio")){
            //vertices.get(0).setFill(Color.WHITE);
            //vertices.remove(0);
            modo = "puntoLlegada";
            vertices.add(c);
            c.setFill(Color.ORANGE);
            lblPunto.setText("");
            return;
        }
//        if(modo.equals("puntoLlegada")){
//            vertices.get(1).setFill(Color.WHITE);
//            vertices.remove(1);
//            vertices.add(c);
//            modo = "puntoLlegada";
//        }
    }  
    
    @FXML
    private void actLineas(ActionEvent event) {
        setLineasVisible();
    } 
    
    boolean verticesVisibles;
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
        circles.forEach(x->{
            x.setVisible(btnVertices.isSelected());
        });
        lblPunto.setText("Seleccione el punto de llegada");
        btnCancelar.setVisible(true);
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
        seleccionarRuta();
    }
    
    @FXML
    private void actFloyd(ActionEvent event){
        cbxDijkstra.setSelected(false);
        seleccionarRuta();
    }
    
    private int cont = 0;
    private void addVertices(){

        circles.add(v1); circles.add(v2); circles.add(v3); circles.add(v4); circles.add(v5); circles.add(v6);
        circles.add(v7); circles.add(v8); circles.add(v9); circles.add(v10); circles.add(v11); circles.add(v12);
        circles.add(v13); circles.add(v14); circles.add(v15); circles.add(v16); circles.add(v17); circles.add(v18);
        circles.add(v19); circles.add(v20); circles.add(v21); circles.add(v22); circles.add(v23); circles.add(v24);
        circles.add(v25); circles.add(v26); circles.add(v27); circles.add(v28); circles.add(v29); circles.add(v30);
        circles.add(v31); circles.add(v32); circles.add(v33); circles.add(v34); circles.add(v35); circles.add(v36);
        circles.add(v37); circles.add(v38); circles.add(v39); circles.add(v40); circles.add(v41); circles.add(v42);
        circles.add(v43); circles.add(v44); circles.add(v45); circles.add(v46); circles.add(v47); circles.add(v48);
        circles.add(v49); circles.add(v50); circles.add(v51); circles.add(v52); circles.add(v53); circles.add(v54);
        circles.add(v55); circles.add(v56); circles.add(v57); circles.add(v58); circles.add(v59); circles.add(v60);
        circles.add(v61); circles.add(v62); circles.add(v63); circles.add(v64); circles.add(v65); circles.add(v66);
        circles.add(v67); circles.add(v68); circles.add(v69); circles.add(v70); circles.add(v71); circles.add(v72);
        circles.add(v73); circles.add(v74); circles.add(v75); circles.add(v76); circles.add(v77); circles.add(v78);
        circles.add(v79); circles.add(v80); circles.add(v81); circles.add(v82); circles.add(v83); circles.add(v84);
        circles.add(v85); circles.add(v86); circles.add(v87); circles.add(v88); circles.add(v89); circles.add(v90);
        circles.add(v91);
        
        
        circles.forEach(x-> {
            x.setId(String.valueOf(cont));
            cont++;
        });
    }

    @FXML
    private void actCancelar(ActionEvent event) {
        if(modo.equals("puntoInicio")){
            vertices.get(0).setFill(Color.WHITE);
            vertices.clear();
            modo = "seleccionarRuta";
            lblPunto.setText("Seleccione el punto de partida");  
        }
        if(modo.equals("puntoLlegada")){
            if(vertices.get(1) != null){
                vertices.get(1).setFill(Color.WHITE);
                vertices.remove(1);
                modo = "puntoInicio";
                lblPunto.setText("Seleccione el punto de llegada");
            }
        }
    }
    
    private void seleccionarRuta(){
        lblPunto.setVisible(true);
        lblPunto.setText("Seleccione el punto de partida");
        btnCancelar.setVisible(true);
        modo = "seleccionarRuta";
    }
}
