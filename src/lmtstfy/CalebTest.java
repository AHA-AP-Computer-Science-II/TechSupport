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
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("How may I help you?");
		dialog.setContentText("Please enter your name:");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()){
		    System.out.println("Your name: " + result.get());
		}
		
		String problem = "";
		
		for (int i = 0; i < problem.length(); i++) {
			if (problem.charAt(i) == ' ') {
				problem = problem.substring(0, i) + "+" + problem.substring(i + 1);
			}
			
			if (problem.charAt(i) == '\'') {
				problem = problem.substring(0, i) + "%27" + problem.substring(i + 1);
			}
		}
		
		engine.load("http://lmgtfy.com/?q=" + problem + "&l=1");
		Scene scene = new Scene(browser);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
}