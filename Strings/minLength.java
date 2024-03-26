package Strings;

import java.util.Scanner;

public class minLength {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(minimumLength(s));
  }

  public static int minimumLength(String s) {
    int start = 0, end = s.length()-1;

    if(s.length() ==  1) return 1;
    if(s.charAt(start)!= s.charAt(end)) return s.length()-1;


    while(start < end && s.charAt(start) == s.charAt(end))
    {
        String st = s.substring(start, start+1);
        String en = s.substring(end-1,end);
        int i = start+1;
        int j = end-1;
        while(st.startsWith(s.substring(i,i+1)))
        {
            i++;
            start = i;
        }
        while(st.startsWith(s.substring(j-1,j)))
        {
            j--;
            end = j;
        }

        if(st == en)
        {
            start++;
            end--;
        }
    }
    return end - start + 1;
}
  
}
