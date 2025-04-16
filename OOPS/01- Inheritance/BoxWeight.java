package practice;

public class BoxWeight extends Box {
	
	//SINGLE LEVEL INHERITANCE 

	double weight;
	
	BoxWeight(){
		this.weight=-1;
	}

	BoxWeight(double l, double b, double w, double weight){
		super(l,b,w);  //calling the parent class contructor -> 1st use caseof the super 
		//used to initailize the values of the parent class
		//this super should come first before any other linee otherwise error
		
		//if we make l->private then here the initilzation will take place
		//bcoz the Box class constructor was called with the super()
		
		this.weight=weight;
		
		//2nd use case of the super ->
//		System.out.println(super.w);  
	}
	
	
	//created for the BoxPrice class->>> otherwise error in that class using the super word()
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
	
}


//NOTE -> the subclass BoxWeight will not be able to acess those members of parent class which are private
// Assume if u make l-> as a private in the parent class 
