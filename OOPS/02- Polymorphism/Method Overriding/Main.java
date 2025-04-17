package poly;

public class Main {

	public static void main(String[] args) {
		
		Shapes shape=new Shapes();
		Circle circle=new Circle();
		Square square=new Square();
		
		shape.area();	//I am in the shape
		circle.area();  //Area of circle
		square.area();  //Area of Square
		
		Shapes bj=new Square();  //agar yeh area() parent mei nahi hua na toh it will not run. EG-> Shapes
		bj.area();   //Area of Square
		
		//here whatever type the object is of-> it will run the method of that type 
		
		//now you might be confused-> bcoz what methods, variables, it could access that depends on the LHS
		//Correct -> but how is it checking which one to RUN?
		
		//NOTE-> What it is able to access is defined by the type of the reference  (acess)
		// Which one to acess is defined by the type of the object  (run)
		
		//When the refernce var and the type of object is same then usual normal thing happens.
		
		//Overriding is done -> when the reference var you are using is of super class and which particular
		//method will be called will depend upon the object that the reference var is refering to
		//THIS is called UPCASTING ->>> and this whole process is how the Overriding works.
		
		//okay so know which one to call -> but how the JAVA determines this and do memory manag stuff?
		
		//DYNAMIC METHOD DISPATCH -> It is just a mechanism by which just a call to an overriden method
		//is resolved at the run time rather than the compile time. 
		//All the compilation is done when the program is running, during that time JAVA will determine 
		//which one to run. 
		
		//This is imp -> bcoz this is how we do runtime poly. 
		
	}

}


//NOTE ->> Both overloading, and overriding doesn't apply to the instance variables.
