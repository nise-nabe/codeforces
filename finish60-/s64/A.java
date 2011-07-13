package s64;

import java.util.*;

public class A{
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int r = 1;
		for(int i = 1; i < n; ++i){
			r = (r * 3) % 1000003;
		}
		System.out.println(r);
	}
}
