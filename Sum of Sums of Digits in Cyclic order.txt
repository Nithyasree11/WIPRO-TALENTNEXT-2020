import java.io.*;
import  java.util.*;

// Read only region start
class SumOfSumsOfDigitsInCyclicOrder {

	public int sumOfSumsOfDigits(int input1){
  String number = String.valueOf(input1);
		int sum = 0;
		
		for (int i = 0; i < number.length(); i++) {
			for (int j = i; j < number.length(); j++) {
                sum += Integer.parseInt(String.valueOf(number.charAt(j)));
			}
		}
		
		return sum;
		
	}
}