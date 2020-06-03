/*
* Assignment Name: [Penny Pitch Program OO style]
* Author: [Shaiza Hashmi]
* Date: [Tuesday, October 2nd 2018]
* Class Name: [C_Pennies]
* Description: [alskjgarghawth}
*/
public class C_Pennies extends V_Board{
    boolean pennies[][] = new boolean[6][6];    //array used to avoid overlapping of random generation for penny positions

    public C_Pennies(){
        //default constructor
    }

    public void spawnPos(){ //method that randomly generates the positions for the pennies
        for(int i = 0; i <=9; i++){
            posX = random.nextInt(5);
            posY = random.nextInt(5);
            while(pennies[posX][posY] == true){   //loop checking for overlapping positions
                posX = random.nextInt(5);
                posY = random.nextInt(5);
            }
            board[posX][posY] = "[[      ]] ";
            pennies[posX][posY] = true;
        }
    }

}
