package poly;

public class Circle extends Shapes {

	@Override
	//this area has been overriden -> how can u check ? here we applied the common sense
	//just write @Override above the method -> if error comes -> not overriden , if not then overriden
	void area() {
		System.out.println("Area of cicle");
	}
	
	//so it will override the parent method 
	
}
