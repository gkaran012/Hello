package arrayAssignment;
import java.util.Scanner;

public class PayrollClass {
	Scanner in= new Scanner(System.in);
	 PayrollClass(){}
	int []employeeId;
	double []hours;
	double []payrate;
	double []wages;
public void employeeID(int[]employeeId){
	int a=employeeId.length;
	for(int i=0;i<a;i++){
		for (int j=0;j<i;j++){
			for (int k =0;k<j;k++){
				System.out.println("Enter your Id");
				employeeId[i]=in.nextInt();
				System.out.println("Enter your Hours");
				hours[j]=in.nextDouble();
				System.out.println("Enter your payrate");
				payrate[k]=in.nextDouble();
			}
			
		}
	}
	
}

}
