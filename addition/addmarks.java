package addition;

import java.util.Scanner;

public class addmarks {


	public static void main(String[] args) {
    
		int tamil,english,maths,science,social,Total;
		
		Scanner o=new Scanner(System.in);
		System.out.println("enter tamil mark");
		tamil=o.nextInt();
		
		System.out.println("enter english mark");
		english=o.nextInt();
		
		System.out.println("enter maths mark");
		maths=o.nextInt();
		
		System.out.println("enter science mark");
		science=o.nextInt();
		
		System.out.println("enter social mark");
		social=o.nextInt();
		
		Total=tamil+english+maths+science+social;
		
		System.out.println("Total mark  " +Total);
	}

}
