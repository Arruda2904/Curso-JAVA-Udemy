package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the path to the file:");
		String path = sc.nextLine();
		System.out.print("Type the salary:");
		Double salary = sc.nextDouble();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line=br.readLine();
			}
			
			List<String> emails = list.stream() // list to stream
					.filter(x -> x.getSalary() > salary) // filtra a list pra ficar só com quem recebe mais que salary
					.map(x -> x.getEmail()) // pega email de todos que ainda estão na lista
					.sorted() // ordena em ordem alfabética
					.collect(Collectors.toList()); // stream to list
			
			System.out.println("Emails for people whose salary is more than:"+salary);
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getEmail().toUpperCase().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of the salary of people whoe name starts with 'M':"+sum);
			
		}catch(IOException e) {
			System.out.println("Error"+e.getMessage());
		}
		
		
		
		sc.close();
	}
}
