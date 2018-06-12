package without_fxml;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class View {
    private Model model;
    private HBox hBox;
    private VBox vBox;
    private TextArea txtHistory;
    private TextField txtSend;
    private Button btnSend;

    private Controller controller;

    public View(Model model) {
        this.model = model;
        controller = new Controller(model);

        createPane();
    }

    private void createPane() {
        txtHistory = new TextArea();
        txtSend = new TextField();
        btnSend = new Button("Send");

        hBox = new HBox(txtSend, btnSend);
        vBox = new VBox(txtHistory, hBox);

        VBox.setVgrow(txtHistory, Priority.ALWAYS);
        HBox.setHgrow(txtSend, Priority.ALWAYS);
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);
        hBox.setSpacing(10);

        vBox.setStyle("-fx-background-color: #ca8;");

        txtHistory.setEditable(false);
        btnSend.setDefaultButton(true);
    }

    Parent getParent() {
        return vBox;
    }
}
