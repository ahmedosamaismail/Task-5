/*Ahmed Osama Ismail
 * Sec:1
 * B.N:2
 */
import java.util.*;
public class Problem4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double invamou,rate,numofyears;
		System.out.println("Enter The Investment Amount: ");
		invamou=input.nextDouble();
		System.out.println("Enter The Rate Of Interest: ");
		rate=input.nextDouble();
		System.out.println("Enter Number Of Years: ");
		numofyears=input.nextDouble();
		double YearsFutureValue=Yearsfuturevalue(invamou,rate,numofyears);
		

	}
	public static double  Yearsfuturevalue(double invamou,double rate,double numofyears) {
		double Rate=rate/100;
		System.out.println("Years Future Value: ");
		for(int i=0;i<numofyears;i++) {
			invamou+=invamou*Rate;
			System.out.println(i+1+" "+invamou);
		}
		return 0;
		
	}
	

}
