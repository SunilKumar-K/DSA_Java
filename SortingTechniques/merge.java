package SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        arr = mergeSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  static int[] mergeSorting(int arr[])
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length/2;
        int left[] = Arrays.copyOfRange(arr,0,mid);
        int right[] = Arrays.copyOfRange(arr,mid,arr.length);
        return merging(left,right);
    }

    public  static  int[] merging(int left[] , int right[])
    {
        int arr[] = new int[left.length+right.length];
        int m = left.length, n = right.length;
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(left[i] < right[j])
            {
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while (i<m){
            arr[k++] = left[i++];
        }
        while (j<n)
        {
            arr[k++] = right[j++];
        }
        return arr;
    }
}
