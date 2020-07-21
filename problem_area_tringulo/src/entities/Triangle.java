package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {//nao recebe parametro pq os lados do triangulo ja sao da propria classe
		double p = (a + b + c)/2.0;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
}
}