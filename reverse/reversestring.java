package reverse;

public class reversestring {


public static void main(String[] args) {
	
	String name="alex";
	String reverse="";
	char ch;
	for(int i=0;i<name.length();i++) {
		
    ch=name.charAt(i);
    reverse=ch+reverse;
    
	}
    System.out.println(reverse);

	if(reverse.equals(name)) {
	  System.out.println("it is palindrome");
		}
	else {
		System.out.println("it is not palindrome");
		}
	
}
}
