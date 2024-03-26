package math;

import java.util.Scanner;

public class perfect {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(perfectNumber(n));
 } 

 static int perfectNumber(int n)
 {
  int number = 0;
  if(n <= 0){
    return 0;
  }
  else {
     number = 10 * n + 10 - n;
  }
  return number;
 }
}
