package sample;

import java.awt.event.ActionEvent;
import java.io.File;

public class Controller {
    TextUtils text = new TextUtils();
    public void openfile(ActionEvent event) {
    File f = text.openFile();
    }
}
