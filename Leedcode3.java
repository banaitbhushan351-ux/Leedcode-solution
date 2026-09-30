import org.xml.sax.SAXException;
import java.util.Scanner;
import java.util.HashSet;
public class Leedcode3{
    public static void main(String[] args) {
        System.out.println("well come to the string : ");
        Scanner input = new Scanner(System.in);   
        System.out.print("enter the string : ");
        String name  = input.next();
        int solve = longStringLength(name);
        System.out.print("solution is ; " + solve);
    }
    public static int longStringLength(String s){
        int max =0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(set.contains(ch)){
                   break;
                }
                set.add(ch);
                if(set.size()>max){
                    max = set.size();
                }
            }
        }
        return max;
    }
}