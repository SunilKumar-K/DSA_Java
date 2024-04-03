package Strings;
import java.util.Scanner;

public class wordSearch {

  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    char board[][] = new char[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        board[i][j] = sc.next().charAt(0);
      }
    }

    String word = sc.next();

    System.out.println(exist(board,word));
  }

private static boolean exist(char[][] board, String word) {
    for(int i=0;i<board.length;i++)
        for(int j=0;j<board[0].length;j++)
        {
            if(word.charAt(0) == board[i][j] && exist(board,word,i,j,0))
                return true;

        }

    return false;    
}

private static boolean exist(char board[][],String word, int i,int j,int pos)
{
    if(pos == word.length()) return true;
    if(i < 0 || j < 0 || i >= board.length || j>= board[0].length) return false;
    if(word.charAt(pos) != board[i][j]) return false;
    char temp = board[i][j];
    board[i][j] = '@';
    if(exist(board,word,i+1,j,pos+1)||
        exist(board,word,i-1,j,pos+1)||
        exist(board,word,i,j+1,pos+1)||
        exist(board,word,i,j-1,pos+1))
        return true;

    board[i][j] = temp;

    return false;    
}
  
}
