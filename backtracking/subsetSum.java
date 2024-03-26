package backtracking;

import java.util.Scanner;

public class subsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(subsetSum(arr,sum,n));
    }

    static  boolean subsetSum(int arr[],int sum, int n)
    {
        if(sum == 0) return true;
        if(n == 0) return false;
        if(arr[n-1] > sum) return subsetSum(arr,sum,n-1);

        return subsetSum(arr, sum, n-1)||subsetSum(arr, sum-arr[n-1], n-1);
    }
}
