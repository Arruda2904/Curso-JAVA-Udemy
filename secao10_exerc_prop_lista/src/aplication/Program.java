package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); //criando a lista
		
		//------------reading data--------------
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Employee #"+i+":");
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			list.add(new Employee(id,name,salary));
		}
		
		
		//------------updating data --------------
		
		
		Employee emp = null;
		
		while(emp == null) {
			System.out.println();
			System.out.print("Enter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);//varrendo lista até achar primeiro
																				  //nó com id compatível
				if(emp==null) {
					System.out.println("This id does not exist!");
				}
		
		}
	
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		//-------------listing data--------------
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj:list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}