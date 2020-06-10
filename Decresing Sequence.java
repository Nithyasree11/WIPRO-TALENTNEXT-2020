import java.io.*;
import  java.util.*;

// Read only region start
class DecreasingSequence {

	public class Result{
		public final int output1;
		public final int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
	}
   public Result decreasingSeq(int[] input1,int input2){
  boolean flag = false;
		 int decCount = 0;
		int longLen = 0;
		int sCount = 0;
		
		
		for (int i = 0; i < input2 - 1; i++) {			
			if (input1[i] > input1[i + 1]) {
				if (flag == false) {
					flag = true;
					sCount++;
				}
				
				decCount++;
				
				longLen = decCount > longLen ? decCount : longLen; 
			} else {
				if (flag == true) {
					flag = false;
					decCount = 0;
				}
			}
		}
		
		if (sCount > 0) longLen++; 
        
		return new Result(sCount, longLen);
    
        
    }
}
