package com.psol;

/**
 * Itemクラス
 * 
 * @author 齋藤裕仁
 *
 */
public class Item {

	private String name;
	private int price;

	/**
	 * @param name
	 *            商品名
	 * @param price
	 *            値段
	 * @return none
	 * @throws none
	 */
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * 商品名と値段を出力
	 * 
	 * @param none
	 * @return none
	 * @throws none
	 */
	public void printItem() {
		System.out.println(name + ":" + price + "円");
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
}
