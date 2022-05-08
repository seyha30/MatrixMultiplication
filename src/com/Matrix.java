package com;

import java.util.Random;
public class Matrix {

	public static int [][]generateManualMatrix(int rows,int columns) {
		int[][] result = new int[rows][columns];
		return result;
	}
	public static int[][] generateMatrix(int rows, int columns) {
		int[][] result = new int[rows][columns];
		Random random = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = random.nextInt(100) * 10;

			}
		}

		// returning output.
		return result;
	}

	// to print the matrix
	public static void print(int[][] matrix) {

		System.out.println();

		int rows = matrix.length;
		int columns = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
