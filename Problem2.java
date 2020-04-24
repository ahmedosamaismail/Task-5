/*Ahmed Osama Ismail
 * Sec:1
 * B.N:2
 */
import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Three Sides Of The Triangle: ");
		double m,n,o;
		m=input.nextDouble();
		n=input.nextDouble();
		o=input.nextDouble();
		double TheArea=area(m,n,o);
		System.out.println("The Area Of The Triangle Is: "+TheArea);

	}
	public static double area(double x,double y,double z) {
		double Thearea;
		double u=(x+y+z)/2;
		Thearea=Math.sqrt(u*(u-x)*(u-y)*(u-z));
		return Thearea;
	}
}
