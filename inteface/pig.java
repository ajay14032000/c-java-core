package inteface;

public class pig implements inteface {

	public void animalsound() {
	System.out.println(" the pig says : wee wee");	
	}
	
    public void  sleep() {
    	System.out.println(" Zzzz");	
	
	}
	
	
	
	
	public static void main(String[] args) {
      pig pig=new pig();
      pig.animalsound();
      pig.sleep();
	}

}
