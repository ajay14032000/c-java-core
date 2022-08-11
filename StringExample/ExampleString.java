package StringExample;

public class ExampleString {

	public static void main(String[] args) {

		
		String name="ajithkumar";
		int number=3;
		
		
		//Character value for the particular index
		System.out.println(name.charAt(1));
		
		//length
		System.out.println(name.length());
		
		//equality of two string
		System.out.println(name.equals("ajay"));
		
		//check without case sensitive
		System.out.println(name.equalsIgnoreCase("AJITHKUMAR"));

		//string is empty or not
		System.out.println(name.isEmpty());
		
		//check value present or not boolean
		System.out.println(name.contains("j"));
		
		//particular position of the string will be removed
		System.out.println(name.substring(3));


		//inbettween the give position of value only print
		System.out.println(name.substring(1,4));

       //add the two given string 
		System.out.println(name.concat("thala"));
		
		//replacing existing char to given char
		System.out.println(name.replace("k","K"));

		System.out.println(name.replace("ajith","ajay"));

		
       //using char find position of string
		System.out.println(name.indexOf("k"));
		                //ajithkumar
		//change the character using position
		System.out.println(name.indexOf("a",8));
		
		//find char use index
		System.out.println(name.indexOf("i",2));
		//word 
		System.out.println(name.indexOf("kum",1));

        //trim  will remove white space
		System.out.println(name.trim());
		
		//convert given data type(numbers) to a string
		System.out.println(String.valueOf(number));
		
		//convert lower case to upper case
		String lowercase="ajay";
	    System.out.println(lowercase.toUpperCase());
			
	    //writen joined sting with the delimeters
		System.out.println(String.join("-", "ajay","ashock","alan"));
		
		//string split
		String split="hi,good morning,friend";
		String[] splittedwords=split.split(",");
		for(String string:splittedwords) {
			System.out.println(string);
		}
		

	}

}
