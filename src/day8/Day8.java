package day8;

import java.util.*;

class Day8{
 public static void main(String []argh)
 {
    Scanner in = new Scanner(System.in);
    Map<String, Integer> pb = new HashMap<String, Integer>();
    int N=in.nextInt();
    in.nextLine();
    for(int i=0;i<N;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       pb.put(name, phone);
       in.nextLine();
    }
    while(in.hasNext())
    {
       String s=in.nextLine();
       if(pb.get(s) != null){
           System.out.println(s + "=" + pb.get(s));
       }
       else{
           System.out.println("Not found");
       }
    }
    in.close();
 }
}
