package interfacebasics;

public class developing implements bankingclient,domainclient { //here we are implementing the menthods present in the bankingclient interface.
	//only classes can implement the methods present in interface
	//here when we write implements keyword that means developing class will take the respondibility and implement all methods
	//present in bankingclient
	//we will get error saying add unimplemented methods if we miss any methods from bankingclient interface.
	//one class can implemnt multiple interfaces, we just need to sepcify using ,

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		developing d = new developing();    // 'd' is responsible for calling all the methods presnt in developing class 
		d.paycreditcard();            // developing class includes bankingclient methods also as we are implemnting interface methods
		d.transferbalance();
		d.debitcard();                 //debitcard is the own methd present in developng class 
		bankingclient dr = new developing(); // 'dr' is responsible for calling all the methods presnt in bankingclient class
		
		                                    // if we call with dr. we wont get debitcard as debitcard is responsible for developing class
//and dr will call only bankingclass methods.this type is called RUNTIME PROLYMORPHISM".which is same as webdriver driver = new chromedriver();
		
		domainclient dc = new developing();
		dc.login();  // we will get only method present in domaincleint as we are giving contrl only to that.this helps for cleint understnd
	}

@Override
public void transferbalance() {
	// TODO Auto-generated method stub
	System.out.println("transfer balance");    //  method which is  present in interface 
	
}

@Override
public void paycreditcard() {
	// TODO Auto-generated method stub
	System.out.println("credit card paid");    //  method which is  present in interface 
}

public void debitcard() {
	System.out.println("debit card paid");    // own method which is not present in interface 
}

@Override
public void login() {
	// TODO Auto-generated method stub//methods from domainclient interface
	System.out.println("loggedin"); 
	
}

}


//Interface will have mthods without coding
//classes will implement the methods present in interface.
//by default the methods are public that means we can access anywhere that is outisde the class and outside the package also
//if we dont mention public also by default it takes public
//we can own methods also in the developing class apart from methods present in bankingclient