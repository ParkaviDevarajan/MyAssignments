package week3.day2;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id"+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID:"+id);
		System.out.println("Student Name:"+name);
	}
	
	public void getStudentInfo(String phoneno,String email)
	{
		System.out.println("Student PhoneNumber:"+phoneno);
		
		System.out.println("Student Name:"+email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		st.getStudentInfo(1830);
		
		st.getStudentInfo(1235, "parkavi");
		
		st.getStudentInfo("8056065600", "parkaviloga09@gmail.com");
		

	}

}
