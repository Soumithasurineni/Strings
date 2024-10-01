import java.util.*;
import java.lang.*;
import java.io.*;

// Given string count the occurrences of each character in the string.
// Input:"hello"
// Output:h-1,e-1,l-2,o-1.
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] charArray=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
		    hm.put(charArray[i],hm.getOrDefault(charArray[i],0)+1);
		}
		System.out.println(hm);

	}
}
