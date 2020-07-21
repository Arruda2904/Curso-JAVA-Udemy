package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();  //para fazer flush no enter que entrou do nextInt
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?"); 
		char answer = sc.next().charAt(0);
		if(answer == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(name,number,initialDeposit);//conta criada com deposito inicial
		}
		else {
			account = new Account(name,number);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		sc.close();
	}

}
