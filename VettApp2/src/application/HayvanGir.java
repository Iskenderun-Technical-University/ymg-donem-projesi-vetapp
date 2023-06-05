package application;


import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.DragEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.ZoneId;
public class HayvanGir {
	public HayvanGir() {
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
    private Button btn_kaydet;

    @FXML
    private ChoiceBox<String> chc1_Cesit;

    @FXML
    private ChoiceBox<String> chc2_Tur;
    @FXML
    private ChoiceBox<String> chc3_cinsiyet;

    @FXML
    private DatePicker date_muayne;

    @FXML
    private DatePicker dogum_tarihi;

    @FXML
    private Label lbl1;
    @FXML
    private ImageView backround;
    @FXML
    private TextField txt_ad;

    @FXML
    private TextField txt_foto;

    @FXML
    private TextField txt_not;

    @FXML
    private TextField txt_sag;

    @FXML
    private TextField txt_tur;
    @FXML
    private AnchorPane pane;

    @FXML
    private Button btnana;

    @FXML
    void inputtext(javafx.scene.input.InputMethodEvent event) {

    }
    

    @FXML
    void dragdetect(MouseEvent event) {
 
    }

    @FXML
    void dragdone(DragEvent event) {
    	ObservableList<String> tur = FXCollections.observableArrayList("Kümes Hayvanı", "Küçükbaş", "Büyükbaş","SuÜrünü");
    	chc2_Tur.setItems(tur);
    }
    
    public static java.sql.Date tarihYaz(DatePicker tarih) {
        LocalDate dogum = tarih.getValue();
        
        // LocalDate'i java.util.Date'e dönüştürün
        java.util.Date dogum2 = java.util.Date.from(dogum.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        // java.util.Date'i java.sql.Date'e dönüştürün
        java.sql.Date dogum3 = new java.sql.Date(dogum2.getTime());
        
        return dogum3;
    }

    public java.sql.Date tarihh(DatePicker datePicker) {
        LocalDate selectedDate = datePicker.getValue();
        if (selectedDate != null) {
            return java.sql.Date.valueOf(selectedDate);
        } else {
            return null;
        }
    }

   
    
		    @FXML
		    void anamenu(ActionEvent event) {
 new formAc("hosgel.fxml");
  	 Stage stage = (Stage) pane.getScene().getWindow();
		    stage.close();
    
		    }
		    
		    
		    
		    
		    
		    
		    
    @FXML
    void KAydet(ActionEvent event) {

	    String tur = chc2_Tur.getValue();
	    String cinsiyet = chc3_cinsiyet.getValue();
	    String cesit = chc1_Cesit.getValue();
   
	
	    
	    String ad = txt_ad.getText();
	    String ozeltur = txt_tur.getText();
	    String foto = txt_foto.getText();
	    String saglik = txt_sag.getText();
	    String notlar = txt_not.getText();



	     
 if (cesit=="" ||cinsiyet==""||tur==""||ad==""||ozeltur==""||foto==""||saglik==""||notlar==""||date_muayne.equals(null)||dogum_tarihi.equals(null)) {
     Alert alert = new Alert(AlertType.WARNING);
     alert.setTitle("Hata");
     alert.setHeaderText(null);
     alert.setContentText("Tüm Alanaları Doldurun.");
     
     alert.show();
	}else {    // Date   dogum=tarihYaz(dogum_tarihi);
    //  Date   muayne=tarihYaz(date_muayne);
		
		Date sqlDate = tarihh(date_muayne);
		Date sqlDate2 = tarihh(dogum_tarihi);
	    String sql = "INSERT INTO hayvan (Ad, Tur, Cesit, Cinsiyet, Notlar,SaglıkDurumu,Fotograf,AltTur,Dogum,MuayneSon) VALUES (?, ?, ?,?,?, ?, ?,?,?,?)";

	    try {
	        PreparedStatement statement = baglanti.prepareStatement(sql);
	        statement.setString(1, ad);
	   

	       statement.setString(2, tur);
	        statement.setString(3, cesit.toString());
	        statement.setString(4, cinsiyet.toString());

	        statement.setString(5, notlar);

	        statement.setString(6, saglik);
	        statement.setString(7, foto);
	    statement.setString(8, ozeltur);
          //      System.out.println(date_muayne.toString());
	        statement.setDate(9,sqlDate);
	        statement.setDate(10, sqlDate2);
	        	        statement.executeUpdate();
	        
	        Alert alert = new Alert(AlertType.INFORMATION);
	        alert.setTitle("Başarıyla "+ad+" Eklendi");
	        alert.setHeaderText(null);
	        alert.setContentText("Başarıyla "+ad+" Eklendi");
	        
	        alert.show();
	        new formAc("hosgel.fxml");
	      	 Stage stage = (Stage) pane.getScene().getWindow();
	   		    stage.close();

	        
	     //   System.out.println("Veri başarıyla eklendi.");
	    } catch (SQLException e) {
	    //    System.out.println("Veri eklenirken hata oluştu: " + e.getMessage());
	        Alert alert = new Alert(AlertType.WARNING);
	        alert.setTitle("Hata");
	        alert.setHeaderText(null);
	        alert.setContentText("Bir Hata Oluştu : "+e);
	        System.out.println(e);
	        alert.show(); 

	    }}

    }


    @FXML
    void initialize() {
    	
   	 Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEi3bChfQvLpIu7lSSTJDV_dG82rhhCza8mscpnkESUZBuId_2c0kVqnM1aG3I6E5gJjHHXqXkSI2Q2ZM7ZonqgU8LwNhmNkSG9dM3CJnG24UwBruEQfJWmloUN2LAFDkwXyLPYH1_rmw6Fo_KO1c2LZ97yEolTyXv_yinY_u61FYZSgoyxv196IcCnp0w");

   //  	 Image image = new Image("https://blogger.googleusercontent.com/img/a/AVvXsEgcxRbKAKpl1wp60PrzgBANmTPDQXjhRw3AZk5sE29SKh2XrGfMZWE-bi7TCMB3BNh8m0k9Zk-zjnTg72VBwM8ZrTyAzOLg3jeuyc7nit32CeA890K0bf377SY-y8FX_3gxBfeEU1D8514KrX8XuVJaZy6vYEAfJg7lshkWasrnVt1cL3Y2t1v4u88sbQ");
         backround.setImage(image);
         
    	ObservableList<String> cesit = FXCollections.observableArrayList("Kümes Hayvanı", "Küçükbaş", "Büyükbaş","SuÜrünü","Ev Hayvanı");
    	chc1_Cesit.setItems(cesit);
    
    	
    	
    	ObservableList<String> cinsiyet = FXCollections.observableArrayList("dişi","erkek","belirsiz");
        chc3_cinsiyet.setItems(cinsiyet);
        
        
    	chc1_Cesit.setOnAction(event -> {
    	    // Seçim değişikliği olayı gerçekleştiğinde buradaki kod çalışacak
    	    Object selectedOption = chc1_Cesit.getSelectionModel().getSelectedItem();
    	 if(selectedOption.equals("Kümes Hayvanı")) {
     		 ObservableList<String> tur = FXCollections.observableArrayList(
 				    "Tavuk",
 				    "Ördek",
 				    "Kaz",
 				    "Hindi",
 				    "Bıldırcın",
 				    "Keklik"
 				);
    	    	chc2_Tur.setItems(tur);
    	 }else  	 if(selectedOption.equals("Küçükbaş")) {
    		 ObservableList<String> tur = FXCollections.observableArrayList(
    				    "koyun",
    				    "keçi"
    		
    				);
	    	chc2_Tur.setItems(tur);
	 }
    	 else  	 if(selectedOption.equals("Büyükbaş")) {
    		 ObservableList<String> tur = FXCollections.observableArrayList();
    		 tur.add("Sığır");
    		 tur.add("Manda");
    		 tur.add("Bufalo");
    		 tur.add("Deve");
    		 tur.add("At");
	    	chc2_Tur.setItems(tur);
	 }else 	 if(selectedOption.equals("SuÜrünü")) {
		 ObservableList<String> tur = FXCollections.observableArrayList(
				    
				    "levrek",
				    "somon",
				    "hamsi",
				    "karides",
				    "midye",
				    "istiridye",
				    "kalamar",
				    "tavuk balığı",
				    "sardalya",
				    "ton balığı",
				    "palamut",
				    "mezgit",
				    "uskumru",
				    "morina",
				    "çipura",
				    "lufer",
				    "kefal",
				    "turna balığı",
				    "akya",
				    "neon tetra",
				    "lepistes",
				    "platy",
				    "moli",
				    "zümrüt gözlü tetra",
				    "kardinal tetra",
				    "discus",
				    "kılıçbalığı",
				    "labirent balığı",
				    "zebra danio",
				    "neon tetra",
				    "melek balığı",
				    "cüce vatoz",
				    "prenses balığı",
				    "kongo tetra",
				    "cüce gourami",
				    "prenses pleyt",
				    "cüce iris",
				    "otocinclus",
				    "betta",  
				    "japon balığı",
				    "diğer"
				  
				);
	    	chc2_Tur.setItems(tur);
    	}else 	 if(selectedOption.equals("Ev Hayvanı")) {
    		ObservableList<String> tur = FXCollections.observableArrayList(
    			    "kedi",
    			    "köpek",
    			    "kuş",
    			    "tavşan",
    			    "hamster",
    			    "sıçan",
    			    "papağan",
    			    "kaplumbağa",
    			    "kertenkele",
    			    "kır kurdu",
    			    "sürüngen",
    			    "ipek böceği",
    			    "kanarya",
    			    "hindi",
    			    "kanguru",
    			    "kaplan",
    			    "salyangoz",
    			    "akvayum balığı"
    			);
	    	chc2_Tur.setItems(tur);
    	}
    	 

    
    });

}}
