package Gracia.lab;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// #31 - 은행정보와 카드 정보 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 카드번호를 입력하세요");
		String card = sc.nextLine();

		// 카드정보 판별
		char ctype = card.charAt(0);
		String ctmsg = "카드정보 없음";

		if (ctype == '3' && card.charAt(1) == '5')
			ctmsg = "JCB 카드";
		else if (ctype == '4')
			ctmsg = "Visa 카드";
		else if (ctype == '5')
			ctmsg = "Master 카드";

		// 은행정보 판별
		String bank = "은행정보 없음";
		switch (card) {
		case "356317":
			bank = "NH 농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;
		}

		System.out.printf("%s %s \n", ctmsg, bank);

		// #32 - 주민번호 검증하기
		String jumin = "1111111111118";

		// a. 가중치 적용 및 합산
		int sum = 0;
		// sum += (jumin.charAt(0) - 48) * 2;
		// sum += (jumin.charAt(1) - 48) * 3;
		// sum += (jumin.charAt(2) - 48) * 4;
		// sum += (jumin.charAt(3) - 48) * 5;
		// sum += (jumin.charAt(4) - 48) * 6;
		// sum += (jumin.charAt(5) - 48) * 7;
		// sum += (jumin.charAt(6) - 48) * 8;
		// sum += (jumin.charAt(7) - 48) * 9;
		// sum += (jumin.charAt(8) - 48) * 2;
		// sum += (jumin.charAt(9) - 48) * 3;
		// sum += (jumin.charAt(10) - 48) * 4;
		// sum += (jumin.charAt(11) - 48) * 5;

		int jcode = 0;
		for (int i = 0, j = 2; i <= 11; ++i, ++j) {
			if (i == 8)
				j = 2;
			jcode = jumin.charAt(i) - 48;
			sum += jcode * j;
		}

		// 나머지 계산
		// int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "주민번호 검증 실패!";

		// if (check > 9) { // 나머지가 2자리수 라면
		// if (check % 10 == jumin.charAt(12) - 48)
		// msg = "주민번호 검증 성공!";
		// } else if ((11 - check) == jumin.charAt(12) - 48)
		// msg = "주민번호 검증 성공!";

		// 11 로 나눈 나머지 구한후
		// 11 에서 이것을 빼고, 맨 마지막 자리 빼냄
		int check = (11 - (sum % 11)) % 10;

		if (check == jumin.charAt(12) - 48)
			msg = "주민번호 검증 성공!";

		// 결과 출력
		System.out.println(msg);

	}

}
