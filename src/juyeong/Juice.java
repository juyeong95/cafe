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
}
