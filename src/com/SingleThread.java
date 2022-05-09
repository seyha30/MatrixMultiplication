package com;

import java.util.Date;
import java.util.Scanner;

public class SingleThread {

	public static void main(String[] args) {

		Date start = new Date();
		int[][] matrix1 = null;
		int[][] matrix2 = null;

//		int[][] result = multiply(matrix1, matrix2);
//		Date end = new Date();
//		System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));
		boolean loopBreaker = true;
		int choice;
		Scanner in = new Scanner(System.in);
		while (loopBreaker) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter menu :");
			System.out.println("1 : Create Matrix");
			System.out.println("2 : Auto Generate Matrix");
			System.out.println("3 : Multiply Matrix");
			System.out.println("4 : Exit");
			choice = (int) scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number of row");
				int r = in.nextInt();
				System.out.println("Enter number of col");
				int c = in.nextInt();
				matrix1 = Matrix.generateMatrix(r, c);
				break;
			case 2:
				System.out.println("Enter number of row");
				int r1 = in.nextInt();
				System.out.println("Enter number of col");
				int c1 = in.nextInt();
				matrix2 = Matrix.generateMatrix(r1, c1);
				break;
			case 3:
				System.out.println("Multiplier");
			    Matrix.print(Matrix.multiply(matrix1, matrix2));
				break;
			case 4:
				loopBreaker = false;
				break;

			default:
				System.out.println("Incorrect input");
				loopBreaker = false;
				break;
			}
		}
	}

}
