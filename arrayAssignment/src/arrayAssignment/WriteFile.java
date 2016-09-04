package arrayAssignment;
import java.io.*;

public class WriteFile  {
	
//	private String FileCreate;

	 public static void fileC(String Fname)throws IOException{
		 //this.FileCreate=Fname;
		 File file=new File(Fname);
		 file.createNewFile();
		 FileWriter writer=new FileWriter(file);
		 writer.write("HEllo is there anybodu in there");
		 writer.flush();
		 writer.close();
		 
	 }
	          public WriteFile() {
			// TODO Auto-generated constructor stub
		}
			public static void main(String[] args)throws Exception{
	        	fileC("a.txt");
	        	  
	          }
	}


