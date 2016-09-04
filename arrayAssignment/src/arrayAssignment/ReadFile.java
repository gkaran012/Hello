package arrayAssignment;
import java.util.*;
import java.io.*;
public class ReadFile {
	public static void ReadF() throws FileNotFoundException{
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the file");
		String ss=in.nextLine();
		
		Scanner s = new Scanner(new File(ss));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		
		for(Object ob:list){
			System.out.println(ob);
		}
		 double suma=0;
		double sumb=0;
		double sumc=0;
		
		double sumd=0;
		
		for(int i=10;i<list.size();){
			
		
			suma=suma+Integer.parseInt(list.get(i));
			//System.out.print(" sum"+suma);
			i=i+5;
			//System.out.println("new I"+i);
		}
		System.out.println("Candidate A:"+suma);
		
	
	     for(int i=11;i<list.size();){
		
		
		sumb=sumb+Integer.parseInt(list.get(i));
		//System.out.print(" sum"+sumb);
		i=i+5;
		//System.out.println("new I"+i);
	}
	System.out.println("Candidate B:"+sumb);

    for(int i=12;i<list.size();){
	
	
	sumc=sumc+Integer.parseInt(list.get(i));
	//System.out.print(" sum"+sumc);
	i=i+5;
	//System.out.println("new I"+i);
}
     System.out.println("Candidate C:"+sumc);
    

         for(int i=13;i<list.size();){


           sumd=sumd+Integer.parseInt(list.get(i));
      //       System.out.print(" sum"+sumd);
              i=i+5;
              //System.out.println("new I"+list.get(i));
}
            System.out.println("Candidate D:"+sumd);

	double Total=suma+sumb+sumc+sumd;
	System.out.println("Total:"+Total);
	double a=(suma/Total)*100;
	if(a>=50){System.out.print( "WINNER a:");}
	System.out.println("Total Percentage:"+a);
	double b=(sumb/Total)*100;
	if(b>=50){System.out.print( "WINNER b:");}
	System.out.println("Total Percentage:"+b);
	double c=(sumc/Total)*100;
	if(c>=50){System.out.print( "WINNER c:");}
	System.out.println("Total Percentage:"+c);
	double d=(sumd/Total)*100;
	if(d>=50){System.out.print( "WINNER d:");}
	System.out.println("Total Percentage:"+d);
	
    if(a <50 && b<50 && c<50 && d<50){
     double[]can={a,b,c,d};
       int m=0;
       for(int i=0;i<4;i++){
    	   
       }
       
    	
    	
        	   
	      		
    }
    }	
	
	public static void main(String[] args)throws Exception {
		
		Scanner s = new Scanner(new File("bb.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		for(Object ob:list){
			System.out.println(ob);
		}
		
		ReadF();
	}

}
