package s09;

import java.util.Scanner;

public class CHexadecimalsNumbers {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt(), result = 0;
		for(int i = 1; new Integer(Integer.toBinaryString(i)) <= n; ++i){
			++result;
		}
		System.out.println(result);

	}
}
