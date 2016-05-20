package com.psol;

import java.util.ArrayList;

/**
 * Cart クラス
 * 
 * @author 齋藤裕仁
 * @version 1.00
 * 
 */
public class Cart {

	private ArrayList<Item> items = new ArrayList<>();

	/**
	 * @param item
	 * @return none
	 * @throws none
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * @param none
	 * @return none
	 * @throws none
	 */
	public void printCart() {
		System.out.println("カートに入っている商品は、");
		if (items.size() > 0) {
			for (Item i : items) {
				i.printItem();
			}
		} else {
			System.out.println("ありません。");

		}
		System.out.println("商品の合計は" + this.getTotalPrice() + "円です。");
	}

	/**
	 * @param none
	 * @return カートの合計金額
	 * @throws none
	 */
	public int getTotalPrice() {
		int price = 0;
		for (Item i : items) {
			price += i.getPrice();
		}
		return price;
	}

}
