import java.util.Scanner;

public class TestProject {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("**************Registration  For Admin*********************");
		
		
		LoginPage l = new LoginPage();		
			
			System.out.println("*******************Add student***********************");

			
			System.out.println("Enter Number Of New Student To Enroll:");
			
			int numOfStudents = sc.nextInt();
			
			StudData[] students = new StudData[numOfStudents];

			for (int n = 0; n < numOfStudents; n++) {
				students[n] = new StudData();
				students[n].course();
				students[n].payTution();

				System.out.println(students[n].toString());
				System.out.println("******************************************");
			
		
}
}
}