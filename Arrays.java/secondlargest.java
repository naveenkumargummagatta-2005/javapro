import java.util.*;

class secondlargest {

    public static int secondLargestElement(int[] nums) {
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            }
            else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }

        if (secondMax == 0) {
            return -1;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = secondLargestElement(arr);
        System.out.println(result);
    }
}
