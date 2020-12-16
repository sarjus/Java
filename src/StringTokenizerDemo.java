import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String args[]) 
    { 
        /*StringTokenizer(String str) :
		str is string to be tokenized.*/
		System.out.println("Using Constructor 1 - "); 
        StringTokenizer st1 = 
             new StringTokenizer("Hello, how are you", " "); 
        while (st1.hasMoreTokens()) 
            System.out.println(st1.nextToken()); 
        /*StringTokenizer(String str, String delim) :
    	delim is set of delimiters that are used to tokenize
    	the given string.*/
    System.out.println("Using Constructor 2 - "); 
    StringTokenizer st2 =  
         new StringTokenizer("JAVA:Code:Test String", ":"); 
    while (st2.hasMoreTokens()) 
        System.out.println(st2.nextToken()); 

    /*StringTokenizer(String str, String delim, boolean flag):
     * If the flag is false, delimiter characters serve to separate tokens.
     * If the flag is true, delimiter characters are considered to be tokens.
     */

    System.out.println("Using Constructor 3 - "); 
    StringTokenizer st3 =  
         new StringTokenizer("JAVA:Code:String", ":",  true); 
    while (st3.hasMoreTokens()) 
        System.out.println(st3.nextToken()); 
  
       
    } 

}

