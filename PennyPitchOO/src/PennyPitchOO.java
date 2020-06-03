/*
* Assignment Name: [Penny Pitch Program OO style]
* Author: [Shaiza Hashmi]
* Date: [Tuesday, October 2nd 2018]
* Class Name: [PennyPitchOO]
* Description: [This program is based off of a carnival game where a user launches pennies onto a board.
*              If the pennies land on top of a prize, (which is in a randomly generated position),
*              the user wins that prize. This class contains the main method, a.k.a the starting point
*              in the program.]
*/
public class PennyPitchOO {

    M_Prizes plot = new M_Prizes(); //object instantiation of Model class which is M_Prizes



    public static void main(String args[]){                 //main method of the program, this is where the program begins being read
        PennyPitchOO start = new PennyPitchOO();            //Instantiating a method from same class
        start.Run();                                        //calling a simple method from another, in order to bypass 'static' type hindrance
    }

    public void Run() {
        //subclass M_Prizes calls all methods developed in superclasses that it extends
        //execution of the program is completed through here
        plot.createBoard();     //fills array with single square braces
        plot.spawnPos();        //generates the positions for all the 10 pennies
        plot.generateBall();    /***************************************/
        plot.generateDoll();    //  These generate the Prize positions,*/
        plot.generatePoster();  //  and check if they're overlapping   */
        plot.generatePuzzle();  //  with any penny positions           */
        plot.generateGame();    /**************************************/
        plot.displayBoard();    //Displays final rendition of the board with all pennies pitched and prizes visible
        plot.displayWins();     //Displays in the console which prizes the users have won


    }
}

