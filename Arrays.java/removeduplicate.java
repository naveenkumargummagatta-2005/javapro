import java.util.*;

class removeduplicate {

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = removeDuplicates(nums);

        System.out.println(result);
    }
}
