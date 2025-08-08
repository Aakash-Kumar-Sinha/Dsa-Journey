public class Largest {
    public static int getLargest(int[] nums) {
        int largest = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,8,9,13,5,7,1,6};
        System.out.println(getLargest(nums));
    }
}