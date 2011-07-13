package s12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class B_CorrectSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] cs = scan.nextLine().toCharArray();
		Arrays.sort(cs);
		int i;
		for(i = 0; i < cs.length&&cs[i]==48;i++);
		if(i!=0&&i<cs.length){
			cs[0]=cs[i];
			cs[i]=48;
		}
		System.out.println(scan.nextLine().equals(new String(cs))?"OK":"WRONG_ANSWER");
	}
}
