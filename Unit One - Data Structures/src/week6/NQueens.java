package week6;

import java.util.Stack;
import week6.Queen;

public class NQueens {
  public static void main(String[] args) {
    solveNQueens(4);
  }

  private static Stack<Queen> solveNQueens(int n) {
    Stack<Queen> goodQueens = new Stack<Queen>();
    int numFilled = 0;
    Queen q = new Queen(1, 1);
    goodQueens.push(q);
    numFilled++;

    int col = 0;
    while (numFilled != n) {
      int row = numFilled + 1;
      col++; // change this because it will not always be 1 fi we are shifting the queen t the right it will be col + 1
      if (!conflict(new Queen(row, col), goodQueens)) {
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
