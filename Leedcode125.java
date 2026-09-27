import java.util.Scanner;

public class Leedcode125{
    public static void main(String[] args) {
        System.out.print("well come to the string : ");
        Scanner input = new Scanner(System.in);
      System.out.print("enter the string : ");
      String name = input.nextLine();
      boolean result = solve(name);
      System.out.print("solution is : " + result); 
    }
    public static boolean solve (String name){
      StringBuilder ans = new StringBuilder();
     StringBuilder s  = new StringBuilder();
     for(int i=0;i<name.length();i++){
      char ch = name.charAt(i);
      if(Character.isLetterOrDigit(ch)){
          s.append(Character.toLowerCase(ch));
      }
     }
     s.reverse();
     for(int i=0;i<name.length();i++){
      char ch = name.charAt(i);
      if(Character.isLetterOrDigit(ch)){
        ans.append(Character.toLowerCase(ch));
      }
     }
     if(s.toString().equals(ans.toString())){
      return true;
     }
     return false ;
    
    }
}

