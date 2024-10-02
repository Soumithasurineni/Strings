import java.util.*;
import java.lang.*;
import java.io.*;

/*  Longest Substring Without Repeating Characters
    Input: abcabcd
    Output:4(abcd)
*/

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet < Character > hs = new HashSet < > ();
        int left = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            while (hs.contains(str.charAt(i))) {
                hs.remove(str.charAt(left));
                left++;
            }
            hs.add(str.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        System.out.println("The max" + max);

    }
}