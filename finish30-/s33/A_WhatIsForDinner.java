package s33;
import java.util.*;

public class A_WhatIsForDinner{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
        boolean[]b=new boolean[m];
        Map<Integer,List<Integer>>map=new HashMap<Integer, List<Integer>>();
        for(;n-->0;){
            int r=s.nextInt();
            if(!b[r-1]){
                map.put(r,new ArrayList<Integer>());
                b[r-1]=true;
            }
            map.get(r).add(s.nextInt());
        }
        int sum=0;
        for(List<Integer>list:map.values()){
           sum+=Collections.min(list);
        }
        System.out.println(Math.min(sum,k));
    }
}
