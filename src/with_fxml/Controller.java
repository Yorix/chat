package with_fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea txtHistory;
    @FXML
    private TextField txtSend;
    @FXML
    private Button btnSend;

    public void send(ActionEvent actionEvent) {
        txtHistory.setText(txtHistory.getText() + txtSend.getText() + "\n"); //todo заменить на связь с моделью
        txtSend.clear();
    }
}
