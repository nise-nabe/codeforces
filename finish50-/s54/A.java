package s54;
public class A {
	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).nextLine();
		int p = 0;
		String r = "YES";
		for(char c : "hello".toCharArray()){
			int i = s.indexOf(c, p);
			if(i < 0){
				r = "NO";
				break;
			}
			p = i + 1;
		}
		System.out.println(r);
	}
}
