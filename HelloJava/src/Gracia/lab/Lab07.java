package Gracia.lab;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {
		// # 22 - 윤년 여부 확인
		// 현재 연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠 떨어지지 않음
		GregorianCalendar gc = new GregorianCalendar();

		String welcome = "윤년 확인할 연도를 입력하세요";
		String fmt1 = "%d년은 윤년입니다. \n";
		String fmt2 = "%d년은 윤년이 아닙니다. \n";

		Scanner sc = new Scanner(System.in);
		System.out.println(welcome);
		int year = sc.nextInt();
		// sc.close();

		// int year = 2000;
		if (gc.isLeapYear(year))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		//
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		// #23 - 복권 발행 프로그램
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막값 - 시작값) + 1) + 시작값
		// 복권 숫자 범위 : 100 - 999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 726 = 2개 일치
		// lotto : 657, lucky : 626 = 1/2개 일치 ??!!

		int rand = (int) (Math.random() * 100000);
		int lotto = rand % ((999 - 100) + 1) + 100;
		System.out.println(lotto);

		sc = new Scanner(System.in);
		System.out.println("100 ~ 999 사이 임의의 숫자 3자리를 입력하세요 ");
		String lucky = sc.nextLine();

		// 문자 하나씩 추출
		char lucky1 = lucky.charAt(0);
		char lucky2 = lucky.charAt(1);
		char lucky3 = lucky.charAt(2);

		char lotto1 = ("" + lotto).charAt(0);
		char lotto2 = ("" + lotto).charAt(1);
		char lotto3 = ("" + lotto).charAt(2);

		// 비교
		int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
		// ++match;
		//
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3)
		// ++match;
		//
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
		// ++match;

		String lotto4 = "" + lotto;
		int size = lotto4.length();

		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (lucky.charAt(i) == lotto4.charAt(j))
					++match;

		String msg = "꽝이군요! 다음 기회에!";
		switch (match) {
		case 3:
			msg = "모두 일치! 상금 1백만원!";
			break;
		case 2:
			msg = "2개 일치! 상금 1만원!";
			break;
		case 1:
			msg = "1개 일치! 상금 1천원!";
			break;
		}
		System.out.println(msg);

		// #24
		String fmt = "%2d x %2d = %3d \n";
		welcome = "출력할 구구단의 단을 입력하세요 (1-19)";
		sc = new Scanner(System.in);

		System.out.println(welcome);
		int dan = sc.nextInt();

		for (int i = 1, j = dan; i <= 19; ++i) {
			System.out.printf(fmt, j, i, j * i);
		}

		fmt = "%d x %d = %d \t";
		for (int i = 1, j = dan; i <= 9; ++i) {
			System.out.printf(fmt, j, i, j * i);
		}

		// #25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자 A : 65
		System.out.println("소문자 알파벳을 대문자로 바꿔드립니다!");
		System.out.println("소문자 알파벳을 하나 입력하세요");
		int ch = System.in.read();

		// 소문자(a:97, z:122) 이외의
		// 문자가 입력되면 경고메세지 출력
		if (ch < 97 || ch > 122)
			System.out.println("잘못입력하셨습니다!");
		else {
			// 소문자를 대문자로 변환하기 위해
			// 입력한 문자에서 32 만큼 빼고 처리
			ch = ch - 32;

			System.out.println((char) ch);
		}

		// #26 - 숫자 맞추기
		int num2 = (int) (Math.random() * 100) + 1;

		sc = new Scanner(System.in);
		// 키보드로부터 데이터를 입력받을 준비를 함

		while (true) {
			int num1 = sc.nextInt(); // 정수 입력받음

			if (num1 > num2)
				System.out.println("추측한 숫자가 큽니다");
			else if (num1 < num2)
				System.out.println("추측한 숫자가 작습니다");
			else if (num1 == num2) {
				System.out.println("빙고! 숫자를 맞췄습니다");
				break;
			}
		}

		// #27
		int number = 0;
		int sum = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}

		fmt = "num : %d, sum : %d \n";
		System.out.printf(fmt, number, sum);

		// #28
		number = 0;
		sum = 0;
		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}

		System.out.printf(fmt, number, sum);

		// # 30 - 구구단 차트
		fmt = "\t   Multiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";
		fmt += "1 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "2 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "3 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "4 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "5 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "6 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "7 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "8 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "9 |    1   2   3   4   5   6   7   8   9 \n\n";

		System.out.printf(fmt);

		fmt = "\t   Multiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";

		System.out.println(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d  | %3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "\t   Multiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";

		System.out.println(fmt);
		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d  | %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("  %2d", i * j);
			}
			System.out.println();
		}

	}

}
