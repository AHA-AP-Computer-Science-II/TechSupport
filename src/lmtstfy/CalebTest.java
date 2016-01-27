package lmtstfy;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.TextInputDialog;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class CalebTest extends Application {
	public static void main(String[]args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Tech Support");
		
		Group root = new Group();
		WebView browser = new WebView();
		WebEngine engine = browser.getEngine();
		
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Tech Support (give it a minute)");
		dialog.setHeaderText("How may I help you?");
		dialog.setContentText("Enter your problem: ");

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();
		String problem = result.get();
		replaceAll(problem);
		
		engine.load("http://www.google.com/");
//		engine.load("http://lmgtfy.com/?q="+problem+"&l=1");
		
	}
	public static void replaceAll(String problem){
		replace(problem, ' ',"+");
		replace(problem, '\'',"%27");
		replace(problem, '%',"%25");
		replace(problem, '^',"%5E");
		replace(problem, '?',"%3F");
		replace(problem, '#',"%23");
		replace(problem, '&',"%26");
		replace(problem, '@',"%40");
		replace(problem, '$',"%24");
		replace(problem, '+',"%2B");
		replace(problem, '=',"%3D");
		replace(problem, ':',"%3A");
		replace(problem, ';',"%3B");
	}
	public static void replace(String problem, char c, String key){
		for(int i = 0; i < problem.length() ; i++){
			if(problem.charAt(i) == c)
				problem = problem.substring(0, i) + key + problem.substring(i+1);
		}
	}
}

