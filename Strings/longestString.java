package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class longestString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(longestSubString(s));
  }

  static int longestSubString(String s )
  {
    if(s==null || s.length() == 0) return 0;
    if(s.length() == 1) return 1;
    int length = 0;
    int currentIndex = 0;
    Map<Character,Integer> hash = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      if(hash.containsKey(ch))
      {
        if(currentIndex <= hash.get(ch))
        {
          currentIndex = hash.get(ch)+1;
        }
      }

      length = Math.max(length, i-currentIndex+1);
      hash.put(ch, currentIndex);
    }
    return length;
  }
}
