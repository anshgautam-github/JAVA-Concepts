package abs;

public class Main {

	public static void main(String[] args) {
			
			
			  Son son = new Son(30);
		      son.career();

		      son.normal();

		      Parent daughter = new Daughter(28); //u can use the abstract class as a reference var
		      daughter.career(); //which one it will acess? we discussed earlier 

		      Parent.hello();
//		      Parent mom = new Parent(45); //cannot create an object of abstract class

	}

}


//ABSTRACT class just tells what to do , not how to do

//Then in the child class we will override them 
//It;s child class responsibility to implement them  (all method should overrride)
//Any class that contains one or more abstarct methods, we should make it as an abstract class


