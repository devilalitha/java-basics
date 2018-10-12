import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("devi");
		hs.add("devi");    //will not accept duplicate values and it wiilnt show in what order it is shown
		hs.add("Lalitha");
		hs.add("mpl");
		hs.add("mine");
		System.out.println(hs);
		hs.remove("Devi"); //can remove
		hs.size(); //size of hashset
		hs.isEmpty();//check whether the array is empty is not
		//If we want to iterate through each and every string present in hashset
		Iterator<String> i = hs.iterator();
		i.next(); //points the first index value
		i.next();//points to second index, for everytime we say i.next(); cntrl goes down from top
		//if we have 100 strings, and if we want 97th index then we cant write i.next() 100 times, so
		while(i.hasNext())
		{
			System.out.println(i.next());  // loop runs till last, i.next() will execute and prints.
		}
		

	}

}

//list accepts duplicate values and guarantees sequential value
//set doesn't do.




/* HashSet, treeSet, linkedHashSet implements set interface.
 elements are not stored in sequential order whereas arraylist stores in sequential order.
 Here we wont have getindex() of bcoz the stroring order is nt sequntil.
 */