package application;

public class ara {
private int id;
private String ad,familya,tur,ozelturu,saglikdurumu;

ara(){}



 ara(int id, String ad, String familya, String tur, String ozelturu, String saglikdurumu) {
	super();
	this.id = id;
	this.ad = ad;
	this.familya = familya;
	this.tur = tur;
	this.ozelturu = ozelturu;
	this.saglikdurumu = saglikdurumu;
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
public String getFamilya() {
	return familya;
}
public void setFamilya(String familya) {
	this.familya = familya;
}
public String getTur() {
	return tur;
}
public void setTur(String tur) {
	this.tur = tur;
}
public String getOzelturu() {
	return ozelturu;
}
public void setOzelturu(String ozelturu) {
	this.ozelturu = ozelturu;
}


public String getSaglikdurumu() {
	return saglikdurumu;
}


public void setSaglikdurumu(String saglikdurumu) {
	this.saglikdurumu = saglikdurumu;
}

}

