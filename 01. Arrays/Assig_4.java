public class Assig_4 {
    public static int trappedWater(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        left[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i], left[i-1]);
        }

        right[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i+1]);
        }

        int water = 0;
        for(int i = 0; i < height.length; i++) {
            water += Math.min(right[i], left[i]) - height[i];
        }

        return water;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water is : " + trappedWater(height));
    }
}