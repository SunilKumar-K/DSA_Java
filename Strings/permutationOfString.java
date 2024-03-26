package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutationOfString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    System.out.println(permutationOfString(s));
  }

  static List<String> permutationOfString(String s)
  {
    List<String> list = new ArrayList<>();

    if(s == null) return null;
    if(s.length() == 0 )
    {
      return list;
    }
    return list;
  }
}
