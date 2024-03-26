
package cfa;

import java.util.Arrays;
import java.util.Scanner;

public class productArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }

    System.out.println(Arrays.toString(productArray(arr)));
  }

  static int[] productArray(int arr[])
  {
    int product = 1;
    int prod[] = new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
      product *= arr[i];
    }

    for(int i=0;i<arr.length;i++)
    {
      prod[i] = product/arr[i];
    }

    return prod;
  }
}