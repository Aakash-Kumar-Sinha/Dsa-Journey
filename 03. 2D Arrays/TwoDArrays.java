import java.util.Scanner;
public class TwoDArrays {
    public static void search(int[][] matrix, int key) {
        boolean found = false;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found key at index : (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("Key does not exist..!");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int key = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your matrix : ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            } System.out.println();
        }

        search(matrix, key);
    }
}