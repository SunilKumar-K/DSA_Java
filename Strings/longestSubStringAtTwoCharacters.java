package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestSubStringAtTwoCharacters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    System.out.println(lengthOfLongestSubstringTwoDistinct(s));
  }
  public static int lengthOfLongestSubstringTwoDistinct(String s)
  {
    if(s.length()<2) return 0;
    int start = 0;
    Map<Character,Integer> map = new HashMap<>();
    int count = 0;

    for(int i=0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);
      if(map.size()>=2)
      {
        count = Math.max(count,i-start+1);
        int val = map.get(start);
        if(val == 1)
        {
          map.remove(s.charAt(start));
        }
        else{
          map.put(s.charAt(start),val-1);
        }
        start++;
      }
    }

    return count;
  }
}
