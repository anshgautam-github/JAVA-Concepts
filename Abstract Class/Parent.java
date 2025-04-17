package abs;

abstract public class Parent {
	 	int age;
	    final int VALUE;

	    public Parent(int age) {
	        this.age = age;
	        VALUE = 32456789;
	    }

	    static void hello(){ //normal static methods 
	        System.out.println("hey");
	    }

	    void normal() {
	        System.out.println("this is a normal method");
	    }

	    abstract void career();
	    abstract void partner();
}


//We cannot create the objects of the abstract class
//Abstract costructor -> Not possible (WHY?)

//ABSTRACT STATIC METHODS-> STATIC can;t be overriden -> so no ABS STATIC METHOd

//Final abs class -> can;t be applied -> bcoz absract needs to be inhertied by the child for implementation
