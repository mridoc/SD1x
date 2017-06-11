package whackamole;

import java.util.Random;
import java.util.Scanner;

public class WhackAMole {
    int score = 0;
    int molesLeft = 0;
    int attemptsLeft;
    char[][] moleGrid;
    
    WhackAMole(int numAttempts, int gridDimension) {
        moleGrid = new char[gridDimension][gridDimension];
        for (int i = gridDimension-1;  i >= 0; i--) {
            for (int j = gridDimension-1; j >= 0; j--) {
                

                moleGrid[i][j] = '*';
            }
        }
        this.attemptsLeft = numAttempts;
        
    }
    
    boolean place (int x, int y) {
        if (moleGrid[x][y] == '*') {
            moleGrid[x][y] = 'M';
            this.molesLeft++;
            return true;
        }          
        return false;
    }
    
    void whack (int x, int y) {
        if (moleGrid[x][y] == 'M') {
            this.score ++;
            this.attemptsLeft--;
            this.molesLeft--;
            moleGrid[x][y] = 'W';
        } else {
        this.attemptsLeft--;
        }
    }
    
    void printGridToUser () {
        for (int i = 0; i < moleGrid.length; i++ ) {
            for (int j = 0; j < moleGrid.length; j++) {
                if (moleGrid[i][j] == 'M'){
                    System.out.print('*');
                    continue;
                } else {
                    System.out.print(moleGrid[i][j]);
                }
                if ( j == 9){
                    System.out.println("\r\n");
                }
            }
        }
    }
    
    void printGrid () {
        
        for (int i = 0; i < moleGrid.length; i++ ) {
            for (int j = 0; j < moleGrid.length; j++) {
                
                System.out.print(moleGrid[i][j]);
                if ( j == 9){
                    System.out.println("\r\n");
                }
            }
        }
        //System.out.println(moleGrid);
    }
    
    public static void main (String[] args ) {
        WhackAMole grid = new WhackAMole(50, 10);
        Random rn = new Random();
        for (int i = 10; i > 0; i--){
            if (grid.place(rn.nextInt(9), rn.nextInt(9))) {
                continue;
            }
            i = i+1;
        }
        //grid.molesLeft = 10;
        
        while (grid.attemptsLeft != 0 || grid.molesLeft != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have " + grid.attemptsLeft + " attempts. Enter coordinates between 0 and 9 separated by comma: ");
            String coordinate = scanner.nextLine();
            //scanner.close();
            String[] parts = coordinate.split(",");
            String x = parts[0];
            String y = parts[1];
            int x1 = Integer.parseInt(x);
            int y1 = Integer.parseInt(y);
            if (x1 == -1 && y1 == -1) {
                break;
            }
            grid.whack(x1, y1);
            grid.printGridToUser();
            //System.out.println(grid.attemptsLeft + grid.score);
            System.out.println("attempts left: " + grid.attemptsLeft + " score:  " + grid.score + " moles left: " + grid.molesLeft);
        }
        
        grid.printGrid();
        
        

        
    }

}
