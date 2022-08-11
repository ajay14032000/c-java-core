package polymorphism;

public class wayoftalk {

	public void talk(parents styleoftalk) {
		System.out.println(" respect");
	}
	private void talk(friends styleoftalk) {
		System.out.println("crazy");
	}
	protected void talk(lover styleoftalk) {
		System.out.println("love,romantic");
	}
	//Access modifier can be anything
	///overloading/compile time/early binding
	
	
	public static void main(String[] args) {

	  wayoftalk talk=new wayoftalk();
	  
      parents parents=new parents();
      talk.talk(parents);
      
      lover lover=new lover();
      talk.talk(lover);
      
      friends friends=new friends();
      talk.talk(friends);
	}

}
