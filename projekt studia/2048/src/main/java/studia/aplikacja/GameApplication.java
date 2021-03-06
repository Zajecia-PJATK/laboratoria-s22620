package studia.aplikacja;

import studia.aplikacja.ui.GameView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class GameApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setWidth(900);
        primaryStage.setHeight(800);
        primaryStage.setScene(new Scene(new GameView()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
