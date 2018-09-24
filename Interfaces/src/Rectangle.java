
public class Rectangle implements Shape {
	private double l;
	private double b;
   
	public Rectangle(double l,double b) {this.l=l;this.b=b;}
	@Override
	public double area() {
		
		return l*b;
	}

}
