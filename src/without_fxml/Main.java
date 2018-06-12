package without_fxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Model model = new Model();
        View view = new View(model);
        primaryStage.setTitle("CHAT");
        primaryStage.setScene(new Scene(view.getParent(), 400, 375));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
