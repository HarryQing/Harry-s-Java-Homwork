package TheFirst;

import java.util.ArrayList;

/**
 * 
 * @author 庆子哥
 *2020年9月4日 下午4:40:21
 *description:
 *1、实现一个Animal类，该类包含type、name、color。
 *定义该类的三个构造函数：无参构造函数、带type和name参数的构造函数、带type、name、color参数的构造函数；
 *定义该类的每个属性的访问器方法；
 *定义一个sleep方法，其功能为打印输出语句“The animal is sleeping!”；
 *定义一个方法wakeUp方法，其功能为打印输出语句“The animal wakes up!”；
 *定义一个方法sing，其功能为打印输出语句“The animal is singing!”；
 *实现toString方法，返回Animal类的相关信息。
 *2、实现一个Cat类，该类继承Animal类。
 *该类中新增属性age，定义该类的两个构造函数，无参构造函数、带参数type、name、color、age属性的构造函数（调用父类的构造函数初始化从父类继承的type、name、color属性）。
 *分别覆盖父类中的sleep方法、wakeUp方法、sing方法，其功能分别打印输出“The cat is sleeping!”、“The cat wakes up!”、“The cat is singing miaomiao!”；
 *实现toString方法，返回Cat类的相关信息（包含从父类继承得到数据属性信息）。
 *3、实现一个Horse类，该类继承Animal类。
 *该类中新增属性height，定义该类的两个构造函数，无参构造函数、带参数type、name、color、height属性的构造函数（调用父类的构造函数初始化从父类继承的type、name、color属性）。
 *分别覆盖父类中的sleep方法、wakeUp方法、sing方法，其功能分别打印输出“The horse is sleeping!”、“The horse wakes up!”、“The horse is singing!”；
 *实现toString方法，返回Horse类的相关信息（包含从父类继承得到数据属性信息）。
 *4、定义一个测试类AnimalTest，在该类中定义一个ArrayList<Animal>对象，要求在代码构造块中初始化该对象；
 *在该类中定义方法 public void animalSleep(Animal animal)；
 *在该类中定义方法 public void animalWakeUp(Animal animal)；
 *在该类中定义方法 public void animalSing(Animal animal)；
 *在该类中定义main方法，实现：
 *（1）往ArrayList<Animal>对象中添加3只猫和3匹马；
 */

class Animal{
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
	public void sleep() {
		System.out.println("The animal is sleeping!");
	}
	public void wakeUp() {
		System.out.println("The animal wakes up!");
	}
	public void sing() {
		System.out.println("The animal is singing!");
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", color=" + color + "]";
	}
}
class Cat extends Animal{
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
}
class Horse extends Animal{
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
}

public class wyq_7 {
	public void animalSleep(Animal animal) {
		animal.sleep();
	}
	public void animalWakeUp(Animal animal) {
		animal.wakeUp();
	}
	public void animalSing(Animal animal) {
		animal.sing();
	}
	public static void main(String[] args){
		wyq_7 test=new wyq_7();
		ArrayList<Animal> animalsArrayList=new ArrayList<Animal>();
		Animal a1=new Cat("家养猫", "小佳", "黄色", 2);
		Animal a2=new Cat("加菲猫", "小叮当", "白色", 3);
		Animal a3=new Cat("短尾猫", "小可", "黑色", 1);
		Animal b1=new Horse("汗血宝马", "赤兔", "红棕色", 4);
		Animal b2=new Horse("汗血宝马", "大腕", "棕色", 5);
		Animal b3=new Horse("汗血宝马", "的卢", "红色", 3);
		animalsArrayList.add(a1);
		animalsArrayList.add(a2);
		animalsArrayList.add(a3);
		animalsArrayList.add(b1);
		animalsArrayList.add(b2);
		animalsArrayList.add(b3);
		
		test.animalSleep(a1);
		test.animalSleep(a2);
		test.animalSleep(a3);
		test.animalSleep(b1);
		test.animalSleep(b2);
		test.animalSleep(b3);
		
		test.animalWakeUp(a1);
		test.animalWakeUp(a2);
		test.animalWakeUp(a3);
		test.animalWakeUp(b1);
		test.animalWakeUp(b2);
		test.animalWakeUp(b3);
		
		test.animalSing(a1);
		test.animalSing(a2);
		test.animalSing(a3);
		test.animalSing(b1);
		test.animalSing(b2);
		test.animalSing(b3);
	}
}
