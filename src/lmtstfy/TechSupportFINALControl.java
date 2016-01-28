package lmtstfy;

import javafx.application.Application;
import javafx.stage.Stage;

public class TechSupportFINALControl extends Application {

	public static void main(String[] args) {
		launch(args);
		
//		String test = "what";
//		System.out.println(test);
//		test = test.replace('w', 't');
//		System.out.println(test);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		TechSupportFINAL techSupport = new TechSupportFINAL();
		techSupport.run(stage);
		
	}
	
}
