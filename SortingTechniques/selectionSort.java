
package SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    
    Sort(arr,n);

}

static void Sort(int arr[], int n)
{
    for(int i=0;i<arr.length-1;i++)
    {
        int min = i;
        for(int j=i+1;j<arr.length;j++)
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
    System.out.println(Arrays.toString(arr));
}
}
