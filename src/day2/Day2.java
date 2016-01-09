//Arithmetic!
package day2;

import java.util.*;

public class Day2 {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      // Run some computations....
      double Tip = M * (T/100.0);
      double Tax = M * (X/100.0);
      
      int total = (int) Math.round(M + Tip + Tax);
      
      // ...then print!
      System.out.println("The final price of the meal is $" + total + ".");
      sc.close();
    }
}
