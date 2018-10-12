
public class superkeywordchild extends superkeywordParent {
	
	String name = "child";

	public void getString() {
		
		System.out.println(name);     //displys output of childclass
		System.out.println(super.name); //displys output of parentclass
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superkeywordchild sp = new superkeywordchild();		
		sp.getString();
	}

}

/*when parent class and child class has same variable defined("name" here) and child class is extended to aprent class, 
if we want to disply the variable("name" here) then the first prefrence will be given to child class bcoz it is extending parent class
then prefernce is given to parent class, so inoder to print the varailbe of parent class as well we use super keyword.
System.out.println(name);   ------referd to childclass string
		System.out.println(super.name)----------------- refered to parent class string;*/

//considr if we dont have child varaible then super keyword is not required
//only if parent and child have same names then only super keyword is requried.