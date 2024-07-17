/*
 * Margaret Wade
 * 
 * Date File Created: 05/17/2022
 * Date Last Edited: 05/17/2022
 * 
 * BattleshipApplication is a recreation of the game Battleship 
 * in JavaFX for skill building and practice with no commercial purpose.
 */

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * The class BattleshipApplication extends the class Application. This class contains 
 * the start method and creates the stage that the player will see and use to interface 
 * with the game. Inside the start method, an instance of the IntroPane is added 
 * to the Scene and subsequently displayed on the Stage.
 *
 */
public class BattleshipApplication extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			// Create a window for the main view
			MainPane root = new MainPane();
			Scene scene = new Scene(root, 1000, 600);
			primaryStage.setScene(scene);
			
			primaryStage.show();

		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}//start
	
	public static void main(String[] args) 
	{
		launch(args);
	}//main
}//BattleshipApplication
