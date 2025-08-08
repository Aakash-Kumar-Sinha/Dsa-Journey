public class KadMaxSubArraySum {
    public static void kadanes(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 6, -1, 3};
        kadanes(nums);
    }
}