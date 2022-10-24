package Hackerank;

import java.util.Scanner;
import java.util.Stack;

public class simpleText {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	         Stack<String> stack = new Stack<>();
	         int totalOperation = Integer.parseInt(in.nextLine().trim());
	         StringBuilder builder = new StringBuilder(); 
	        //  String result = "";
	        //  int index = 0;
	         while (totalOperation > 0) {
	             String st = in.nextLine().trim();
	             int operation = Integer.parseInt(st.substring(0, 1));
	             switch (operation) {
	                case 1: {
	                    String result = st.substring(2, st.length());
	                    stack.push(builder.toString());
	                    builder.append(result);
	                    break;
	                }
	                case 2: {
	                    stack.push(builder.toString());
	                    String result = st.substring(2, st.length());
	                    int index = Integer.parseInt(result);
	                    builder.delete( builder.length()-index, 
	                                    builder.length());
	                    break;
	                }
	                case 3: {
	                    String result = st.substring(2, st.length());
	                    int index = Integer.parseInt(result);
	                    System.out.println(builder.charAt(index-1));
	                    break;
	                } 
	                case 4: {
	                    StringBuilder temp = new StringBuilder(stack.pop());
	                    builder = temp;
	                    break;
	                } 
	            }
	            totalOperation--;
	        }
	        in.close();    
	    }
}
