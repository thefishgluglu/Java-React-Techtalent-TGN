import app.controller.ClienteController;
import app.model.ClienteDAO;
import app.view.ClienteView;

public class Main {
    public static void main(String[] args) {
        ClienteView vista = new ClienteView();
        ClienteDAO dao = new ClienteDAO();
        new ClienteController(vista, dao);
    }
}
