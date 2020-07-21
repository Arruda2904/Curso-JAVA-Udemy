package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Type the number of lines:");
		int m = sc.nextInt();
		System.out.print("Type the number of columns:");
		int n = sc.nextInt();
		int[][]matrix = new int[m][n];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println("Type the corresponding number to the " +(i+1)+"º line and " +(j+1)+ "º column:");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Type the number you want to find:");
		int x = sc.nextInt();
		
		for(int i=1;i<=matrix.length;i++) { //matrix.length número de linhas de matrix
			for(int j=1;j<=matrix[i].length;j++) {//matrix[i] mostra númerod de colunas daquela linha em i
				if(matrix[i][j]==x) {
					System.out.println("Position"+i+","+j);
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
