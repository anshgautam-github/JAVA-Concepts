package poly;

public class Shapes {

	void area() { //LATE BINDING 
		System.out.println("I am in the shapes");
	}
	
	//if I make this method as a final -> then it won't be overriden. Why? find yourself 
	// U can also use it to prevent the INHERITANCE
	//Whenevr u decalre a class as a  final -> implicitly it's methods will be declared as final too
	
	//STATIC -> methods are also not overriden .
	//If u make 2 static methods -> one in the parent class, one in the subclass
	//then when u create object, and run the static method -> it will run the PARENT ONE 
	//despite the type of the OBJECT, the rule we discussed.	
	
	//EEESY PEEESY EXPLAINATION
	//Overriding depends upon the OBJECT.
	//Static stuff does not depend on objects.
	//Hence u can't override static methods 


//		EARLY binding
	
//		final void area() {
//			System.out.println("I am in the shapes");
//		}
}	



