package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class formAc{
    private Stage stage;

	public formAc(String kapıyıac){
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(kapıyıac));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
	}
	
	
    public void formKapat() {
        stage.close();

    }
}
