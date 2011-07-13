package s09;
import java.util.Scanner;

public class ADieRoll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 7 - Math.max(scan.nextInt(), scan.nextInt());
		switch (result) {
		case 1:
			System.out.println("1/6");
			break;
		case 2:
			System.out.println("1/3");
			break;
		case 3:
			System.out.println("1/2");
			break;
		case 4:
			System.out.println("2/3");
			break;
		case 5:
			System.out.println("5/6");
			break;
		case 6:
			System.out.println("1/1");
			break;
		default:
			System.out.println("0/1");
			break;
		}
	}
}
