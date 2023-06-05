package application;

public class giris {
private int id;
private String nick;
private String pass;

public giris() {

}
public giris(int id, String nick,String pass) {

}
public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNick() {
	return nick;
}

public void setNick(String nick) {
	this.nick = nick;
}

}
