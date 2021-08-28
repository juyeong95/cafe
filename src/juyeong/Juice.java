package juyeong;

import java.util.Scanner;

public class Juice {
	private static int num2=0;
	public void Juice() {
		int num;
		String j = null;
		Scanner input = new Scanner(System.in);
		System.out.println("종류를 선택해 주세요");
		while(true) {
		System.out.println("1.사과 2.오렌지 3.토마토 4.당근 5.파인애플 6.뒤로가기");
		num=input.nextInt();
		switch(num) {
		case 1:
			j="사과주스";
			System.out.println(j+" 선택하였습니다.");
			Jnumber(j);
			take();
			break;
		case 2:
			j="오렌지";
			System.out.println(j+" 선택하였습니다.");
			Jnumber(j);
			take();
			break;
		case 3:
			j="토마토";
			System.out.println(j+" 선택하였습니다.");
			Jnumber(j);
			take();
			break;
		case 4:
			j="당근";
			System.out.println(j+" 선택하였습니다.");
			Jnumber(j);
			take();
			break;
		case 5:
			j="파인애플";
			System.out.println(j+" 선택하였습니다.");
			Jnumber(j);
			take();
			break;
		case 6:
			return;
		}
		
		break;
		}
		System.out.println("주문하신 음료 금액: "+num2*5000+"원 입니다.");
		charge();
		System.out.println("주문하신 "+j+" "+num2+" 잔 나왔습니다.");
		System.exit(0);
	}
	public void Jnumber(String j) {
		Scanner input = new Scanner(System.in);
		System.out.println("몇 잔 주문하시겠습니까?");
		System.out.print(">>>");
		num2=input.nextInt();
		System.out.println(j+" "+num2+"잔 주문하셨습니다.");
	}
	public void take() {
		int num3;
		Scanner input = new Scanner(System.in);
		System.out.println("1.매장 2.테이크아웃");
		num3=input.nextInt();
		switch(num3) {
		case 1:
			System.out.println("매장 선택");
			break;
		case 2:
			System.out.println("테이크아웃 선택");
			break;
		}
	}
	public void charge() {
		int num4,money;
		Scanner input = new Scanner(System.in);
		System.out.println("1.현금 2.카드 3.쿠폰");
		System.out.print(">>>");
		num4=input.nextInt();
		
		switch(num4) {
		case 1:
			System.out.println("현금을 넣어주세요");
			System.out.print(">>>");
			money=input.nextInt();
			System.out.println(money+"원 투입하셨습니다.");
			int moneyresult=money-(num2*5000);
			while(true) {
			if(money<(num2*5000)) {
				System.out.println("잔액이 부족합니다 현금을 더 넣어주세요");
			}else {
				System.out.println("잔돈 반환: "+moneyresult+"원");
				break;
			}
			}
			break;
		case 2:
			System.out.println("카드를 넣어주세요");
			break;
		case 3:
			System.out.println("쿠폰은 카운터에 문의 주세요.");
			System.out.println("이용에 불편을 드려 죄송합니다.");
			System.exit(0);
		}
		
	}
}
