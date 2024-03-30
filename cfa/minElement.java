package cfa;

import java.util.Scanner;

public class minElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }

    System.out.println(minElement(arr));

  }

  static int minElement(int arr[])
  {
    int start = 0;
    int end = arr.length;
    while(start <= end)
    {
      int mid = (start+end)/2;

      if( arr[mid-1] > arr[mid] && arr[mid]<arr[mid+1])
      {
        return arr[mid];
      }
      else if(arr[mid-1] > arr[mid])
      {
        end = mid - 1;
      }
      else {
        start = mid+1;
      }
    }
    return -1;
  }
}
