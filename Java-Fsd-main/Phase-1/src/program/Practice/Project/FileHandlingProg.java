package program.Practice.Project;
import java.io.*;

public class FileHandlingProg {
 public static void main(String[] args){
 //Writing in the file

 try
 {                                    
FileWriter f = new FileWriter("C:\\Users\\SUREKHA J\\Desktop\\XYZ\\FileDemo.txt");
 try
 {
 f.write("janu is the employee of xyz company..!!");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 }


 
  //Reading an Existing file
  try
  {
  FileReader r = new FileReader("C:\\Users\\SUREKHA J\\Desktop\\XYZ\\FileDemo.txt");

  try
  {
  int i;
 while((i=r.read())!=-1)
  {
  System.out.print((char)i);
  }
  }
  finally
  {
  r.close();
  System.out.print("\n");
  System.out.print("File Closed successfully.");
  }
  }
  catch(IOException e)
  {
  System.out.println("Exception handled..");
  }
 
   // Append text to Existing File.
   String path = ("C:\\Users\\SUREKHA J\\Desktop\\XYZ\\FileDemo.txt");
   String text = " Currently doing training at Simplilearn";
   try
   {
   FileWriter f = new FileWriter(path,true);
   f.write(text);
   f.close();
   System.out.println("Append done Successfully..");
   }
   catch(IOException e){
   System.out.println(e);
   }
   }
  }