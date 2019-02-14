package problem03;
import java.lang.Math;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (this.width*this.height)/2;
	}

	@Override
	public double getPerimeter() {
		double Hypotenuse;
		Hypotenuse = (this.width*this.width)+(this.height*this.height); // 빗변
		
		return this.width+this.height+Math.sqrt(Hypotenuse);
	}
}
