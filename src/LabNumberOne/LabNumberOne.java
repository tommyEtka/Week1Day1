package LabNumberOne;

import java.util.Scanner;

public class LabNumberOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float length, width, height, area, perimeter, volume =0.0f;
		// refactoring - just reworked the code to pull the primitive types
		
		Scanner scan = new Scanner(System.in);
		
		String select = "y";
		
		while(select.equalsIgnoreCase ("y")){
			
			
		System.out.println("Enter the Length:");
		length = scan.nextInt();
		
		System.out.println("Enter the Width:");
		width = scan.nextInt();
		
		System.out.println("Enter the Height:");
		height = scan.nextInt();
		
		System.out.println("Area:");
		area = length * width;
		System.out.println(area);
		
		System.out.println("Perimeter");
		perimeter = 2 * length + 2 * width;
		System.out.println(perimeter);
		
		System.out.println("Volume:");
		volume = length * width * height;
		System.out.println(volume);
		
	
	
	System.out.println("Continue? (y/n):");
	select = scan.next();
	System.out.println();
	
	}
	scan.close();	
		
	}
	
}
	

	


