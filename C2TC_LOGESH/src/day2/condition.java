package day2;

public class condition {
	public static void main(String args[]) {
		//if condition
		int i=10;
		 if(i>8)
			 System.out.println("i is greater than 8");
		 //if else
		 int a= 10,b= 20;
		 if(a>b)
           System.out.println("a is greater than b");
		 else
			 System.out.println("b is greater than a");
		 //nested if
		 int e=10,f=1;
		 if(e>f)
			 System.out.println("e is greater than f");
		    if (e==10)
		    	System.out.println("e is ten");
		    else
		    	System.out.println("e is not ten");	
		 //switch statement
		    int course =2 ;
		    switch (course) {
		    case 1:
		    	System.out.println("CSE");
		    	break;
		    case 2:
		    	System.out.println("ECE");
		    	break;
		    case 3:
		    	System.out.println("EEE");
		    	break;
		    case 4:
		    	System.out.println("MECH");
		    	break;
		    default:
		    	System.out.println("the course not found");
		    	break;
	}
	}

}
