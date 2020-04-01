package Assignment_Lab_02;

public class Database_App 
{
	public static void main(String[] args)
	{		
		NewStudent student01 = new NewStudent("Tammy", "583982595");
		
		student01.getInfo("8955843515", "Phoenix", "Arizona");
		
		student01.enroll("Programming Foundations");
		student01.enroll("Computer Science 101");
		student01.enroll("Software Development 101");
		
		student01.showCourses();

		student01.pay(1200);
		student01.checkBalance();
		
		System.out.println(student01.toString());
		
		NewStudent student02 = new NewStudent("Wren", "631069375");

		student02.getInfo("7394762136", "City2", "State2");
		//student02.enroll();
		student02.pay(1500);
		student02.checkBalance();
		
		NewStudent student03 = new NewStudent("Zach", "906362683");

		student03.getInfo("6783241329", "City3", "State3");
		//student03.enroll();
		student03.pay(1500);
		student03.checkBalance();	
	}
}

class NewStudent
{
	//Properties of user
	private String studentName;
	private String studentSSN;
	
	private String studentPhoneNum;
	private String studentCity;
	private String studentState;
			
	private String emailID;
	private String userID; 
	
	private String studentCourses = "";
	
	private static int ID = 1000;
	private double balance = 2000;
		
	//Constructor
	public NewStudent(String name, String ssn)
	{
		ID++;
		
		this.studentName = name;
		this.studentSSN = ssn;
		
		generateIDs();
	}
	
	public void getInfo(String phone, String city, String state)
	{
		this.studentPhoneNum = phone;
		this.studentCity = city;
		this.studentState = state;
	}
	
	public void generateIDs()
	{		
		emailID = studentName + "@sdet.edu";
		//System.out.println("Student Static ID: " + ID);
		
		int random = (int) (Math.random() * (1000 - 9000) + 1);
		random = Math.abs(random);
		random = random + 1000;			//random ID
		//System.out.println("Random ID: " + random);
		
		String id = Integer.toString(ID);
		String rand = Integer.toString(random);
		String LastFour = studentSSN.substring(5, 9);
		userID = id + rand + LastFour;
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Email: " + emailID);
		System.out.println("User ID: " + userID);
	}
	
	public void enroll(String courses)
	{
		this.studentCourses += courses + "\n";
	}
	
	public void pay(double amount)
	{
		balance -= amount;
		System.out.println("Amount Paid: " + amount);
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: " + balance + "\n");
	}
	
	public void showCourses()
	{
		System.out.println("Courses this term:" + "\n" + studentCourses);
	}
	
	public String toString()
	{
		return "[Student Name: " + studentName + "]" + "\n" + "[User ID: " + userID + "]" + "\n" + "[Student Email ID: " + emailID + "]" + "\n" + "[Balance: " + balance + "]" + "\n";
	}
}
