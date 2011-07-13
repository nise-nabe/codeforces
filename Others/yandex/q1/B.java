package yandex.q1;
import java.util.*;

public class B {
	public static void main(String[] args) {
		System.out.println(new Scanner(System.in).nextLine().replaceAll("\\.{3} *", " \\.\\.\\.").replaceAll(" *,", ", ").replaceAll(" +", " ").trim());
	}
}
