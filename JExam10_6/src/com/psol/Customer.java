package com.psol;

/**
 * Customer クラス
 * 
 * @author 齋藤裕仁
 * @version 1.00
 */
public class Customer {
	private String name;
	private int	money;
	private Cart myCart = new Cart();

	/**
	 * @param name 客の名前
	 * @return none
	 * @throws none
	 */
	public Customer(String name, int money) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name	= name;
		this.money	= money;
	}
	
	/**
	 * @param shop	商品を保持しいている店
	 * @param itemNo　商品の格納番号
	 * @return none
	 * @throws none
	 */
	public void buyItem(Shop shop, int itemNo) {
		myCart.addItem(shop.buyItem(itemNo));
	}

	
	/**
	 * @param none
	 * @return none
	 * @throws none
	 */
	public void printCustomer() {
		System.out.println("私の名前は、" + name + "です。");
		System.out.println("所持金は" + money + "円です。");
		myCart.printCart();
	}
	
	/**
	 * @param none
	 * @return none
	 * @throws none
	 */
	public void register() {
		int total = myCart.getTotalPrice();
		System.out.println("商品を清算します。");
		System.out.println("商品の合計は" + total + "円です。");
		
		if(total > money){
			System.out.println("所持金が不足しています!");
			System.out.println("商品を清算することはできませんでした。");
			System.out.println("所持金は" + money + "円です。");
		} else {
			money -= total;
			System.out.println("所持金は" + money + "円となりました。");
		}
	}
	
	/**
	 * @param none
	 * @return none
	 * @throws none 
	 */
	public void printTotalPrice() {
		System.out.print(myCart.getTotalPrice());
		
	}
}
