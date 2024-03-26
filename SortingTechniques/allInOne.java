package SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class allInOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("It is bubble sorting : " + Arrays.toString(bubbleSort(arr)));
        System.out.println("It is selection sorting : " + Arrays.toString(selectionSort(arr)));
        System.out.println("It is insertion sorting : "+ Arrays.toString(insertionSort(arr)) );
        System.out.println("It is mergeSorting : " + Arrays.toString(mergeSorting(arr)));
    }



    private static int[] mergeSorting(int[] arr) {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int first[] = mergeSorting(Arrays.copyOfRange(arr, 0, mid));
        int second[] = mergeSorting(Arrays.copyOfRange(arr,mid,arr.length ));
        return merge(first,second);
    }



    private static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length+second.length];

        int i = 0,j=0,k=0;

        while(i<first.length && j<second.length)
        {
            if(first[i]>second[j])
            {
                mix[k++] = second[j++];
            }
            else {
                mix[k++] = first[i++];
            }
        }
        while(i<first.length)
        {
            mix[k++] = first[i++];
        }
        while(j<second.length)
        {
            mix[k++] = second[j++];
        }
        return mix;
    }



    private static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }
        return arr;
    }

    private static int[] selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++)
        {
            int min = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    private static int [] bubbleSort(int[] arr) {

        for(int i =0 ;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
