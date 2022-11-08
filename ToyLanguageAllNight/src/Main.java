import Controller.Controller;
import Repository.Repository;
import View.View;

public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();
        Controller controller = new Controller(repo);
        View view = new View(controller);
        view.run();
    }
}