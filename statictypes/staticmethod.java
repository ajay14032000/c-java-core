package statictypes;

public class staticmethod {

	public static void method1() {
		System.out.println("****");
	}
	public void method2() {
		System.out.println("method two");
		method1();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		method1();
	
	}

}
