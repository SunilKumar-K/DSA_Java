
package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isomorphicStrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(isIsomorphic(s1, s2));
  }

      public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            if( !map.containsKey(s.charAt(i)) ){
                if( map.containsValue(t.charAt(i)) ){
                    return false;
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }else{
                if( map.get(s.charAt(i)) != t.charAt(i) ){
                    return false;
                }
            }
        }
        return true;

    }
  
}
