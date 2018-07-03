import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class First{

public void filesAndFilesInSubdirectories(String directoryName,String pattern){
        File directory = new File(directoryName);      // creating file class
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
              Pattern r = Pattern.compile(pattern);
              // Now create matcher object.
              Matcher m = r.matcher(file.getName());   // matching file name with pattern
              if(m.find())                             // if matches
               System.out.println(file.getAbsolutePath()); // printing absolute path

             }
            else if (file.isDirectory()){
                filesAndFilesInSubdirectories(file.getAbsolutePath(),pattern); // recursivley searching files directories & subdirectories
            }
        }


}

public static void main(String[] args)
{

String directory_name = "/home/zemoso" ;                // home directory
First obj = new First();                                // creating object of First class  
while(true) {
 System.out.println("Enter regular expression \n ");    //Taking input from terminal i.e regular expression
 Scanner sc = new Scanner(System.in);  
 String pattern = sc.next();

 obj.filesAndFilesInSubdirectories(directory_name,pattern);
}
}

}
