package practice;

public class Box {

    double l;
	double b;
	double w;
	
	Box(){
//		super();  //Every class is a subclass of the Object class.
		//super( ) always refers to the constructor in the closest superclass.
		this.l=-1;
		this.b=-1;
		this.w=-1;
	}
	
	//CUBE
	Box (double side) {
		this.l=side;
		this.b=side;
		this.w=side;
	}
	
	Box (double l, double b, double w){
		this.l=l;
		this.b=b;
		this.w=w;
	}
	
	//COPY CONSTRUCTOR
	Box(Box old){
		this.l=old.l;
		this.b=old.b;
		this.w=old.w;
	}
	
	
}
