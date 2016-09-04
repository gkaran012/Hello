package arrayAssignment;
import java.util.regex.*;
import java.util.Scanner;
public class Regex {

	public static void main(String[] args) {
		String email;
		String IpAdd;
		String numbers;
		Scanner in= new Scanner(System.in);
	 System.out.println("Enter an email id");
	 email=in.nextLine();
	 System.out.println("Enter your phone number including area codeseparetd by -");
	 numbers=in.nextLine();
	 System.out.println("IP");
	 IpAdd=in.nextLine();
	 
	 System.out.println(Pattern.matches("\\w*[@]\\w*[.]\\w{3}",email));
	 System.out.println(Pattern.matches("[1-9]{1}[0-9]{2}[-][0-9]{3}[-][0-9]{4}",numbers));
	 System.out.println(Pattern.matches("[0-9]{2}[.][0-9]{3}[.][0-9]{2}[.][0-9]{3}",IpAdd));
     
	}

}
