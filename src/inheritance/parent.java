package inheritance;

public class parent extends grandparent { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p= new parent();
		p.city();
		p.country();
		
	}

	
	public void work()
	{
		System.out.println("selenium");
	}
}
// Inheritance is the concept of getting the properties of other class into one class.
//here we inherit the properties present in grandparent class to parent class.
// we can do this by using extends keyword which is followed by the classname which we want to inherit.
//multiple herirachy is also possible in java, as if parent class extends the properties of grandparent class.
//consider we can have a son class in which we extends parent class. that means in son class we extend the properties of parent class 
//as well as grand parent class as parent class contains the properties of grandparent class.
//used mostly in case of login test cases in real time,if we want to check anything that could be done only if we login in to the application
//so instead of writing the login test case in every place we can inherit/duplicate the test case by extending that login testcase class.