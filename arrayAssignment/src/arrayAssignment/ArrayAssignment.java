package arrayAssignment;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.*;

public class ArrayAssignment {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double []employeeId=new double [7];
		double []hours=new double[7];
		double []payrate=new double[7];
		double []wages=new double[7];
		int i;
	     ArrayList <String> list=new ArrayList<String>();
		for ( i=0;i<7;i++){
			System.out.println("EmployeeId: ");
			employeeId[i]=in.nextDouble();
			System.out.println("hours: ");
			hours[i]=in.nextDouble();
			System.out.println("payrate: ");
			payrate[i]=in.nextDouble();
		}
		for(i=0;i<7;i++){
			list.add(data(employeeId[i],hours[i],payrate[i]));
		}
		for (i=0;i<7;i++){
			try{
				DataOutputStream dos= new  DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.txt")));
			    for(int j=0;j<7;i++){
				dos.writeDouble(employeeId[i]);
				dos.writeDouble(hours[i]);
				dos.writeDouble(payrate[i]);
			    }
			}
		    catch (IOException e){
		    	e.printStackTrace();
		    }
			
			
		}
		for (i=0;i<7;i++){

		System.out.println(hours[i]);
	}}
	
	public static String data (double employeeId,double hours,double payrate){
	     return  ("EmployeeId="+employeeId+"hours"+hours+"payrate:"+payrate+"wages :"+(hours*payrate) );}


  
   }	   
   