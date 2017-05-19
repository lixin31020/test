import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		System.out.println("欢迎来到宠物店！");
		System.out.print("请输入要领养的宠物名字：");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		System.out.print("请选择要领养的宠物类型：");
		System.out.print("1、狗   2、企鹅");
		switch(input.nextInt()){
		case 1:
//			选择狗
			System.out.println("请选择狗性别：1、公 2、母");
			int sexI=input.nextInt();
			String strain="公狗";
			if(sexI==2){
				strain="母狗";
			}
			System.out.print("请输入狗健康值：");
			int healthy=input.nextInt();
//			创建狗对象并赋值
			Dog dog=new Dog();
			dog.setName(name);
			dog.setHealth(healthy);
			dog.setstrain(strain);
			dog.print();
			break;
		case 2:
//			选择企鹅
			System.out.print("请选择企鹅性别：1、Q仔 2、Q妹");
			int sexId=input.nextInt();
			String sex="Q仔";
			if(sexId==2){
				sex="Q妹";
			}
			System.out.print("请输入企鹅的健康值（1-100）：");
			int health=input.nextInt();
//			创建企鹅对象并赋值
			penguin png=new penguin();
			png.setName(name);
			png.setHealth(health);
			png.setSex(sex);
			png.print();
			break;
			
		}
	}
}
