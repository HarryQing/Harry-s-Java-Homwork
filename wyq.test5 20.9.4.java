package TheFirst;
/**
 * 
 * @author 庆子哥
 *2020年9月4日 下午12:41:45
 *description:
 *（1）定义该类的bookID、bookName、price、publisher、author等属性，各属性的数据类型大家根据实际进行定义，bookID的值要求自动增长（其值是每个Book对象产生时，自动让bookID加1得到）
 *（2）分别定义该类的无参构造函数、带bookName、author参数的构造函数、以及带除bookID之外的其他所有属性参数的构造函数；
 *（3）bookID的值要求在构造代码块中形成；
 *（4）定义Book类所有属性的访问器方法，bookID属性不能定义其set方法；
 *（5）定义Book类的toString方法；
 *（6）在main方法中，定义三个Book类对象，并对每个对象的所有属性用访问器方法进行测试调用，并通过toString方法打印输出每个Book类对象的信息。
 */
class book{
	static int bookID;
	private String bookName;
	private int price;
	private String publisher;
	private String auther;
	{
		bookID++;
	}
	public book(){
		
	}
	public book(String bookName, String auther) {
		super();
		this.bookName = bookName;
		this.auther = auther;
	}
	public book(String bookName, int price, String publisher, String auther) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
		this.auther = auther;
	}
	public int getBookID() {
		return bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "bookID：" + getBookID() + "\t bookName：" + getBookName() + "\t price：" + getPrice() + "\t publisher：" + getPublisher()
		+ "\t auther：" + getAuther() ;
	}	
}

public class wyq_5 {
	public static void main(String[] args){
		
	}
}
