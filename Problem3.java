/*Ahmed Osama Ismail
 * Sec:1
 * B.N:2
 */
import java.util.*;
public class Problem3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String str="";
		System.out.println("Enter Your Password: ");
		str=input.nextLine();
		boolean x=ValidOrInvalide(str);
		if(x==true) {
			System.out.print("Password Is Valid");
		}
		else{System.out.print("Password Is Invalid");}

	}
	public static boolean ValidOrInvalide (String string) {
		if(string.length()>=10) {
			int y=0;
			
		for(int i=0;i<string.length();i++) {
			if((string.charAt(i))=='!'||(string.charAt(i))=='#'||(string.charAt(i))=='$'||(string.charAt(i))=='%'||(string.charAt(i))=='^'||(string.charAt(i))=='@') {
				y++;
			}
			else {
				if(((int)string.charAt(i)>=65&&(int)string.charAt(i)<=90)||((int)string.charAt(i)>=97&&(int)string.charAt(i)<=122)) {
			    
				}
				else {
					if(((int)string.charAt(i)>=48&&(int)string.charAt(i)<=57)) {
						
					}
					
					
				}
			
				
			}
			
		}
		if(y>0) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
		
			
		
	}
	

}
