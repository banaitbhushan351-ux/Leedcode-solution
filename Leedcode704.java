import java.util.Scanner;

public class Leedcode704 {
    public static void main(String[] args) {
        System.out.println("well come to the array: ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of array : ");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.print("enter the array : ");
        for(int i=0 ; i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("array is ; ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.print("enter the targate ; ");
        int targate =  input.nextInt();
        int answer = solve(arr,targate);
        System.out.print("solution is ; " + answer);
    }
    public static int solve(int arr[],int targate){
        for(int i = 0 ;i<arr.length;i++){
            if(targate==arr[i])  return i ;
        }
        return -1 ;
    }
}
