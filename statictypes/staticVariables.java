package statictypes;
 
public class staticVariables {
   
	static int balance=0;
	String name; 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		staticVariables object1=new staticVariables();
		object1.balance=100;
		object1.name="ajay";
		staticVariables object2=new staticVariables();
		object2.balance=200;
		object2.name="arun";
		System.out.println(object1.balance );
		System.out.println(object1.name );
		System.out.println(object2.balance );
		System.out.println(object2.name );

	}

}
