package lmtstfy;

import java.util.Scanner;

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

		Scanner scan = new Scanner(System.in);
		
		stage.setTitle("Tech Support");
		
		Group root = new Group();
		WebView browser = new WebView();
		WebEngine engine = browser.getEngine();
		
		System.out.print("Enter your problem: ");
		String problem = scan.nextLine();
		
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