package s55;
public class A {
	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).nextLine();
		int cnt = 0;
		for(char c : s.toCharArray()){
			if(Character.isUpperCase(c)){
				++cnt;
			}
		}
		String r = "";
		if(cnt > s.length() / 2){
			r = s.toUpperCase();
		}else{
			r = s.toLowerCase();
		}
		System.out.println(r);
	}
}
