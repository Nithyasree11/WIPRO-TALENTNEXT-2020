import java.io.*;
import  java.util.*;

// Read only region start
class MostFrequentlyOccurringDigit {

	public int mostFrequentlyOccurringDigit(int[] input1,int input2){
  StringBuilder input = new StringBuilder();
		for (int ip : input1) input.append(ip);

		int[] frequency = new int[10];

		
		for (int j = 0; j < input.length(); j++) {
			frequency[Integer.parseInt(String.valueOf(input.charAt(j)))]++;
		}

        	int maxFreqIndex = 0;
		int maxFreq = 0;
		
		for (int i = 9; i >= 0; i--) {
			if (frequency[i] > maxFreq) {
				maxFreqIndex = i;
				maxFreq = frequency[i];
			}
		}
		
		
		return maxFreqIndex;

		
	}
}
