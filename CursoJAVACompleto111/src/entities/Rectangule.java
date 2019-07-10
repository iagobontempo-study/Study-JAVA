package entities;

public class Rectangule extends Shape {

	private double width;
	private double height;
	
	public Rectangule() {
		
	}

	public Rectangule(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
	
	
}
