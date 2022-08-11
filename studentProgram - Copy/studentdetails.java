package studentProgram;

public class studentdetails extends studentrecord {

	
	
	public static void main(String[] args) {
      
		studentdetails student=new studentdetails();
		
		System.out.println(student.collegename);
		
		student.registernumber();
		student.studentname();
		student.department();
		student.batch();
		
		
	}

}
