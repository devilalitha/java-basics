
public class constrctr {
	
	//this is defult constrctr bcoz it is not expctng any values
	public constrctr()
	{
		System.out.println("Iam defult constrtctr");
	}

	//parametrised constrtr is below which accpts some values
	public constrctr(int a , int b)
	{
		System.out.println("Iam  paramtr constrtctr");
		int c= a+b;
		System.out.println(c);
		
	}
	
	public constrctr(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constructr excutes block of code whenever an object is created for that class
		// only diff btwn constructr and method is contrcutr doesnt return anything
		//and the classname and constructr name should be same.

		constrctr c= new constrctr(); //object for default constructor
		
		//whenever an object is created constructer is called
		//complier will call default constructr or impilict instructr if we havent defined any constrctr block
		//but if we define it will excute that blck
		//even if we dont create contsrutr the prgrm runs and compiler calls default contsrtr.
		
		constrctr pc= new constrctr(4,5);   //object for paramatrsed constructor
		
		// when construtr is called in generl default constructor is called as we are nt passing any values when object is created.
		//when we pass values in runtime as above then the complier assumes to call paramatrsed constructor and executes
		//we can create many objects for a same class
		//explicit constructr is something which we define
		
		constrctr sc= new constrctr("Hello");
		
		// if no construtr is defined in the class then only it goes nd find implicit constrctr 
		//if anyone of the explict constructr is defined then it thrws error if we create an object and no constrctr is defined for the same.
		
	}

}
