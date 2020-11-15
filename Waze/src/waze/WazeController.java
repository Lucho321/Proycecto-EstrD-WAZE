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
    private Circle v33;
    @FXML
    private Circle v8;
    @FXML
    private Circle v9;
    @FXML
    private Circle v34;
    @FXML
    private Circle v10;
    @FXML
    private Circle v46;
    @FXML
    private Circle v48;
    @FXML
    private Circle v45;
    @FXML
    private Circle v35;
    @FXML
    private Circle v36;
    @FXML
    private Circle v32;
    @FXML
    private Circle v43;
    @FXML
    private Circle v11;
    @FXML
    private Circle v37;
    @FXML
    private Circle v39;
    @FXML
    private Circle v38;
    @FXML
    private Circle v49;
    @FXML
    private Circle v7;
    @FXML
    private Circle v42;
    @FXML
    private Circle v54;
    @FXML
    private Circle v50;
    @FXML
    private Circle v65;
    @FXML
    private Circle v64;
    @FXML
    private Circle v6;
    @FXML
    private Circle v66;
    @FXML
    private Circle v30;
    @FXML
    private Circle v5;
    @FXML
    private Circle v4;
    @FXML
    private Circle v3;
    @FXML
    private Circle v29;
    @FXML
    private Circle v28;
    @FXML
    private Circle v2;
    @FXML
    private Circle v1;
    @FXML
    private Circle v31;
    @FXML
    private Circle v41;
    @FXML
    private Circle v27;
    @FXML
    private Circle v26;
    @FXML
    private Circle v44;
    @FXML
    private Circle v47;
    @FXML
    private Circle v63;
    @FXML
    private Circle v72;
    @FXML
    private Circle v57;
    @FXML
    private Circle v55;
    @FXML
    private Circle v25;
    @FXML
    private Circle v60;
    @FXML
    private Circle v58;
    @FXML
    private Circle v59;
    @FXML
    private Circle v24;
    @FXML
    private Circle v61;
    @FXML
    private Circle v62;
    @FXML
    private Circle v73;
    @FXML
    private Circle v74;
    @FXML
    private Circle v53;
    @FXML
    private Circle v83;
    @FXML
    private Circle v51;
    @FXML
    private Circle v40;
    @FXML
    private Circle v13;
    @FXML
    private Circle v14;
    @FXML
    private Circle v69;
    @FXML
    private Circle v52;
    @FXML
    private Circle v68;
    @FXML
    private Circle v67;
    @FXML
    private Circle v71;
    @FXML
    private Circle v76;
    @FXML
    private Circle v75;
    @FXML
    private Circle v82;
    @FXML
    private Circle v21;
    @FXML
    private Circle v22;
    @FXML
    private Circle v20;
    @FXML
    private Circle v81;
    @FXML
    private Circle v80;
    @FXML
    private Circle v70;
    @FXML
    private Circle v77;
    @FXML
    private Circle v19;
    @FXML
    private Circle v79;
    @FXML
    private Circle v78;
    @FXML
    private Circle v18;
    @FXML
    private Circle v15;
    @FXML
    private Circle v16;
    @FXML
    private Circle v17;
    @FXML
    private Circle v56;
    @FXML
    private Circle v23;
    @FXML
    private Circle v12;
    @FXML
    private Circle v84;
    @FXML
    private Line l24;
    @FXML
    private Line l22;
    @FXML
    private Line l21;
    @FXML
    private Line l20;
    @FXML
    private Line l19;
    @FXML
    private Line l18;
    @FXML
    private Line l14;
    @FXML
    private Line l17;
    @FXML
    private Line l15;
    @FXML
    private Line l26;
    @FXML
    private Line l25;
    @FXML
    private Line l8;
    @FXML
    private Line l7;
    @FXML
    private Line l6;
    @FXML
    private Line l5;
    @FXML
    private Line l4;
    @FXML
    private Line l3;
    @FXML
    private Line l2;
    @FXML
    private Line l1;
    @FXML
    private Line l27;
    @FXML
    private Line l11;
    @FXML
    private Line l12;
    @FXML
    private Line l10;
    @FXML
    private Line l9;
    @FXML
    private Line l13;
    @FXML
    private Line l16;
    @FXML
    private Line l30;
    @FXML
    private Line l29;
    @FXML
    private Line l28;
    @FXML
    private Line l38;
    @FXML
    private Line l35;
    @FXML
    private Line l36;
    @FXML
    private Line l31;
    @FXML
    private Line l32;
    @FXML
    private Line l33;
    @FXML
    private Line l34;
    @FXML
    private Line l42;
    @FXML
    private Line l43;
    @FXML
    private Line l41;
    @FXML
    private Line l39;
    @FXML
    private Line l37;
    @FXML
    private Line l40;
    @FXML
    private Line l44;
    @FXML
    private Line l56;
    @FXML
    private Line l69;
    @FXML
    private Line l57;
    @FXML
    private Line l49;
    @FXML
    private Line l55;
    @FXML
    private Line l46;
    @FXML
    private Line l45;
    @FXML
    private Line l47;
    @FXML
    private Line l48;
    @FXML
    private Line l58;
    @FXML
    private Line l65;
    @FXML
    private Line l59;
    @FXML
    private Line l60;
    @FXML
    private Line l61;
    @FXML
    private Line l71;
    @FXML
    private Line l68;
    @FXML
    private Line l70;
    @FXML
    private Line l52;
    @FXML
    private Line l53;
    @FXML
    private Line l51;
    @FXML
    private Line l50;
    @FXML
    private Line l54;
    @FXML
    private Line l74;
    @FXML
    private Line l62;
    @FXML
    private Line l63;
    @FXML
    private Line l64;
    @FXML
    private Line l73;
    @FXML
    private Line l72;
    @FXML
    private Line l66;
    @FXML
    private Line l67;
    @FXML
    private Line l75;
    @FXML
    private Line l76;
    @FXML
    private Line l85;
    @FXML
    private Line l86;
    @FXML
    private Line l81;
    @FXML
    private Line l84;
    @FXML
    private Line l83;
    @FXML
    private Line l82;
    @FXML
    private Line l77;
    @FXML
    private Line l90;
    @FXML
    private Line l94;
    @FXML
    private Line l102;
    @FXML
    private Line l99;
    @FXML
    private Line l107;
    @FXML
    private Line l110;
    @FXML
    private Line l112;
    @FXML
    private Line l113;
    @FXML
    private Line l111;
    @FXML
    private Line l117;
    @FXML
    private Line l114;
    @FXML
    private Line l118;
    @FXML
    private Line l121;
    @FXML
    private Line l120;
    @FXML
    private Line l115;
    @FXML
    private Line l119;
    @FXML
    private Line l122;
    @FXML
    private Line l91;
    @FXML
    private Line l95;
    @FXML
    private Line l92;
    @FXML
    private Line l100;
    @FXML
    private Line l108;
    @FXML
    private Line l123;
    @FXML
    private Line l124;
    @FXML
    private Line l80;
    @FXML
    private Line l96;
    @FXML
    private Line l101;
    @FXML
    private Line l104;
    @FXML
    private Line l97;
    @FXML
    private Line l105;
    @FXML
    private Line l109;
    @FXML
    private Line l106;
    @FXML
    private Line l98;
    @FXML
    private Line l93;
    @FXML
    private Line l87;
    @FXML
    private Line l88;
    @FXML
    private Line l89;
    @FXML
    private Line l78;
    @FXML
    private Line l79;
    @FXML
    private Line l116;
    @FXML
    private Line l103;
    @FXML
    private Line l125;
    @FXML
    private Line line128;
    @FXML
    private Button btnChoque;
    @FXML
    private Button btnTrafico;
    @FXML
    private Button btnCerrarCalle;
    @FXML
    private CheckBox cbxFloyd;
    @FXML
    private CheckBox cbxDijkstra;
    
    
    
    

    
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
        line128.setVisible(btnlineas.isSelected());
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

    @FXML
    private void actChoque(ActionEvent event) {
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
    
    private void addVertices(){
        vertices.add((Vertice)v1); vertices.add((Vertice)v2); vertices.add((Vertice)v3); vertices.add((Vertice)v4); vertices.add((Vertice)v5); vertices.add((Vertice)v6);
        vertices.add((Vertice)v7); vertices.add((Vertice)v8); vertices.add((Vertice)v9); vertices.add((Vertice)v10); vertices.add((Vertice)v11); vertices.add((Vertice)v12);
        vertices.add((Vertice)v13); vertices.add((Vertice)v14); vertices.add((Vertice)v15); vertices.add((Vertice)v16); vertices.add((Vertice)v17); vertices.add((Vertice)v18);
        vertices.add((Vertice)v19); vertices.add((Vertice)v20); vertices.add((Vertice)v21); vertices.add((Vertice)v22); vertices.add((Vertice)v23); vertices.add((Vertice)v24);
        vertices.add((Vertice)v25); vertices.add((Vertice)v26); vertices.add((Vertice)v27); vertices.add((Vertice)v28); vertices.add((Vertice)v29); vertices.add((Vertice)v30);
        vertices.add((Vertice)v31); vertices.add((Vertice)v32); vertices.add((Vertice)v33); vertices.add((Vertice)v34); vertices.add((Vertice)v35); vertices.add((Vertice)v36);
        vertices.add((Vertice)v37); vertices.add((Vertice)v38); vertices.add((Vertice)v39); vertices.add((Vertice)v40); vertices.add((Vertice)v41); vertices.add((Vertice)v42);
        vertices.add((Vertice)v43); vertices.add((Vertice)v44); vertices.add((Vertice)v45); vertices.add((Vertice)v46); vertices.add((Vertice)v47); vertices.add((Vertice)v48);
        vertices.add((Vertice)v49); vertices.add((Vertice)v50); vertices.add((Vertice)v51); vertices.add((Vertice)v52); vertices.add((Vertice)v53); vertices.add((Vertice)v54);
        vertices.add((Vertice)v55); vertices.add((Vertice)v56); vertices.add((Vertice)v57); vertices.add((Vertice)v58); vertices.add((Vertice)v59); vertices.add((Vertice)v60);
        vertices.add((Vertice)v61); vertices.add((Vertice)v62); vertices.add((Vertice)v63); vertices.add((Vertice)v64); vertices.add((Vertice)v65); vertices.add((Vertice)v66);
        vertices.add((Vertice)v67); vertices.add((Vertice)v68); vertices.add((Vertice)v69); vertices.add((Vertice)v70); vertices.add((Vertice)v71); vertices.add((Vertice)v72);
        vertices.add((Vertice)v73); vertices.add((Vertice)v74); vertices.add((Vertice)v75); vertices.add((Vertice)v76); vertices.add((Vertice)v77); vertices.add((Vertice)v78);
        vertices.add((Vertice)v79); vertices.add((Vertice)v80); vertices.add((Vertice)v81); vertices.add((Vertice)v82); vertices.add((Vertice)v83); vertices.add((Vertice)v84);
        vertices.add((Vertice)v1); vertices.add((Vertice)v1); vertices.add((Vertice)v1); vertices.add((Vertice)v1); vertices.add((Vertice)v1); vertices.add((Vertice)v1);
    }
}
