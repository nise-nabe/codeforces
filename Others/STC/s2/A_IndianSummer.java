package STC.s2;
import java.util.*;

public class A_IndianSummer{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		s.nextLine();
		Set<String> set = new HashSet<String>();
		for(;s.hasNext();){
			set.add(s.nextLine());
		}
		System.out.println(set.size());
	}
}
