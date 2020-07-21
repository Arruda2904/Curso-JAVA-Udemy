package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth:");
		rectangle.heigth = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.println("Area = " + rectangle.Area());
		System.out.println("Perimeter = " + rectangle.Perimeter());
		System.out.println("Diagonal = " + rectangle.Diagonal());
		
		sc.close();
	}

}
