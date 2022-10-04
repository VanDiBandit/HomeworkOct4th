package CodeAlong;

import java.util.Arrays;

public class Notes2DArray {
    //2D arrays are dimensional
    public static void main(String[] args) {
        //build tic tac toe game with 2D array
        //2D array gets 2 square brackets
        //initialize array with 2 square brackets
        char[][] board = new char[3][3];
        //fill array
        for (int i = 0; i < 3; i++) {
            //another for loop
            for (int j = 0; j < 3; j++) {
                //fill your board
                //with the dash we filled the board with dashes
                board[i][j] = '-';
            }
        }
        //in line create array
        //this board is the same as the one above
        //the only difference is that we have default values instead
        //of nested loop
        char[][] board2 = new char[][]{
                //create default values
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'},
                new char[]{'O', '-', '-'},
        };

        //setting the board up to look like tic tac toe board
        //putting values at index positions
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        //because the array is 2D we have to put deep infront of toString
        //pass the board
        System.out.println(Arrays.deepToString(board));
        //print board 2, comes out same way as first board
        System.out.println(Arrays.deepToString(board2));
    }
}