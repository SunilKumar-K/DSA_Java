
package usaco.prefix_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class oneDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }

    //System.out.println(Arrays.toString(prefixSum(arr)));
    System.out.println(maxSubSum(arr));
  }

  static int[] prefixSum(int[] arr)
  {
    int preSum[] = new int[arr.length+1];
    for(int i=0;i<arr.length;i++)
    {
      preSum[i+1] = preSum[i]+arr[i];
    }
    return preSum;
  }

  static int maxSubSum(int[] arr)
  {
    int maxSubSum = arr[0];
    int minSubSum = 0;
    int runningSum = 0;
    for(int i : arr)
    {
      runningSum += i;
      maxSubSum = Math.max(maxSubSum, runningSum-minSubSum);
      minSubSum = Math.min(runningSum, minSubSum);
    }
    return maxSubSum;
  }
}