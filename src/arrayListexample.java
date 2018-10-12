import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>(); // arraylist here is not class name but refers to arraylist only
		a.add("Devi");
		a.add("Lalitha");
		a.add(0, "Gurram"); // we can add many values like above and we can add in between also say we can add in 0th index or 1st index
		System.out.println(a);
		//a.remove(1);        // like wise we can remove the value in partcular index or we can remove all values also
		//System.out.println(a);
		System.out.println(a.get(2));  // prints the value in 2nd index
		//verify whether one string in present in list or not ---- a.contains(value);
	    System.out.println(a.contains("Lalitha"));
	    //if we want to know the index of a particular value/string
		System.out.println(a.indexOf("Devi"));
		System.out.println(a.isEmpty()); //check whether array is empty or not
		System.out.println(a.size());//checks the size of the array

	}

}
//all classes which implements list(array list,linked list,vector) it accepts duplicate values.
//like if we have a.add("devi") again we can add the same
//array has fixed size where as arraylist grows dynamically.
/* Arrays is diffrent from Arraylist ,we defines values in array as static that means we cannot add or delete values after the code, say
  int a[]= {1,2,3,4} like this. where as arraylist we can define as above code we can add anytime that is dynamically we can allocate.*/
 