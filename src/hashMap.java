import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new  HashMap<Integer, String>();   
		hm.put(0, "devi") ;   // put is the one which takes value and key, we cannot find add() here,0,1,2 --- are keys
		hm.put(1, "lalitha") ; 
		hm.put(2, "mine") ; 
		hm.put(3, "mpl") ; 
		System.out.println(hm.get(42));   // if we dont have key index say 42 it prints null as output
		System.out.println(hm.remove(1)); //removes 1st key value
		Set s=hm.entrySet(); // s is a set object which points to set collection, ante oke chota store chesthunnam s ane object lo, 
		//key nd value rendu store avthay set lo, set ante consider as dabba with blocks
		Iterator it= s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next(); //as both key and value are stored in same set, we have to seperate it.
			//so we are telling mp object that this is map kind of structure so please seperate key and value in two different formats
			mp.getKey(); //with the help of mp object we are getting key, mp object knows as we have given map.entry
			mp.getValue();//with the help of mp object we are getting value 
		}
	} 


}

/* when we use hashmap we need to passing two args i.e- we map key to value 
 Interview Q : I have a key and value and extract me by pushing in set collection
Q: create a hash table and pass values, and print the keys and values separately using Iterator?
Ans : above
  */
 