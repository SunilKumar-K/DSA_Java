package Arrays;

import java.util.Scanner;

public class subArrayCountMaxEleAtmostKtimes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }
    int k = scanner.nextInt();
    System.out.println(countSubarrays(nums, k));
  }

  public static long countSubarrays(int[] nums, int k) {
        
    int max = Integer.MIN_VALUE;

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i] >  max)
        {
            max = nums[i];
        }
    }
    int count = 0;
    int start = 0;
    int end = 0;
    long countSubarray = 0;
    while(end < nums.length)
    {
        if(nums[end] == max)
        {
            count++;
        }
        while(count >= k)
        {
            countSubarray += nums.length-end;
            if(nums[start] == max)
            {
                count--;
            }
            start++;
        }

        end++;
    }

    return countSubarray;
}
}
