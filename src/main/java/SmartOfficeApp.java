import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class SmartOfficeApp extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent parent = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/resources/GUI/SmartOfficeForm.fxml")));
        Scene scene = new Scene(parent, 800, 600);
        stage.setTitle("Smart Office");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
