package abstractclass;

public class bmw extends car  {
	
	@Override
	public  void enginesecret() {
		System.out.println("Bmw engine secret");
	}
	@Override
	public  void companyvault() {
		System.out.println("Bmw company vault ");
	}


	public static void main(String[] args) {
        
		car car=new bmw();//parentClass ref=new childClass()
		car.enginesecret();
		car.companyvault();
		

	}
}
