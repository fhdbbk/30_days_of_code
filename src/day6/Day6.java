//A review till Day 5!

package day6;

import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j > 0; j--){
                if(j < i+1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}

