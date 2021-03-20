package week6;

import java.util.Scanner;
import java.util.Stack;
import week6.Queen;

public class NQueens {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the amount of Queens on the board");
    int n = Integer.parseInt(in.nextLine());
    printIt(solveNQueens(n), n);
    in.close();
  }
/**
 * in the method printIt I first create a board and place the Queens on th eboard by taking the Queens from the stacks and then we fill all the null spots with * and at last we print the board
 * @param solveNQueens
 * @param n
 */
  private static void printIt(Stack<Queen> solveNQueens, int n) {
    String p;
    String [][] board = new String [n][n];
    for (int k = 0; k<n; k++){

      Queen q = solveNQueens.peek();
      int a = q.getRow()-1;
      int b = q.getCol()-1;
      board [a][b] = "Q";
      solveNQueens.pop();
    
    }
    for (int j = 0; j<n; j++){
      for (int h = 0; h<n; h++){
        if (board[j][h]==null)
          board [j][h] = "*";

      }
    }
    for (int y = 0; y<n; y++){
      System.out.println();
      for (int x = 0; x<n; x++){
        p = board[y][x];
        System.out.print(p+" ");
      }
    }
  }

  /**
   * In method solveNQueens we place the Queens in the stack
   * @param n
   * @return
   */
  private static Stack<Queen> solveNQueens(int n) {
    Stack<Queen> goodQueens = new Stack<Queen>();
    int numFilled = 0;
    Queen q = new Queen(1, 1);
    goodQueens.push(q);
    numFilled++;

    int col = 0;
    while (numFilled != n) {
      int row = numFilled + 1;
      col++;
      if (!conflict(new Queen(row, col), goodQueens)&&(col<=n)) {
        goodQueens.push(new Queen(row, col));
        numFilled++;
        col = 0;
      } else {
        if (col + 1 > n) {
           q = goodQueens.pop();
           col = q.getCol();
            numFilled--;
        }
    }
  }
  return goodQueens;
}
  /**
   * the conflict method checks if two queens have a conflict by checking if two or more queens are above one another, beside one another, or have the same slope as each other. If the queens have a conflict the method will pop a queen and start everything again in the solvedNQueens method.
   * @param queen
   * @param goodQueens
   * @return
   */
  private static boolean conflict(Queen queen, Stack<Queen> goodQueens) {
    Stack<Queen> temp = new Stack<Queen>();

    while(!goodQueens.isEmpty()){
      Queen q = goodQueens.peek();

      if (q.getCol() == queen.getCol() || q.getRow() == queen.getRow()
          || (Math.abs(q.getCol() - queen.getCol()) == Math.abs(q.getRow() - queen.getRow()))) {
        while (!temp.isEmpty())
          goodQueens.push(temp.pop());
        return true;
      }else{
        temp.push(goodQueens.pop());
      }
    }
    while (!temp.isEmpty())
    goodQueens.push(temp.pop());
    return false;  
  }
}
