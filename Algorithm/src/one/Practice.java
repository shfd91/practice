package one;

import java.util.Scanner;

public class Practice {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		if (max < d) {
			max = d;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 네개를 입력하세요.");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		// String str = stdIn.nextLine();

		System.out.println(a + " " + b + " " + c + " " + d + "을 입력하였습니다.");
		System.out.println("최대값은 " + max4(a, b, c, d) + "입니다.");
	}
}
