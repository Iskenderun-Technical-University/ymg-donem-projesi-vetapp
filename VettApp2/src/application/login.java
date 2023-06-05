package application;

public class login {
private int id;
private String nick;
private String pass;


login() {

}
login(int ido,String nicko,String passo)
{
	
	this.id=ido;
	this.nick=nicko;
	this.pass=passo;
	
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
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
