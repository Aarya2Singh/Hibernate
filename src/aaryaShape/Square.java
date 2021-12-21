package aaryaShape;

public class Square extends Shape {
	Square(int a,int b){
		height=a;
		width=b;
	}
	@Override
	void CalculateArea() {
	//public int CalculateArea() {
		//return height^2;
		System.out.println("Area is" +  (height*height));
	}

}
