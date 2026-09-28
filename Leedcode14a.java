import java.util.Scanner;

public class Leedcode14a {
    public static void main(String[] args) {
        System.out.println("well come to the string : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of an String array : ");
        int num = input.nextInt();
        String  str[] = new String[num];
        for(int i=0;i<num ;i++){
            str[i] = input.next();
        }
        System.out.print("string array is : ");
        for(String  ele : str){
            System.out.print(ele + " ");
        }
        String  solve = solve(str);
        System.out.print("solution is : " + solve);
    }
    public static String solve (String str[]){
        String solution = "";
        String s = str[0];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=1;j<str.length;j++){
                if(i>=str[j].length()  || ch!=str[j].charAt(i))   return solution ;
            }
            solution +=ch ;
        }
        return solution ;
    }
}
