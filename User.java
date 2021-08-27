import java.util.Scanner;

public class User {
	
	private String name;
	public String UserName;
	public String Password;
	private String EmailId;
	private int PhoneNo;
	
	Scanner sc = new Scanner(System.in);
	
	User()
	{
		System.out.println("Enter name: ");
		name=sc.next();
		
		System.out.println("Enter userName: ");
		UserName=sc.next();
		
		System.out.println("Enter EmailId: ");
		EmailId=sc.next();
		
		System.out.println("Enter Password: ");
		Password=sc.next();
		
		System.out.println("Enter PhoneNo: ");
		PhoneNo=sc.nextInt();
		
		System.out.println("**************Registration details*********************");

		System.out.println("Name : " +name);
		System.out.println("UserName : " +UserName);
		System.out.println("EmailId : " +EmailId);
		System.out.println("Password : " +Password);
		System.out.println("PhoneNo : "+PhoneNo);
	}
	
	
	

	
}




 class LoginPage extends User {
	
	LoginPage() {
		
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n***************WELCOME to login page******************** ");
		
		System.out.println("\nEnter user name :");
		String uname = sc.next();
		System.out.println("Enter user password : ");
		String pass = sc.next();
		
	
		
		if (uname.equals(UserName) && (pass.equals(Password)))
		{
		    System.out.println("Login successfully");
		}
		else
		{
			System.out.println("Invalid Username or Password ");

		}
	}
}
