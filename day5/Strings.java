                                                   STRINGS


1.PALINDROME OR NOT:


import java.util.Scanner;
 
class Main

{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}

2.JOIN TWO STRINGS:

import java.util.Scanner;
import java.lang.String;
class Main

{
   public static void main(String args[])
   {

      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a 1 string:");
      String str1 = sc.nextLine();
      System.out.println("Enter a 2 string:");
      String str2 = sc.nextLine();

      int length1 = str1.length();
      int length2 = str2.length();
 
      
      String str3 = str1.concat(str2);
      System.out.println(str3);
   }
}

3.PRINT THE FIRST HALF OF THE EVEN STRING:

import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string");
        String abc= sc.nextLine();
       
        String bcd=null;
        int lenght=abc.length();
        int n=lenght/2;
        if(lenght%2==0)
        { bcd="";
            for(int i=0;i<n;i++)
            {

                bcd=bcd+abc.charAt(i);
               
            }
}
            System.out.print(bcd);
        
       
    }

}




4.PRINT FIIRST TWO CHARACTERS N TIMES:

import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string");
        String abc= sc.nextLine();
       
        String bcd=null;
        int n =abc.length();
        
       if(n<=1)
       {
         bcd = abc;
       }
       else
       {
         for(int i=0;i<n;i++)
         {
           bcd = bcd+bcd.charAt(0)+abc.charAt(1);
         }
       }
       System.out.print(bcd);
      
    }
  
 }


5.REMOVING FIRST AND LAST CHARACTER:


import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string");
        String abc= sc.nextLine();
       
        int n = abc.length();
        String bcd = " ";
       
        for(int i=0;i<n;i++)
        {
           bcd+=abc.substring(1,n-1);
           break;

        }
          System.out.print(bcd);
          
    }
 }


6.PRINTING LONG WORD INSIDE:



import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
         System.out.print("ENETER THE STRING 1");
        String a = scanner.nextLine();
         System.out.print("ENTER THE STRING 2");
        String b = scanner.nextLine();
        if(a.length() > b.length())
           System.out.print(b+a+b); 
        else
          System.out.print(a+b+a);  
    }
}


7.REMOVING X FROM FIRST AND LAST:

import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
     Scanner sc =  new Scanner(System.in);
     
     System.out.print("Enter the string");
         String a = sc.nextLine();  
       
        int len=a.length();
        if(a.charAt(0)=='x'){
            a=a.substring(1, len);
            len=a.length();
        }
        if(a.charAt(len-1)=='x')
            a=a.substring(0, len-1);
    System.out.print(a);
  
}


}

8.PRINTING THE LAST N LETTERS N TIMES:

import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
     Scanner sc =  new Scanner(System.in);
     
     System.out.print("Enter the string");
      String a = sc.nextLine();
   
      
     System.out.print("Enter the number");
      int b = sc.nextInt();
       
        int len=a.length();
        String c="";
        len=len-b;
        for(int i= 0;i<b;i++)
        {
            c=c+a.substring(len);
        }
        System.out.println(c);

    }
}


9.HELLO,WORLD = HWEOLRLLOD


import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
     Scanner sc =  new Scanner(System.in);
     
     System.out.print("Enter the string1");
      String a = sc.nextLine();
      System.out.print("Enter the string2");
      String b = sc.nextLine();
   
      
  
        String c="";
        int alen,blen,len,i=0;
        alen=a.length();
        blen=b.length();
        len=(alen+blen);
        len=Math.min(alen, blen);
        while(i<len){
            c=c+a.charAt(i)+b.charAt(i);
            i++;
        }
        if(len==alen){
            if(alen!=blen)
            c=c+b.substring(len-1);
        }
        else
            c=c+a.substring(len-1);
        System.out.println("String is: "+c);

    }

}

10. INPUT = WIPRO,X N=3 ,OUTPUT=WIPROXWIPROXWIPROX


public class A {
	public static void main(String[] args) {
		String str1 = "Wipro";
		String str2 = "X";
		int separator = 3;
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < separator - 1; i++) 
			sb.append(str1).append(str2);
		sb.append(str1);
		System.out.println(sb);
	}
}

11.




public class Assignment9 {
public static void main(String[] args) {
		String str = "ab*cd";
		String[] strs = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : strs)
			sb.append(x);
System.out.println(sb);
}
}
    


  
12.import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Assignment13 {
public static void main(String[] args) {
String str1 = "abcXY123XYijk"; // "XY123XY"
		String str2 = "XY";
		StringBuffer sb = new StringBuffer();
		while (str1.indexOf(str2) != -1) {	
			int index = str1.indexOf(str2);
			if (index == 0 && index + str2.length() < str1.length() - 1) {
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
				sb.append(str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
				sb.append(str1.charAt(index - 1));
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(sb);
	}

}




