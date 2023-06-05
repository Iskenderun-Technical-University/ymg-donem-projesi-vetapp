package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.util.veritabanıU;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class statik {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl10;

    @FXML
    private Label lbl101;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl111;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl121;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl21;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl31;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl41;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl51;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl61;

    @FXML
    private Label lbl7;
    @FXML
    private Label lbl13;

    @FXML
    private Label lbl71;

    @FXML
    private Label lbl8;

    @FXML
    private Label lbl81;

    @FXML
    private Label lbl9;

    @FXML
    private Label lbl91;

    @FXML
    private AnchorPane pane;
    @FXML
    void giris(ActionEvent event) {
    	new formAc("Sample4.fxml");
      	 Stage stage = (Stage) pane.getScene().getWindow();
   		    stage.close();
    }

    @FXML
    void refresh(ActionEvent event) {
    	 initialize();
    }
    	public statik() {
    		baglanti=veritabanıU.Baglan();
    	}

        Connection baglanti =null;

        PreparedStatement sorguifadesi=null;
        ResultSet getirilne=null;
       String sql;
    @FXML
    void initialize() {
    	String soru1 = "Kümes hayvanı olanların sayısı: ";
    	String sql1 = "SELECT COUNT(*) FROM hayvan WHERE Cesit = 'Kümes Hayvanı'";
        lbl.setText(soru1);
        executeSorgu2(sql1,lbl1);

        
        String soru2 = "Büyükbaş hayvan sayısı: ";
        String sorgu2 = "SELECT COUNT(*) FROM hayvan WHERE Cesit = 'Büyükbaş'";

        String tur = "Sığır";
        String soru3 = tur + " türüne sahip hayvan sayısı: ";
        String sorgu3 = "SELECT COUNT(*) FROM hayvan WHERE Tur = '" + tur + "'";


        String saglikDurumu = "İyi";
        String soru4 = saglikDurumu + " sağlık durumuna sahip hayvan sayısı: ";
        String sorgu4 = "SELECT COUNT(*) FROM hayvan WHERE SaglikDurumu = '" + saglikDurumu + "'";

        String soru6 = "Hayvanların toplam sayısı: ";
        String sorgu6 = "SELECT COUNT(*) FROM hayvan";
        
        String soru7 = "En eski kaydedilen hayvanın doğum tarihi: ";
        String sorgu7 = "SELECT MIN(Dogum) FROM hayvan";
        
        String soru8 = "En genç hayvanın doğum tarihi: ";
        String sorgu8 = "SELECT MAX(Dogum) FROM hayvan";

        
        String sdd = "kötü";
        String soru9 = sdd + " sağlık durumuna sahip hayvanların isimleri ve sağlık durumları: ";
        String sorgu9 = "SELECT Ad, SaglikDurumu FROM hayvan WHERE SaglikDurumu = '" + sdd + "'";

        String turuu = "Köpek";
        String soru10 = turuu + " türüne sahip hayvanların isimleri ve cinsiyetleri: ";
        String sorgu10 = "SELECT Ad, Cinsiyet FROM hayvan WHERE Tur = '" + turuu + "'";

        String soru11 = "Hayvanların ortalama yaşam süresi: ";
        String sorgu11 = "SELECT AVG(DATEDIFF(OLUMZAMANI, Dogum)) FROM hayvan WHERE OlumZamani IS NOT NULL";

        
        String soru12 = "Ölüm nedeni belirtilen hayvanların sayısı: ";
        String sorgu12 = "SELECT COUNT(*) FROM hayvan WHERE OlumNedeni IS NOT NULL";

        
        String soru13 = "Veterineri belirtilen hayvanların sayısı: ";
        String sorgu13 = "SELECT COUNT(*) FROM hayvan WHERE Veterineri IS NOT NULL";



        
        String kelime = "belirli kelime";
        String soru15 = "Notları " + kelime + " kelimesini içeren hayvanların sayısı: ";
        String sorgu15 = "SELECT COUNT(*) FROM hayvan WHERE Notlar LIKE '%" + kelime + "%'";

        String saglık = "iyi";
        String cinsiyet = "dişi";
        String soru16 = saglikDurumu + " sağlık durumuna ve " + cinsiyet + " cinsiyetine sahip hayvan sayısı: ";
        String sorgu16 = "SELECT COUNT(*) FROM hayvan WHERE SaglikDurumu = '" + saglikDurumu + "' AND Cinsiyet = '" + cinsiyet + "'";

        
        int minYas = 1;
        int maxYas = 5;
        String soru17 = minYas + " ile " + maxYas+ " yaş aralığındaki hayvan sayısı: ";
        String sorgu17 = "SELECT COUNT(*) FROM hayvan WHERE Yas BETWEEN " + minYas + " AND " + maxYas;

        
        String tur5 = "mezgit";
        String soru18 = tur5 + " sayısı: ";
        String sorgu18 = "SELECT COUNT(*) FROM hayvan WHERE Tur = '" + tur5 + "'";

        
        String tur2 = "tavuk";
        String soru19 = tur2 + " sayısı: ";
        String sorgu19 = "SELECT COUNT(*) FROM hayvan WHERE Tur = '" + tur2 + "'";

        
        String altTur = "americanus";
        String soru20= altTur + " alttürüne sahip tavuk sayısı: ";
        String sorgu20 = "SELECT COUNT(*) FROM hayvan WHERE AltTur = '" + altTur + "' AND Tur = 'tavuk'";

        
        String tur3 = "köpek";
        String soru21 = tur3 + " sayısı: ";
        String sorgu21 = "SELECT COUNT(*) FROM hayvan WHERE Tur = '" + tur3 + "'";

        
        
        String altTur2 = "doberman";
        String soru22 = altTur2 + " alttürü sayısı: ";
        String sorgu22 = "SELECT COUNT(*) FROM hayvan WHERE AltTur = '" + altTur2 + "'";

        
     

        lbl2.setText(soru2);
        executeSorgu2(sorgu2, lbl3);

       // lbl3.setText(soru3);
       // executeSorgu2(sorgu3, lbl3);

        lbl4.setText(soru4);
        executeSorgu2(sorgu4, lbl5);



        lbl6.setText(soru6);
        executeSorgu2(sorgu6, lbl7);

        lbl8.setText(soru7);
        executeSorgu2(sorgu7, lbl9);

       // lbl8.setText(soru8);
      //  executeSorgu2(sorgu8, lbl8);

        lbl10.setText(soru9);
        executeSorgu2(sorgu9, lbl11);

  //     lbl10.setText(soru10);
     //   executeSorgu2(sorgu10, lbl10);

//       lbl12.setText(soru11);
   //     executeSorgu2(sorgu11, lbl12);

        lbl12.setText(soru21);
        executeSorgu2(sorgu21, lbl13);

        lbl41.setText(soru22);
        executeSorgu2(sorgu22, lbl41);
    //    lbl12.setText(soru12);
    //    executeSorgu2(sorgu12, lbl12);

        lbl31.setText(soru13);
        executeSorgu2(sorgu13, lbl41);



   //     lbl51.setText(soru15);
    //    executeSorgu2(sorgu15, lbl51);

        lbl51.setText(soru16);
        executeSorgu2(sorgu16, lbl61);

    //    lbl71.setText(soru17);
    //    executeSorgu2(sorgu17, lbl71);

        lbl71.setText(soru18);
        executeSorgu2(sorgu18, lbl81);

        lbl91.setText(soru19);
        executeSorgu2(sorgu19, lbl101);

        lbl111.setText(soru20);
        executeSorgu2(sorgu20, lbl121);


        
    }
 
    private void executeSorgu2(String sql,Label lbxl) {
  

        try {
            PreparedStatement statement = baglanti.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                lbxl.setText("Cevap:"+count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
