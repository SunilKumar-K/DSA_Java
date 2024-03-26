

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {

  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }

    twoSum(arr, target);
  }

  static void twoSum(int arr[], int target)
  {
    int sum = 0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]+arr[j] == target)
        {
          System.out.println(arr[i]+1+" "+ (int) arr[j]+1);
        }
      }
      
    }

  }
  
}
