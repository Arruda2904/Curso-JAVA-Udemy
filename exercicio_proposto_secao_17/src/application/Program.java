package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<Product> list = new ArrayList<>(); //lista com os produtos que vao ser escritos noa arquivo summary.csv
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
				
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //cria pasta "out" no diretorio informado
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //string com path pro arquivo summary
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCSV = br.readLine();
			while(itemCSV != null) {
				String[] fields = itemCSV.split(","); //itens estao separados por virgula
				String name = fields[0];              //entao pega eles separados aqui
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCSV = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for(Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
				}
				
				System.out.println(targetFileStr + "CREATED!");
			}catch(IOException e) {
				System.out.println("Error writing file:"+e.getMessage());
			}
			
		}catch(IOException e) {
			System.out.println("Error reading file:"+e.getMessage());
		}
				
		sc.close();
	}

}
