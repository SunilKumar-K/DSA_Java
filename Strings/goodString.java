package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class goodString {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    System.out.println(countGoodSubstrings(s));
  }   
  
  
  
  public static int countGoodSubstrings(String s) {
        Map<Character,Integer> hash = new HashMap<>();
        if(s.length() < 3) return 0;

        int j = 0,count = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);

            while(i+1-j == 3)
            {
                if(hash.size() == 3)
                {
                    count++;
                }

                char st = s.charAt(j);
                int val = hash.get(st);
                if(val == 1)
                {
                    hash.remove(st);
                }
                else{
                    hash.put(st,hash.getOrDefault(st,--val));
                }
                j++;
            }
        }

        return count;
    }
  
}
