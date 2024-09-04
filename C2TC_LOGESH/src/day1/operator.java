package day1;

public class operator {
		   public static void main(String args[])
		           {
		// arithmetic operator
		        int a=10,b=10;
		        System.out.println("a+b=" +(a+b));
		        System.out.println("a-b=" +(a-b));
		        System.out.println("a*b=" +(a*b));
		        System.out.println("a%b=" +(a%b));
		        System.out.println("a/b=" +(a/b));
		        
		//increment or decrement operator
		        int result1, result2;
		        System.out.println("Value of a: " + a);
		        result1 = ++a;
		        System.out.println("After increment: " + result1);
		        System.out.println("Value of b: " + b);
		        result2 = --b;
		        System.out.println("After decrement: " + result2);
		    
		//assignment operator
		   
		    	int d= 4;
		        int var;
		        var = d;
		        System.out.println("var using =: " + var);
		        var += d;
		        System.out.println("var using +=: " + var);
		        var *= d;
		        System.out.println("var using *=: " + var);
		      
		// relational operator
		        int e = 7, f = 11;
		        System.out.println("a is " + e + " and b is " + f);
		        System.out.println(e == f); 
		        System.out.println(e!= f);  
		        System.out.println(e > f); 
		        System.out.println(e< f);  
		        System.out.println(e >= f);  
		        System.out.println(e<= f); 

		// ternary operator
		    	int februaryDays = 29;
		        String result;
		        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		        System.out.println(result);
		   
		}


}
