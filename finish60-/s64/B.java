package s64;

import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		s.nextLine();
		String line = s.nextLine();
		String[] sens = line.split("[\\!\\?\\.] +");
		int r = 0, len = 0;
		for(int i = 0; i < sens.length; ++i){
			sens[i] = sens[i].replaceAll("[\\!\\?\\.]","");
			if(len + sens[i].length() < n){
				if(len == 0){
					++r;
				}
				len += sens[i].length() + 2;
			}else if(sens[i].length() < n){
				++r;
				len = sens[i].length() + 2;
			}else{
				r = 0;
				break;
			}
		}
		System.out.println(r==0?"Impossible":r);
	}
}
