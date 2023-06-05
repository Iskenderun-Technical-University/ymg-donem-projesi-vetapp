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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.sql.*;

public class SampleController5 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Label lbl3;

    @FXML
    private TableView<login> table;

    @FXML
    private TableColumn<login, Integer> tableid;

    @FXML
    private TableColumn<login, String> tablenick;

    @FXML
    private TableColumn<login, String> tablepass;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;
    	public SampleController5() {
		baglanti=veritabanıU.Baglan();
	}
    Connection baglanti =null;

    PreparedStatement sorguifadesi=null;
    ResultSet getirilne=null;
    String sql;

    @FXML
    void table_click(MouseEvent event) {
login kayit=new login();
kayit=(login) table.getItems().get(table.getSelectionModel().getSelectedIndex());
txt2.setText(kayit.getNick());

//coder 


txt3.setText(MD5Utils.encrypt(kayit.getPass()));


txt1.setText(Integer.toString(kayit.getId()));
if(kayit.getId()==1) {
	btn1.setText("hahahah");
}
    }
public void doritoscubun(TableView<login> table) {
	sql="select * from login";
    ObservableList<login> kayitlist=FXCollections.observableArrayList();
     try {
    	    sorguifadesi=baglanti.prepareStatement(sql);
               ResultSet getirilen=sorguifadesi.executeQuery();

               while (getirilen.next()) {
               kayitlist.add(new login(getirilen.getInt("id"),getirilen.getString("nick"),getirilen.getString("pass")));	


}

     tableid.setCellValueFactory(new PropertyValueFactory<>("id"));
     tablenick.setCellValueFactory(new PropertyValueFactory<>("nick"));
     tablepass.setCellValueFactory(new PropertyValueFactory<>("pass"));
    table.setItems(kayitlist);
     } catch (Exception e) {
		// TODO: handle exception
    	 System.out.println("hataaa"+e.getMessage().toString());
	}
    
    

}
    @FXML
    void aaaa(ActionEvent event) {

    }
    @FXML
    void initialize() { 
     doritoscubun(table);
    }

}
