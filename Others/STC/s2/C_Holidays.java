package STC.s2;
import java.util.*;

public class C_Holidays{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		List<List<Integer>>list=new ArrayList<List<Integer>>();
		for(int i=0;i<=n;++i){
			list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;++i){
			for(int a=s.nextInt(),b=s.nextInt();a<=b;++a){
				list.get(a).add(i);
			}
		}
		for(int i=1;i<=n;++i){
			if(list.get(i).size()!=1){
				System.out.println(i+" "+list.get(i).size());
				return;
			}
		}
		System.out.println("OK");
	}
}
