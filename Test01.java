import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) {
		System.out.println("��ӭ��������꣡");
		System.out.print("������Ҫ�����ĳ������֣�");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�");
		System.out.print("1����   2�����");
		switch(input.nextInt()){
		case 1:
//			ѡ��
			System.out.println("��ѡ���Ա�1���� 2��ĸ");
			int sexI=input.nextInt();
			String strain="����";
			if(sexI==2){
				strain="ĸ��";
			}
			System.out.print("�����빷����ֵ��");
			int healthy=input.nextInt();
//			���������󲢸�ֵ
			Dog dog=new Dog();
			dog.setName(name);
			dog.setHealth(healthy);
			dog.setstrain(strain);
			dog.print();
			break;
		case 2:
//			ѡ�����
			System.out.print("��ѡ������Ա�1��Q�� 2��Q��");
			int sexId=input.nextInt();
			String sex="Q��";
			if(sexId==2){
				sex="Q��";
			}
			System.out.print("���������Ľ���ֵ��1-100����");
			int health=input.nextInt();
//			���������󲢸�ֵ
			penguin png=new penguin();
			png.setName(name);
			png.setHealth(health);
			png.setSex(sex);
			png.print();
			break;
			
		}
	}
}
