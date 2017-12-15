package Gracia.lab;

public class Lab02 {

	public static void main(String[] args) {
		// #03
		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;

		System.out.printf("3 * x = %d \n", 3 * x); // 3x
		result = 3 * x + y; // 3x + y
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// #4 : 정수끼리 연산 결과는 언제나 정수!
		System.out.printf("(1/3)*3 = %d \n", (1 / 3) * 3);
		System.out.printf("(1/3)*3 = %f \n", ((double) 1 / 3) * 3);

		// #5 - 몫, 나머지 구하기
		int quotient, remander;
		quotient = 7 / 5;
		remander = 7 % 5;

		// #6 - 단축 대입 연산자
		int results = 11;
		results /= 2; // r = r / 2;

		// #7 - 연산자 우선순위
		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;
		System.out.println(x + n * y - (x + n) * y);
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(1 - (1 - (1 - (1 - (1 - n)))));

		// #8 - 논리 연산자의 단축평가
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true || false && 3 < 4 || !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
		// System.out.println(!true > 'A');
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.println(53 % 21 < 45 / 18);
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));

		// #9 - 문자열로 처리
		System.out.println("May 13, 1988 fell on day number  ");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// (Year + (Year / 4) - (Year / 100)
		// + (Year / 400) + (13 * Month + 8)
		// / 5 + Day) % 7;
		System.out.println((1988 + (1988 / 4) - (1988 / 100) + (1988 / 400) + (13 * 5 + 8) / 5 + 13) % 7);
		System.out.println((2017 + (2017 / 4) - (2017 / 100) + (2017 / 400) + (13 * 12 + 8) / 5 + 12) % 7);
		// (lastyear+(lastyear/4)-(lastyear/100)+(lastyear/400)+1)%7
		System.out.println("----");
		int lastyear = 2016;
		System.out.println((lastyear + (lastyear / 4) - (lastyear / 100) + (lastyear / 400) + 1) % 7); // year+1의 1월1일
																										// 요일
		System.out.println((lastyear - 1 * 365 + (lastyear / 4) - (lastyear / 100) + (lastyear / 400) + 1) % 7);
		System.out.println("Check out this line  ");
		System.out.println("//hello there " + '9' + 7);
		System.out.println('H' + 'I' + " is " + 1 + "more example");
		System.out.println('H' + 6.5 + 'I' + " is " + 1 + "more example");
		// System.out.print("Print both of us", "Me too");
		System.out.println("Reverse " + 'I' + 'T');
		System.out.println("No! Here is" + 1 + "more example");
		// System.out.println ("Here is " + 10*10));
		System.out.println("Not x is " + true);
		// System.out.print();
		// System.out.println;
		// System.out.print("How about this one" ++ '?' + 'Huh? ' );

		// #10 - 단축연산
		System.out.println(true && false && true || true);
		System.out.println(true || true && true && false);
		System.out.println((true && false) || (true && !false) || (false && !false));
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);

		// #11 - 우선순위, 데이터 유형
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);
		System.out.println(42.7 % 3 + 18);
		// System.out.println((3 < 4) && 5 / 8);
		System.out.println(23 / 5 + 23 / 5.0);
		System.out.println(2.0 + 'a');
		System.out.println(2 + 'a');
		System.out.println('a' + 'b');
		System.out.println('a' / 'b');
		// System.out.println('a' && !'b');
		System.out.println((double) 'a' / 'b');

		// #12 - 형변환 : 축소
		int o = (int) 3.9;
		System.out.println("n == " + o);

		// #13 : 증가/감소 연산자
		int p = 3;
		p++; // ++p
		System.out.println("p == " + p);

		p = 3;
		System.out.println("p == " + p++);
		// "p == " + p, p = p + 1
		System.out.println("p == " + p);

		p = 3;
		p--;
		System.out.println("p == " + p);

		p = 3;
		System.out.println("p == " + p--);
		System.out.println("p == " + p);

		// #14 - 문자 연결
		System.out.println("2 + 2 = " + (2 + 2));
		System.out.println("2 + 2 = " + 2 + 2);

		// #15 - 문자와 숫자 사이
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);

		b = 'c';
		System.out.println(b);

		a = b;
		System.out.println(a);

	}
}
