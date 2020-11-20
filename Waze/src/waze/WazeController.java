/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

import com.sun.prism.paint.LinearGradient;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import waze.algoritmos.Dijkstra;
import waze.algoritmos.Floyd;
import waze.util.AppContext;
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

    private int contCaminos;
    private List<Circle> circles = new ArrayList();
    private List<Circle> vertices = new ArrayList();
    private List<Line> lines = new ArrayList();
    private List<Line> ruta = new ArrayList();
    private List<Integer> camino = new ArrayList();
    @FXML
    private Label lblPunto;
    @FXML
    private Button btnCancelar;
    
    private String modo = "";
    private Matriz matriz = new Matriz();
    @FXML
    private Button btnComenzar;
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Circle v, v8, v9, v33, v34, v10, v46, v48, v45, v35, v36, v32, v43, v11, v37, v39, v38, 
            v49, v7, v42, v54, v50, v65, v64, v6, v66, v30, v5, v4, v3, v29, v28, v2, v1, v12,
            v31, v41, v27, v26, v44, v47, v63, v72, v57, v55, v25, v60, v58, v59, v24, v61, v84,
            v62, v73, v74, v53, v83, v51, v40, v13, v14, v69, v52, v68, v67, v71, v76, v75, v23,
            v82, v21, v22, v20, v81, v80, v70, v77, v19, v79, v78, v18, v15, v16, v17, v56, v85, 
            v86, v87, v88, v89, v90;
    
    private boolean tipoRecorrido; //TRUE DIJKSTRA FALSE FLOYD
    
    private PathTransition p = new PathTransition();
    private boolean enMovimiento = false;
    Image iA = new Image(getClass().getResourceAsStream("/imagenes/A.png"));
    Image iB = new Image(getClass().getResourceAsStream("/imagenes/B.png"));
    Image image = new Image(getClass().getResourceAsStream("/imagenes/carrito.png"));
    ImageView iv = new ImageView(image);
    @FXML
    private Button carros;
    @FXML
    private Label labelCostoInicial;
    @FXML
    private Label labelDistanciaInicial;
    @FXML
    private Label labelCostoFinal;
    @FXML
    private Label labelDistanciaFinal;
    private Alert alert;
    private final int noCamino = 9999999;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnCerrarCalle.setDisable(true);
        btnChoque.setDisable(true);
        btnTrafico.setDisable(true);
        
        addVertices();
        dibujarLineas();
        
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
        setVerticesVisible();
        
        lblPunto.setVisible(false);
        btnCancelar.setVisible(false);
        
        btnComenzar.setDisable(true);
        
        
        p.setOnFinished(new EventHandler<ActionEvent>() {
            
            public void handle(final ActionEvent actionEvent) {
                try {
                    contCaminos++;
                    mover();
                    if(enMovimiento){
                        btnComenzar.setDisable(true);
                        btnCancelar.setVisible(false);
                    }else{
                       btnComenzar.setDisable(false);
                       btnComenzar.setText("Nuevo Viaje");
                    }
                } catch (NumberFormatException ex) {
                    Logger.getLogger(WazeController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WazeController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }    
    
    
    public void carroUsar(){
        String carro = (String) AppContext.getInstance().get("Carro");  
        if(carro!=null){
            Image image = new Image("/imagenes/"+carro+".png");
            iv = new ImageView(image);
            System.out.println(carro);
        }else{
            System.out.println("NADA");
        }
    }

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
            c.setFill(Color.YELLOW);
            lblPunto.setText("Seleccione el punto de llegada");
            return;
        }
        if(modo.equals("puntoInicio")){
            modo = "puntoLlegada";
            vertices.add(c);
            c.setFill(Color.YELLOW);
            lblPunto.setText("");
            if(tipoRecorrido){
                dibujarRutaDijkstra(Integer.valueOf(vertices.get(0).getId()), Integer.valueOf(vertices.get(1).getId()), true);
                calcularCostoViajeInicial(Integer.valueOf(vertices.get(0).getId()), Integer.valueOf(vertices.get(1).getId()));    
            }else{
                dibujarRutaFloyd(Integer.valueOf(vertices.get(0).getId()), Integer.valueOf(vertices.get(1).getId()), true);
                calcularCostoViajeInicial(Integer.valueOf(vertices.get(0).getId()), Integer.valueOf(vertices.get(1).getId()));    
            }
        }
        if(modo.equals("puntoLlegada")){
            btnComenzar.setDisable(false);
        }
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
        lines.forEach(x->{
            x.setVisible(btnlineas.isSelected());
            
        });
    }
    
    private void setVerticesVisible(){
        circles.forEach(x->{
            x.setVisible(btnVertices.isSelected());
        });
    }
    
    Matriz m = new Matriz();
    Dijkstra d = new Dijkstra();
    Floyd f = new Floyd();
    @FXML
    private void actChoque(ActionEvent event) {
        if(c1 != null && c2 != null){
            String[] botones = {"A -> B", "B -> A"};
            int direccion = JOptionPane.showOptionDialog(null, 
                    "Seleccione una direccion:", 
                    "Direccion", 	
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, 
                    botones, botones[0]);	
            if(direccion == 0) {
                matriz.setPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()), noCamino);
                System.out.println("Opcion A->B");
            } 	
            else if(direccion == 1) {
                matriz.setPeso(Integer.valueOf(c2.getId()), Integer.valueOf(c1.getId()), noCamino);
                System.out.println("Boton B->A");
            }
           	
        	
   

            
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Se ha cerrado la calle");
        }
    }
    
    int tipoTrafico;
    @FXML
    private void actTrafico(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("TipoTrafico.fxml"));
            stage.setScene(new Scene(root1));
            stage.setTitle("Seleccion de tráfico");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException ex){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Lo sentimos, en este momento las calles colapsaron");
            alert.show();
        }
    }

    private void cargarPesoTrafico(){
        if(AppContext.getInstance().get("tipoTrafico") != null){
            tipoTrafico = (Integer) AppContext.getInstance().get("tipoTrafico");
            if(c1 != null && c2 != null){//linea seleccionada
                int pesoViejo = matriz.getPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()));
                System.out.println("Peso viejo "+pesoViejo);
                if(tipoTrafico == 1){//consultar trafico normal
                    int aux = consultarTipoTrafico(pesoViejo);
                    matriz.setPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()), (aux));
                }else{
                    matriz.setPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()), (pesoViejo*tipoTrafico)); 
                }
                //verificar
                int x = matriz.getPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()));
                System.out.println("nuevo peso "+x); 
            }    
        }
    } 
    private int consultarTipoTrafico(int peso){
        int aux=0;
        if(tipoTrafico%2==0){//normal
            aux = peso/2;
        }else{
            aux = peso/3;
        }
        return aux;
    }
    
    @FXML
    private void actCerrarCalle(ActionEvent event) {
        if(c1 != null && c2 != null){
            matriz.setPeso(Integer.valueOf(c1.getId()), Integer.valueOf(c2.getId()), noCamino);
            matriz.setPeso(Integer.valueOf(c2.getId()), Integer.valueOf(c1.getId()), noCamino);
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Se ha cerrado la calle");
        }
    }
    
    @FXML
    private void actDijkstra(ActionEvent event){
        tipoRecorrido = true;
        cbxFloyd.setSelected(false);
        vertices.clear();
        circles.forEach(x->{x.setFill(Color.WHITE);});
        lines.forEach(x->{x.setStroke(Color.DARKCYAN);});
        seleccionarRuta();
    }
    
    @FXML
    private void actFloyd(ActionEvent event){
        tipoRecorrido = false;
        cbxDijkstra.setSelected(false);
        vertices.clear();
        circles.forEach(x->{x.setFill(Color.WHITE);});
        lines.forEach(x->{x.setStroke(Color.DARKCYAN);});
        seleccionarRuta();
    }
    
    private int cont = 0;
    private void addVertices(){

        circles.add(v); circles.add(v1); circles.add(v2); circles.add(v3); circles.add(v4); circles.add(v5); circles.add(v6);
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
        
        
        circles.forEach(x-> {
            x.setId(String.valueOf(cont));
            cont++;
        });
    }

    @FXML
    private void actCancelar(ActionEvent event) {
        labelCostoInicial.setText("");
        labelDistanciaInicial.setText("");
        labelCostoFinal.setText("");
        labelDistanciaFinal.setText("");
        
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
                btnComenzar.setDisable(true);
            }
        }
        
        ruta.forEach(x->{
            x.setStroke(Color.DARKCYAN);
        });
        circles.forEach(x->{
            if(!vertices.isEmpty()){
                if(x != vertices.get(0)){
                    x.setFill(Color.WHITE);
                }
            }
        });
        
    }
    
    private void seleccionarRuta(){
        lblPunto.setVisible(true);
        lblPunto.setText("Seleccione el punto de partida");
        btnCancelar.setVisible(true);
        modo = "seleccionarRuta";
    }
    
    private void dibujarLineas(){
        int[][] m = matriz.getMatriz();
        double startX, startY, endX, endY;
        int noCamino = matriz.getNoCamino();
        int cont = 0;
        for(int i=0; i<91; i++){
            for(int j=0; j<91; j++){
                if(m[i][j] != noCamino){
                    cont++;
                    startX = circles.get(i).getLayoutX();
                    startY = circles.get(i).getLayoutY();
                    endX = circles.get(j).getLayoutX();
                    endY = circles.get(j).getLayoutY();
                    
                    dibujarLinea(startX, startY, endX, endY, Color.DARKCYAN);
                }
            }
        }
        circles.forEach(x-> {
            x.toFront();
        });
    }
    
    Circle c1,c2;
    private void dibujarLinea(double startX, double startY, double endX, double endY, Color c){
        Line l = new Line();
        l.setId(String.valueOf(cont));
        l.setStartX(startX);
        l.setStartY(startY);
        l.setEndX(endX);
        l.setEndY(endY);
        l.setStrokeWidth(10);
        l.setStroke(c);
        l.setStrokeLineCap(StrokeLineCap.ROUND);
        anchorPane.getChildren().add(l);
        lines.add(l);
        ruta.add(l);
        
        l.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            double posA1, posA2, posB1, posB2;
            public void handle(final MouseEvent mouseEvent) {
                if(!l.getStroke().equals(Color.RED)){
                    l.setStroke(Color.RED);
                    posA1 = l.getStartX(); posA2 = l.getStartY();
                    posB1 = l.getEndX();   posB2 = l.getEndY();

                    circles.forEach(x->{
                        if(posA1 == x.getLayoutX() && posA2 == x.getLayoutY()){
                            c1=x;
                        }
                        if(posB1 == x.getLayoutX() && posB2 == x.getLayoutY()){
                            c2=x;
                        }
                    });
                    btnCerrarCalle.setDisable(false);
                    btnChoque.setDisable(false);
                    btnTrafico.setDisable(false);
                }else{//desmarcar linea
                    l.setStroke(Color.DARKCYAN);
                    posA1=0; posA2=0; posB1=0; posB2=0;
                }
               
                ImageView A = new ImageView(iA);
                ImageView B = new ImageView(iB);
                A.setLayoutX(c1.getLayoutX()); A.setLayoutY(c1.getLayoutY()-20);
                B.setLayoutX(c2.getLayoutX()); B.setLayoutY(c2.getLayoutY()-20); 
                anchorPane.getChildren().add(A);anchorPane.getChildren().add(B);
                }
            });
    }

    private void dibujarRutaDijkstra(int a, int b, boolean band){
        int[][] m = matriz.getMatriz();
        Dijkstra d = new Dijkstra();
        d.dijkstra(m, a, b);
        if(band){
            camino = d.getRoad();
        }
        int cont = 0;
        
        for(int i=0; i<camino.size(); i++){
            Circle c = circles.get(camino.get(i));
            c.setFill(Color.YELLOW);
            Circle c2 = new Circle();
            
            if(i+1 < camino.size()){
                c2 = circles.get(camino.get(i+1));
                dibujarLinea(c.getLayoutX(), c.getLayoutY(), c2.getLayoutX(), c2.getLayoutY(), Color.YELLOW);
            }
        }
        circles.forEach(x->{
            x.toFront();
        });
        
    }
    private void dibujarRutaFloyd(int a, int b, boolean band){
        Floyd f = new Floyd();
        f.floyd(a, b);
        if(band){
            camino = f.getRoad();
        }
        
        int cont = 0;
        
        for(int i=0; i<camino.size(); i++){
            Circle c = circles.get(camino.get(i));
            c.setFill(Color.YELLOW);
            Circle c2 = new Circle();
            
            if(i+1 < camino.size()){
                c2 = circles.get(camino.get(i+1));
                dibujarLinea(c.getLayoutX(), c.getLayoutY(), c2.getLayoutX(), c2.getLayoutY(), Color.YELLOW);
            }
        }
        circles.forEach(x->{
            x.toFront();
        });
    }
    @FXML
    private void actComenzar(ActionEvent event) throws InterruptedException {
        if(btnComenzar.getText().equals("Comenzar Viaje")){
            carroUsar();
            cargarPesoTrafico();
            contCaminos = 0;
            btnComenzar.setDisable(true);
            btnCancelar.setVisible(false);
            cbxDijkstra.setDisable(true);
            cbxFloyd.setDisable(true);
            recorrido();
        }
        if(btnComenzar.getText().equals("Nuevo Viaje")){
            anchorPane.getChildren().remove(iv);
            circles.forEach(x->x.setFill(Color.WHITE));
            lines.forEach(x->x.setStroke(Color.DARKCYAN));
            btnComenzar.setText("Comenzar Viaje");
            cbxDijkstra.setDisable(false);
            cbxFloyd.setDisable(false);
            labelCostoFinal.setText("");
            labelCostoInicial.setText("");
            labelDistanciaFinal.setText("");
            labelDistanciaInicial.setText("");
           
            vertices.clear();
            matriz.inicializar();
            seleccionarRuta();
        }
        btnCerrarCalle.setDisable(true);
        btnChoque.setDisable(true);
        btnTrafico.setDisable(true);
    }
    
    private void recorrido() throws InterruptedException{
        
        
        iv.setFitHeight(40);
        iv.setFitWidth(40);
        
        Circle a = circles.get(camino.get(0));
        iv.setX(a.getLayoutX()-20);
        iv.setY(a.getLayoutY()-20);
        anchorPane.getChildren().add(iv);
        
        
        movimiento();
            
        
    }
   
    private void movimiento() throws InterruptedException {
        Thread thread = new Thread(mover());
        thread.start();
    }
    
    private String mover() throws NumberFormatException, InterruptedException {
        Circle a;
        Circle b;
        int duracion;
        Line line;
        
        if(contCaminos+1 < camino.size()){
            enMovimiento = true;
            a = circles.get(camino.get(contCaminos));
            b = circles.get(camino.get(contCaminos+1)); 
            
            duracion = matriz.getPeso(Integer.valueOf(a.getId()), Integer.valueOf(b.getId()));
            line = new Line(a.getLayoutX(), a.getLayoutY(), b.getLayoutX(), b.getLayoutY());

            p.setNode(iv);
            p.setDuration(Duration.seconds(duracion));
            p.setPath(line); 
            p.play();
            if(tipoRecorrido){
                dibujarRutaDijkstra(Integer.valueOf(a.getId()), Integer.valueOf(vertices.get(1).getId()), false);
            }else{
                dibujarRutaFloyd(Integer.valueOf(a.getId()), Integer.valueOf(vertices.get(1).getId()), false);
            }
            iv.toFront();
        }else{
            enMovimiento = false;
        } 
        return "";
    }

    
    
    public void calcularCostoViajeInicial(int a, int b){
        List<Integer> camino;
        float costoInicialViaje=0, kmInicialViaje=0, aux=0;
        
        Matriz matriz = new Matriz();
        int[][] m = matriz.getMatriz();
        
        if(cbxDijkstra.isSelected()){//peso * $100
            Dijkstra d = new Dijkstra();
            d.dijkstra(m, a, b);
            camino = d.getRoad();
        }else{//is cbxFloyd
            Floyd f = new Floyd();
            f.floyd(a, b);
            camino = f.getRoad();  
        }
        
        for(int i=0; i<camino.size(); i++){
            if((i+1)<camino.size()){
               aux += matriz.getPeso(camino.get(i), camino.get(i+1));

               System.out.println("costo: "+aux);  
            }
        }
        costoInicialViaje = aux*250;
        kmInicialViaje = aux/4;
        System.out.println("costo Final  ¢ "+costoInicialViaje);
        System.out.println("Km Final    km "+kmInicialViaje);
        labelCostoInicial.setText("¢ "+costoInicialViaje);
        labelDistanciaInicial.setText("km "+kmInicialViaje);
        //FALTA 
        labelCostoFinal.setText("¢ "+costoInicialViaje);
        labelDistanciaFinal.setText("km "+kmInicialViaje);
    } 
    
    void calcularCostoViajeFinal(int a, int b){
        float costoFinalViaje=0,kmFinalViaje=0, aux=0;
        Matriz matriz = new Matriz();
        int[][] m = matriz.getMatriz();
        
        if(cbxDijkstra.isSelected()){//peso * $100
            Dijkstra d = new Dijkstra();
            d.dijkstra(m, a, b);
            camino = d.getRoad();
        }else{//is cbxFloyd
            Floyd f = new Floyd();
            f.floyd(a, b);
            camino = f.getRoad();  
        }
        
        for(int i=0; i<camino.size(); i++){
            if((i+1)<camino.size()){
               aux += matriz.getPeso(camino.get(i), camino.get(i+1));
               System.out.println("costoNuevo: "+aux);  
            }
        }
        costoFinalViaje = aux*250;
        kmFinalViaje = aux/4;

        labelCostoFinal.setText("¢ "+costoFinalViaje);
        labelDistanciaFinal.setText("km "+kmFinalViaje);
    }
     
    @FXML
    private void selCarros(ActionEvent event) {
        try{
            Stage stage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("Carros.fxml"));
            stage.setScene(new Scene(root1));
            stage.setTitle("Seleccion de auto");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();
        }catch(IOException ex){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Lo sentimos, en este momento los carritos estan ocupados");
            alert.show();
        }
    }

}
   
