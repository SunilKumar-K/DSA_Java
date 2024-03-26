package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class anagram {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String p = sc.nextLine();
    List<Integer> list = findAnagrams(s, p);
    for(int i : list)
    {
      System.out.println(i + " ");
    }
  }
  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    if(p.length() > s.length())
    {
        return list;
    }

    Map<Character,Integer> hash = new HashMap<>();
    Map<Character,Integer> phash = new HashMap<>();

    for(int i=0;i<p.length();i++)
    {
        char ch = p.charAt(i);
        phash.put(ch,phash.getOrDefault(ch,0)+1);
    }

    for(int i=0;i<p.length();i++)
    {
      hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i), 0)+1);
    }

    if(hash.equals(phash)){
      list.add(0);
    }
    for(int i = 0;i<s.length()-p.length();i++)
    {
      char st = s.charAt(i);
      int val = hash.get(st);
      if(val == 1 )
      {
        hash.remove(st);
      }
      else{
        hash.getOrDefault(st,val-1);
      }

      hash.put(s.charAt(i+p.length()),hash.getOrDefault(s.charAt(i)+p.length(), 0)+1);

      if(hash.equals(phash))
      {
        list.add(i+1);
      }
    }
    return list;
}
}
