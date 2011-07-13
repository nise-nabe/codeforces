package yandex.q1;
public class A {
	public static void main(String[] args) {
		char[] line = new java.util.Scanner(System.in).next().toCharArray();
		int len = line.length;
		for (int i = 0; i < len; ++i) {
			for (; i>= 0 && i + 1 < len
					&& line[i] == line[i+ 1]; --i) {
				System.arraycopy(line, i+2, line, i, (len-=2) - i);
			}
		}
		System.out.println(new String(line).substring(0,len));

//		StringBuilder line = new StringBuilder(new java.util.Scanner(System.in).next());
//		for (int i = 0; i < line.length(); ++i) {
//			for (; i >= 0 && i + 1 < line.length()
//					&& line.charAt(i) == line.charAt(i + 1);--i) {
//				line.delete(i, i+2);
//			}
//		}
//		System.out.println(line);
	
	}
}
