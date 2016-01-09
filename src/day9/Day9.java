package day9;

import java.util.*;
public class Day9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
        sc.close();
    }
   static  int find_gcd(int a,int b){
          //Write the base condition
          if(b == 0)
              return a;
          return find_gcd(b,a%b);
      }
   
}
 

