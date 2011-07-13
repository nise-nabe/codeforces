package s18;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = new Integer(scan.nextLine());
		List<Integer> list = new ArrayList<Integer>();
		for(;n-->0;){
			list.add(scan.nextInt());
		}
		int c = 0;
		for(int i = 1; i < list.size()-1; i++){
			long a = sum(list.subList(0, i));
			long b = sum(list.subList(i, list.size()));
			if(a>=0&&b>=0&&a==b){
				c++;
			}
		}
		System.out.println(c);
	}
	static long sum(List<Integer> is) {
		long c = 0;
		for (int i : is)
			c += i;
		return c;
	}
	
}
