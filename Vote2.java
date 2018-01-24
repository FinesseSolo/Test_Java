import java.util.Scanner;
public class Vote2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		
		
		int age = scan.nextInt();
		
		if (age < 18)
		{
			System.out.println("You are not eligible to vote");
		}
		else if (age == 18)
		{
			System.out.println("You are eligible to vote");
		
		}
	     else if (age > 18)
		{
	    	 System.out.println("Your are eligable to vote and get a license");
		
	}
	
	}
}
