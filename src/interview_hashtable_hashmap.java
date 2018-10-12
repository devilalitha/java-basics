
public class interview_hashtable_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*   in place of map we can plce table, but there are slight differences 
 
   Hashmap: consider we have 10 programs, if we hashmap in 10 prgmrs/threads we can run concurrently
   			we can pass null values values also say hm.put(9,"");
   			objects are Iterated by using iterator
   			
   hashtable: for the same scenario only one can run at a time,operation complts only once one thread/prgrm is completed.
   				we cannot pass null values;
   				no interator is used, we use enumartor
   				
   				apart the above everything is same.
   
   */
 