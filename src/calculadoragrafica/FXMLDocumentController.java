package calculadoragrafica;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.css.StyleableProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineBuilder;
import javafx.scene.transform.Rotate;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class FXMLDocumentController implements Initializable {

    @FXML
    public Button um;
    public Button dois;
    public Button tres;
    public Button quatro;
    public Button cinco;
    public Button seis;
    public Button sete;
    public Button oito;
    public Button nove;
    public Button zero;
    public Button ponto;
    public Button sin;
    public Button cos;
    public Button tan;
    public Button ln;
    public Button asin;
    public Button acos;
    public Button atan;
    public Button log;
    public Button asinh;
    public Button acosh;
    public Button atanh;
    public Button abs;
    public Button CE;
    public Button C;
    public Button DEL;
    public Button igual;
    public Button parentesis;
    public Button raiz;
    public Button elevado;
    public Button variavel;
    public Button dividir;
    public Button multiplicar;
    public Button somar;
    public Button subtrair;
    public TextArea input;
    public Pane pane;
    public TextField label1;
    public TextField label2;
    public TextField label3;
    public TextField label4;
    public TextField label5;
    public TextField xmin;
    public TextField xmax;
    public TextField ymin;
    public TextField ymax;
    public Button button1;
    public TabPane tabpane1;
    public Tab graficotab;


    @FXML
    private void buttonUm(ActionEvent event) {
        String valor = input.getText();
        String set = "1";
        input.setText(valor + set);
    }

    @FXML
    private void buttonDois(ActionEvent event) {
        String valor = input.getText();
        String set = "2";
        input.setText(valor + set);
    }

    @FXML
    private void buttonTres(ActionEvent event) {
        String valor = input.getText();
        String set = "3";
        input.setText(valor + set);
    }

    @FXML
    private void buttonQuatro(ActionEvent event) {
        String valor = input.getText();
        String set = "4";
        input.setText(valor + set);
    }

    @FXML
    private void buttonCinco(ActionEvent event) {
        String valor = input.getText();
        String set = "5";
        input.setText(valor + set);
    }

    @FXML
    private void buttonSeis(ActionEvent event) {
        String valor = input.getText();
        String set = "6";
        input.setText(valor + set);
    }

    @FXML
    private void buttonSete(ActionEvent event) {
        String valor = input.getText();
        String set = "7";
        input.setText(valor + set);
    }

    @FXML
    private void buttonOito(ActionEvent event) {
        String valor = input.getText();
        String set = "8";
        input.setText(valor + set);
    }

    @FXML
    private void buttonNove(ActionEvent event) {
        String valor = input.getText();
        String set = "9";
        input.setText(valor + set);
    }

    @FXML
    private void buttonPonto(ActionEvent event) {
        String valor = input.getText();
        String set = ".";
        input.setText(valor + set);
    }

    @FXML
    private void buttonZero(ActionEvent event) {
        String valor = input.getText();
        String set = "0";
        input.setText(valor + set);
    }

    @FXML
    private void buttonSomar(ActionEvent event) {
        String valor = input.getText();
        String set = "+";
        input.setText(valor + set);
    }

    @FXML
    private void buttonSubtrair(ActionEvent event) {
        String valor = input.getText();
        String set = "-";
        input.setText(valor + set);
    }

    @FXML
    private void buttonMultiplicar(ActionEvent event) {
        String valor = input.getText();
        String set = "*";
        input.setText(valor + set);
    }

    @FXML
    private void buttonDividir(ActionEvent event) {
        String valor = input.getText();
        String set = "/";
        input.setText(valor + set);
    }

    @FXML
    private void buttonSin(ActionEvent event) {
        String valor = input.getText();
        String set = " sin()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonCos(ActionEvent event) {
        String valor = input.getText();
        String set = " cos()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonTan(ActionEvent event) {
        String valor = input.getText();
        String set = " tan()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonLn(ActionEvent event) {
        String valor = input.getText();
        String set = "ln()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonC(ActionEvent event) {
        input.setText("");
    }

    @FXML
    private void buttonCe(ActionEvent event) {
        String valor = input.getText();
        String set = "π";
        input.setText(valor + set);
    }

    private String getConta(String conta){
        String[] linev = conta.toLowerCase().split(" = ");
        String line = "";
        
        if(linev.length > 1){
            linev = linev[linev.length-1].split("\n");
            line = linev[linev.length-1];
        }
        else{
            line = conta.toLowerCase();
        }
        

        if(line.indexOf("asin") >=0 ){
            line = line.replace("asin", "Math.asin");
        }
        else if(line.indexOf("sin") >=0 ){
            line = line.replace("sin", "Math.sin");
        }
        if(line.indexOf("acos") >=0 ){
            line = line.replace("acos", "Math.acos");
        }
        else if(line.indexOf("cos") >=0 ){
            line = line.replace("cos", "Math.cos");
        }
        if(line.indexOf("atan") >=0 ){
            line = line.replace("atan", "Math.atan");
        }
        else if(line.indexOf("tan") >=0 ){
            line = line.replace("tan", "Math.tan");
        }
               
        line = line. 
            replace("sqrt", "Math.sqrt").
            replace("ln", "Math.log").
            replace("exp", "Math.pow").
            replace("π", "Math.PI").
            replace("abs", "Math.abs").
            replace("log", "Math.log");
        
        return line;
    }
    
    @FXML
    private void buttonIgual(ActionEvent event) throws ScriptException {
        tabpane1.getSelectionModel().select(0);

        String conta = input.getText();
       
        String line = getConta(conta);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(line);
        String resultado = String.valueOf(result);
        input.appendText("\n = " + resultado + "\n\n");
    }

    @FXML
    private void buttonAsin(ActionEvent event) {
        String valor = input.getText();
        String set = "asin()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonAcos(ActionEvent event) {
        String valor = input.getText();
        String set = "acos()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonAtan(ActionEvent event) {
        String valor = input.getText();
        String set = "atan()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonLog(ActionEvent event) {
        String valor = input.getText();
        String set = "log()";
        input.setText(valor + set);
        
    }

    @FXML
    private void buttonAsinh(ActionEvent event) {
    }

    @FXML
    private void buttonAcosh(ActionEvent event) {
    }

    @FXML
    private void buttonAtanh(ActionEvent event) {
    }

    @FXML
    private void buttonAbs(ActionEvent event) {
        String valor = input.getText();
        String set = "abs()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonRaiz(ActionEvent event) {
        String valor = input.getText();
        String set = "sqrt()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonParentesis(ActionEvent event) {
        String valor = input.getText();
        String set = "()";
        input.setText(valor + set);
    }

    @FXML
    private void buttonVariavel(ActionEvent event) {
        String valor = input.getText();
        String set = "x";
        input.setText(valor + set);
    }

    
    @FXML
    private void buttonElevado(ActionEvent event) {
        String valor = input.getText();
        String set = "exp(,)";
        input.setText(valor + set);
    }
    
    @FXML
    private void buttonDEL(ActionEvent event) {
        String str = input.getText();
        input.setText(str.substring(0, str.length() - 1));
    }

    
    private void drawConta(String conta, Color color){
        double dx= pane.getWidth();
        double dy= pane.getHeight();
        
        
        String line = getConta(conta);
        String lineaux = "";
        double lastresult = Integer.parseInt(xmin.getText());

        if(line.indexOf("x") >=0){
            for(double x =0; x<dx; x++){
                lineaux = line;
                if(lineaux.indexOf("x") >=0 ){
                   lineaux = lineaux.replace("x", Double.toString(x));
                }
                
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                Object result;
                try {
                    result = engine.eval(lineaux);
                    String resultado = String.valueOf(result);
                    Line grahLine = new Line(parseDouble(resultado), x, lastresult, x-1);

                    grahLine.setStroke(color);
                    lastresult = parseDouble(resultado);
                    pane.getChildren().add(grahLine);
                } catch (ScriptException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }else{
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result;
            try {
                result = engine.eval(line);
                String resultado = String.valueOf(result);

                Line redLine = new Line( parseDouble(resultado), parseDouble(resultado), parseDouble(resultado), parseDouble(resultado));                
                pane.getChildren().add(redLine);
                
            } catch (ScriptException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @FXML
    private void button1(ActionEvent event) {
        String str1 = label1.getText();
        String str2 = label2.getText();
        String str3 = label3.getText();
        String str4 = label4.getText();
        String str5 = label5.getText();

        String conta1 = str1.toLowerCase();
        String conta2 = str2.toLowerCase();
        String conta3 = str3.toLowerCase();
        String conta4 = str4.toLowerCase();
        String conta5 = str5.toLowerCase();
        
        double TranslateX= pane.getWidth();
        double TranslateY= pane.getHeight();
       
        tabpane1.getSelectionModel().select(1);
        pane.getChildren().removeAll(pane.getChildren());

        pane.setScaleY(200/(Math.abs(Double.parseDouble(xmax.getText())) + Math.abs(Double.parseDouble(xmin.getText()))));
        pane.setScaleX(200/(Math.abs(Double.parseDouble(ymax.getText())) + Math.abs(Double.parseDouble(ymin.getText()))));
        pane.setTranslateY((Integer.parseInt(xmax.getText()) + Integer.parseInt(xmin.getText()))/2);
        pane.setTranslateX((Integer.parseInt(ymax.getText()) + Integer.parseInt(ymin.getText()))/2);
        
        Line xLine = new Line(370, 110, 0, 110);
        pane.getChildren().add(xLine);
        
        Line yline = new Line(185, 220, 185, 0);
        pane.getChildren().add(yline);
        
        
        if(conta1 != null && conta1.length() > 0){
            drawConta(conta1, Color.RED);
        }
        if(conta2 != null && conta2.length() > 0){
            drawConta(conta2, Color.ORANGE);
        }
        if(conta3 != null && conta3.length() > 0){
            drawConta(conta3, Color.GREEN);
        }
        if(conta4 != null && conta4.length() > 0){
            drawConta(conta4, Color.BLUE);
        }
        if(conta5 != null && conta5.length() > 0){
            drawConta(conta5, Color.PINK);
        }
        

    }
    

    @Override
    public void initialize(URL url,ResourceBundle rb) {

        Line xLine = new Line(370, 110, 0, 110);
        pane.getChildren().add(xLine);
        
        Line yline = new Line(185, 220, 185, 0);
        pane.getChildren().add(yline);
        
 
    }

}
