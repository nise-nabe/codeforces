package s16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(;m-->0;){
			list.add(Arrays.asList(new Integer(scan.nextInt()), new Integer(scan.next())));
		}
		Collections.sort(list, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> e0, List<Integer> e1) {
				return e1.get(1)-e0.get(1);
			}
		});
		int result = 0;
		for(List<Integer> l : list){
			int c = Math.min(n, l.get(0));
			result += c * l.get(1);
			n -= c;
			if(n == 0){
				break;
			}
		}
		System.out.println(result);
	}
}
