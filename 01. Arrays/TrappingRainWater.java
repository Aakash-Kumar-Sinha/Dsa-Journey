public class TrappingRainWater {
    public static int calcTrappedWater(int[] height) {
        int n = height.length;
        int result = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];

        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        
        for(int j = n-2; j >= 0; j--) {
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }

        for(int k = 0; k < n; k++) {
            result += (Math.min(leftMax[k], rightMax[k])) - height[k];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total trapped rain water is : " + calcTrappedWater(height));
    }
}