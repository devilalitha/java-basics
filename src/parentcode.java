
public class parentcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is frst prgm");
		
		childcode cc = new childcode();// creating the class object
			 // classname class object(user defined) = new(memory allocated) classname();
		
			//here class name refers to which class we are calling.
			//which method we want to use here.
			//consider we have header section in 10 pages, we will be writing the code in all 10 sections.
			// instead of that we can write code and we can use it where ever we want by calling the function.
			//here we are have written code in childcode class file and calling in parentcode classfile.
		
		cc.validateHeader(); // classobject. classname(); - for calling the class in another class
		
		
		
	}

}
