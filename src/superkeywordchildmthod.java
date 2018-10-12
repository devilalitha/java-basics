
public class superkeywordchildmthod extends superkeywordparentmethod{
	
	
	public superkeywordchildmthod()
	{
		super();
		System.out.println("I am child constructor");			//defining child construtr
	}
	
	public void childMethod()
	{
		System.out.println("I am child method");				//defining child method
		super.parentMethod();
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	String name = "child";						//defining child varible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superkeywordchildmthod CM = new superkeywordchildmthod();
		CM.childMethod();
		CM.parentMethod();
	
		

	}

}

//when we want to call parent constructr just with super(); we can call but the first line of child constrtr should be super();
//when we want to call parent method just with super.parentmethodname(); 
//when we want to call parent variable just with super.varaiblename.
