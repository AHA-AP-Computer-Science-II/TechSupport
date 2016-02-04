package lmtstfy;

import java.util.Optional;

import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class TechSupport{

	private String problem = "";
	WebView browser;
	WebEngine engine;
	TextInputDialog dialog;
	
	public TechSupport() {
		browser = new WebView();
		engine = browser.getEngine();
		dialog = new TextInputDialog();
		
		dialog.setTitle("Tech Support");
		dialog.setHeaderText("How may I help you?");
		dialog.setContentText("Problem: ");
	}
	
	public void run(Stage stage) throws Exception {
		
		stage.setTitle("Tech Support");
		
		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();

		if (result.isPresent()){
			problem = result.get();
		}
		
		replaceAll();
		
		engine.load("http://lmgtfy.com/?q=" + problem + "windows 7 troubleshoot" + "&l=1");
		
		Scene scene = new Scene(browser);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void replaceAll() {
		problem = problem.replace("^", "%5E");
		problem = problem.replace("?", "%3F");
		problem = problem.replace("#", "%23");
		problem = problem.replace("@", "%40");
		problem = problem.replace("$", "%24");
		problem = problem.replace("&", "%26");
		problem = problem.replace("+", "%2B");
		problem = problem.replace("=", "%3D");
		problem = problem.replace(":", "%3A");
		problem = problem.replace(";", "%3B");
		problem = problem.replace("\"", "%22");
	}

}
