package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter currency;
		currency = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		currency.price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		currency.quantity = sc.nextDouble();
		
		double final_value = currency.converter();
		System.out.printf("Amount to be paid in reais = R$ %.2f",+final_value);
		sc.close();
	};

}
