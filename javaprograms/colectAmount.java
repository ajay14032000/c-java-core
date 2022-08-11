package javaprograms;

public class colectAmount {
	 
public 	Integer collectedAmount=2000;

public Integer collecteAmountAndGiveMe() {
	System.out.println("i have coleected amount :"+collectedAmount +   "send it to you");
	return collectedAmount;
}

	public static void main(String[] args) {
		// TODO we create object for collectedAmount
		
		colectAmount myson=new colectAmount();
		Integer Amount=myson.collecteAmountAndGiveMe();
		System.out.println("i have got the amount:"+Amount);
	}

}
