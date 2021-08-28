package main_project;

import java.util.Scanner;
import jihee_dessert.Dessert;
import juyeong.Juice;
import skh.SkhCoffe;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SkhCoffe cf = new SkhCoffe();
		Dessert de = new Dessert();

		Juice j = new Juice();

		int num;
		while(true) {
			System.out.println("1.커피 2.차 3.주스 4.디저트 5.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				cf.order();
				break;
			case 2:break;

			case 4:de.choice();
				break;
			case 3:
				j.Juice();
				break;
			case 5: return;
			}
		}
		
	}
}
