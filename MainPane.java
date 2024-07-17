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

import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

public class MainPane extends BorderPane {
	
	//IntroPane
	private BorderPane introPane;
	
	//Title
	private Label title;
	
	//Center UI Buttons
	private VBox centerButtonsVBox;
	
	private Button onePlayerButton;
	private Button twoPlayerButton;
	private Button optionsButton;
	private Button creditsButton;
	
	//madeByLabel
	private Label madeByLabel;
	
	/*
	 * The layout of IntroPane is defined in the constructor. IntroPane extends
	 * the class BorderPane and contains the title of the game and four buttons.
	 * The buttons are start one-player game, start two-player game, go to the options
	 * page, and go to the credits page.
	 */
	
	public MainPane()
	{
		//Set up Layout
		introPane = new BorderPane();
		
		title = new Label("Battleship");
		
		introPane.setAlignment(title, Pos.CENTER);
		introPane.setMargin(title, new Insets(100, 10, 10, 10));
	
		onePlayerButton = new Button("Start One-Player Game");
		twoPlayerButton = new Button("Start Two-Player Game");
		optionsButton = new Button("Options");
		creditsButton = new Button("Credits");
		
		centerButtonsVBox = new VBox(onePlayerButton, twoPlayerButton, optionsButton, creditsButton);
		centerButtonsVBox.setAlignment(Pos.CENTER);
		centerButtonsVBox.setSpacing(10);
		
		madeByLabel = new Label("Made by Margaret Wade");
		introPane.setAlignment(madeByLabel, Pos.CENTER);
		introPane.setMargin(madeByLabel, new Insets(10, 10, 25, 10));
		
		introPane.setTop(title);
		introPane.setCenter(centerButtonsVBox);
		introPane.setBottom(madeByLabel);
		
		this.setCenter(introPane);
		
		//Set up Style
		this.setStyle("-fx-background-color: cadetblue");
		introPane.setStyle("-fx-background-color: cadetblue");
		title.setStyle("-fx-font: 80px 'Segoe UI Semibold';");
		onePlayerButton.setStyle("-fx-background-color: whitesmoke;" +
				"-fx-font: 20px 'Segoe UI Semibold';");
		twoPlayerButton.setStyle("-fx-background-color: whitesmoke;" +
				"-fx-font: 20px 'Segoe UI Semibold';");
		optionsButton.setStyle("-fx-background-color: whitesmoke;" +
				"-fx-font: 20px 'Segoe UI Semibold';");
		creditsButton.setStyle("-fx-background-color: whitesmoke;" +
				"-fx-font: 20px 'Segoe UI Semibold';");
		madeByLabel.setStyle("-fx-font: 20px 'Segoe UI Semibold';");
		
		
		//Bind buttons with their Handlers
		onePlayerButton.setOnAction(new OnePlayerButtonHandler());
		twoPlayerButton.setOnAction(new TwoPlayerButtonHandler());
		optionsButton.setOnAction(new OptionsButtonHandler());
		creditsButton.setOnAction(new CreditsButtonHandler());
		
	}//MainPane()
	
	public void updateCurrentPane(BorderPane currentPane)
	{
		this.setCenter(currentPane);
	}
	
	public class OnePlayerButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			updateCurrentPane(new OnePlayerPane());
		}//handle
		
	}//OnePlayerButtonHandler()
	
	public class TwoPlayerButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			
		}//handle
		
	}//TwoPlayerButtonHandler()
	
	public class OptionsButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			
		}//handle
		
	}//OptionsButtonHandler()
	
	public class CreditsButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			
		}//handle
		
	}//CreditsButtonHandler()

}//MainPane
