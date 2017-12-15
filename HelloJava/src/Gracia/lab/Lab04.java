package Gracia.lab;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		// #16 - if 문
		int n = 1;
		int k = 2;
		int r = n; // r = 1
		if (k < n) // 2 < 1
			r = k;
		System.out.printf("%d %d %d\n", n, k, r);

		int q;
		if (n < k) // 1 < 2
			q = k; // q = 2
		else
			q = k + n;
		System.out.printf("%d %d %d\n", n, k, q);

		r = k; // r = 2
		if (r < k) // 2 < 2
			n = r;
		else
			k = n; // k = 1;
		System.out.printf("%d %d %d\n", n, k, r);

		r = 3;
		k = 2;
		if (r < n + k) // 3 < 1 + 2
			r = 2 * n;
		else
			k = 2 * r; // k = 2 * 3
		System.out.printf("%d %d %d\n", n, k, r);

		// #17
		int x = 1, y = 2;
		// if (x && y == 0) { // x && y == true
		// x = 1;
		// y = 1;
		// }

		// if (1 <= x <= 10) // x >= 1 && x <= 10
		// System.out.println("");

		// #18
		int number = 30;
		if (number % 2 == 0)
			System.out.println(number + " 는 짝수");
		System.out.println(number + " 는 홀수");

		number = 35;
		if (number % 2 == 0)
			System.out.println(number + " 는 짝수");
		System.out.println(number + " 는 홀수");

		number = 30;
		if (number % 2 == 0)
			System.out.println(number + " 는 짝수");
		else
			System.out.println(number + " 는 홀수");

		number = 35;
		if (number % 2 == 0)
			System.out.println(number + " 는 짝수");
		else
			System.out.println(number + " 는 홀수");

		// #19
		x = 3;
		y = 2;

		// a : x=3, y=2
		if (x > 2) {
			if (y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// b : x=3, y=4
		x = 3;
		y = 4;
		if (x > 2) { //
			if (y > 2) {
				int z = x + y; // 3 + 4
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// c : x=2, y=2
		x = 2;
		y = 2;
		if (x > 2) {
			if (y > 2) {
				int z = x + y; // 3 + 4
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// #20
		int a = 3;
		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		if (++a == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		a = a++; // 수식에 사용
		if (a == 3)
			System.out.println("3");
		else
			System.out.println("4");
		System.out.println(a);

		a = 3;
		++a; // a++;
		if (a == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		a = ++a; // 수식에 사용
		if (a == 3)
			System.out.println("3");
		else
			System.out.println("4");
		System.out.println(a);

		// #21
		// 결혼여부 isMarried = "Y", "N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 0, 1
		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입력하세요 (미혼:0, 기혼:1)");
		int isMarried = sc.nextInt();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		} else if (isMarried == 1) {

		}

		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);

	}

}
