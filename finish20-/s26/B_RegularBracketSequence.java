package s26;
import java.util.Stack;

public class B_RegularBracketSequence {
	public static void main(String[] args) throws Exception {
		int buf;
		Stack<Integer> stack = new Stack<Integer>();
		int c = 0;
		while ((buf = System.in.read()) > 0) {
			if (buf == 40) {
				stack.push(0);
			} else if (buf == 41) {
				if (!stack.isEmpty()) {
					stack.pop();
					c+=2;
				}
			}
		}
		System.out.println(c);
	}

}
