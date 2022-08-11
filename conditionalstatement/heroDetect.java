package conditionalstatement;

public class heroDetect {
      String myHeroName="iron man";
      //multiple condition if else if we will use
      public void superherodetect() {
    	 if(myHeroName.equals("iron man")) {
    		 System.out.println("your super hero iron man");
    	 }
    	 else if(myHeroName.equals("bat man")) {
    		 System.out.println("your super hero bat man");
      }
    	 else if(myHeroName.equals("spider man")) {
    		 System.out.println("your super hero spideer man");
      }
    	 else if(myHeroName.equals("Hulk")) {
    		 System.out.println("your super hero Hulk");
      }
    	 else {
    		 System.out.println("sorry i cant guess");
      }
      }
      
      
	public static void main(String[] args) {

		heroDetect hero= new heroDetect();
		hero.superherodetect();
	}

}
