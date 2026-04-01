import java.util.*;
class twosum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = twoSum(arr, target);

if(result.length == 2){
    System.out.println("Indices: " + result[0] + " " + result[1]);
    System.out.println("Values: " + arr[result[0]] + " " + arr[result[1]]);
} else {
    System.out.println("Not found");
}


    }
    public static  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}