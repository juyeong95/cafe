package seoon_tea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tea {
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList();
	HashMap menu = new HashMap();

	int pFT = 0;

	public int getpFT() {
		return pFT;
	}
	
	public void setpFT(int pFT) {
		this.pFT = pFT;
	}
	
	public HashMap menutea() {
		menu.put(1, 2000);
		menu.put(2, 2500);
		menu.put(3, 3000);
		menu.put(4, 3000);
		return menu;
	}
	
		public void tea() {
			System.out.println("====================");
			System.out.println("1. 주문하기\n2. 주문확인\n3. 계산하기");
			System.out.println("====================");
			System.out.print(">>>");
			int sel = sc.nextInt();
			while(true) {
				switch(sel) {
				case 1: oder(); break;
				case 2: odercheck(); break;
				case 3: pay(); break;
				}
			}
		}
		
		public void oder() {
			while(true) {
				int value = 0;
				System.out.println("====================");
				System.out.println("1. Green Tea\t2000원\n2. Black Tea\t2500원\n3. Herbal Tea\t3000원\n4. Rooibos Tea\t3000원\n5. -주문완료-");	
				System.out.println("====================");
				System.out.print(">>>");
				int sel_tea = sc.nextInt();
				System.out.print("수량을 입력하세요 : ");
				int qua = sc.nextInt();
				list.add(sel_tea);//리스트 다시작성
				menutea();
				value = ((int)menu.get(sel_tea)) * qua;//value = key값 * qua
				pFT += value;
				if(sel_tea == 5) setpFT(value); tea();
			}
		}
		
		public void odercheck() {
			System.out.println(list);
		}
		
		public void pay() {
			System.out.println("계산 도와드리겠습니다 주문하신 총 Tea값은 " + getpFT());
			System.out.println("지출할 돈 : ");
			int pay = sc.nextInt();
			if(getpFT() > pay) System.out.println("돈이 "+(getpFT()-pay)+"원 부족합니다.");
			else if(pay > getpFT()) System.out.println("거스름돈 "+(pay-getpFT())+"원 입니다.");
			else System.out.println("감사합니다.");
		}
}
