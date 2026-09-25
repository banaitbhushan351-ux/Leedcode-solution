import java.util.Arrays;
import java.util.Scanner;

public class Leedcode1512 {
    public static void main(String[] args) {
        System.out.print("well come to the numbers : ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of array : ");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.print("enter the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       int solution =  solution(arr);
        System.out.print("solution is : " + solution(arr));
    }
    public static int solution(int arr[]){
        int ans = 0 ;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans ++ ;
                }
            }
        }
        return ans ;
    }
}
