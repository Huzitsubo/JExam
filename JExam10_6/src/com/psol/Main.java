package com.psol;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static final String ENDER = "q";
	public static final String TOTAL = "t";
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// お店の生成
		Shop shop = new Shop("ケーキ屋さん");
		System.out.println("Shopを店名=" + shop.getName() + "で作成しました。");
		
		// 登録ループ
		shop.addItem(new Item("チョコレートケーキ", 990));
		shop.addItem(new Item("ショートケーキ", 890));
		shop.addItem(new Item("マーブルケーキ", 1180));
		shop.addItem(new Item("チーズケーキ", 1200));
		shop.addItem(new Item("マロンケーキ", 1050));
		
		// 表示
		System.out.println("==============================");
		shop.printShop();
		System.out.println("==============================");
		System.out.println("");
		System.out.println("********************************************");
		
		// 客の生成
		String	name = "五郎丸";
		Customer customer = new Customer(name, 3000);
		
		// カート表示
		customer.printCustomer();
		
		// 購入ループ
		System.out.println("********************************************");
		System.out.println("購入したい商品を選んでください。");
		
		Scanner sn = new Scanner(System.in);	// スキャナ定義
		String	sNum;
		int		num;
		
		while(true){
			
			System.out.print("商品番号(qで終了)?");
			sNum = sn.next();
			
			if(sNum.equals(ENDER)){
				break;
			} else if(sNum.equals(TOTAL)){
				
			}
			
			try {
				num = Integer.parseInt(sNum);
				customer.buyItem(shop, num);

			} catch (InputMismatchException e) { 		// 整数以外の入力
				// System.err.println(e.getMessage());
				System.err.println("数値を入力してください。");
				sn.nextLine(); 							// スキャナクリア
			} catch (IndexOutOfBoundsException  e) {	// リストアクセス違反
				System.err.println("指定の商品はありません");
				sn.nextLine();
			} 
		}
		sn.close();
		
		// カート表示
		System.out.println("");
		System.out.println("********************************************");
		customer.printCustomer();
		System.out.println("********************************************");
	}


}
