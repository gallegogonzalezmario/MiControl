package es.ieslosmontecillos.micontrol;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class TestMiControlController {

    @FXML
    private MiControl mggControl;
    @FXML
    private Label textoLbl;

    @FXML
    public void accionControl(MouseEvent actionEvent) {
        textoLbl.setText("Has pulsado la zona del recuadro rojo");
    }
}