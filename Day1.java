                                              WIPRO TALENTNEXT PROGRAMS - DAY 1


1.POSITIVE,NEGATIVE,ZERO:

import javax.lang.model.util.ElementScanner6;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a number");
    int n = sc.nextInt();
    if(n > 0)
    {
      System.out.print("Positive");

    }
    else if(n < 0)
    {
        System.out.print("Negative");
    }
    else
    {
         System.out.print("Zero");
    }
  }
}


2.GREATEST OF TWO NUMBERS:

import javax.lang.model.util.ElementScanner6;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a first number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter a Second number : ");
    int n2 = sc.nextInt();
    if(n1 > n2)
    {
      System.out.print("The greatest number is : "+n1);

    }
   
    else
    {
         System.out.print("The greatest number is : "+n2);

    }
  
}
}

3.EVEN OR ODD:


import javax.lang.model.util.ElementScanner6;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a  number : ");
    int n1 = sc.nextInt();
   
    if(n1%2 == 0)
    {
      System.out.print("EVEN");

    }
   
    else
    {
         System.out.print("ODD");

    }
  
}
}



4.PRINT NUMBERS FROM 1 TO 100:


class Main {
  public static void main(String[] args) {
  
int n=1;
while(n>0)
{
  System .out.print(n);
  n++;
  if(n == 101)
   {
     break;
   }
}
}
}



5.ACCEPT TWO NUMBERSAND PRINT GREATEST:


import javax.lang.model.util.ElementScanner6;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a first number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter a Second number : ");
    int n2 = sc.nextInt();

    int n3 = n1+n2;
    if(n3%2 == 0)
    {
      System.out.print("EVEN");

    }
   
    else
    {
      System.out.print("ODD");
    }
  }
}


6.ALTERNATE NUMBERS FROM 1 TO 99:

class Main {
  public static void main(String[] args) {
  
int n=1;
while(n<=100)
{
  System .out.print(n);
  n+=2;
  if(n == 100)
   {
     break;
   }
}
}
}


7.ALTERNATE NUMBERS FROM 0 TO 100:


class Main {
  public static void main(String[] args) {
  
int n=0;
while(n<=100)
{
  System .out.print(n);
  System .out.println();
  n+=2;
  
}
}
}


8.BACKWARDS FROM 100 TO 0:


class Main {
  public static void main(String[] args) {
  
int n=100;
while(n<=100)
{
  System .out.print(n);
  System .out.println();
  n--;
  if(n == 0)
  {
    break;
  }
  
}
}
}



9.BACKWARDS FROM 100 TO  1 BY SKIPPING 2 NUMBERS INBETWEEN:


class Main {
  public static void main(String[] args) {
  
int n=100;
while(n>0)
{
  System .out.print(n);
  
  n-=3;
}
}
}