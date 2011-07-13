package s51;

public class B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	}

	static class Scanner {
		java.io.BufferedInputStream bis;
		
		public Scanner(java.io.InputStream is) {
			bis = new java.io.BufferedInputStream(is);
		}

		public String next() {
			StringBuilder sb = new StringBuilder();
			int b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				for (; !Character.isWhitespace(b); b = bis.read()) {
					sb.append((char) b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sb.toString();
		}

		public int nextInt() {
			int r = 0, s = 1, b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				if ((s = b == '-' ? -1 : 1) < 0) {
					b = bis.read();
				}
				for (; Character.isDigit(b); b = bis.read())
					r = r * 10 + b - '0';
			} catch (Exception e) {
			}
			return s * r;
		}
	}

}