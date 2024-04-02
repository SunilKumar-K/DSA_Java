package Strings;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class atmostKCharacters {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    System.out.println(atMostKCharacters(s, 2)-atMostKCharacters(s, 1));
  }

  public static int atMostKCharacters(String s, int k)
    {
      Map<Character,Integer> map = new HashMap<Character,Integer>();
      int maxLen = 0;
      int startChar = 0;
      for(int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);

        while(map.size()>2)
        {
          char st = s.charAt(startChar);
          map.put(st, map.getOrDefault(st, 0)-1);
          if(map.get(st) == 0)
          {
            map.remove(st);
          }
          startChar++;
        }

        maxLen += i-startChar+1;
    }

    return maxLen;
  }
}
