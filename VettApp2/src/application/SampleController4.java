package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SampleController4 {
	public SampleController4() {
	baglanti=veritabanıU.Baglan();
}
    Connection baglanti =null;
    PreparedStatement sorguifadesi=null;

    ResultSet getirilne=null;
    String sql;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField txt1;
    @FXML
    private ImageView img1;
    @FXML
    private TextField txt2;

    @FXML
    void giris(ActionEvent event) {
  


    	  sql="select * from giris where KullaniciAdi=? and Sifre=?";
    	    try {
    			sorguifadesi=baglanti.prepareStatement(sql);
    			sorguifadesi.setString(1,txt1.getText().trim());//trim baştaki ve sondaki boşlukları silmke için
    			sorguifadesi.setString(2,txt2.getText().trim());//trim baştaki ve sondaki boşlukları silmke için

    	//		sorguifadesi.setString(2,MD5Utils.encrypt(txt2.getText().trim()));
    			ResultSet getirilen=sorguifadesi.executeQuery();
    		    Alert alert = new Alert(AlertType.WARNING);
    			if (!getirilen.next()) {
    				
        	        alert.setTitle("VettApp");
        	        alert.setHeaderText("Kullanıcı Adı veya Şifre Hatalı");

        	        alert.showAndWait();
 			    }
    			else {
    				getirilen.getString(1);
    				
    				
    	
    			    formAc form = new formAc("hosgel.fxml");
    //	Sample3.fxml
    			    Stage stage = (Stage) pane.getScene().getWindow();
    			    stage.close();
    			 
    		//		getirilen.getDate(0);
    			//	getirilen.getInt(0);
    				
    				

    			}
    			
    		} catch (Exception e) {
    			// TODO: handle exception
    			
    		}

    
    }

    @FXML
    void istatistik(ActionEvent event) {
	    new formAc("statik.fxml");

    }

    @FXML
    void initialize() {
   	 Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEi5QvH2ucY0J-hQlndxLx63wpjGWotz5UQ5JDiZhO6_lDOHz9Ft51Gr7NY6LHRdhj1tqnqVh4fw-vvf605yWuD5VdyLwCPwnbwDA0UifnQbVm5yyBXSZTgpRcfJGXj_lmTcAxeyAA2J1PXTBnlsNheeJxsjWfTQMrfOnolQtCM7Morxk3MLr0YR_nRn3w");

    	// Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEieZ8BqwzwdLPXi_xqjVzgzpWtQ1cDR2G-CWQQzd_PAlt1QXGvjsAPEC8K11d4BJRfuhHfdLOKpP6B86lItySjqdILXxailc3lFN4ZSqJM4_rOv-CY8vmVJoLprxyWP9LL5R_LlqUO9T0uas7f4jPy2uLzv_y0Qy9wzP6g5989nI6U96PSaazgxvxnxEQ");
         img1.setImage(image);
    	//Image image = new Image(getClass().getResourceAsStream("https://blogger.googleusercontent.com/img/a/AVvXsEi3bChfQvLpIu7lSSTJDV_dG82rhhCza8mscpnkESUZBuId_2c0kVqnM1aG3I6E5gJjHHXqXkSI2Q2ZM7ZonqgU8LwNhmNkSG9dM3CJnG24UwBruEQfJWmloUN2LAFDkwXyLPYH1_rmw6Fo_KO1c2LZ97yEolTyXv_yinY_u61FYZSgoyxv196IcCnp0w"));
    	// img1.setImage(image);
 
     }
    
    
    

}




