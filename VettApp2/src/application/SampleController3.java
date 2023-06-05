package application;


import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;
import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController3 {

	public SampleController3() {
		baglanti=veritabanıU.Baglan();
	}
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ara;

    @FXML
    private Button ekle;

    @FXML
    private TableColumn<hayvan_giris,Image> stn1;

    @FXML
    private TableColumn<hayvan_giris,String> stn2;

    @FXML
    private TableColumn<hayvan_giris,String> stn3;
    @FXML
    private ImageView backround;

    @FXML
    private TableColumn<hayvan_giris,String> stn4;

    @FXML
    private TableColumn<hayvan_giris,String> stn5;

    @FXML
    private TableColumn<hayvan_giris,String> stn6;

    @FXML
    private TableView<hayvan_giris> table;

    @FXML
    private TextField txt1;
    @FXML
    private AnchorPane pane;
    
    
    //////////////////////
    
	

    Connection baglanti =null;

    PreparedStatement sorguifadesi=null;
    ResultSet getirilne=null;
   String sql;

    
    ///////////////
   @FXML
   void ekle_btn(ActionEvent event) {
		new formAc("hosgel.fxml");
   	 Stage stage = (Stage) pane.getScene().getWindow();
		    stage.close();
   }
   
    @FXML
    void arabtn(ActionEvent event) {
    	
    	
		if (txt1.getText().equals(" ")) {
    	sql="select * from hayvan";

}else {
	String sql = "SELECT * FROM hayvan WHERE id LIKE '%" + txt1.getText() + "%' OR Ad LIKE '%" + txt1.getText() + "%' OR Cesit LIKE '%" + txt1.getText() + "%' OR Tur LIKE '%" + txt1.getText() + "%' OR AltTur LIKE '%" + txt1.getText() + "%' OR Notlar LIKE '%" + txt1.getText() + "%'";
    doritoscubun(table,sql);

}
    //doritoscubun(table,sql);
    }
    
    @FXML
    void keypress(KeyEvent event) {
    		
    }
    @FXML
    void textChange(InputMethodEvent event) {
    
    }
    

    public void doritoscubun2(TableView<hayvan_giris> table,PreparedStatement sorgu) {
    	//sql="select * from hayvanlar";
        ObservableList<hayvan_giris> kayitlist=FXCollections.observableArrayList();
         try {
        	   sorguifadesi=baglanti.prepareStatement(sql);
                   ResultSet getirilen=sorgu.executeQuery();

                   while (getirilen.next()) {
                	   kayitlist.add(new hayvan_giris(
                			    getirilen.getInt("id"),
                			    getirilen.getString("ad"),
                			    getirilen.getString("cesit"),
                			    getirilen.getString("tur"),
                			    getirilen.getString("altTur"),
                			    getirilen.getString("notlar"),
                			    getirilen.getString("saglikDurumu"),
                			    getirilen.getString("Cinsiyet"),
                			    getirilen.getString("saglikDurumuEski"),
                			    getirilen.getBoolean("canlilikDurumu"),
                			    getirilen.getDate("olumZamani"),
                			    getirilen.getString("olumNedeni"),
                			    getirilen.getString("veterineri"),
                			    getirilen.getInt("oncekiVeteriner"),
                			    getirilen.getDate("muayneSon"),
                			    getirilen.getDate("Dogum"),
                			    getirilen.getDate("muayneEski"),
                			    getirilen.getString("fotograf")
                			));


    }

                   stn1.setCellValueFactory(new PropertyValueFactory<>("id"));
                   stn2.setCellValueFactory(new PropertyValueFactory<>("ad"));
                   stn3.setCellValueFactory(new PropertyValueFactory<>("cesit"));
                   stn4.setCellValueFactory(new PropertyValueFactory<>("tur"));
                   stn5.setCellValueFactory(new PropertyValueFactory<>("altTur"));
                   stn6.setCellValueFactory(new PropertyValueFactory<>("notlar"));


        table.setItems(kayitlist);
        
        

  	  
         } catch (Exception e) {
    		// TODO: handle exception
        	 System.out.println("hataaa"+e.getMessage().toString());
    	}}
    private static int selectedId;

    public void doritoscubun(TableView<hayvan_giris> table,String sql) {
    	//sql="select * from hayvanlar";
        ObservableList<hayvan_giris> kayitlist=FXCollections.observableArrayList();
         try {
        	    sorguifadesi=baglanti.prepareStatement(sql);
                   ResultSet getirilen=sorguifadesi.executeQuery();

                   while (getirilen.next()) {
                	   kayitlist.add(new hayvan_giris(
               			    getirilen.getInt("id"),
               			    getirilen.getString("ad"),
               			    getirilen.getString("cesit"),
               			    getirilen.getString("tur"),
               			    getirilen.getString("altTur"),
               			    getirilen.getString("notlar"),
               			    getirilen.getString("saglikDurumu"),
               			    getirilen.getString("Cinsiyet"),
               			    getirilen.getString("saglikDurumuEski"),
               			    getirilen.getBoolean("canlilikDurumu"),
               			    getirilen.getDate("olumZamani"),
               			    getirilen.getString("olumNedeni"),
               			    getirilen.getString("veterineri"),
               			    getirilen.getInt("oncekiVeteriner"),
               			    getirilen.getDate("muayneSon"),
               			    getirilen.getDate("Dogum"),
               			    getirilen.getDate("muayneEski"),
               			    getirilen.getString("fotograf")
               			));

    }


                   stn1.setCellValueFactory(new PropertyValueFactory<>("id"));
                   stn2.setCellValueFactory(new PropertyValueFactory<>("ad"));
                   stn3.setCellValueFactory(new PropertyValueFactory<>("cesit"));
                   stn4.setCellValueFactory(new PropertyValueFactory<>("tur"));
                   stn5.setCellValueFactory(new PropertyValueFactory<>("altTur"));
                   stn6.setCellValueFactory(new PropertyValueFactory<>("notlar"));


        table.setItems(kayitlist);
        
        
        
      
         } catch (Exception e) {
    		// TODO: handle exception
        	 System.out.println("hataaa"+e.getMessage().toString());
    	}
        
        

    }

	public static int getSelectedId() {
        return selectedId;
    }
    @FXML
    void initialize() {
     	 Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEg7WTEaRN8V_CekamXN3ZBS3SADrlUC9rWT1_5DTGXQpkNfYJWRl-OwyhdZHUZ5VOygN2r5Wz6V8MEVcyJzE46p0coP5-vNfN6E_5pkfUgHDrzwYR1iB-ZTbD6g0isqIe4cop5ykZNsmFeRFevmbbq2LwqUWo9X9T8sNOWVei7L4P6s-c9J2YTrpn1m5g");
         backround.setImage(image);
    	sql="select * from hayvan";
    doritoscubun(table,sql);
    
     sat();
     arayıc();
    }
public void arayıc() {
    txt1.setOnKeyReleased(event -> {
        arabtn(null);
        	
        // İstenilen işlemler burada yapılabilir
    });}

    
    public void sat() {    table.getSelectionModel().selectedItemProperty().addListener((observable, oldSelection, newSelection) -> {

	   if (newSelection != null) {
           selectedId = newSelection.getId();
           formAc form = new formAc("img.fxml");
       }
   });}

}
