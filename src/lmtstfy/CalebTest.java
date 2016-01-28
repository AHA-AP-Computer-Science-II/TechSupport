package lmtstfy;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
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
		
		WebView browser = new WebView();
		WebEngine engine = browser.getEngine();
		
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Tech Support");
		dialog.setHeaderText("How may I help you?");
		dialog.setContentText("Problem: ");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		String problem = "";
		if (result.isPresent()){
			problem = result.get();
		}
		
		engine.load("http://www.google.com/webhp?#q=" + problem +" windows 7 my computer won't start"
				+ "troubleshoot" + "&btnI=I");
		Scene scene = new Scene(browser);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
}