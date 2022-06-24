package studia.aplikacja.ui.utils;

import javafx.fxml.FXMLLoader;
import studia.aplikacja.Main;

import java.io.IOException;

@SuppressWarnings("unused")
public class FXMLUtils {

    public static <R> void loadFXML(R view){
        loadFXML("fxml/"+view.getClass().getSimpleName() + ".fxml", view);
    }

    public static <R> void loadFXML(String path, R view){
        try {
            new FXMLLoader(Main.class.getResource(path)){{
                setController(view);
                setRoot(view);
            }}.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}