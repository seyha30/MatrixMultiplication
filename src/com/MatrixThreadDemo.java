package com;

import java.util.Date;
public class MatrixThreadDemo {

	public static void main(String[] args) {

		Date start = new Date();

//		int[][] matrix1 = Matrix.generateMatrix(10000, 10000);
//		int[][] matrix2 = Matrix.generateMatrix(10000, 10000);
//		int[][] matrix1 = Matrix.generateMatrix(1000, 1000);
//		int[][] matrix2 = Matrix.generateMatrix(1000, 1000);
		
		int[][] matrix1 = Matrix.generateMatrix(5000, 5000);
		int[][] matrix2 = Matrix.generateMatrix(5000, 5000);

		int[][] result = new int[matrix1.length][matrix2[0].length];
		ParallelThreadsCreator.multiply(matrix1, matrix2, result);

		Date end = new Date();
		System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));

	}

}
