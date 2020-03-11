# Java program to merge two files into a third file
Prerequisite : PrintWriter , BufferedReader

Let the given two files be file1.txt and file2.txt. Our Task is to merge both files into third file say file3.txt. The following are steps to merge.

Create PrintWriter object for file3.txt
Open BufferedReader for file1.txt
Run a loop to copy each line of file1.txt to file3.txt
Open BufferedReader for file2.txt
Run a loop to copy each line of file2.txt to file3.txt
Flush PrintWriter stream and close resources.
To successfully run the below program file1.txt and file2.txt must exits in same folder OR provide full path for them.



filter_none
edit
play_arrow

brightness_4
// Java program to merge two  
// files  into third file 
  
import java.io.*; 
  
public class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("file3.txt"); 
          
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader("file1.txt")); 
          
        String line = br.readLine(); 
          
        // loop to copy each line of  
        // file1.txt to  file3.txt 
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("file2.txt")); 
          
        line = br.readLine(); 
          
        // loop to copy each line of  
        // file2.txt to  file3.txt 
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
          
        // closing resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("Merged file1.txt and file2.txt into file3.txt"); 
    } 
} ```
### Output:

Merged file1.txt and file2.txt into file3.txt