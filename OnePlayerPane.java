package application;

import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

/*
 * OnePlayerPane is a BorderPane that allows the player to play
 * a single-player version of Battleship. The computer's board
 * has most information hidden from the player. Once one side
 * wins the game, the computer's board is revealed.
 */

public class OnePlayerPane extends BorderPane{
	
	//HBox that holds the two game boards
	private HBox boardsHBox;
	
	private GridPane playerBoard;
	private GridPane computerBoard;

}//OnePlayerPane
