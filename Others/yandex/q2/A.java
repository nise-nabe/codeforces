package yandex.q2;
import java.util.*;

public class A {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt() - 1;
		for(;n>=5;){
			n -= 5; n >>= 1;
		}
		System.out.println(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}[n]);
	}
}
