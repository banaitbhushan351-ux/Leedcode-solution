import java.util.Arrays;
import java.util.Scanner;

public class Leedcode976 {
    public static void main(String[] args) {
        System.out.println("well come to the array : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of array ; ");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.print("enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("array is : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        int solve = num(arr);
        System.out.print("solution is : " + solve);
    }
    public static int num (int arr[]){
      Arrays.sort(arr);
      int i=arr.length-1;  int num = 0 ;
      while(i>=2){
          int n = arr[i-2]+arr[i-1];
          if(n>arr[i]){
               num = n +arr[i];
               return num ;
          }
          i--;
      }
      return 0 ;
    }
}

