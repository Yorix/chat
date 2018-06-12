package without_fxml;

public class Controller {
    Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void send(String message) {
        model.setMessage(message); //todo связь с моделью
    }
}
