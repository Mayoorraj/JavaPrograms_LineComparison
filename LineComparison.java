package com.bridgelabz.assignment8.LineComp;

/**
 * @author mayoor calculating length of the line
 */
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comaparison program..!" + "\n");

		int x1 = 16;
		int x2 = 7;
		int y1 = 4;
		int y2 = 9;

		Double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Co-ordintes of a point are: " + x1 + ", " + y1 + "\nCo-ordinates for another point are: "
				+ x2 + ", " + y2 + "\n" + "\nLength of the line is : " + length);
	}
}