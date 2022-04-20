package com.bridgelabz.assignment8.LineComp;

/**
 * @author mayoor
 * 
 */
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comaparison program..!" + "\n");

//		coordinates for first line
		int x1 = 16;
		int x2 = 7;
		int y1 = 4;
		int y2 = 9;
//		coordinates for the second line
		int x3 = 4;
		int x4 = 13;
		int y3 = 6;
		int y4 = 2;
//		calculating length of both lines
		Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		Double length2 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
		System.out.println("Co-ordintes of a point for first line are: " + x1 + ", " + y1
				+ "\nCo-ordinates for another point of first line are: " + x3 + ", " + y3 + "\n"
				+ "\nLength of first line is : " + length1 + "\n" + "\nCo-ordintes of a point for second line are: "
				+ x1 + ", " + y1 + "\nCo-ordinates for another point of second line are: " + x4 + ", " + y4 + "\n"
				+ "\nLength of second line is : " + length2);

//		checking the equality of lines
		if (length1.equals(length2)) {
			System.out.println("\nboth lines are of equal Length..!");
		} else {
			System.out.println("\nboth lines are not of equal Length..!");
		}
	}
}