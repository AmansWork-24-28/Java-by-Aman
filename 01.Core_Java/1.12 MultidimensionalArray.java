import java.util.Scanner;

class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D Array of size 5x4
        int[][] arr = new int[5][4];

        // Input
        System.out.println("Enter 20 elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print
        System.out.println("\nArray Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array of size 3x3x3
        int[][][] arr3D = new int[3][3][3];

        sc.close();
    }
}