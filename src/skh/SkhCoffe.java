package skh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SkhCoffe implements Cofinter{
	Scanner input = new Scanner(System.in);
	
	public void order() { 
Map map = new HashMap();
		
		map.put("아메리카노", 3000);
		map.put("라떼", 4000);
		map.put("콜드브루", 3500);
		map.put("믹스커피", 2500);
		int num;
		while(true) {
		System.out.println("커피를 주문하시겠습니까?");
		System.out.println("예/아니오");
		String qs = input.next();
		if(qs.equals("예"))
		{
			System.out.println("어떤 커피를 주문하시겠습니까?");
			System.out.println("1.아메리카노(3천원) 2.라떼(4천원) 3.콜드브루(3500원) 4.믹스커피(2500원) 5.돌아가기");
			num = input.nextInt();
			int su;
			int price=0;
			switch(num){
				
				case 1 : System.out.println("아메리카노를 선택하셨습니다.");
				System.out.println("몇잔 선택하시겠습니까?");
				su = input.nextInt();
						shot();
						price = (int)map.get("아메리카노") * su;
						System.out.println("가격은 "+price+"원 입니다.");
						System.out.println("주문이 완료되었습니다.");
						break;
				case 2: System.out.println("라떼를 선택하셨습니다.");
				System.out.println("몇잔 선택하시겠습니까?");
				su = input.nextInt();
						shot();
						price = (int)map.get("라떼") * su;
						System.out.println("가격은 "+price+"원 입니다.");
						System.out.println("주문이 완료되었습니다.");
				
				break;
				case 3: System.out.println("콜드브루를 선택하셨습니다.");
				System.out.println("몇잔 선택하시겠습니까?");
				su = input.nextInt();
						shot();
						price = (int)map.get("콜드브루") * su;
						System.out.println("가격은 "+price+"원 입니다.");
						System.out.println("주문이 완료되었습니다.");
				
				break;
				case 4: System.out.println("믹스커피를 선택하셨습니다.");
				System.out.println("몇잔 선택하시겠습니까?");
				su = input.nextInt();
						shot();
						price = (int)map.get("믹스커피") * su;
						System.out.println("가격은 "+price+"원 입니다.");
						System.out.println("주문이 완료되었습니다.");
				
				break;
				case 5: System.out.println("이전으로 돌아갑니다.");
				break;
				
						 
			}
			break;
		} else if (qs.equals("아니오")) {
			System.out.println("이전으로 돌아갑니다.");
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
		}
		}
	}
	
	public void shot() {
		int shot =0;
		while(true) {
		System.out.println("샷을 추가하시겠습니까?");
		System.out.println("예/아니오");
		String sqs = input.next();
		if(sqs.equals("예")) {
			shot++;
			System.out.println("샷을 한번 추가했습니다.");
		} else if(sqs.equals("아니오")) {
			System.out.println("샷추가를 종료합니다.");
			System.out.println("샷이 " +shot+"번 추가되었습니다.");
			break;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		}
		
	}
	
	

}
