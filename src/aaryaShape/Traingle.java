package aaryaShape;

public class Traingle extends Shape  {
	Traingle(int a,int b){
		height=a;
		width=b;
	}
	@Override
	void CalculateArea() {
	//public double CalculateArea() {
		//return(height * width)/2;
		System.out.println("Area is" + (height*width)/2);
	}

}
