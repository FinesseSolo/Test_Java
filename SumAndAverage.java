import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
	      System.out.print("Enter Integer: ");
	      int n = sc.nextInt();
	      System.out.println("You entered: " + n);
	 
	      int sum = 1;
	 
	      for (int x=2;x<=n;x++) {
	        sum = sum + (x*x);
	      }
	      System.out.println(sum);
	}

}
