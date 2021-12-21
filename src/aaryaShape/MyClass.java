package aaryaShape;

public class MyClass {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(5,5);
		Traingle tr = new Traingle(4,2);
		Square sq = new Square(4,4);
		
		//rec.set_value(5, 5);
		//tr.set_value(5, 5);
		//sq.set_value(5, 5);
		
		//System.out.println(rec.CalculateArea());
		//System.out.println(tr.CalculateArea());
		//System.out.println(sq.CalculateArea());
		
		
		rec.CalculateArea();
		tr.CalculateArea();
		sq.CalculateArea();
		
		
		

	}

}
