package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicatesContains {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();

    System.out.println(containsDuplicate(arr,k));
  }

  static boolean containsDuplicate(int[] nums, int k)
  {
            if(nums == null || k<= 0 || nums.length <= 1) return false;

        Set<Integer> set = new HashSet<>();

        for(int i =0;i<nums.length;i++)
        {

            if(set.contains(nums[i])){
              if(i > k)
              {

              }
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         if(Math.abs(map.get(nums[i])-i) <= k)
        //         {
        //             return true;
        //         }
        //         map.put(nums[i], i);
        //     }

        //     else{
        //         map.put(nums[i],i);
        //     }
        // }
        // return false;
  }
}
