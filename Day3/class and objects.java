
                                   CLASS AND OBJECT

1.BOX:


public class Box
 {

  double w;
  double h;
  double d;
Box( double width,double height,double depth)
{
  w=width;
  h=height;
  d=depth;
}
double volume()
{
  double v;
  v=w*h*d;
  return v;

}



  public static void main(String[] args)
   {
    Box ob = new Box(8.5,7.9,9.6);
     System.out.print(ob.volume());
  }
}


2.CALCULATOR:

Public class calci
 {

  public static void main(String args[])
  {
      System.out.print(Calculator.powerInt(12,10));
      System.out.print(Calculator.powerDouble(25.65,7));
  }
  
  
  
  class Calculator
  {
      static double powerInt(int num1,int num2);
        {
        return Math.pow(num1,num2);
      }
      static double powerDouble(Double num1,int num2);
      {
        return Math.pow(num1,num2);
      }
      }
}



3.PATIENT:

import java.util.*;
import java.lang.*;
import java.io.*;
 class  Patient
{
    String n;
    double h;
    double w;
    
    Patient(double height,double weight)
    {
        
        h = height;
        w= weight;
    }
    double Bmi()
    {
        return((w/(h*h))*703);
        
    }
}
    public class Patients
    {
        public static void main(String args[])
    {
        Patient p = new Patient();
        System.out.print(p.Bmi());
    }
    }



















