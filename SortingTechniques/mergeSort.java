package SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sort[] = mergeSort(arr);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length ==  1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left , right);
    }

    private static int[] merge(int[] left, int[] right) {

        int i=0,j=0,k = 0;
        int mix[] = new int[left.length+right.length];
        while(i < left.length && j < right.length)
        {
            if(left[i]<right[j])
            {
                mix[k++] = left[i++];
            }
            else{
                mix[k++] = right[j++];
            }
            
        }

        while(i<left.length)
        {
            mix[k++] = left[i++];
        }
        while (j<right.length) {
            mix[k++] = right[j++];
        }

        return mix;

    }
}
