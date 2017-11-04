package BonusOne;

import java.util.Scanner;

public class BonusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte testscore;
		// char grade;
		String choice = "y";

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a numerical grade: ");

		while (choice.equalsIgnoreCase("y")) {
			testscore = scan1.nextByte();

			{
				if (testscore >= 90) {
					// grade = 'A';
					System.out.println("A");
				} else if (testscore > 80) {
					// grade = 'B';
					System.out.println("B");
				} else if (testscore > 70) {
					// grade = 'C';
					System.out.println("C");
				} else if (testscore > 60) {
					// grade = 'D';
					System.out.println("D");
				} else
					System.out.println("F");
				// grade = 'F';

				// choice = scan1.next();
				// System.out.println(grade);

			}
		}
		scan1.close();

	}

}