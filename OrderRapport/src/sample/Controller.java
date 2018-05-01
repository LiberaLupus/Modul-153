package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.BufferedInputStream;


public class Controller {

    @FXML
    Button btnPrint;

    @FXML
    ImageView IVBild;

    @FXML
    protected void btnPrintOA(ActionEvent event) {
        InsertImageTest DBHelper = new InsertImageTest();
        BufferedInputStream Bild = DBHelper.readeImage("select * from bildtest where id = 1", "Bild");
        Image img = new Image(Bild);
        IVBild.setImage(img);
    }
}
