
package Arrays;
import java.util.Scanner;
import java.util.Arrays;

class main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(subSum(arr,target)));
        
    }
    
    static int[] subSum(int arr[],int target)
    {
        int left = 0, right = 0;
        int sum = 0;
        while(right < arr.length)
        {
          if(sum == target)
          {
              return new int[]{left+1,right+1};
          }
          else if(sum >= target)
          {
              sum -= arr[left++];
              right++;
          }
          else{
            right++;
          }
            sum += arr[right];

        }
        
        return new int[]{-1,-1};
    }
    
}