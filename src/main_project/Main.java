package main_project;

import java.util.Scanner;

import jihee_dessert.Dessert;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dessert de = new Dessert();
		int num;
		while(true) {
			System.out.println("1.커피 2.차 3.주스 4.디저트 5.종료");
			num = input.nextInt();
			switch(num) {
			case 1:break;
			case 2:break;
			case 3:break;
			case 4:de.choice();
				break;
			case 5: return;
			}
		}
		
	}
}
