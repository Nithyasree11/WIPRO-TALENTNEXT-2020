                           WIPRO TALENTNEXT -DAY 2

1.LAST DIGIT OF A NUMBER:

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    
    System.out.print("Enter a number");
    int n = sc.nextInt();
    
    while(n!=0)
    {
      int m = n%10;
      System.out.print(m);
      break;
      
    }
  }
}


2.SECOND LAST DIGIT OF A NUMBER:

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    
    System.out.print("Enter a number");
    int n = sc.nextInt();
    
    while(n!=0)
    {
      int m = (n%100)/10;
      System.out.print(m);
      break;
      
    }
  }
  }


3.SUM OF LAST DIGITS OF TWO NUMBERS:


import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    
    
    System.out.print("Enter a number");
    int n = sc.nextInt();
    
    System.out.print("Enter a number");
    int n1 = sc.nextInt();
    
    
    
      int m = n%10;
      int m1 = n1%10;
      int e = m +m1;
    
      System.out.print(e);
      
      
    
  }
  }


4.MAXIMUM ELEMENT IN THE ARRAY:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,max;
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
		    if(max<a[i])
		    {
		        max=a[i];
		        
		    }
		}
		System.out.println("Maximum value:"+max);
	}
}






5.NO OF TIME MAXIMUM ELEMENT REPEATS IN THE ARRAY:S

import java.io.*;
public class Main
{
    static int maxRepeating(int arr[],int n,int k)
    {
    for(int i=0;i<n;i++)
    arr[(arr[i]%k)]+=k;
    int max=arr[0],result=0;
    for(int i=1;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
            result=i;
        }
    }
    return result;
    }
	public static void main(String[] args) {
	    int arr[]={1,2,2,3,4,4,5,6,6,6};
	    int n=arr.length;
	    int k=10;
		System.out.println("Maximumrepeating element is:"+maxRepeating(arr,n,k));
	}
}



6.FACTORIAL

public class Main
{
    static int factorial(int n)
    {
        if(n==0)
            return 1;
            return n*factorial(n-1);
    }
	public static void main(String[] args) {
	    int num=5;
		System.out.println("Factorial of"+num+"is"+factorial(5));
	}
}



7.REMOVING CHARACTERS FROM THE STRING WHICH APPEARS MORE THAN ONCE:

import java.util.*;
public class Main
{
    static String remChar(char str[],int n)
    {
        int index=0,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
            if(str[i]==str[j])
            {
                break;
            }
            }
            if(j==i)
            {
                str[index++]=str[i];
        
            }
        }
        return String . valueOf(Arrays . copyOf(str,index));
    }
    
	public static void main(String[] args) {
	    char str[]="malayalam".toCharArray();
	    int n=str.length;
		System.out.println(remChar(str,n));
	}
}

8.LEAST PERFECT SQUARE

import java.io.*;
import java.util.*;
public class PerfectSquareDivByNum 
{
    public static void main(String[]args)
    {
        int arr[]={21,36,66};
        int n=arr.length;
        System.out.print("Least Perfect Square divisible  by 21,36,66 is: ");
        System.out.println(LeastPerfectSquare(arr,n));
    }
    public static int LeastPerfectSquare(int arr[],int n)
    {
        int minsquare;
        int l=arraylcm(arr,n);
        minsquare=(int)l;
        int count=0;
        while(l>1 && l%2==0)
        {
            count++;
            l=l/2;
        }
        if(count % 2 !=0)
        {
            minsquare= minsquare *2;
        }
        int i=3;
        while(l>1)
        {
            count=0;
            while(l%i==0)
            {
                count++;
                l=l/i;
            }
            if(count%2!=0)
            {
                minsquare=minsquare*i;
            }
            i=i+2;
        }
        return minsquare;
    }
    public static int arraylcm(int arr[],int n)
    {
        if(n<1)
        {
            return 0;
        }
        int l=arr[0];
        for(int i=1;i<n;i++)
        {
            l=l*arr[i]/gcd(l,arr[i]);
        }
        return l;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}

