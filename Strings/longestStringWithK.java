package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestStringWithK {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    System.out.println(longestSubstring(s, k));
  }
  public static int longestSubstring(String s, int k) {
    if (s.length() < k) return 0;
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    int max = s.length(); // Initialize to the length of the entire string
    for (int i = 0; i < s.length(); i++) {
        char st = s.charAt(i);
        if (map.get(st) < k) {
            int left = longestSubstring(s.substring(0, i), k);
            int right = longestSubstring(s.substring(i + 1), k);
            return Math.max(left, right);
        }
    }

    return max;
}
}
