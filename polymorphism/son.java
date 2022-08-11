package polymorphism;

public class son extends dad {
	
   @Override
	public void marriage() {
		System.out.println(" i only decide ");

	}

	public static void main(String[] args) {

	  son son=new son();
	  
      son.properties();
      son.marriage();
	
	}

}
