package dp;

import java.util.Arrays;
import java.util.Scanner;

public class maximumWays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println(maximumWays(arr,n));
  }

  static int maximumWays(int[][] arr,int n) {

    int dp[][] = new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i == 0 || j == 0)
        {
          dp[i][j] = 1;
        }
        else{
        dp[i][j] = dp[i-1][j]+dp[i][j-1];
        }
      }
    }

    return dp[n-1][n-1];
}
}
