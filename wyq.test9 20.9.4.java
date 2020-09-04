package TheFirst;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author 庆子哥
 *2020年9月4日 下午11:10:16
 *description:
 *定义一个学生类Student，包含数据成员name（串类型）、age（整型）、scoreArr（ArrayList<int>类型）、stuID（串类型）。要求：
 *1、定义无参构造方法；
 *2、定义数据成员name、age、stuID的setter方法，分别为setName(String name), setAge(int age), setStuID(String stuID), 其中name要求不得包含英文字符，age大于等于0且小于等于200，stuID的长度为8；
 *3、定义成员方法inputScore，实现向scoreArr中输入成绩，直到遇到“#”，成绩输入结束，成绩大于等于0且小于等于100；
 *4、要求定义自定义异常类StuException；
 *5、name、age、stuID输入非法时，抛出StuException异常；
 *6、inputScore中，在对输入的字符串进行解析时，应通过异常处理机制实现对输入数据的合法性校验。
 *7、在main方法中，定义一个大小为3的Student数组，每个学生的name、age、stuID通过setter方法初始化，成绩通过inputScore方法输入。打印出每个学生的所有信息。
 */
public class wyq_9 {
	public static void main(String[] args) throws StuException{
		
		Student student1=new Student();
		student1.setName("Tom");
		student1.setAge(18);
		student1.setStuID("21092109");
		System.out.println("录入Tom信息");
		student1.inputScores();
		System.out.println();
		Student student2=new Student();
		student2.setName("Jack");
		student2.setAge(8);
		student2.setStuID("21092109");
		System.out.println("录入Jack信息");
		student2.inputScores();
		System.out.println();
		
		Student student3=new Student();
		student3.setName("Mary");
		student3.setAge(20);
		student3.setStuID("21092109");
		System.out.println("录入Mary信息");
		student3.inputScores();
		System.out.println();
		
		Student[] students= {student1,student2,student3};
		
		for(Student e:students) {
			System.out.println(e.toString());
		}
		
	}
}
class StuException extends Exception{

	private String message;

	public StuException(String message) {
		super();
		this.message = message;
	}
}
class Student{
	String name;
	int age;
	String stuID;
	ArrayList<Integer> scoreArr;
	
	public Student() {
		super();
	}
	
	public void setName(String name) throws StuException{
		char[] a=new char[name.length()];
		a=name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if((int)a[i]>=65&&(int)a[i]<=90||(int)a[i]>=97&&(int)a[i]<=122) {
				this.name = name;
			}else {
				throw new StuException("输入错误，name要求不得包含非英文字符!");
			}
		}
	}

	public void setAge(int age) throws StuException{
		if(age<0||age>200) {
			throw new StuException("输入错误，age应当大于等于0且小于等于200！");
		}else {
			this.age = age;
		}
	}

	public void setStuID(String stuID) throws StuException{
		if(stuID.length()!=8) {
			throw new StuException("输入错误，stuID的长度应当为8!");
		}else {
			this.stuID = stuID;
		}
	}
	
	public void inputScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生的成绩：");
        String scoreStr;
        int score = 0;
        while (true) {
            scoreStr = scanner.next();
            if (scoreStr.equals("#")) {
                break;
            }
            try {
                score = Integer.parseInt(scoreStr);
                if (score < 0 || score > 100) {
                    System.out.println("成绩应该在[0-100]范围内。");
                } else {
                    scoreArr.add(score);
                }
 
            } catch (NullPointerException | NumberFormatException e) {
                // TODO: handle exception
                if (e instanceof NullPointerException) {
                	System.out.println("动态数组未开辟空间；");
                    scoreArr = new ArrayList<Integer>();
                    scoreArr.add(score);
                }
                if (e instanceof NumberFormatException) {
                    System.out.println("成绩输入内容不对，请重新输入！");
                }
 
            }  finally {
                System.out.println("\t您刚才输入的是：" + scoreStr);
            }
 
        }
        System.out.print("输入的成绩是：");
        for (int i = 0; i < scoreArr.size(); i++) {
            System.out.print(scoreArr.get(i) + " ");
        }
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", stuID=" + stuID + ", scoreArr=" + scoreArr + "]";
	}
}
