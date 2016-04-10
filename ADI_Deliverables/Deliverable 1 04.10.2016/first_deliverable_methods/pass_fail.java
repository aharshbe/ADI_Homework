import java.util.*;

class Main {
	
	
	public static void main(String [] args){
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your current grade points between 0 and 100");
		int theirPoints = input.nextInt();
		if (theirPoints >= 65){
			System.out.println("Pass");
		}else if (theirPoints <= 65){
			System.out.println("Fail");
		}else{
			System.out.println("Those points are negative at which point you're being cheeky!");
		}
		
		
		
	}
	
	
	
	
}