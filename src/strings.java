
public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="payment $100 paid";
		//instead of creating an obkect for a class we can write as above
		//instaed of string string str = new string("");
		//we can write as above but it is applicable only for string
		str.charAt(8); //if we want to print letter from the text by giving index
		String str1="payments $100 paid";
		str1.indexOf("$");//if we want to print the index number by giving the letter or character.
		
		str.substring(8);// we can print the substring present in the 8th index, that means $100 will be printed

	}

}
