import java.util.*;

class Main {
  public static void main(String[] args) {
    string5();
  }
  
  public static void string5(){
         Scanner input = new Scanner(System.in);
         System.out.println("Pick a number");
         int thierNumber = input.nextInt();
         int iterations = 5;
            for (int i = 0; i < iterations; i++) {
               System.out.print(thierNumber);
             }
          }

}