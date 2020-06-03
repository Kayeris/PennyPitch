import java.util.Random;
/*
* Assignment Name: [Penny Pitch Program OO style]
* Author: [Shaiza Hashmi]
* Date: [Tuesday, October 2nd 2018]
* Class Name: [V_Board]
* Description: [This class is the View portion of the MVC model. This class creates the game board
*               and contains the statements to be printed stating the prizes the user has won.]
*/
public class V_Board {
    public String board[][] = new String[6][6];
    Random random = new Random();           // Variable to invoke the random number generator

    public int posX;        //variable for randomized x position for prizes
    public int posY;        //variable for random y values for prize positions

    //variables that act as a counter as to how many prizes of each type are won.
    public int gameVal;
    public int ballVal;
    public int puzzleVal;
    public int posterVal;
    public int dollVal;

    public V_Board(){
        //default constructor
    }

    public void createBoard() { //method that fills Board array with square brackets [] to indicate board space
        for(int row = 0; row <= 4; row++){
            for(int col =  0; col <= 4; col++){
                board[row][col] = "[        ] ";
            }
        }
    }

    public void displayBoard(){
        //displays in the console the array being used for the board.
        System.out.println(board[0][0] + board[1][0] + board[2][0] + board[3][0] + board[4][0] + "\n" +
                           board[0][1] + board[1][1] + board[2][1] + board[3][1] + board[4][1] + "\n" +
                           board[0][2] + board[1][2] + board[2][2] + board[3][2] + board[4][2] + "\n" +
                           board[0][3] + board[1][3] + board[2][3] + board[3][3] + board[4][3] + "\n" +
                           board[0][4] + board[1][4] + board[2][4] + board[3][4] + board[4][4] + "\n" );
    }

    public void displayWins(){
        //displays in the console the prizes user has won.
        System.out.println("You have won " + ballVal + " Balls");
        System.out.println("You have won " + gameVal + " Games");
        System.out.println("You have won " + puzzleVal + " Puzzles");
        System.out.println("You have won " + posterVal + " Posters");
        System.out.println("You have won " + dollVal + " Dolls");

    }
}
