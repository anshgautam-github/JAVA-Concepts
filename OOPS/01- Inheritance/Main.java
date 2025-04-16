package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(1,2,3);
		System.out.println(box.l + " " + box.b + " " + box.w);
		
		Box box2=new Box(box); //copy constructor eg
		System.out.println(box2.l + " " + box2.b + " " + box2.w);
		
		BoxWeight box3= new BoxWeight(); //u r trying to reference a child to child 
		System.out.println(box3.l + " " + box3.b + " " + box3.weight);
		
		BoxWeight box4= new BoxWeight(1,2,3,4); //here i want to pass values like (l,b,h,weight)
		System.out.println(box4.l + " " + box4.b + " " + box4.w + " " + box4.weight);
		
		Box box5= new BoxWeight(2,4,5,6); // r trying to reference a child to parent -> acceptable
//		System.out.println(box5.l + " " + box5.b + " " + box5.w + " " + box5.weight); //box5.weight -> will give an error here 
		
	
//		A Superclass Variable Can Reference a Subclass Object:
//			It is important to understand that it is the type of the reference variable—not the type of the object that it refers
//			to—that determines what members can be accessed.
//			When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
//			those parts of the object defined by the superclass.
//
//			plainbox      =  weightbox;
//			(superclass)     (subclass)
//
//			SUPERCLASS ref = new SUBCLASS();    // HERE ref can only access methods which are available in SUPERCLASS
		
	
//		BoxWeight box6= new Box(2,4,5,6);  //erorr -> u r trying to reference a parent to child 
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
		//Box contructor -> don't know about what is weight -> parent can't acess child properties 
	
	}

	//NOTE -> Parent class cannot access the members of the child class
	//If the object is made of parent class, it won't be able to acess the child properties 
}

