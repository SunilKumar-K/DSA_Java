package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class maximumlength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    System.out.println(characterReplacement(s,k));
  }

  public static int characterReplacement(String s, int k) {
    int start = 0;
    int maxLen = 0;
    int maxFre = 0;
    HashMap<Character,Integer> hash = new HashMap<>();

    for(int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        maxFre = Math.max(hash.get(ch), maxFre);

        // Check if the window size minus the maximum frequency is greater than k.
        // If so, move the window start to shrink the window.
        if (i - start + 1 - maxFre > k) {
            char leftChar = s.charAt(start);
            hash.put(leftChar, hash.get(leftChar) - 1);
            start++;
        }

        // Update maxLen with the maximum length of valid substring found so far.
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
}
