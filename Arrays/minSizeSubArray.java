package Arrays;

import java.util.Scanner;

public class minSizeSubArray {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    System.out.println(minSubArrayLen(target, arr));

  }
  public static int minSubArrayLen(int target, int[] nums) {

    int preSum[] = new int[nums.length+1];
    preSum[0] = 0;
    for(int i=0;i<nums.length;i++)
    {
        preSum[i+1] = preSum[i]+nums[i];
    }

    int start = 0,min = 0;
    for(int i=0;i<preSum.length;i++)
    {
            while(preSum[i] - preSum[start] >= target)
            {
                min = Math.min(min,i-start);
                start++;
            }
    }
    return min;

}
}
