package com;

import java.util.Random;

public class Matrix {

	public static int[][] generateManualMatrix(int rows, int columns) {
		int[][] result = new int[rows][columns];
		return result;
	}

	public static int[][] generateMatrix(int rows, int columns) {
		int[][] result = new int[rows][columns];
		Random random = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = random.nextInt(3) + 1;
			}
		}

		// returning output.
		return result;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int resultRows = matrix1.length;
		int resultColumns = matrix2[0].length;
		int[][] result = new int[resultRows][resultColumns];
		int columns2 = matrix2[0].length;
		for (int i = 0; i < resultRows; i++) {
			for (int j = 0; j < columns2; j++) {
				result[i][j] = 0;
				for (int k = 0; k < resultColumns; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

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
