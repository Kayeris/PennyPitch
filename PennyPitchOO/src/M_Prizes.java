/*
* Assignment Name: [Penny Pitch Program OO style]
* Author: [Shaiza Hashmi]
* Date: [Tuesday, October 2nd 2018]
* Class Name: [M_Prizes]
* Description: [This class is the Model for the MVC. It generates the positions of the prizes
*               and compares these values to the board where pennies have been pitched.]
*/

public class M_Prizes extends C_Pennies{

    private boolean prizes[][] = new boolean[6][6]; //boolean array used to avoid overlapping of coordinate generation
    // The arrays ensure the fact that no prizes positions overlap and that there are 3 prizes of each type.
    private int doll[] = new int[2];
    private int ball[] = new int[2];
    private int poster[] = new int[2];
    private int puzzle[] = new int[2];
    private int game[] = new int[2];

    public M_Prizes(){
      //  default constructor
    }

    //The following methods generate and keep track of the prizes positions. All methods utilize the same logic.

    public void generateBall(){ //generate positions for the BALL prizes
        //Loop generating positions for all BALL prizes
        for(int i = 0; i <=ball.length; i++){
            posX = random.nextInt(5);           //randomly generate x index values for the position on the board
            posY = random.nextInt(5);           //randomly generate y index value for the position on the board
            while(prizes[posX][posY] == true) {         //looks through the boolean array and checks if the chosen space
                posX = random.nextInt(5);        // is already occupied by another prize or not. if it's occupied, it
                posY = random.nextInt(5);        // re-generates the random position.
            }
            if (board[posX][posY] == "[[      ]] ") {   //if penny is already placed there, inserts prize name into slot
                //showing penny is still there, counts this prize as one that has been won
                board[posX][posY] = "[[ BALL ]] ";
                ballVal++;                              //counter keeping track of how many prizes of this type has been won
                System.out.println(ballVal);
            }
            else {
                board[posX][posY] = "[  BALL  ] ";  //no penny was originally there, so prize name is placed with no hindrance
            }
            prizes[posX][posY] = true;              //sets this area on the board as true, so it cannot be chose again
        }
    }
    //The logic and checks used in the above for loop for the ball prize is the same for the loops below as well,
    //simply the type of prize is switched through from ball to puzzle to poster to doll to game.
    //Each prize is in a separate method to maintain clarity


    public void generateDoll(){
        //Generate positions for DOLL prizes
        for(int i = 0; i <=2; i++){
            posX = random.nextInt(5);
            posY = random.nextInt(5);
            while(prizes[posX][posY] == true) {
                posX = random.nextInt(5);
                posY = random.nextInt(5);
            }
            if (board[posX][posY] == "[[      ]] ") {
                board[posX][posY] = "[[ DOLL ]] ";
                dollVal++;

            } else {
                board[posX][posY] = "[  DOLL  ] ";
            }
            prizes[posX][posY] = true;
        }
    }

    public void generatePoster(){
        //Loop generating positions for all POSTER prizes
        for(int i = 0; i <=2; i++){
            posX = random.nextInt(5);
            posY = random.nextInt(5);
            while(prizes[posX][posY] == true) {
                posX = random.nextInt(5);
                posY = random.nextInt(5);
            }
            if (board[posX][posY] == "[[      ]] ") {
                board[posX][posY] = "[[POSTER]] ";
                posterVal++;
            } else {
                board[posX][posY] = "[ POSTER ] ";
            }
            prizes[posX][posY] = true;
        }
    }

    public void generatePuzzle(){
        //Loop generating positions for all PUZZLE prizes
        for(int i = 0; i <=2; i++){
            posX = random.nextInt(5);
            posY = random.nextInt(5);
            while(prizes[posX][posY] == true) {
                posX = random.nextInt(5);
                posY = random.nextInt(5);
            }
            if (board[posX][posY] == "[[      ]] ") {
                board[posX][posY] = "[[PUZZLE]] ";
                puzzleVal++;
            } else {
                board[posX][posY] = "[ PUZZLE ] ";
            }
            prizes[posX][posY] = true;
        }
    }

    public void generateGame(){
        //loop generating all GAME prize positions
        for(int i = 0; i <=2; i++){
            posX = random.nextInt(5);
            posY = random.nextInt(5);
            while(prizes[posX][posY] == true) {
                posX = random.nextInt(5);
                posY = random.nextInt(5);
            }
            if (board[posX][posY] == "[[      ]] ") {
                board[posX][posY] = "[[ GAME ]] ";

                gameVal++;
            } else {
                board[posX][posY] = "[  GAME  ] ";
            }
            prizes[posX][posY] = true;
        }
    }
}
