package inheritance;

public class son extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son s= new son();
		s.city();     //belong to grandparent class
		s.country();   //belong to grandparent class
		s.work();      //belong to parent class
	}

	/*here we are extending only parent class but the properties of grandparent class are also there as we have extended grandparent class
	 in parent class*/
		
}
