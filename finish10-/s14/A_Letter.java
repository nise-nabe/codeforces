package s14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Letter {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m=scan.nextInt();
		List<String> list = new ArrayList<String>();
		String line = "";
		for(;scan.hasNext()&&!(line=scan.nextLine()).contains("*"););
		int l = Math.max(0, line.indexOf('*'));
		int r = line.lastIndexOf('*');
		int e = 0;
		list.add(line);
		for(;scan.hasNext();list.add(line)){
			line = scan.nextLine();
			l = Math.min(l, line.indexOf('*')<0?l:line.indexOf('*'));
			r = Math.max(r, line.lastIndexOf('*'));
			if(line.contains("*")){
				e=list.size();
			}
		}
		for(int i = 0; i < e+1; i++){
			System.out.println(list.get(i).substring(l, r+1));
		}
	}
}
