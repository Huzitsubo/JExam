package com.psol;

import java.util.ArrayList;

/**
 * Shopクラス
 * 
 * @author 齋藤裕仁
 * @version 1.00
 */
public class Shop {
	private String name;
	private ArrayList<Item> items = new ArrayList<Item>();

	/**
	 * @param name
	 *            店名
	 * @return none
	 * @throws none
	 */
	public Shop(String name) {
		this.name = name;
	}

	/**
	 * @param none
	 * @return 店名
	 * @throws none
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param 店名
	 * @return none
	 * @throws none
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品をリストに追加
	 * 
	 * @param item
	 *            商品
	 * @return none
	 * @throws none
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * @param itemNo
	 * @return items
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public Item buyItem(int itemNo) throws ArrayIndexOutOfBoundsException {
		return items.get(itemNo);
	}

	/**
	 * @param none
	 * @return none
	 * @throws none
	 */
	public void printShop() {
		System.out.println("いらっしゃいいませ。" + name + "です。");
		System.out.println("扱っている商品は、");
		int cnt = 0;
		for (Item item : items) {
			System.out.print(cnt++ + " ");
			item.printItem();

		}
	}
}
