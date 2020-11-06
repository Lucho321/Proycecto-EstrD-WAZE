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
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class WazeController implements Initializable {

    @FXML
    private ImageView mapa;
    @FXML
    private Line line128;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickLine(MouseEvent event) {
        Line l = (Line)(event.getSource());
        l.setStroke(Color.RED);
    }
    

    @FXML
    private void clickCircle(MouseEvent event) {
        Circle c = (Circle)event.getSource();
        c.setFill(Color.RED);
       
    }

    @FXML
    private void actLineas(ActionEvent event) {
        if(btnlineas.isSelected()){
            l1.setVisible(true);
            l1.setVisible(true);
            l2.setVisible(true);
            l3.setVisible(true);
            l4.setVisible(true);
            l5.setVisible(true);
            l6.setVisible(true);
            l7.setVisible(true);
            l8.setVisible(true);
            l9.setVisible(true);
            l10.setVisible(true);
            l11.setVisible(true);
            l12.setVisible(true);
            l13.setVisible(true);
            l14.setVisible(true);
            l15.setVisible(true);
            l16.setVisible(true);
            l17.setVisible(true);
            l18.setVisible(true);
            l19.setVisible(true);
            l20.setVisible(true);
            l21.setVisible(true);
            l22.setVisible(true);
            l24.setVisible(true);
            l25.setVisible(true);
            l26.setVisible(true);
            l27.setVisible(true);
            l28.setVisible(true);
            l29.setVisible(true);
            l30.setVisible(true);
            l31.setVisible(true);
            l32.setVisible(true);
            l33.setVisible(true);
            l34.setVisible(true);
            l35.setVisible(true);
            l36.setVisible(true);
            l37.setVisible(true);
            l38.setVisible(true);
            l39.setVisible(true);
            l40.setVisible(true);
            l41.setVisible(true);
            l42.setVisible(true);
            l43.setVisible(true);
            l44.setVisible(true);
            l45.setVisible(true);
            l46.setVisible(true);
            l47.setVisible(true);
            l48.setVisible(true);
            l49.setVisible(true);
            l50.setVisible(true);
            l51.setVisible(true);
            l52.setVisible(true);
            l53.setVisible(true);
            l54.setVisible(true);
            l55.setVisible(true);
            l56.setVisible(true);
            l57.setVisible(true);
            l58.setVisible(true);
            l59.setVisible(true);
            l60.setVisible(true);
            l61.setVisible(true);
            l62.setVisible(true);
            l63.setVisible(true);
            l64.setVisible(true);
            l65.setVisible(true);
            l66.setVisible(true);
            l67.setVisible(true);
            l68.setVisible(true);
            l69.setVisible(true);
            l70.setVisible(true);
            l71.setVisible(true);
            l72.setVisible(true);
            l73.setVisible(true);
            l74.setVisible(true);
            l75.setVisible(true);
            l76.setVisible(true);
            l77.setVisible(true);
            l78.setVisible(true);
            l79.setVisible(true);
            l80.setVisible(true);
            l81.setVisible(true);
            l82.setVisible(true);
            l83.setVisible(true);
            l84.setVisible(true);
            l85.setVisible(true);
            l86.setVisible(true);
            l87.setVisible(true);
            l88.setVisible(true);
            l89.setVisible(true);
            l90.setVisible(true);
            l91.setVisible(true);
            l92.setVisible(true);
            l93.setVisible(true);
            l94.setVisible(true);
            l95.setVisible(true);
            l96.setVisible(true);
            l97.setVisible(true);
            l98.setVisible(true);
            l99.setVisible(true);
            l100.setVisible(true);
            l101.setVisible(true);
            l102.setVisible(true);
            l103.setVisible(true);
            l104.setVisible(true);
            l105.setVisible(true);
            l106.setVisible(true);
            l107.setVisible(true);
            l108.setVisible(true);
            l109.setVisible(true);
            l110.setVisible(true);
            l111.setVisible(true);
            l112.setVisible(true);
            l113.setVisible(true);
            l114.setVisible(true);
            l115.setVisible(true);
            l116.setVisible(true);
            l117.setVisible(true);
            l118.setVisible(true);
            l119.setVisible(true);
            l120.setVisible(true);
            l121.setVisible(true);
            l122.setVisible(true);
            l123.setVisible(true);
            l124.setVisible(true);
            l125.setVisible(true);
        }else{
            l1.setVisible(false);
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            l4.setVisible(false);
            l5.setVisible(false);
            l6.setVisible(false);
            l7.setVisible(false);
            l8.setVisible(false);
            l9.setVisible(false);
            l10.setVisible(false);
            l11.setVisible(false);
            l12.setVisible(false);
            l13.setVisible(false);
            l14.setVisible(false);
            l15.setVisible(false);
            l16.setVisible(false);
            l17.setVisible(false);
            l18.setVisible(false);
            l19.setVisible(false);
            l20.setVisible(false);
            l21.setVisible(false);
            l22.setVisible(false);
            l24.setVisible(false);
            l25.setVisible(false);
            l26.setVisible(false);
            l27.setVisible(false);
            l28.setVisible(false);
            l29.setVisible(false);
            l30.setVisible(false);  
            l31.setVisible(false);
            l32.setVisible(false);
            l33.setVisible(false);
            l34.setVisible(false);
            l35.setVisible(false);
            l36.setVisible(false);
            l37.setVisible(false);
            l38.setVisible(false);
            l39.setVisible(false);
            l40.setVisible(false);
            l41.setVisible(false);
            l42.setVisible(false);
            l43.setVisible(false);
            l44.setVisible(false);
            l45.setVisible(false);
            l46.setVisible(false);
            l47.setVisible(false);
            l48.setVisible(false);
            l49.setVisible(false);
            l50.setVisible(false);
            l51.setVisible(false);
            l52.setVisible(false);
            l53.setVisible(false);
            l54.setVisible(false);
            l55.setVisible(false);
            l56.setVisible(false);
            l57.setVisible(false);
            l58.setVisible(false);
            l59.setVisible(false);
            l60.setVisible(false);
            l61.setVisible(false);
            l62.setVisible(false);
            l63.setVisible(false);
            l64.setVisible(false);
            l65.setVisible(false);
            l66.setVisible(false);
            l67.setVisible(false);
            l68.setVisible(false);
            l69.setVisible(false);
            l70.setVisible(false);
            l71.setVisible(false);
            l72.setVisible(false);
            l73.setVisible(false);
            l74.setVisible(false);
            l75.setVisible(false);
            l76.setVisible(false);
            l77.setVisible(false);
            l78.setVisible(false);
            l79.setVisible(false);
            l80.setVisible(false);
            l81.setVisible(false);
            l82.setVisible(false);
            l83.setVisible(false);
            l84.setVisible(false);
            l85.setVisible(false);
            l86.setVisible(false);
            l87.setVisible(false);
            l88.setVisible(false);
            l89.setVisible(false);
            l90.setVisible(false);
            l91.setVisible(false);
            l92.setVisible(false);
            l93.setVisible(false);
            l94.setVisible(false);
            l95.setVisible(false);
            l96.setVisible(false);
            l97.setVisible(false);
            l98.setVisible(false);
            l99.setVisible(false);
            l100.setVisible(false);
            l101.setVisible(false);
            l102.setVisible(false);
            l103.setVisible(false);
            l104.setVisible(false);
            l105.setVisible(false);
            l106.setVisible(false);
            l107.setVisible(false);
            l108.setVisible(false);
            l109.setVisible(false);
            l110.setVisible(false);
            l111.setVisible(false);
            l112.setVisible(false);
            l113.setVisible(false);
            l114.setVisible(false);
            l115.setVisible(false);
            l116.setVisible(false);
            l117.setVisible(false);
            l118.setVisible(false);
            l119.setVisible(false);
            l120.setVisible(false);
            l121.setVisible(false);
            l122.setVisible(false);
            l123.setVisible(false);
            l124.setVisible(false);
            l125.setVisible(false);
        }
        
    }

    @FXML
    private void actVertices(ActionEvent event) {
        
        if(btnVerices.isSelected()){
            
            v1.setVisible(true);
            v2.setVisible(true);
            v3.setVisible(true);
            v4.setVisible(true);
            v5.setVisible(true);
            v6.setVisible(true);
            v7.setVisible(true);
            v8.setVisible(true);
            v9.setVisible(true);
            v10.setVisible(true);
            v11.setVisible(true);
            v12.setVisible(true);
            v13.setVisible(true);
            v14.setVisible(true);
            v15.setVisible(true);
            v16.setVisible(true);
            v17.setVisible(true);
            v18.setVisible(true);
            v19.setVisible(true);
            v20.setVisible(true);
            v21.setVisible(true);
            v22.setVisible(true);
            v23.setVisible(true);
            v24.setVisible(true);
            v25.setVisible(true);
            v26.setVisible(true);
            v27.setVisible(true);
            v28.setVisible(true);
            v29.setVisible(true);
            v30.setVisible(true);
            v31.setVisible(true);
            v32.setVisible(true);
            v33.setVisible(true);
            v34.setVisible(true);
            v35.setVisible(true);
            v36.setVisible(true);
            v37.setVisible(true);
            v38.setVisible(true);
            v39.setVisible(true);
            v40.setVisible(true);
            v41.setVisible(true);
            v42.setVisible(true);
            v43.setVisible(true);
            v44.setVisible(true);
            v45.setVisible(true);
            v46.setVisible(true);
            v47.setVisible(true);
            v48.setVisible(true);
            v49.setVisible(true);
            v50.setVisible(true);
            v51.setVisible(true);
            v52.setVisible(true);
            v53.setVisible(true);
            v54.setVisible(true);
            v55.setVisible(true);
            v56.setVisible(true);
            v57.setVisible(true);
            v58.setVisible(true);
            v59.setVisible(true);
            v60.setVisible(true);
            v61.setVisible(true);
            v62.setVisible(true);
            v63.setVisible(true);
            v64.setVisible(true);
            v65.setVisible(true);
            v66.setVisible(true);
            v67.setVisible(true);
            v68.setVisible(true);
            v69.setVisible(true);
            v70.setVisible(true);
            v71.setVisible(true);
            v72.setVisible(true);
            v73.setVisible(true);
            v74.setVisible(true);
            v75.setVisible(true);
            v76.setVisible(true);
            v77.setVisible(true);
            v78.setVisible(true);
            v79.setVisible(true);
            v80.setVisible(true);
            v81.setVisible(true);
            v82.setVisible(true);
            v83.setVisible(true); 
            v84.setVisible(true);
         
        }else{
               v1.setVisible(false);
            v2.setVisible(false);
            v3.setVisible(false);
            v4.setVisible(false);
            v5.setVisible(false);
            v6.setVisible(false);
            v7.setVisible(false);
            v8.setVisible(false);
            v9.setVisible(false);
            v10.setVisible(false);
            v11.setVisible(false);
            v12.setVisible(false);
            v13.setVisible(false);
            v14.setVisible(false);
            v15.setVisible(false);
            v16.setVisible(false);
            v17.setVisible(false);
            v18.setVisible(false);
            v19.setVisible(false);
            v20.setVisible(false);
            v21.setVisible(false);
            v22.setVisible(false);
            v23.setVisible(false);
            v24.setVisible(false);
            v25.setVisible(false);
            v26.setVisible(false);
            v27.setVisible(false);
            v28.setVisible(false);
            v29.setVisible(false);
            v30.setVisible(false);
            v31.setVisible(false);
            v32.setVisible(false);
            v33.setVisible(false);
            v34.setVisible(false);
            v35.setVisible(false);
            v36.setVisible(false);
            v37.setVisible(false);
            v38.setVisible(false);
            v39.setVisible(false);
            v40.setVisible(false);
            v41.setVisible(false);
            v42.setVisible(false);
            v43.setVisible(false);
            v44.setVisible(false);
            v45.setVisible(false);
            v46.setVisible(false);
            v47.setVisible(false);
            v48.setVisible(false);
            v49.setVisible(false);
            v50.setVisible(false);
            v51.setVisible(false);
            v52.setVisible(false);
            v53.setVisible(false);
            v54.setVisible(false);
            v55.setVisible(false);
            v56.setVisible(false);
            v57.setVisible(false);
            v58.setVisible(false);
            v59.setVisible(false);
            v60.setVisible(false);
            v61.setVisible(false);
            v62.setVisible(false);
            v63.setVisible(false);
            v64.setVisible(false);
            v65.setVisible(false);
            v66.setVisible(false);
            v67.setVisible(false);
            v68.setVisible(false);
            v69.setVisible(false);
            v70.setVisible(false);
            v71.setVisible(false);
            v72.setVisible(false);
            v73.setVisible(false);
            v74.setVisible(false);
            v75.setVisible(false);
            v76.setVisible(false);
            v77.setVisible(false);
            v78.setVisible(false);
            v79.setVisible(false);
            v80.setVisible(false);
            v81.setVisible(false);
            v82.setVisible(false);
            v83.setVisible(false); 
            v84.setVisible(false);  
             
        }

        
        
    }
    
  
    
}
