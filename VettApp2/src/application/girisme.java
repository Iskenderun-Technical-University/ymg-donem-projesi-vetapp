package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class girisme {
    private Connection baglanti;
    
    public girisme(Connection baglanti) {
        this.baglanti = baglanti;
    }
    
    public boolean logine(String kullaniciAdi, String sifre) {
        String sql = "SELECT * FROM giris WHERE KullaniciAdi = ? AND Sifre = ?";
        try {
            PreparedStatement sorguIfadesi = baglanti.prepareStatement(sql);
            sorguIfadesi.setString(1, kullaniciAdi);
            sorguIfadesi.setString(2, sifre);
            
            ResultSet sonuclar = sorguIfadesi.executeQuery();
             
            if (sonuclar.next()) {
                // Giriş başarılı
                return true;
            } else {
                // Giriş başarısız
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
