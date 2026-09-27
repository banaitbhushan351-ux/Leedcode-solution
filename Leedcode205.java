import java.util.HashMap;
import java.util.Scanner;

public class Leedcode205 {
    public static void main(String[] args) {
        System.out.println("well come to the string : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string : ");
        String name = input.next();
        System.out.print("enter the next string : ");
        String name1 = input.next();
        boolean ans = ans (name,name1);
        System.out.print("solution is : " + ans  );
    }
    public static boolean ans(String name,String name1){
        HashMap<Character,Character>map = new HashMap<>();
        HashMap<Character,Character>map1 = new HashMap<>();
        char ch = 0; char ch1 = 0 ;
        for(int i=0;i<name.length();i++) {
            ch = name.charAt(i);
            ch1 = name1.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) != ch1) {
                    return false;
                }
            }
            else {
                map.put(ch, ch1);
            }
                ch = name.charAt(i);
                ch1 = name1.charAt(i);
                if (map1.containsKey(ch1)) {
                    if (map1.get(ch1) != ch) {
                        return false ;
                    }
                }
                else{
                    map1.put(ch1,ch);
                }
        }
        return true;
    }
}
