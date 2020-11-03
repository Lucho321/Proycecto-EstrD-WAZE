/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private Line line91;
    @FXML
    private Line line92;
    @FXML
    private Line line93;
    @FXML
    private Line line94;
    @FXML
    private Line line95;
    @FXML
    private Line line96;
    @FXML
    private Line line97;
    @FXML
    private Line line98;
    @FXML
    private Line line99;
    @FXML
    private Line line100;
    @FXML
    private Line line101;
    @FXML
    private Line line102;
    @FXML
    private Line line103;
    @FXML
    private Line line104;
    @FXML
    private Line line105;
    @FXML
    private Line line106;
    @FXML
    private Line line110;
    @FXML
    private Line line111;
    @FXML
    private Line line113;
    @FXML
    private Line line114;
    @FXML
    private Line line115;
    @FXML
    private Line line116;
    @FXML
    private Line line117;
    @FXML
    private Line line118;
    @FXML
    private Line line119;
    @FXML
    private Line line120;
    @FXML
    private Line line121;
    @FXML
    private Line line122;
    @FXML
    private Line line123;
    @FXML
    private Line line124;
    @FXML
    private Line line125;
    @FXML
    private Line line127;
    @FXML
    private Line line128;
    @FXML
    private Line line129;
    @FXML
    private Line line130;
    @FXML
    private Line line131;
    @FXML
    private Line line132;
    @FXML
    private Line line133;
    @FXML
    private Line line134;
    @FXML
    private Line line135;
    @FXML
    private Line line136;
    @FXML
    private Line line137;
    @FXML
    private Line line138;
    @FXML
    private Line line139;
    @FXML
    private Line line140;
    @FXML
    private Line line70;
    @FXML
    private Line line71;
    @FXML
    private Line line72;
    @FXML
    private Line line73;
    @FXML
    private Line line74;
    @FXML
    private Line line75;
    @FXML
    private Line line76;
    @FXML
    private Line line77;
    @FXML
    private Line line78;
    @FXML
    private Line line79;
    @FXML
    private Line line80;
    @FXML
    private Line line81;
    @FXML
    private Line line82;
    @FXML
    private Line line83;
    @FXML
    private Line line84;
    @FXML
    private Line line85;
    @FXML
    private Line line86;
    @FXML
    private Line line87;
    @FXML
    private Line line88;
    @FXML
    private Line line89;
    @FXML
    private Line line90;
    @FXML
    private Line line54;
    @FXML
    private Line line55;
    @FXML
    private Line line56;
    @FXML
    private Line line57;
    @FXML
    private Line line58;
    @FXML
    private Line line59;
    @FXML
    private Line line60;
    @FXML
    private Line line61;
    @FXML
    private Line line63;
    @FXML
    private Line line64;
    @FXML
    private Line line65;
    @FXML
    private Line line66;
    @FXML
    private Line line22;
    @FXML
    private Line line23;
    @FXML
    private Line line24;
    @FXML
    private Line line25;
    @FXML
    private Line line26;
    @FXML
    private Line line27;
    @FXML
    private Line line28;
    @FXML
    private Line line29;
    @FXML
    private Line line30;
    @FXML
    private Line line31;
    @FXML
    private Line line32;
    @FXML
    private Line line33;
    @FXML
    private Line line34;
    @FXML
    private Line line35;
    @FXML
    private Line line36;
    @FXML
    private Line line37;
    @FXML
    private Line line38;
    @FXML
    private Line line39;
    @FXML
    private Line line40;
    @FXML
    private Line line41;
    @FXML
    private Line line42;
    @FXML
    private Line line43;
    @FXML
    private Line line44;
    @FXML
    private Line line45;
    @FXML
    private Line line46;
    @FXML
    private Line line47;
    @FXML
    private Line line48;
    @FXML
    private Line line49;
    @FXML
    private Line line50;
    @FXML
    private Line line51;
    @FXML
    private Line line52;
    @FXML
    private Line line53;
    @FXML
    private Line line;
    @FXML
    private Line line1;
    @FXML
    private Line line16;
    @FXML
    private Line line3;
    @FXML
    private Line line4;
    @FXML
    private Line line5;
    @FXML
    private Line line6;
    @FXML
    private Line line7;
    @FXML
    private Line line8;
    @FXML
    private Line line9;
    @FXML
    private Line line10;
    @FXML
    private Line line11;
    @FXML
    private Line line12;
    @FXML
    private Line line13;
    @FXML
    private Line line14;
    @FXML
    private Line line15;
    @FXML
    private Line line17;
    @FXML
    private Line line18;
    @FXML
    private Line line19;
    @FXML
    private Line line20;
    @FXML
    private Line line21;
    @FXML
    private Line line112;
    @FXML
    private Line line2;
    @FXML
    private Line line141;
    @FXML
    private Circle point;
    @FXML
    private Circle point1;
    @FXML
    private Circle point2;
    @FXML
    private Circle point3;
    @FXML
    private Circle point4;
    @FXML
    private Circle point5;
    @FXML
    private Circle point6;
    @FXML
    private Circle point7;
    @FXML
    private Circle point8;
    @FXML
    private Circle point9;
    @FXML
    private Circle point10;
    @FXML
    private Circle point11;
    @FXML
    private Circle point12;
    @FXML
    private Circle point13;
    @FXML
    private Circle point15;
    @FXML
    private Circle point16;
    @FXML
    private Circle point17;
    @FXML
    private Circle point18;
    @FXML
    private Circle point19;
    @FXML
    private Circle point20;
    @FXML
    private Circle point21;
    @FXML
    private Circle point22;
    @FXML
    private Circle point23;
    @FXML
    private Circle point24;
    @FXML
    private Circle point25;
    @FXML
    private Circle point26;
    @FXML
    private Circle point27;
    @FXML
    private Circle point28;
    @FXML
    private Circle point29;
    @FXML
    private Circle point30;
    @FXML
    private Circle point31;
    @FXML
    private Circle point32;
    @FXML
    private Circle point33;
    @FXML
    private Circle point34;
    @FXML
    private Circle point35;
    @FXML
    private Circle point36;
    @FXML
    private Circle point37;
    @FXML
    private Circle point38;
    @FXML
    private Circle point39;
    @FXML
    private Circle point40;
    @FXML
    private Circle point41;
    @FXML
    private Circle point42;
    @FXML
    private Circle point43;
    @FXML
    private Circle point44;
    @FXML
    private Circle point45;
    @FXML
    private Circle point46;
    @FXML
    private Circle point47;
    @FXML
    private Circle point48;
    @FXML
    private Circle point49;
    @FXML
    private Circle point50;
    @FXML
    private Circle point51;
    @FXML
    private Circle point52;
    @FXML
    private Circle point53;
    @FXML
    private Circle point54;
    @FXML
    private Circle point55;
    @FXML
    private Circle point56;
    @FXML
    private Circle point57;
    @FXML
    private Circle point58;
    @FXML
    private Circle point59;
    @FXML
    private Circle point60;
    @FXML
    private Circle point61;
    @FXML
    private Circle point62;
    @FXML
    private Circle point63;
    @FXML
    private Circle point64;
    @FXML
    private Circle point65;
    @FXML
    private Circle point66;
    @FXML
    private Circle point67;
    @FXML
    private Circle point68;
    @FXML
    private Circle point69;
    @FXML
    private Circle point70;
    @FXML
    private Circle point71;
    @FXML
    private Circle point74;
    @FXML
    private Circle point75;
    @FXML
    private Circle point77;
    @FXML
    private Circle point78;
    @FXML
    private Circle point79;
    @FXML
    private Circle point80;
    @FXML
    private Circle point81;
    @FXML
    private Circle point82;
    @FXML
    private Circle point83;
    @FXML
    private Circle point84;
    @FXML
    private Circle point88;
    @FXML
    private Circle point89;
    @FXML
    private Circle point90;
    @FXML
    private Circle point91;
    @FXML
    private Circle point93;
    @FXML
    private Circle point94;
    @FXML
    private Circle point95;
    @FXML
    private Circle point97;
    @FXML
    private Circle point73;
    @FXML
    private Circle point14;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickLine(MouseEvent event) {
        System.out.println("Lulu ");
        Line l = (Line)(event.getSource());
        l.setStroke(Color.RED);

    }

    @FXML
    private void clickCircle(MouseEvent event) {
        Circle c = (Circle)event.getSource();
        c.setStroke(Color.RED);
       
    }
    
  
    
}
