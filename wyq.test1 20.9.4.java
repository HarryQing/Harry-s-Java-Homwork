package TheFirst;

import java.util.Scanner;

/**
 * 
 * @author 庆子哥
 *2020年9月4日 上午9:06:40
 *description:编写程序，从控制台读取员工的姓名，员工的日工资，员工工作的天数，员工的奖金，结果保留3位小数，输出员工的工资。（员工的工资=日工资 * 工作的天数 + 奖金）.
 */
class employee{
	private String name;
	private double wage;
	private int days;
	private double bonus;
	
	public employee() {
		super();
	}

	public employee(String name, double wage, int days, double bonus) {
		super();
		this.name = name;
		this.wage = wage;
		this.days = days;
		this.bonus = bonus;
	}

	public double total(double wage,int days,double bonus) {
		return wage*days+bonus;
	}
	
}
public class wyq_1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		employee a=new employee();
		System.out.println("please print how many employee");
		int number =scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("The "+Change(i)+" employee`s "+"print name");
			String name=scanner.next();
			System.out.println("The "+Change(i)+" employee`s "+"print wage");
			double wage=scanner.nextDouble();
			System.out.println("The "+Change(i)+" employee`s "+"print days");
			int days=scanner.nextInt();
			System.out.println("The "+Change(i)+" employee`s "+"print bonus");
			double bonus=scanner.nextDouble();
			System.out.print("The "+Change(i)+" employee`s "+"total:"+a.total(wage, days, bonus)+"\n");
		}
		System.out.println("Finish!");
	}
	
	public static String Change (int i) {
		String number=null;
		switch (i) {
		case 0:
			number= "First";
			break;
		case 1:
			number= "second";
			break;
		case 2:
			number= "third";
			break;
		default:
			break;
		}
		return number;
	}
}

