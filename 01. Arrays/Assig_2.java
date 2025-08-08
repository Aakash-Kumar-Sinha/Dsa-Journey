public class Assig_2 {
    public static int searchInArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == target) {
                return mid;
            } else if(mid > target) {

            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchInArray(nums, target));
    }
}