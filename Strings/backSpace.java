
package Strings;

import java.util.Scanner;

public class backSpace {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String t = scanner.nextLine();
    System.out.println(backSpace(s,t));
  }

  static boolean backSpace(String s, String t) {
    int i = 0;
    while( i < s.length())
    {
        if(s.charAt(i) == '#')
        {
            if( i != 0)
            {
                s = s.substring(0,i-1) + s.substring(i+1);
                i--;
            }
            else{
                s = s.substring(i+1);
            }
        }
        else{
            i++;
        }
    }   

    int j = 0; 
    while( j < t.length())
    {
        if(t.charAt(j) == '#')
        {
            if( j != 0)
            {
                t = t.substring(0,j-1) + t.substring(j+1);
                j--;
            }
            else{
                t = t.substring(j+1);
            }
        }
        else{
         j++;
        }
    }

    return s.equals(t);
  }
  
}
