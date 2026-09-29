import java.util.Scanner;

public class Leedcode28{
    public static void main(String[] args) {
        System.out.println("well come to the string : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first string : ");
        String name = input.next();
        System.out.print("enter the second string : ");
        String name1 = input.next();
               int solve = solve(name,name1);
               System.out.print("solution is : " + solve);
        }
        public static int solve(String name,String name1){
            for(int i=0;i<name.length()-name1.length();i++){
                int j;
                for(j=0;j<name1.length();j++){
                    if(name.charAt(j+i)!=name1.charAt(j))  return j;
                }
                if(j==name1.length()) return i;
            }
            return -1;
        }
        }