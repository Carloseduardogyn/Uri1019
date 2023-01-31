package Uri;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		System.out.println(n / 365 + " ano(s)");
		n = n % 365;

		System.out.println(n / 30 + " mes(es)");
		n = n % 30;

		System.out.println(n / 1 + " dia(s)");

		sc.close();

	}

}
