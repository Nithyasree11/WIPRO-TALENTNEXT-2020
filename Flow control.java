                                                FLOW CONTROL
1.COMMAND LINE ARGUMENT



class ABCD
{
    public static void main (String[] args) 
    {
      
        if (args.length ==0)
            {
            System.out.println("No Values");
    }
        else{
            for(String i : args)    
                System.out.print(i+" , ");
        
        }
        }

2.LOWERCASE TO UPPERCASE :

import java.util.Scanner;

public class JavaProgram
{
    public static void main(String[] input)
    {
        String strUpper, strLower;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter one word/name in Uppercase : ");
        strUpper = scan.nextLine();
        
        strUpper = strUpper.toUpperCase();
        System.out.print("Equivalent Word/Name in Lowercase : " + strUpper);
    }
}




3.PALINDROME OR NOT:


import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number");
     int n  = sc.nextInt();
     int m = n;int s =0;
     while(n!=0)
     {
       int rem = n%10;
       
       s = s*10+rem;
       n = n/10;
     }
     if(m == s)
     {
       System.out.print("Palindrome");
     }
     else{
        System.out.print("Not a Palindrome");
     }
   }
 }



4.REVERSE OF A NUMBER:

import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number");
     int n  = sc.nextInt();
     int m = n;int s =0;
     while(n!=0)
     {
       int rem = n%10;
       
       s = s*10+rem;
       n = n/10;
     }
     
     
       System.out.print(s);
     }
   
   }



5. PRIME


import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number");
     int n  = sc.nextInt();
     for(int i =2;i<=n;i++)
     {
       if(n%i == 0)
       {
          System.out.print("Not a Prime Number");
          break;
       }
       else
       {
          System.out.print("Prime Number");
          break;
       }
     }
     
     
      
   }
   }


6.PRIME OR COMPOSITE

import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number1");
    
     int n= sc.nextInt();
    
     
     if((n == 0 )|| (n==1))
     {
       
        System.out.print("Neither prime nor composite");

     }
     else if(n>2)
     {
       for(int i=2;i<=2;i++)
       {
         if(n%i == 0)
         {
           
        System.out.print("Not a prime no");
         }
         else
         
        System.out.print("Prime no");
       }
     }
     else
     {
       
        System.out.print("Please enter  a number");
     }
        
      
       
        
      }
    }

 
7.EVEN NUMBERS FROM 23 TO 57:

import java.util.*;
class Main {
  public static void main(String args[]) {
   
    
 for(int i =23;i<=57;i++)
 {
   if(i%2 == 0)
   {
     System.out.print(i+"\n");
   }
  
 }
  }
}


8.PRINT NUMBERS FROM 1 TO 10:

import java.util.*;
class Main {
  public static void main(String args[]) {
   
    
 for(int i =1;i<=10;i++)
 {
  
     System.out.print(i+"\t");
     
   }
  
 }
  
}
  


9.SUM OF DIGITS:

import java.util.*;
class Main {
  public static void main(String args[]) {
    int sum;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number");
    int n = sc.nextInt();
    
 for(sum =0;n!=0;n/=10)
 {
    sum+=n%10;
 }
   System.out.print(sum);
}
}



								

10. POSITIVE,NEGATIVE,ZERO:

import java.util.*;


class Main {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1>0)
      System.out.println("The number"+num1+"is positive");
    else if(num1<0)
      System.out.println("The number"+num1+"is negative");
    else
      System.out.println("The number"+num1+"is equal to 0");
  }
}

11.EVEN OR ODD:

import java.util.*;
class Main {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1%2==0)
      System.out.println("The number"+num1+"is even");
    else 
      System.out.println("The number"+num1+"is odd");
    
  }
}


12. INITIALIZE AND DISPLAY CHARACTER IN ALPHABETICAL ORDER:

import java.util.*;
class Main {
  public static void main(String[] args) {
  char ch1,ch2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  System.out.println("enter character 2:");
  ch2=sc.next().charAt(0);
  if(ch1>ch2)
  {
    System.out.println(ch2+","+ch1);
  }
  else{
   System.out.println(ch1+","+ch2);
  } 
  }
  
  }



13.ALPHABET,DIGIT,SPECIAL CHARACTER:

import java.util.*;
class Main {
  public static void main(String[] args) {
  char ch1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  if((ch1>='a' && ch1<='z')||(ch1>='A' && ch1<='Z'))
    {
        System.out.print("Entered character"+ ch1 + "is Alphabet");
    }
  else if(ch1>=48 && ch1<=57)
    {
        System.out.print("Entered character"+ ch1 + "isDigit");

    }
    
    else
    {
        System.out.print("Entered character"+ ch1 + "is special character");

    }
  }
  
  }


14. ACCEPT GENDER AND PRINT PERCENTAGE:

import java.util.*;

class Main {
  public static void main(String[] args) {
    String gen=args[0];
    int age= Integer.parseInt(args[1]);
    if(gen.equalsIgnoreCase("Female"))
    {
      if(age>=1 && age<=58)
      {
        System.out.println("Interest == 8.2%");
      }
      else if (age>=58 && age<=120)
      {
        System.out.println("Interest == 7.6%");
      }
    }
      else
      {
        if(age>=1 && age<=60)
      {
        System.out.println("Interest == 9.2%");
      }
      else if(age>=60 && age<=120)
      {
        System.out.println("Interest == 8.3%");
      }
      }
      
  }
}




15. COLOURS WITH SWITCH CASE:

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter starting colour in caps :");
    char ch=s.next().charAt(0);
    switch(ch){
    case 'R':
    System.out.println("Red");
    break;
    case 'Y':
    System.out.println("Yellow");
    break;
    case 'G':
    System.out.println("Green");
    break;
    case 'B':
    System.out.println("Blue");
    break;
    case 'w':
    System.out.println("White");
    break;
    case 'O':
    System.out.println("Orange");
    break;
    
    default:
    System.out.println("Invalid month");
    }
       
  }
}

16. MONTHS WITH SWITCH CASE:

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter corresponding number of a month :");
    int n=s.nextInt();
    switch(n){
    case 1:
    System.out.println("January");
    break;
    case 2:
    System.out.println("February");
    break;
    case 3:
    System.out.println("March");
    break;
    case 4:
    System.out.println("April");
    break;
    case 5:
    System.out.println("May");
    break;
    case 6:
    System.out.println("June");
    break;
    case 7:
    System.out.println("July");
    break;
    case 8:
    System.out.println("August");
    break;
    case 9:
    System.out.println("September");
    break;
    case 10:
    System.out.println("October");
    break;
    case 11:
    System.out.println("November");
    break;
    case 12:
    System.out.println("December");
    break;
    default:
    System.out.println("Invalid month");
    }
       
  }
}


17.* IN FLOYD'S FORMAT:

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
    }
}



18. FIRST FIVE NUMBERS:

import java.util.*;

class Main {
  public static void main(String[] args) {
    int count=0,i=1;
    {
      while(count<5)
      {
        if(i%2==0 && i%3==0 && i%5==0)
        {
          System.out.println(i);
          count++;
        }
        i++;
      }
    }
  }}



19. PRINT NUMBERS FROM 1 TO 99:

import java.util.*;

class Main {
  public static void main(String[] args) {
    int i =0;
       int num =0;
       
       String  primeNumbers = "";

       for (i = 10; i < 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 10 to 99 are :");
       System.out.println(primeNumbers);
   }
}




