package application;

import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

/*
 * TwoPlayerPane is a BorderPane that allows the user to play
 * a two-player version of Battleship. The two boards are
 * separated horizontally with a barrier blocking the view
 * of the opponent's board when it is not their turn. A
 * "Start Turn?" screen is shown before each turn to prevent
 * players from seeing their opponent's board.
 */

public class OnePlayerPane extends BorderPane{
	
	//GridPane that holds the two game boards
	private GridPane boards;
	
	//Game board GridPanes
	private GridPane player1Board;
	private GridPane player1OpponentBoard;
	private GridPane player2Board;
	private GridPane player2OpponentBoard;
	
	

}//OnePlayerPane
