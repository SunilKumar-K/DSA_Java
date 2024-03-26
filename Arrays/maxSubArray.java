package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class maxSubArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];

    for(int i=0;i<n;i++)
    {
      nums[i] = sc.nextInt();
    }
    int k = sc.nextInt();

    System.out.println(Arrays.toString(getAverages(nums, k)));
  }

   public static long maxSlidingWindow(int[] nums, int k) {
        long maxSum = 0;
        int sum = 0;
        Map<Integer , Integer> map = new HashMap<>();
        int j = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(i+1-j == k)
            {
                if(map.size() == k)
                {
                    maxSum = Math.max(maxSum,sum);
                }
                sum -= nums[j];
                int val = map.get(nums[i]);
                if(val == 1)
                {
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i],val-1);
                }
                j++;
            }
        }

        return maxSum;
    }

    public static int[] getAverages(int[] nums, int k) {
        if(nums.length == 1 && k == 0) return nums;

        if(k>nums.length)
        {
            Arrays.fill(nums, -1);
            return nums;
        }

        int res[] = new int[nums.length];
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            res[i] = -1;
        }
        for(int i= nums.length-k;i<nums.length;i++)
        {
            res[i] = -1;
        }

        for(int i=0;i<2*k+1;i++)
        {
            sum += nums[i];
        }

        for(int i = k;i<nums.length-k;i++)
        {
            res[i] = sum/(2*k+1);
            sum -= nums[i-k];
            if (i + k + 1 < nums.length) {
                sum += nums[i + k + 1];
            }
        }

        return res;
    }

}
