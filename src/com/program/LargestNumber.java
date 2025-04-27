package com.program;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LargestNumber {
	public static void main(String[] args) {
		
	}
	 public void largestNumber(final List<String> A) {
		  Collections.sort(A, new Comparator<String>(){ 
			  
		        // A comparison function which is used by  
		        // sort() in printLargest() 
		        @Override
		        public int compare(String X, String Y) { 
		          
		        // first append Y at the end of X 
		        String XY=X + Y; 
		          
		        // then append X at the end of Y 
		        String YX=Y + X; 
		          
		        // Now see which of the two formed numbers  
		        // is greater 
		        return XY.compareTo(YX) > 0 ? -1:1; 
		    } 
		    }); 
		          
		    Iterator it = A.iterator(); 
		  
		    while(it.hasNext()) 
		        System.out.print(it.next()); 
		      
	    }
}
