package com.ajp_day1;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize two 2x2 matrices
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultMatrix = new int[2][2];  // To store the result of multiplication

        // Input for first matrix
        System.out.println("Enter elements for the first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("\nEnter elements for the second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication logic
        // Result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j]
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        }

        // Display the result matrix
        System.out.println("\nResult of matrix multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
