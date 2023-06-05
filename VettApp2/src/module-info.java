module VettApp {	

	requires transitive javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	requires transitive javafx.graphics;
	opens application to javafx.graphics, javafx.fxml;
	exports application;


}
