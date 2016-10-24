package sample;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class TextUtils {
    Stage stage = new Stage();


    public File openFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escoge una archivo de texto");
        fileChooser.showOpenDialog(stage);
    return null;
    }
}
