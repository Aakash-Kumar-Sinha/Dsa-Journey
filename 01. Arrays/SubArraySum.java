public class SubArraySum {
    public static void maxSubArray(int[] arr) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += arr[k];
                } System.out.println(currSum);
                // if(currSum > maxSum) {
                // maxSum = currSum;
                // }
                maxSum = Math.max(currSum, maxSum);
            } System.out.println();
        }
        System.out.println("Maximum SubArray Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSubArray(arr);
    }
}