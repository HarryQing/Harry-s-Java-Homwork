package TheFirst;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author 庆子哥
 *2020年9月4日 下午4:20:23
 *description:
 *（1）该类中定义属性bookNum，表示书的数量；定义一个ArrayList类型的bookArrayList属性，用于存储多个Bool类的对象；
 *（2）定义一个方法public void inputBooks(int n)，输入多本书的信息，并保存到bookArrayList中；
 *（3）定义方法searchByName，searchByBookID，searchByAuthor，分别实现按书名、书编号、书的作者查询，并返回对应的Book对象；
 *（4）定义方法deleteBook，删除指定书名的书籍信息；
 *（5）定义方法listBooksInfo(int n)，打印输出bookArrayList前n本书籍的信息；
 *（6）定义方法listBooksInfo()，要求将bookArrayList转化为Book类型的数组，并将该数组打印输出；
 *（7）在main方法中，对以上方法进行测试运行。
 */

public class wyq_6 {
	public static void main(String[] args){
		wyq_6 all=new wyq_6();
		BookDatabase testbook=new BookDatabase();
		Scanner scanner = new Scanner(System.in);
		all.menu();
		int n1=scanner.nextInt();
		select(testbook, n1);
		circle(testbook, n1);
	}
	public static void menu() {
		System.out.println("目\t录");
		System.out.println("1.输入多本书的信息");
		System.out.println("2.按书名查询");
		System.out.println("3.按书编号查询");
		System.out.println("4.按书的作者查询");
		System.out.println("5.删除指定书名的书籍信息");
		System.out.println("6.打印输出bookArrayList前n本书籍的信息");
		System.out.println("7.将该数组打印输出");
		System.out.println("8.提供目录");
		System.out.println("9.结束");
		System.out.println("请输入您的选择！！！");
	}
	public static void select(BookDatabase testbook,int n) {
		Scanner scanner = new Scanner(System.in);
		switch(n) {
		case 1:
			System.out.print("请输入您需要添加多少本书的信息：");
			int a1=scanner.nextInt();
			testbook.inputBooks(a1);
			break;
		case 2:
			System.out.print("输入查询的书名：");
			String a2=scanner.next();
			testbook.searchByName(a2);
			break;
		case 3:
			System.out.print("输入查询的书编号：");
			int a3=scanner.nextInt();
			testbook.searchByBookID(a3);
			break;
		case 4:
			System.out.print("输入查询的书的作者：");
			String a4=scanner.next();
			testbook.searchByAuthor(a4);
			break;
		case 5:
			System.out.print("输入删除的书籍名：");
			String a5=scanner.next();
			testbook.deleteBook(a5);
			break;
		case 6:
			System.out.print("输入查询前几本书的信息：");
			int a6=scanner.nextInt();
			testbook.listBooksInfo(a6);
			break;
		case 7:
			System.out.println("此时书籍库的信息如下：");
			testbook.listBooksInfo();
			break;
		case 8:
			menu();
			break;
		case 9:
			System.out.println("感谢您的使用！！！");
			break;
		}
	}
	public static void circle(BookDatabase testbook,int n1) {
		Scanner scanner = new Scanner(System.in);
		if(n1<9) {
			System.out.println("请输入您的选择！！！");
			n1=scanner.nextInt();
			select(testbook, n1);
			circle(testbook, n1);
		}else {
			System.out.println();
		}
	}
	
}

class book {
	static int bookID;
	private String bookName;
	private int price;
	private String publisher;
	private String auther;
	int id;
	{
		bookID++;
		id=bookID;
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
		return "book [bookID="+id+",bookName=" + bookName + ", price=" + price + ", publisher=" + publisher + ", auther=" + auther
				+ "]";
	}
	
}

class BookDatabase {
	private int bookNum;
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	private ArrayList<book> bookArrayList;
	{
		bookArrayList=new ArrayList<book>();
		bookArrayList.add(new book("三国演义", 100, "新华出版社", "罗贯中"));
		bookArrayList.add(new book("水浒传",99,"新华出版社", "施耐庵"));
	}
	/** 
	 *2020年4月16日 下午3:42:58
	 *@param 定义一个方法public void inputBooks(int n)，输入多本书的信息，并保存到bookArrayList中；
	 */
	public void inputBooks(int n) {
		Scanner scanner = new Scanner(System.in);	
		for(int i=0;i<n;i++) {
			book a=new book();
			System.out.println("输入添加的第"+(i+1)+"本书的信息!");
			System.out.print("书名：");
			String bookName=scanner.next();
			a.setBookName(bookName);
			System.out.print("书价：");
			int price=scanner.nextInt();
			a.setPrice(price);
			System.out.print("出版社：");
			String publisher=scanner.next();
			a.setPublisher(publisher);
			System.out.print("作者：");
			String auther=scanner.next();
			a.setAuther(auther);
			bookArrayList.add(a);
		}
		System.out.println("添加成功！！！");
	}
	/**
	 *2020年4月16日 下午5:04:22
	 *@param 定义方法searchByName实现按书名查询,返回对应的Book对象
	 */
	public void searchByName(String bookName) {
		int number=0;
		for(book a:bookArrayList) {
			if(a.getBookName().equals(bookName)) {
				System.out.println("书库中存在书名为“"+bookName+"”的书，其详细信息如下：");
				System.out.println(a.toString());
				number=1;
				break;
			}
		}
		if(number==0) {
			System.out.println("书库中不存在书名为“"+bookName+"”的书！");
		}
	}
	/**
	 *2020年4月16日 下午5:18:26
	 *@param 定义方法searchByBookID实现按书编号查询,返回对应的Book对象
	 */
	public void searchByBookID(int id) {
		int number=0;
		for(book a:bookArrayList) {
			if(a.id==id) {
				System.out.println("书库中存在书编号为“"+id+"”的书，其详细信息如下：");
				System.out.println(a.toString());
				number=1;
				break;
			}
		}
		if(number==0) {
			System.out.println("书库中不存在书编号为“"+id+"”的书！");
		}
	}
	/**
	 *2020年4月16日 下午5:54:34
	 *@param 定义方法searchByAuthor实现按书的作者查询,返回对应的Book对象
	 */
	public void searchByAuthor(String author) {
		int number=0;
		for(book a:bookArrayList) {
			if(a.getAuther().equals(author)) {
				System.out.println("书库中存在书的作者为“"+author+"”的书，其详细信息如下：");
				System.out.println(a.toString());
				number=1;
				break;
			}
		}
		if(number==0) {
			System.out.println("书库中不存在书的作者为“"+author+"”的书！");
		}
	}
	/**
	 * 2020年4月16日 下午5:59:25
	 * 定义方法deleteBook，删除指定书名的书籍信息；
	 */
	public void deleteBook(String bookname) {
		int number=0;
		for(book a:bookArrayList) {
			if(a.getBookName().equals(bookname)) {
				bookArrayList.remove(a);
				System.out.println("书库中书名为“"+bookname+"”的书已清除");
				number=1;
				break;
			}
		}
		if(number==0) {
			System.out.println("书库中不存在书名为“"+bookname+"”的书！");
		}
	}
	/**
	 *2020年4月16日 下午4:05:38
	 *@param 定义方法listBooksInfo(int n)，打印输出bookArrayList前n本书籍的信息；
	 */
	public void listBooksInfo(int n) {
		book[] newbook=new book[bookArrayList.size()];
		bookArrayList.toArray(newbook);
		for (int i = 0; i < n; i++) {
			System.out.println(newbook[i].toString());
		}
	}
	/**
	 *2020年4月16日 下午4:49:19
	 *定义方法listBooksInfo()，要求将bookArrayList转化为Book类型的数组，并将该数组打印输出；
	 */
	public void listBooksInfo() {
		book[] newbook=new book[bookArrayList.size()];
		bookArrayList.toArray(newbook);
		for (int i = 0; i < newbook.length; i++) {
			System.out.println(newbook[i].toString());
		}
	}	
}


