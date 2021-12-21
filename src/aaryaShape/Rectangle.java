package aaryaShape;
//Shape is base class and Rectangle /Triangle/Square is derived class

public class Rectangle extends Shape {
	Rectangle(int a , int b){
		height = a;
		width = b;
		}
	
	@Override
	void CalculateArea() {
	//public double CalculateArea() {
		//return(height * width);
		System.out.println("Area is" + height*width);
	}

}
