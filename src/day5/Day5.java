//Loops!
package day5;


import java.util.*;

public class Day5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            int sum = a;
            for(int j = 0;j < N;j++){
                sum += (Math.pow(2,j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
            sc.close();
        }
    }
    
    
}