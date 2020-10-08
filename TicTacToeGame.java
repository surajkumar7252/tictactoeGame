import java.util.Scanner;

public class TicTacToeGame {

	public static final char[] Board= new char[10];
	
	public static void board(){
	
	     for(int index=0;index<10;index++){
		      Board[index]=' ';
	         }
	
   	}

	public static void main(String[] args) {
	    board();
		
		
	}
}
