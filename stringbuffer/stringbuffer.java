package stringbuffer;

public class stringbuffer {

	public static void main(String[] args) {
				
		//string is immutable
     String name="alex";
     System.out.println(name.concat("pandiyan"));
     System.out.println(name);
     
     //string buffer is mutable
     StringBuffer name1=new StringBuffer("alex");
     System.out.println(name1.append("padiyan"));
     System.out.println(name1);
     
     //string buffer methods\
     //reverse
     System.out.println(name1.reverse());   
     //replace
     StringBuffer name2=new StringBuffer("moni");
     System.out.println(name2.replace( 0,3,"rav"));
     //delete
     StringBuffer name3=new StringBuffer("xyzashok");
     System.out.println(name3.delete( 0,3));   
     //insert
     StringBuilder name4=new StringBuilder("moni");
     System.out.println(name4.insert(4,"sha"));
     //capacity
     System.out.println(name2.capacity());
     
	}

}
