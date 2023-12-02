  break statement >>>>> exit from control structure 
        continue statement >>>>> skip  
                  return statement >>>>> Exit from current method 
    ( two forms of break statement - unlabeled and labeled. ) 
   
    Labeled break statement is used to terminate the outer loop, the loop should be labeled for it to work. 
    Here is an example showing java break label statement usage.
-----------------------------------------------------------------------------------------------------------------------------------
    package com.journaldev.util;

    public class JavaBreakLabel {

	         public static void main(String[] args) {
                  		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
                  		boolean found = false;
                  		int row = 0;
                  		int col = 0;
                  		// find index of the first int greater than 10
                  		searchint:
                  		for (row = 0; row < arr.length; row++) {
                  			for (col = 0; col < arr[row].length; col++) {
                  				if (arr[row][col] > 10) {
                  					found = true;
                  					// using break label to terminate outer statements
                  					break searchint;
                  				}
                  			}
                  		}
                  		if (found)
                  			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
              }
                  
}
-----------------------------------------------------------------------------------------------------------------------------------
label:{
	-block of code (we want to break it)
	-break label; >>> بيخرجني برا خالص
	- continue label ;  بيخليني اروح ابدا من هناك واكنسل اي حاجه بعدي  
		}

    
