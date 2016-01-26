package lmtstfy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class CalebTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle("Tech Support");
		
		Group root = new Group();
		WebView browser = new WebView();
		WebEngine engine = browser.getEngine();
		engine.load("http://www.google.com/");
		Scene scene = new Scene(browser);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
}