package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Product product = new Product();
		System.out.println("Enter Product Data:");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		//System.out.println(product.name + "," + product.price + "," + product.quantity);
		System.out.println(product);
		
		System.out.println("Entre com o numero de produtos para adicionar");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println(product);
		
		System.out.println("Entre com o numero de produtos para retirar");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println(product);
		
		
		sc.close();
	}

}
