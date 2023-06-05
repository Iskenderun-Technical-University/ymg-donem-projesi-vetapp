package application;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class hayvan_giris {
	 
	private int id;
	    private String ad;
	    private String cesit;
	    private String tur;
	    private String altTur;
	    private String notlar;
	    private String saglikDurumu;
	    private String Cinsiyet;
	    private String saglikDurumuEski;
	    private boolean canlilikDurumu;
	    private Date olumZamani;
	    private String olumNedeni;
	    private String veterineri;
	    private int oncekiVeteriner;
	    private Date muayneSon;
	    private Date Dogum;
	    private Date muayneEski;
	    private String fotograf;
	    
	    
	    public hayvan_giris() {}
		public hayvan_giris(int id, String ad, String cesit, String tur, String altTur, String notlar, String saglikDurumu,
				String Cinsiyet, String saglikDurumuEski, boolean canlilikDurumu, Date olumZamani,
				String olumNedeni, String veterineri, int oncekiVeteriner, Date muayneSon, Date Dogum,
				Date muayneEski, String fotograf) {
			this.id = id;
			this.ad = ad;
			this.cesit = cesit;
			this.tur = tur;
			this.altTur = altTur;
			this.notlar = notlar;
			this.saglikDurumu = saglikDurumu;
			this.Cinsiyet = Cinsiyet;
			this.saglikDurumuEski = saglikDurumuEski;
			this.canlilikDurumu = canlilikDurumu;
			this.olumZamani = olumZamani;
			this.olumNedeni = olumNedeni;
			this.veterineri = veterineri;
			this.oncekiVeteriner = oncekiVeteriner;
			this.muayneSon = muayneSon;
			this.Dogum = Dogum;
			this.muayneEski = muayneEski;
			this.fotograf = fotograf;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAd() {
			return ad;
		}
		public void setAd(String ad) {
			this.ad = ad;
		}
		public String getCesit() {
			return cesit;
		}
		public void setCesit(String cesit) {
			this.cesit = cesit;
		}
		public String getTur() {
			return tur;
		}
		public void setTur(String tur) {
			this.tur = tur;
		}
		public String getAltTur() {
			return altTur;
		}
		public void setAltTur(String altTur) {
			this.altTur = altTur;
		}
		public String getNotlar() {
			return notlar;
		}
		public void setNotlar(String notlar) {
			this.notlar = notlar;
		}
		public String getSaglikDurumu() {
			return saglikDurumu;
		}
		public void setSaglikDurumu(String saglikDurumu) {
			this.saglikDurumu = saglikDurumu;
		}
		public String getCinsiyet() {
			return Cinsiyet;
		}
		public void setCinsiyet(String Cinsiyet) {
			this.Cinsiyet = Cinsiyet;
		}
		public String getSaglikDurumuEski() {
			return saglikDurumuEski;
		}
		public void setSaglikDurumuEski(String saglikDurumuEski) {
			this.saglikDurumuEski = saglikDurumuEski;
		}
		public boolean isCanlilikDurumu() {
			return canlilikDurumu;
		}
		public void setCanlilikDurumu(boolean canlilikDurumu) {
			this.canlilikDurumu = canlilikDurumu;
		}
		public Date getOlumZamani() {
			return olumZamani;
		}
		public void setOlumZamani(Date olumZamani) {
			this.olumZamani = olumZamani;
		}
		public String getOlumNedeni() {
			return olumNedeni;
		}
		public void setOlumNedeni(String olumNedeni) {
			this.olumNedeni = olumNedeni;
		}
		public String getVeterineri() {
			return veterineri;
		}
		public void setVeterineri(String veterineri) {
			this.veterineri = veterineri;
		}
		public int getOncekiVeteriner() {
			return oncekiVeteriner;
		}
		public void setOncekiVeteriner(int oncekiVeteriner) {
			this.oncekiVeteriner = oncekiVeteriner;
		}
		public Date getMuayneSon() {
			return muayneSon;
		}
		public void setMuayneSon(Date muayneSon) {
			this.muayneSon = muayneSon;
		}
		public Date getDogum() {
			return Dogum;
		}
		public void setDogum(Date Dogum) {
			this.Dogum = Dogum;
		}
		public Date getMuayneEski() {
			return muayneEski;
		}
		public void setMuayneEski(Date muayneEski) {
			this.muayneEski = muayneEski;
		}
		public String getFotograf() {
			return fotograf;
		}
		public void setFotograf(String fotograf) {
			this.fotograf = fotograf;
		}
		public static List<hayvan_giris> getHayvanGirisListesi(ResultSet resultSet) throws SQLException {
	        List<hayvan_giris> kayitlist = new ArrayList<>();

	        while (resultSet.next()) {
	            hayvan_giris hayvan = new hayvan_giris();
	            hayvan.setId(resultSet.getInt("id"));
	            hayvan.setAd(resultSet.getString("ad"));
	            hayvan.setCesit(resultSet.getString("cesit"));
	            hayvan.setTur(resultSet.getString("tur"));
	            hayvan.setAltTur(resultSet.getString("altTur"));
	            hayvan.setNotlar(resultSet.getString("notlar"));
	            hayvan.setSaglikDurumu(resultSet.getString("saglikDurumu"));
	            hayvan.setCinsiyet(resultSet.getString("Cinsiyet"));
	            hayvan.setSaglikDurumuEski(resultSet.getString("saglikDurumuEski"));
	            hayvan.setCanlilikDurumu(resultSet.getBoolean("canlilikDurumu"));
	            hayvan.setOlumZamani(resultSet.getDate("olumZamani"));
	            hayvan.setOlumNedeni(resultSet.getString("olumNedeni"));
	            hayvan.setVeterineri(resultSet.getString("veterineri"));
	            hayvan.setOncekiVeteriner(resultSet.getInt("oncekiVeteriner"));
	            hayvan.setMuayneSon(resultSet.getDate("muayneSon"));
	            hayvan.setDogum(resultSet.getDate("Dogum"));
	            hayvan.setMuayneEski(resultSet.getDate("muayneEski"));
	            hayvan.setFotograf(resultSet.getString("fotograf"));

	            kayitlist.add(hayvan);
	        }

	        return kayitlist;
	    }
}
