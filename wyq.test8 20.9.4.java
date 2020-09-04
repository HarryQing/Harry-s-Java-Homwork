package TheFirst;

import java.util.ArrayList;

/**
 * 
 * @author 庆子哥
 *2020年9月4日 下午4:47:26
 *description:
 *1、将实验7中的Animal类改造为抽象类，将sleep、wakeUp、sing方法定义为抽象方法，其他不变。在Cat类和Horse类分别实现这三个方法，其他保持不变。
 *2、将实验7中的Cat类和Horse类分别实现Comparable接口，分别实现对Cat类对象age的大小比较、以及Horse类对象的height的大小比较
 *3、定义一个测试类AnimalTest，在该类中定义一个ArrayList<Cat>对象成员，和一个ArrayList<Horse>对象成员；
 *在该类中定义main方法，实现：
 *（1）往ArrayList<Cat>中添加5只不同年龄的猫；
 *（2）对ArrayList<Horse>中添加5匹不同重量的马。
 *（3）分别对ArrayList<Cat>和ArrayList<Horse>进行排序，并打印排序后的结果。
 */
public class wyq_8 {
	public static void main(String[] args){
		wyq_8 animal=new wyq_8();
		ArrayList<Cat> cats=new ArrayList<Cat>();
		ArrayList<Horse> horses=new ArrayList<Horse>();
		Cat a1=new Cat("家养猫", "小佳", "黄色", 2);
		Cat a2=new Cat("加菲猫", "小叮当", "白色", 1);
		Cat a3=new Cat("家养猫", "小佳", "黄色", 4);
		Cat a4=new Cat("加菲猫", "小叮当", "白色", 8);
		Cat a5=new Cat("家养猫", "小佳", "黄色", 5);
		cats.add(a1);
		cats.add(a2);
		cats.add(a3);
		cats.add(a4);
		cats.add(a5);
		Cat[] catArrays=new Cat[cats.size()];
		cats.toArray(catArrays);
		animal.animalComparable(catArrays);
		
		Horse b1=new Horse("汗血宝马", "赤兔", "红棕色", 4);
		Horse b2=new Horse("汗血宝马", "大腕", "棕色", 6);
		Horse b3=new Horse("汗血宝马", "的卢", "红色", 3);
		Horse b4=new Horse("汗血宝马", "赤兔", "红棕色", 9);
	    Horse b5=new Horse("汗血宝马", "大腕", "棕色", 5);
		horses.add(b1);
		horses.add(b2);
		horses.add(b3);
		horses.add(b4);
		horses.add(b5);
		Horse[] HorseArrays=new Horse[horses.size()];
		horses.toArray(HorseArrays);
		animal.animalComparable(HorseArrays);
	}
	public void animalComparable(Cat[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j].comparable(a[j+1])==false) {
					Cat n=a[j];
					a[j]=a[j+1];
					a[j+1]=n;
				}
			}
		}
		for(Cat e:a) {
			System.out.println(e.toString());
		}
	}
	public void animalComparable(Horse[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j].comparable2(a[j+1])==false) {
					Horse n=a[j];
					a[j]=a[j+1];
					a[j+1]=n;
				}
			}
		}
		for(Horse e:a) {
			System.out.println(e.toString());
		}
	}
}
abstract class Animal{
	private String type;
	private String name;
	private String color;
	public Animal() {
		super();
	}
	public Animal(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public Animal(String type, String name, String color) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract public void sleep();
	abstract public void wakeUp();
	abstract public void sing();
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", color=" + color + "]";
	}
}
class Cat extends Animal implements Comparable{
	private int age;	
	public Cat() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Cat(String type, String name, String color, int age) {
		super(type, name, color);
		this.age = age;
	}
	public void sleep() {
		System.out.println("The cat is sleeping!");
	}
	public void wakeUp() {
		System.out.println("The cat wakes up!");
	}
	public void sing() {
		System.out.println("The cat is singing miaomiao!");
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + ", Type=" + getType() + ", Name=" + getName() + ", Color="+ getColor() + "]";
	}
	@Override
	public boolean comparable(Cat a) {
		// TODO Auto-generated method stub
		if(a.age>this.age) {
			return true;
		}else {
			return false;
		}
	}
}
class Horse extends Animal implements Comparable2{
	private int height;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Horse() {
		super();
	}
	public Horse(String type, String name, String color, int height) {
		super(type, name, color);
		this.height = height;
	}
	public void sleep() {
		System.out.println("The horse is sleeping!");
	}
	public void wakeUp() {
		System.out.println("The horse wakes up!");
	}
	public void sing() {
		System.out.println("The horse is singing!");
	}
	@Override
	public String toString() {
		return "Horse [height=" + height + ", Type=" + getType() + ", Name=" + getName() + ", Color="+ getColor() + "]";
	}
	@Override
	public boolean comparable2(Horse a) {
		// TODO Auto-generated method stub
		if(a.height>this.height) {
			return true;
		}else {
			return false;
		}
	}
}

interface Comparable {
	boolean comparable(Cat a);
}

interface Comparable2 {
	boolean comparable2(Horse a);
}
