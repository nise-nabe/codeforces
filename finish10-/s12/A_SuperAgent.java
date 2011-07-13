package s12;

import java.util.Scanner;

public class A_SuperAgent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine()+scan.nextLine()+scan.next();
		for(int i = 0;i < 4; i++){
			if(line.charAt(i) != line.charAt(line.length()-1-i)){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
