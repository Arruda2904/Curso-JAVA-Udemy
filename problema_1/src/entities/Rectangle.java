package entities;

public class Rectangle {
	
	public double heigth;//altura
	public double width;//largura
	
	public double Area() {
		return heigth * width;
	}
	
	public double Perimeter() {
		return 2*(heigth + width);
	}
	
	public double Diagonal() {
		return Math.sqrt(heigth*heigth + width*width);
	}
	
}
