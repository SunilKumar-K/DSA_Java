package recursion;

import java.util.Scanner;

public class knapSack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int weights[] = new int[n];
    int profits[] = new int[n];
    for(int i=0;i<n;i++)
    {
      weights[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      profits[j] = sc.nextInt();
    }

    int bagWeight = sc.nextInt();

    System.out.println(knapSack1(weights,profits,bagWeight,n));
  }

  static int dp[][];
  public static int knapSack1(int[] weights,int[] profits,int bagWeight,int n)
  {

    dp = new int[n+1][bagWeight+1];
    for(int i=0;i<dp.length;i++)
    {
      for(int j=0;j<dp[0].length;j++)
      {
        if(i==0||j==0)
        {
          dp[i][j] = 0;
        }
        else if(weights[i]>bagWeight){
           dp[i][j] = dp[i-1][j]; 
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j],profits[i]+dp[i-1][j-weights[i]]);
        }
      }
    }

    return dp[dp.length][dp[0].length];
  }


  static int knapSack(int[] weights,int[] profits,int bagWeight, int n)
  {
    if(bagWeight < 0 || n < 0)
    {
      return 0;
    }
    if(weights[n] > bagWeight)
    {
      return knapSack(weights, profits, bagWeight, n-1);
    }
    else
    {
      return Math.max(knapSack(weights, profits, bagWeight, n-1),profits[n]+knapSack(weights, profits, bagWeight-weights[n], n-1));
    }
  }
}
