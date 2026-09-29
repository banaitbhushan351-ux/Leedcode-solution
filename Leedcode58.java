import java.util.Scanner;

public class Leedcode58 {
    public static void main(String[] args) {
        System.out.println("well come to the string : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string : ");
        String name = input.nextLine();
        int solve = lengthOfLastWord(name);
        System.out.print("solution is : " + solve);
    }
    public static  int lengthOfLastWord(String s){
        int num =0;
        for(int i= s.length()-1;i>=0;i--){
           String arr[] = s.split("\\s+");
           num = arr[arr.length-1].length();
        }
        return num ;
    }
}
