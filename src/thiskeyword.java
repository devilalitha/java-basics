
public class thiskeyword {
	
	int a= 2;
	
	public void thiskey()
	{
		int a =3;
		System.out.println(a);
		System.out.println(this.a);
		
		int sum=a+this.a;
		System.out.println(sum);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword tk= new thiskeyword();
		tk.thiskey();
		
	}

}
// here a=2 is declred globally where its scope lies in entire class and a=3 declare locally where it scope lies within thiskey();
//when we print the a value in the thiskey() method, it considers local varaible and prints 2
//inorder to print the global varilbe inside a method where the varible name is same then "this" keyword is used
//this keyword is refered to global varible
//this.a ---- refers to global varible where the output will be 2
//inorder to sum -----"a+this.a " --->summing global and local varible.
