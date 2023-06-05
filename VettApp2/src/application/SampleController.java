package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class SampleController {
	
	
	public SampleController() {
		baglanti=veritabanıU.Baglan();
	}
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button eklebt;

    @FXML
    private Button girisbt;

    @FXML
    private Button guncellebt;

    @FXML
    private Label lbl1;

    @FXML
    private Button silbt;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private Button btn4;

    Connection baglanti =null;

    PreparedStatement sorguifadesi=null;
    ResultSet getirilne=null;
   String sql;

   
    @FXML
    void ekle(ActionEvent event) {
    	 sql="insert into login(nick,pass) values(?,?)"; 
    	    try {
    			sorguifadesi=baglanti.prepareStatement(sql);
    			sorguifadesi.setString(2,txt2.getText().trim());
    		    sorguifadesi.setString(1,txt1.getText().trim());
    	        sorguifadesi.executeUpdate();
    	        lbl1.setText("eklendi");
    	    } catch (Exception eee) {
    			// TODO: handle exception
    	        lbl1.setText(eee.getMessage().toString());

    		}
    	    
    	    
    	 
    }
    @FXML
    void formac(ActionEvent event) {
    new formAc("Sample5.fxml");

    }
    @FXML
    void giris(ActionEvent event) {
    sql="select * from login where nick=? and pass=?";
    try {
		sorguifadesi=baglanti.prepareStatement(sql);
		sorguifadesi.setString(1,txt1.getText().trim());//trim baştaki ve sondaki boşlukları silmke için
		sorguifadesi.setString(2,MD5Utils.encrypt(txt2.getText().trim()));
		ResultSet getirilen=sorguifadesi.executeQuery();
	
		if (!getirilen.next()) {
			lbl1.setText("eyvah!! bir hata oluştu");
		}
		else {
			getirilen.getString(1);
			
			System.out.println("id    "+getirilen.getString("id"));
			System.out.println("nick   "+getirilen.getString("nick"));
			System.out.println("pass  "+getirilen.getString("pass"));
			
			
	//		getirilen.getDate(0);
		//	getirilen.getInt(0);
			
			

		}
		
	} catch (Exception e) {
		// TODO: handle exception
		
		lbl1.setText(e.getMessage().toString());
	}
    }

    @FXML
    void guncelle(ActionEvent event) {
    sql="update login set pass=? where nick=?"; 
    try {
		sorguifadesi=baglanti.prepareStatement(sql);
		sorguifadesi.setString(1,txt2.getText().trim());
	sorguifadesi.setString(2,txt1.getText().trim());
    sorguifadesi.executeUpdate();
    lbl1.setText("Sifre guncellendi");
    } catch (Exception eee) {
		// TODO: handle exception
        lbl1.setText(eee.getMessage().toString());

	}
    }

    @FXML
    void sil(ActionEvent event) {
        sql="delete from login where nick=? and pass=?"; 
        try {
    		sorguifadesi=baglanti.prepareStatement(sql);
    		sorguifadesi.setString(2,txt2.getText().trim());
    	sorguifadesi.setString(1,txt1.getText().trim());
        sorguifadesi.executeUpdate();
        lbl1.setText("hesap silindi");
        } catch (Exception eee) {
    		// TODO: handle exception
            lbl1.setText(eee.getMessage().toString());

    	}
    }

    @FXML
    void initialize() {
        assert eklebt != null : "fx:id=\"eklebt\" was not injected: check your FXML file 'Sample.fxml'.";
        assert girisbt != null : "fx:id=\"girisbt\" was not injected: check your FXML file 'Sample.fxml'.";
        assert guncellebt != null : "fx:id=\"guncellebt\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert silbt != null : "fx:id=\"silbt\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txt2 != null : "fx:id=\"txt2\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}
