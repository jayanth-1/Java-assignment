import java.util.*;
import java.io.*;
import java.lang.*;


class Second{

public static void main(String[] args)
{
int count = 0;
System.out.println("Enter string \n");
Scanner sc = new Scanner(System.in);                   

String s = sc.next();                                  // Taking input string from console

String str = s.toLowerCase();
boolean[] hash = new boolean[26];                              // Creating hash array for alphabets
int i;
for(i=0; i<str.length(); i++)
 {
 	if((str.charAt(i)-'a')>=0 && (str.charAt(i)-'a')<=26)
   hash[(str.charAt(i)-'a')]=true;                        // Indexing alphabets
 }

for(i=0; i<26; i++)
 {

   if(hash[i])
    {
    	hash[i]=false;
        count++;                                        // Counting all alphabets present or not
    }
 }

if(count==26)                                           // Checking if a-z alphabets present or not
 System.out.println("String contains all alphabets a-z(case insensitive) \n ");  

else
	System.out.println("String doesn't contains 26 alphabets");

}
}



/*

Time complexity - O(n) here "n" is size of string i.e linear in time

Space complexity - O(1) constant  

*/