package learning;

public class TicTacToe {

    char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '}};


    public void printGameBoard(){
        for (int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j< gameBoard[i].length; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }




}