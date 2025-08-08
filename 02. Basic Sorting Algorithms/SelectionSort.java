public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        System.out.println("Original Array : ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}