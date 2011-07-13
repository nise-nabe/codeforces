package s16;

import java.util.Collections;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		char[][] cs = new char[n][];
		for(int i = 0;i < n; i++){
			cs[i] = scan.next().toCharArray();
		}
		System.out.println(isVir(cs)||isHor(cs)?"YES":"NO");
	}
	
	static boolean isVir(char[][] cs){
		for(int i = 0; i < cs[0].length-1; i++){
			if(cs[0][i] == cs[0][i+1]){
				return false;
			}
		}
		for(int i = 0; i < cs[0].length; i++){
			for(int j = 0; j < cs.length - 1; j++){
				if(cs[j][i] != cs[j+1][i]){
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean isHor(char[][] cs){
		for(int i = 0; i < cs.length -1 ; i++){
			if(cs[i][0] == cs[i+1][0]){
				return false;
			}
		}
		for(int i = 0; i < cs.length; i++){
			for(int j = 0; j < cs[i].length-1; j++){
				if(cs[i][j] != cs[i][j+1]){
					return false;
				}
			}
		}
		return true;
	}
}
