package com.bridgelabz.assignment8.LineComp;

/**
 * @author mayoor
 * 
 */
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comaparison program..!" + "\n");

//		coordinates for the first line
		int x1 = 0;
		int x2 = 5;
		int y1 = 0;
		int y2 = 5;
//		coordinates for the second line
		int x3 = 0;
		int x4 = 6;
		int y3 = 0;
		int y4 = 6;
//		calculating length of both lines
		Double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		Double length2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
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
//		double to string for implementing CompareTo method

		String lgth1 = Double.toString(length1);
		String lgth2 = Double.toString(length2);

//		using compareTo method

		int a = lgth1.compareTo(lgth2);

		if (a < 0) {
			System.out.println("\nFirst line is shorter than second line");
		}
		if (a == 0) {
			System.out.println("\nFirst line is of same length as second line");
		}
		if (a > 0) {
			System.out.println("\nFirst line is longer than second line");
		}
	}
}