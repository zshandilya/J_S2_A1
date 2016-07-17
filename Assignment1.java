import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char ans;
		do
		{
			System.out.print("Enter Age: ");
			int age=s.nextInt();
		
			if(age>0 && age<=100)	//Check whether age is valid or not
				{
					if(age>=18)		//Check if age is greater than or equal to 18
						System.out.println("You're eligible to vote ....");
					else
						System.out.println("You're ineligible to vote. You must atleast be 18 to vote. Wait a while ...");
				}
			else
				System.out.println("Invalid Age. Please retry.");
			
			System.out.print("Do you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
			
		} while(ans=='y');

		s.close();	//Closing the Scanner
	}

}
