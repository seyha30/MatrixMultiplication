package com;

import java.util.Date;
public class SingleThread {

	public static void main(String[] args) {

		Date start = new Date();

		int[][] matrix1 = MatrixGeneratorUtil.generateMatrix(3000, 3000);
		int[][] matrix2 = MatrixGeneratorUtil.generateMatrix(3000, 3000);

		int[][] result = multiply(matrix1, matrix2);
		Date end = new Date();
		System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));

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
}
