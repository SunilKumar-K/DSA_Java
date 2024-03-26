package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class longestSubString {
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();

     System.out.println(lengthOfLongestSubstring(s));
  }
      public static int lengthOfLongestSubstring(String s) {
        
        if( s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Map<Character,Integer> hash = new HashMap<>();
        int length = 0;
        int curretIndex = 0;
        for(int i=0;i< s.length();i++)
        {
          char ch = s.charAt(i);
          if(hash.containsKey(ch))
          {
            if(curretIndex <= hash.get(ch))
            {
              curretIndex = hash.get(ch)+1;
            }
          }
            length = Math.max(length,i-curretIndex+1);
            hash.put(ch,curretIndex);
        }
        return length;

    }
}
