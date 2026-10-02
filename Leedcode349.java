import java.util.HashSet;
import java.util.Scanner;

public class Leedcode349 {
    public static void main(String[] args) {
        System.out.println("well come to the array : ");
        Scanner input = new Scanner(System.in);
         System.out.print("enter the number of array 1 : ");
        int num = input.nextInt();
        int arr[] = new int[num];
        System.out.print("enter the array 1 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("enter the number of an nums : ");
        int num1 = input.nextInt();
        int nums[] = new int[num1];
        System.out.print("enter the array : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.print("first array is : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.print("second array is : ");
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
        int solve[] = s(arr,nums);
        System.out.print("solution is : ");
        for(int ele : solve){
            System.out.print(ele + " ");
        }
    }
    public static int[] s(int[]arr,int[]nums){
      HashSet<Integer>set = new HashSet<>();
       HashSet<Integer>result = new HashSet<>();
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
       }
       for(int j=0;j<nums.length;j++){
        if(set.contains(nums[j])){
            result.add(nums[j]);
        }
       }
       int n=0; int ans[] = new int[result.size()];
       for(int ele :result){
        ans[n++] = ele ;
       }
          return ans ;
    }
}
