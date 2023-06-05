package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class hosgel {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button arama;

    @FXML
    private ImageView backround;

    @FXML
    private Button ekleme;
    @FXML
    private AnchorPane pane;

    @FXML
    void arama_event(ActionEvent event) {
    	new formAc("Sample3.fxml");
    	    //	Sample3.fxml
    	    			    Stage stage = (Stage) pane.getScene().getWindow();
    	    			    stage.close();
    }

    @FXML
    void ekleem_event(ActionEvent event) {
    	new formAc("HayvanGir.fxml");
    	 Stage stage = (Stage) pane.getScene().getWindow();
		    stage.close();
    }

    @FXML
    void initialize() {
    	 Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEguMfvKA2nne2cQk-9R-CAkvwsorRdaQG9CGwFPwgUoa1rgCsEwgjZXAdlYxEfDqQpf6j-dU3vtS4MWdQYcU7dla-CSZIJDXPqfpQ9mtNb3QkSXXqur3UTgxs9Tqaw6-1HVSHPvpqf3zpKcZ_OKC64jlS2--uOFPgkbZPT6VmP7I8C3xjBtZ_GxbivfYw");
         backround.setImage(image);

    }

}
