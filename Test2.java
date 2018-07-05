import java.util.*;
import java.io.*;
import java.lang.*;


class Second{

	public void checkAlphabets(String s)
	{
		int count = 0;
		String str = s.toLowerCase();
boolean[] hash = new boolean[26];                              // Creating hash array for alphabets
int i;
for(i=0; i<str.length(); i++)
 {
 	if((str.charAt(i)-'a')>=0 && (str.charAt(i)-'a')<=25)
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
	System.out.println("String doesn't contains 26 alphabets\n");

	}

public static void main(String[] args)
{

System.out.println("Enter string \n");
Scanner sc = new Scanner(System.in);                   //Taking input from console

String s = sc.next();          
Second obj = new Second();
obj.checkAlphabets(s);                     



}
}



class Test2{

	public static void main(String[] args)
	{
		System.out.println("Positive test cases : \n");

		Second obj = new Second();

		List<String> s = Arrays.asList("abcdefghijklmnopqrstuvwxyz","ABcdefffghiJKLmnOPQrstUVWXYzkjkbkhr","331351351j23bAcdefghijklmnopqrstuvwxYZ");
		int i;
		for(i=0; i<s.size(); i++)
		{

           System.out.println("test case " + i + " " + s.get(i) + "\n");
           obj.checkAlphabets(s.get(i));

		}

		System.out.println("Negative test cases : \n");
		List<String> s1 = Arrays.asList("'abcdefghijklm%$nstuv","@ABefffghiJKLmnOPQrstUVWXYz","331351351j23bAcdefghi");
		for(i=0; i<s1.size(); i++)
		{

           System.out.println("test case " + i + " " + s1.get(i) + "\n");
           obj.checkAlphabets(s1.get(i));

		}



	}




}



/*

Time complexity - O(n) here "n" is size of string i.e linear in time

Space complexity - O(1) constant  

*/