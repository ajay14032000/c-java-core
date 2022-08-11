package javaprograms;

public class bankAcount {
	
	Integer acountNumber=1718187323;
	String holderName="ajay";
	Integer acountBalance=299;
	
	
	
	public void getbalance() {
		System.out.println("Balance is :" + acountBalance);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAcount acount=new bankAcount();
		acount.getbalance();
		acount.holderName();
	}



	private void holderName() {
		// TODO Auto-generated method stub
		System.out.println("Holder Name :" +holderName)	;
		}

}
