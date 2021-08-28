package jihee_dessert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dessert {
	ArrayList list = new ArrayList();
	Scanner sc = new Scanner(System.in);
	HashMap map = new HashMap();
	public void choice() {
		map.put("크로플", 5600);
		map.put("마카롱", 2500);
		map.put("딸기조각케이크", 6000);
		map.put("푸딩", 4000);
		
		while(true) {
			System.out.println("*** 디저트를 선택하세요 ***");
			System.out.println("1. 크로플\t\t5600원");
			System.out.println("2. 마카롱\t\t2500원");
			System.out.println("3. 딸기조각케이크\t6000원");
			System.out.println("4. 푸딩\t\t4000원");
		
		System.out.print("메뉴 입력 >>> ");
		String menu = sc.next();
		System.out.print("수량 입력 >>> ");
		int num = sc.nextInt();
		list.add(menu);
		
		System.out.println("1.다른메뉴 더 담기");
		System.out.println("2.선택 완료");
		System.out.print(">>> ");
		int num1 = sc.nextInt();
		if(num1 == 1) {
		}else if(num1 == 2) {
			
			System.out.println("***고객님께서 주문하신 메뉴***");
			for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + "\t" + (int)map.get(list.get(i))*num + "원");
			
			}
			System.out.println("---------------------------");
			return;
			
		}
		
		}
		
		
	}

}
