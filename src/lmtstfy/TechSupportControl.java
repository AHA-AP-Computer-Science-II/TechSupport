package lmtstfy;

import javafx.application.Application;
import javafx.stage.Stage;

public class TechSupportControl extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		TechSupport techSupport = new TechSupport();
		techSupport.run(stage);
		
	}
	
}
