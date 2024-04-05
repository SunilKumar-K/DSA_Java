package Strings;

public class makeGood {
    public static void main(String[] args) {
      System.out.print(makeGood("leEeetcode"));
    }
    
    static String makeGood(String s)
    {
        int i = 0;
        int j = 1;
        String res = "";
        while(j < s.length())
        {
            String left = s.substring(i,i+1);
            String right = s.substring(j,j+1);
            if(left.equals(right.toUpperCase()) || left.equals(right.toLowerCase()))
            {
                if( i == 0)
                {
                    s = s.substring(j,s.length());
                }
                else if(s.length() == 2){
                    return new String("");
                }
                else{
                    s = s.substring(0,i)+s.substring(j);
                }

                i = 0;
                j = 1;
                res  = "";
            }
            else{
                res += left + right;
                i++;
                j++;
            }
        }
        
        return res;
    }
  }
