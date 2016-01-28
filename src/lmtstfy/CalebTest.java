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
		
		replaceAll(problem);
		
		engine.load("http://lmgtfy.com/?q=" + problem + "&l=1");
		
		Scene scene = new Scene(browser);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void replaceAll(String problem) {
		replace(problem, '^',"%5E");
		replace(problem, '?',"%3F");
		replace(problem, '#',"%23");
		replace(problem, '@',"%40");
		replace(problem, '$',"%24");
		replace(problem, '&',"%26");
		replace(problem, '+',"%2B");
		replace(problem, '=',"%3D");
		replace(problem, ':',"%3A");
		replace(problem, ';',"%3B");
		replace(problem, '"',"%22");
		
//		problem = problem.replace("^", "%5E");
//		problem = problem.replace("?", "%3F");
//		problem = problem.replace("#", "%23");
//		problem = problem.replace("@", "%40");
//		problem = problem.replace("$", "%24");
//		problem = problem.replace("&", "%26");
//		problem = problem.replace("+", "%2B");
//		problem = problem.replace("=", "%3D");
//		problem = problem.replace(":", "%3A");
//		problem = problem.replace(";", "%3B");
//		problem = problem.replace("\"", "%22");

		/* ^ -- %5E
		 * ? -- %3F
		 * # -- %23 ???
		 * @ -- %40
		 * $ -- %24
		 * & -- %26 ???
		 * + -- %2B ???
		 * = -- %3D ???
		 * : -- %3A ???
		 * ; -- %3B ???
		 * " -- %22 ???
		 */
	}
	
	public static void replace(String problem, char c, String replace) {
	
		for (int i = 0; i < problem.length(); i++) {
			if (problem.charAt(i) == c) {
				problem = problem.substring(0, i) + replace + problem.substring(i + 1);
				System.out.println("replace condition is true");
			}
		}
		
	}
	
}