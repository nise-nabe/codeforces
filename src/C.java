import java.util.*;

public class C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt(), a = s.nextInt()-1 , b = s.nextInt()-1;
		int h = b/m-a/m;
		int x = 3;
		if(h == 0){
			x = 1;
		}else if(h == 1){
			x = 2;
			if(a%m==0 && (b%m==m-1||b==n-1)){
				--x;
			}
		}else{
			x = 3;
			if(a%m==0){
				--x;
			}
			if(b%m==m-1||b==n-1){
				--x;
			}
			if(a%m==b%m+1){
				--x;
			}
		}
		System.out.println(x);
	}
}
