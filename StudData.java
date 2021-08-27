import java.util.Scanner;

public class StudData {
	private String Name;
	private String EmailId;
	private int PhoneNo;
	private String Courses=" ";
	private int fee;
	private int remfee;
	private int StudentID;
	public int payment;
	private static int CostOfCourse = 600;
	
	Scanner sc = new Scanner(System.in);

	public StudData() {
		
		System.out.println("Enter student ID :");
		this.StudentID = sc.nextInt();

		System.out.println("Enter student Name : ");
		this.Name = sc.next();

		System.out.println("Enter student Phone No :");
		this.PhoneNo = sc.nextInt();

		System.out.println("\nEnter student Email Id :");
		this.EmailId = sc.next();

	}
	
	public void course()
	{
		int i = 1;
	System.out.println("how many course  you want to enroll: ");
	
	int coursecount = sc.nextInt();

	do {
		System.out.println("Enter Course name : ");
		
		String course = sc.next();
		
		if (!course.equals("n")) {
			
			Courses = Courses + "\n " + course;

			fee = fee + CostOfCourse;
		} 
		else 
		{
			break;
		}
		i++;
	} while (i <= coursecount);
}

public void viewBalance() {
	System.out.println("\nYour fee is: $" + fee);
}

public void payTution() {
	viewBalance();
	System.out.print("\nEnter Your Payment: $");
    payment = sc.nextInt();

	remfee = fee - payment;
	System.out.println("\nThank you for your payment of $" + payment);
	System.out.println("\nYour remaining fee is: $" + remfee);

}

public String toString() {
	System.out.println("**************Student Details************ ");

	return "\nStudent ID: " + StudentID +"\nName: " + Name +
			"\nPhoneNo: " + PhoneNo +"\nEmail Id: " + EmailId +"\nCourses Enrolled: " + Courses +
			"\n Fee: $ " + fee+
			"\n Paid Fee: $ " +payment+"\n Remaining Fee: $ " + remfee;
}
}


