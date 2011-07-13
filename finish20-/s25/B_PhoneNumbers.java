package s25;
import java.util.Scanner;
/**
 * 
 * Phone numbers
 * http://codeforces.com/contest/25/problem/B
 * 
 * ＜問題＞
 * 与えられた数字を2-3個毎にハイフンで分割したものを求めよ
 * 
 * ＜方針＞
 * 2-3個で分割されてればなんでもいいようなので
 * 基本２個で分割して，奇遇で最後だけ２個か３個かを決めた．
 * 
 * @author nise_nabe
 *
 */
public class B_PhoneNumbers {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int a = s.length() % 2 < 1 ? 2 : 3;
		for(int i = 0; i < s.length() - a; i+=2){
			System.out.print(s.substring(i,i+2)+"-");
		}
		System.out.println(s.substring(s.length()-a,s.length()));
	}
	
}
