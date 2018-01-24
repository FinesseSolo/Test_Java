import java.util.Scanner ;
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, b, c,d;
System.out.println("Please enter your numbers");
Scanner in = new Scanner (System.in);
a = in.nextInt();
b = in.nextInt();
c = in.nextInt();
d = in.nextInt();

if (a > b && a > c && a > d)
	System.out.println("The first one is the largest");
if (b > a && b > c && b > d)
	System.out.println("The second one is the largest");
 if ( c > a && c > b && c > d)
	System.out.println ("The third one is largest");
 else if (d > a && d > b && d > c)
 System.out.println(" The forth is the largest");
	}

}
