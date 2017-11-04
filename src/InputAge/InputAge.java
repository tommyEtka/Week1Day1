package InputAge;

import java.util.Scanner;

public class InputAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//byte Age;
		
		Scanner scan1 = new Scanner(System.in);
		
		//Age = scan1.nextByte();
		
		//System.out.println(Age);
		
		
		int x;
		int y;
		
		System.out.println("Please enter x");
		x = scan1.nextInt();
		
		System.out.println("Please enter y");
		y = scan1.nextInt();
		
		
		int result = x + y;
		System.out.println("Result");
		System.out.println(result);
		
		scan1.close();
		
		
		
	}

}
