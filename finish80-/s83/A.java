package s83;
import java.util.*;
public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] sp = s.next().split(":");
		int h = new Integer(sp[0]), m = new Integer(sp[1]) + 1;
		if(m == 60){
			h = (h + 1) % 24;
			m = 0;
		}
		for(;; h = (h + 1) % 24){
			for(m %= 60 ;m < 60; ++m){
				if(String.format("%02d", h).equals(new StringBuilder(String.format("%02d", m)).reverse().toString())){
					System.out.printf("%02d:%02d\n", h, m);
					return ;
				}
			}
		}
	}

}
