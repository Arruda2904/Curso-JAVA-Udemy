package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static final double PI = 3.14159; //final quer dizer que é constante

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // pode chamar a classe Calculadora com o metodo,em vez de um objeto com os metodos
		double v = Calculator.volume(radius);//pq calculadora é estatica
		
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",PI);
		
		sc.close();
	}

}
