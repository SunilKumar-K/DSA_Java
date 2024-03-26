package dp;

import java.util.Arrays;
import java.util.Scanner;

public class lcs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
  }

  System.out.println(Arrays.toString(lcs(arr,n)));
}

static int[] lcs(int[] arr, int n) {
int[] length = new int[n];
Arrays.fill(length, 1);
for(int i = 0; i < length.length; i++)
{
  for(int j = 0; j < i; j++)
  {
    if(arr[j] <=arr[i])
    {
      length[i]= Math.max(length[i],length[i]+length[j]);
    }
  }
}
return length;
}
}