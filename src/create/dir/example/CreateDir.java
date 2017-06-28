//here we creating the package to place the my java file in the particular directory
//we are creating the package for the uniqueness in the program
package create.dir.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//here we are creating a class
public class CreateDir {
//here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			 //here we are Applying the try and catch for handling the excption
				    try
				    {  
				    	/*
				    	 * here we are creating the source file and destination file
				    	 * by using the file reader and file writer
				    	 * we are using the file reader to read the file and 
				    	 * using file writer to write the file
				    	 * 
				         */ 
				      FileReader fr = new FileReader("E:/File/New2/abc.txt");
				      FileWriter fw = new FileWriter("E:/File/New2/New/bcd.txt");
				     //here we are taking the int variable 
				      int k;
				      //here we are applying the .read method to read the file whole file
				      while( ( k = fr.read() ) != -1 )
				      {
				    	  //here we are applying the write method to write in the another file
				        fw.write(k);   		
				        System.out.print((char) k);  
				      }
				      //here we are closing the read and write
				      fw.close();
				      fr.close();
				    }
				    catch(FileNotFoundException e)
				    {
				      System.out.println("File does not exist. " + e);
				    }
				    catch(IOException e)
				    {
				      System.out.println("Some I/O problem. " + e);
				    }
				  }
				}
	
    


