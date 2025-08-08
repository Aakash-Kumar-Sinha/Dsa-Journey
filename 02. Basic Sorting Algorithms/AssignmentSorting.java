public class AssignmentSorting {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        printArray(arr);
    }

    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = count.length-1; i >= 0; i--) {
            while(count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
        System.out.print("Bubble Sort:     ");
        bubbleSort(arr.clone());

        System.out.print("Selection Sort:     ");
        selectionSort(arr.clone());

        System.out.print("Insertion Sort:     ");
        insertionSort(arr.clone());

        System.out.print("Counting Sort:     ");
        countingSort(arr.clone());
    }
}