package Strings;

import java.util.Scanner;

class url{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(urlify(s));
  }

  static  String urlify(String s){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) ==' '){
        sb.append("%20");
      }
      else{
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  
}

}