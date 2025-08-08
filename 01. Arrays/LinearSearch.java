public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,8,9,3,5,7,1,6};
        int key = 9;
        System.out.println("Key is at index : " + linearSearch(arr, key));
    }
}