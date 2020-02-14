package nori.soft;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.util.Random;

public class FormController {

    @FXML // fx:id="circleButton"
    private Button circleButton; // Value injected by FXMLLoader

    @FXML // fx:id="tryAngleButton"
    private Button tryAngleButton; // Value injected by FXMLLoader

    @FXML // fx:id="waveButton"
    private Button waveButton; // Value injected by FXMLLoader

    @FXML // fx:id="squareButton"
    private Button squareButton; // Value injected by FXMLLoader

    @FXML // fx:id="starButton"
    private Button starButton; // Value injected by FXMLLoader

    @FXML // fx:id="resultText"
    private Text resultText; // Value injected by FXMLLoader

    private int buttonID;

    @FXML
    private void onclickCircleButton() {
        this.buttonID=0;
        this.judge();
    }

    @FXML
    private void onclickSquareButton() {
        this.buttonID=1;
        this.judge();
    }

    @FXML
    private void onclickStarButton() {
        this.buttonID=2;
        this.judge();
    }

    @FXML
    private void onclickTryAngleButton() {
        this.buttonID=3;
        this.judge();
    }

    @FXML
    private void onclickWaveButton() {
        this.buttonID=4;
        this.judge();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    private void initialize() {
        assert circleButton != null : "fx:id=\"circleButton\" was not injected: check your FXML file 'Form.fxml'.";
        assert tryAngleButton != null : "fx:id=\"tryAngleButton\" was not injected: check your FXML file 'Form.fxml'.";
        assert waveButton != null : "fx:id=\"waveButton\" was not injected: check your FXML file 'Form.fxml'.";
        assert squareButton != null : "fx:id=\"squareButton\" was not injected: check your FXML file 'Form.fxml'.";
        assert starButton != null : "fx:id=\"starButton\" was not injected: check your FXML file 'Form.fxml'.";
        assert resultText != null : "fx:id=\"resultText\" was not injected: check your FXML file 'Form.fxml'.";

    }

    private int answer;
    private void shuffle(){
        this.answer=new Random().nextInt(5);
    }
    private void judge(){

        //あたり
        if(this.buttonID==this.answer){
            this.resultText.setText("あたりです。お見事!");
        }else{
            this.resultText.setText("ハズレです...残念");
        }
        this.shuffle();
    }
}
