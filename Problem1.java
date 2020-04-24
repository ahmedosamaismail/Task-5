/*Ahmed Osama Ismail
 * Sec:1
 * B.N:2
 */
import java.util.*;
public class Problem1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double m,n,o;
		System.out.println("Enter the first number:");
		m=input.nextDouble();
		System.out.println("Enter the second number:");
		n=input.nextDouble();
		System.out.println("Enter the third number:");
		o=input.nextDouble();
		double TheSmallestValue=TheSmallestNumber(m,n,o);
		System.out.println("The Smallest Value Is: "+TheSmallestValue);

	}
	public static double TheSmallestNumber(double x,double y,double z) {
		double TheSmallest;
		if(x<y&&x<z) {
			TheSmallest=x;
		}
		else {
			if(y<x&&y<z) {
				TheSmallest=y;
			}
			else {
				TheSmallest=z;
			}
				
		}
		
		
		return TheSmallest;
	}

}
