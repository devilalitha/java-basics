
public class exeptions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7;
		int b =0;
				
		try {
			int c= a/b;
		}
		catch(ArithmeticException et)
		{
			System.out.println("error arithmetic");
		}
		catch(Exception e)
		{
			System.out.println("error caught");
		}
		
		finally
		{
			System.out.println("Delete cookies");
		}
		
			}
	

}


/* if we know that some code will fail and throws error(suspection- may or may nt throw an error), if it throws an error we have to catch 
  the error and print the message------this can be done using try catch mechanism called as exception handling */

/* example - If we have a  pop up in any website when we open saying any offers, and again the pop up disappears after some days
we will write code for pop up and when pop up is there it will execute if pop up is not there it will throw an error

// one try can be multiple catch blocks, catch block but catch block should be immediate try block.
in that case we can write the pop up code in try catch */
// if we write any particlur excptn it checks that and executes else it will execute normal excptn in catch block

// finally - this block is excuted irespectve of expection thrown or not, excutes even if progm fails or not
//consider we have 100 lines and we got error in 20th line the remaning code doesnt execute if we have finally block in between  that executes 
// finally block shuld be writen if we use try block only.before exiting the progrm finally block is excutes
//## example - once the test is done, if we want to close the browser or any deleting cookies before the next test executes.
//if test fails the above willnt happen
//so we can write in finally block
//we can use try and finally without catch also
//if we try to stop JVM-java virtual machine( running test, the red button ) forcefully then finally willnt execute.
//if we allow the prgrm to run completely then only finally will execute no matter the script fails or pass