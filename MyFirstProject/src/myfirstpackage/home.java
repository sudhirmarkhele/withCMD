package myfirstpackage;

public class home {
	
	public int food;// instance variable 
	public static int refrigerator;// static Variable
	
	//Global Variable -A variable which is define inside the and ouside the method
	
	// Global variable is of two type-instance/static variable
	//static variable -When we want singke copy accross object
	
	// static Variable-A variable which is defined inside the class and outside the method with static keyword
	
	//Instance Variable -A Variable which is defined inside class and out side the method without static keyword
	
	
	//Class area outside the method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method area
		
		// Local -Avariable which is defined inside the method
		int bed;// local Variable without Acess Modifier
		
		//Object Creation
		//Classname Objectname =new Classname();
home Personone=new home();
home Persontwo= new home();
home Personthree =new home();
home personfour=new home();
home Personfive =new home();

System.out.println(Personone.refrigerator);
Persontwo.refrigerator=25;
System.out.println(Personone.refrigerator);
System.out.println(Personthree.refrigerator);
personfour.refrigerator=100;
System.out.println(Persontwo.refrigerator);
		
		
	}

}
