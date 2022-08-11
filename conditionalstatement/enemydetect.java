package conditionalstatement;


public class enemydetect {
  String enemyName="ant man";
  public void enemyorhero() {
	  switch(enemyName) {
	  case"iron man":
 		 System.out.println("iron man is super hero");
 		 break;
	  case "bat man":
		  System.out.println("bat man is super hero");
		  break;
	  case "spider man":
		  System.out.println("spider man is super hero");
		  break;
	  case "ant man":
		  System.out.println("ant man is super hero");
		  break;
	  case "hulk":
		  System.out.println("hulk is super hero");
		  break;
	  default:
		  System.out.println(" soory i dont know about the person  "+ enemyName);
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enemydetect enemy=new enemydetect();
		enemy.enemyorhero();
	}

}
