package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class imgConto {
	public imgConto() {
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
    private ImageView img;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl7;

    @FXML
    private Label lbl8;

    @FXML
    private Label lblNot;
    @FXML
    void btn1_geri(ActionEvent event) {

    }

    @FXML
    void btn2_ileri(ActionEvent event) {
	
    }
	int selectedId;
    @FXML
    void initialize() {
 
		
			try {
				selectedId = SampleController3.getSelectedId();
				lbl1.setText(String.valueOf(selectedId));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sql = "select * from hayvan where id='" + selectedId + "'";
	//Hallet(sql);
		ObservableList<hayvan_giris> veriler = Hallet2(sql);

		// Örnek olarak, verilerin ilk elemanını alalım ve lbl1'e atayalım
		if (!veriler.isEmpty()) {
		    hayvan_giris ilkHayvan = veriler.get(0);
		    lbl1.setText(String.valueOf(ilkHayvan.getId()));
		    lbl2.setText(ilkHayvan.getAd());
		    lbl3.setText(ilkHayvan.getCesit());
		    lbl4.setText(ilkHayvan.getTur());
		    lbl5.setText(ilkHayvan.getAltTur());
		    lbl6.setText(ilkHayvan.getCinsiyet());
		/*    if (ilkHayvan.isCanlilikDurumu()==true) {
			    lbl6.setText("Canlı");

			}else if(ilkHayvan.isCanlilikDurumu()==false) {
				   lbl6.setText("Ölü");
			}else {
				   lbl6.setText("Akıbeti Bilinmiyor");

			}*/
		 
		    lbl7.setText(ilkHayvan.getSaglikDurumu());
		    lblNot.setText(ilkHayvan.getNotlar());
		    
		    
try {
		   Image image = new Image(ilkHayvan.getFotograf());
	           img.setImage(image);
} catch (Exception e) {
	// TODO: handle exception
}
	    
		}

      

    }
    public void Hallet(String sql) {
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



          
        
        
      
         } catch (Exception e) {
    		// TODO: handle exception
        	 System.out.println("hataaa "+e.getMessage().toString());
    	}
        
        

    }
    public ObservableList<hayvan_giris> Hallet2(String sql) {
        ObservableList<hayvan_giris> kayitlist = FXCollections.observableArrayList();

        try {
            sorguifadesi = baglanti.prepareStatement(sql);
            ResultSet getirilen = sorguifadesi.executeQuery();

            while (getirilen.next()) {
                hayvan_giris hayvan = new hayvan_giris();
                hayvan.setId(getirilen.getInt("id"));
                hayvan.setAd(getirilen.getString("ad"));
                hayvan.setCesit(getirilen.getString("cesit"));
                hayvan.setTur(getirilen.getString("tur"));
                hayvan.setAltTur(getirilen.getString("altTur"));
                hayvan.setNotlar(getirilen.getString("notlar"));
                hayvan.setSaglikDurumu(getirilen.getString("saglikDurumu"));
                hayvan.setCinsiyet(getirilen.getString("Cinsiyet"));
                hayvan.setSaglikDurumuEski(getirilen.getString("Cinsiyet"));
                hayvan.setCanlilikDurumu(getirilen.getBoolean("canlilikDurumu"));
                hayvan.setOlumZamani(getirilen.getDate("olumZamani"));
                hayvan.setOlumNedeni(getirilen.getString("olumNedeni"));
                hayvan.setVeterineri(getirilen.getString("veterineri"));
                hayvan.setOncekiVeteriner(getirilen.getInt("oncekiVeteriner"));
                hayvan.setMuayneSon(getirilen.getDate("muayneSon"));
                hayvan.setDogum(getirilen.getDate("Dogum"));
                hayvan.setMuayneEski(getirilen.getDate("muayneEski"));
                hayvan.setFotograf(getirilen.getString("fotograf"));

                kayitlist.add(hayvan);
            }

            getirilen.close();
            sorguifadesi.close();
            baglanti.close();
        } catch (SQLException e) { 
            e.printStackTrace();
        }

        return kayitlist;
    }

    
}
