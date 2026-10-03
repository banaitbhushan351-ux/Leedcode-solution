import java.util.Scanner;

public class Leedcode443 {
    public static void main(String[] args) {
        System.out.println("enter the string array : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the String array number : ");
        int num = input.nextInt();
        char ch []= new char[num];
        System.out.print("enter the char array : ");
        for(int i=0;i<ch.length;i++){
            ch[i] = input.next().charAt(0);
        }
        System.out.print("array is ; ");
        for(char ele : ch){
            System.out.print(ele + " ");
        }
        int nums = arrlength(ch);
        System.out.print("solution is : " + nums);
    }
    public static int arrlength(char arr[]){
        int i=0;int a=0;
        while(i<arr.length){
            char ch = arr[i];
            int fre =0;
            while(i<arr.length && ch==arr[i]){
                fre++; i++;
            }
            arr[a] = ch ;
            a++;
            if(fre>1){
                String str = String.valueOf(fre);
                for(int j=0;j<str.length();j++){
                    arr[a] = str.charAt(j);
                    a++;
                }
            }
        }
        return a;
    }
}
