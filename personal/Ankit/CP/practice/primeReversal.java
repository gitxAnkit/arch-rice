import java.io.*;
import java.util.*;
public class primeReversal {
    public static void main(String[] args) {
        
        /*
          Problem
You are given two binary strings A and B, each of length N.
 You can perform the following operation on string AA any number of times:

Select a prime number X.
Choose any substring of string A having length X and reverse the substring.
Determine whether you can make the string A equal to BB using 
any (possibly zero) number of operations.

A substring is obtained by deleting some (possibly zero) elements from th
e beginning and some (possibly zero) elements from the end of the string.

Input Format
The first line of input will contain a single integer T,
 denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an 
 integer N— the length of the strings A and B.
The second line contains the binary string A.
The third line contains the binary string B.
         */

        // Solution(not mine)

	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	for(int i=0;i<n;i++){
	    int len=sc.nextInt();
	    String a=sc.next();
	    String b=sc.next();
	    int count1=0;
	    int count2=0;
	    
	     for(int j=0;j<len;j++){
	         if(a.charAt(j)=='1'){
	             count1+=1;
	         }
	         if(b.charAt(j)=='1'){
	             count2+=1;
	         }
	       
	    }
	   
	   {
	       if(count1==count2){
	           System.out.println("YES");
	       }
	       else{
	           System.out.println("NO");
	       }
	   }
	} sc.close();
    }
}
