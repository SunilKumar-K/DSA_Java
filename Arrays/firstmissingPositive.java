package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class firstmissingPositive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println(firstMissingPositive(arr));
    System.out.println(firstMissingPositive1(arr));
    sc.close();
  }

  static int firstMissingPositive1(int[] arr)
  {
    boolean found[] = new boolean[arr.length+1];
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>0 && arr[i]<= arr.length)
      {
        found[arr[i]] = true;
      }
    }
    for(int i = 1 ;i<found.length;i++)
    {
      if(!found[i])
      {
        return i;
      }
    }
    return found.length;
  }

  static int firstMissingPositive(int[] arr)
  {
    int pos[] = segregate(arr);

    for(int i =0 ;i< pos.length;i++)
    {
      int x = Math.abs(pos[i]);
      if(x-1 < pos.length && pos[x-1] > 0)
      {
        pos[x-1] = -pos[x-1];
      }
    }

    for(int i=0;i<pos.length;i++)
    {
      if(pos[i] > 0)
      {
        return i+1;
      }
    }

    return pos.length+1;
  }

  static int[] segregate(int arr[])
  {
    int j=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i] < 0)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    return Arrays.copyOfRange(arr,j,arr.length);
  }
}
