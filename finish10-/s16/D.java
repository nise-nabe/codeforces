package s16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile("\\[(.*)\\.m.\\].*");
		int n = new Integer(scan.nextLine());
		String s = scan.nextLine();
		Matcher mat = p.matcher(s);
		mat.matches();
		String[] prev = mat.group(1).split("[ :]");
		int days = 1, count = 1;
		for(;n-->1;){
			s = scan.nextLine();
			mat = p.matcher(s);
			mat.matches();
			String[] ss = mat.group(1).split("[ :]");
			int ph = new Integer(prev[0]) % 12;
			int h = new Integer(ss[0]) % 12;
			int pm = new Integer(prev[1]);
			int m = new Integer(ss[1]);
			int pap = prev[2].equals("a")?0:1;
			int ap = ss[2].equals("a")?0:1;
			if(pap > ap){
				days++;
				count = 1;
			}else if(pap == ap && ph > h){
				days++;
				count = 1;
			}else if(pap == ap && ph == h && pm > m){
				days++;
				count = 1;
			}else if(pap == ap && ph == h && pm == m){
				count++;
				if(count > 10){
					days++;
					count = 1;
				}
			}else {
				count = 1;
			}
			prev = ss;
		}
		System.out.println(days);

	}
}
