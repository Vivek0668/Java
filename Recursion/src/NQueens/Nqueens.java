package NQueens;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println( queens(board, 0));

    }

    static int queens(boolean[][] board, int row) {
        if(row == board.length) {

            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)) {
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }

            
        }

        return count;

    }

    static boolean isSafe(boolean[][] board, int row , int col) {

        //vertical search
        for (int i = 0; i < row; i++) {
            if (board[i][col] == true) {
                return false;
            }

        }
        //diagonal left
        int max_left = Math.min(row,col);
        for (int i = 0; i <= max_left ; i++) {
            if(board[row-i][col-i] == true) {
                return false;
            }

        }

        int max_Right = Math.min(row,board.length-col-1) ;
            for (int i = 0; i <= max_Right; i++) {
                if(board[row-i][col+i] == true) {
                    return false;
                }

            }

        return true;


    }
    static  void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean num : row) {
                if(num) {
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }

    }


}
