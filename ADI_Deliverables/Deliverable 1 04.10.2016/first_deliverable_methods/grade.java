import java.util.*;

class Main {

public static void main(String [] args){
	Scanner input = new Scanner(System.in);	   
		   
			   
			   System.out.println("Please choose a grade point range from 100 to 0");
			   int i = input.nextInt(); 
			   
					   if (i >= 90 && i <= 100){
					      System.out.println('A');
					   }else if (i >= 80 && i <= 90){
					      System.out.println('B');
					   }else if (i >= 70 && i <= 80){
					      System.out.println('C');
					   }else if (i >= 60 && i <= 70){
					      System.out.println('D');
					   }else if (i >= 0 && i <= 60){
					      System.out.println('F');
					   }else {
					      System.out.println("You either chose a number above 100 at which point you have an A+ or you chose a negative number at which point you're being cheeky ;)");
					      
					   }
					   
		   	 }
		   
	   	}
