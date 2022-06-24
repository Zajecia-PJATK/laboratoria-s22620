package studia.aplikacja.ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import studia.aplikacja.ui.utils.FXMLUtils;
import studia.aplikacja.ui.utils.Utils;

import java.net.URL;
import java.util.ResourceBundle;

public class InnerCellView extends StackPane implements Initializable {

    @FXML
    public Label number_Label;

    public InnerCellView() {
        FXMLUtils.loadFXML(this);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.layoutBoundsProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.getHeight() == 0 || newValue.getWidth() == 0) return;
            Utils.resizeText(newValue.getHeight(), newValue.getWidth(), number_Label);
        });

        number_Label.textProperty().addListener((observable, oldValue, newValue) -> Utils.resizeText(InnerCellView.this.getHeight(), InnerCellView.this.getWidth(), number_Label));
    }

}
