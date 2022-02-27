class Animal {
	int weight;
	String picture;
	
	void eat() {
		System.out.println("������ �Դ´� (Animal Ŭ�������� ȣ��)");
	}
	
	void sleep() {
		System.out.println("���� �ܴ� ���� (Animal Ŭ�������� ȣ��)");
	}
}

class Lion extends Animal{
	int legs;

	void roar() {
		System.out.println("���ڰ� ������ (Lion Ŭ�������� ȣ��)");
	}
}

class Eagle extends Animal{
	int wings;
	
	void sleep() {
		System.out.println("�������� ���� ��� �߱�? (Eagle Ŭ�������� ȣ��)");
	}

	void fly() {
		System.out.println("�������� ���� (Eagle Ŭ�������� ȣ��)");
	}
}

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		lion.weight = 190;
		lion.picture = "����";
		lion.legs = 4;
		
		Eagle eagle = new Eagle();
		eagle.weight = 4;
		eagle.picture = "������";
		eagle.wings = 2;
		
		System.out.println(lion.picture + "�� �����Դ� " + lion.weight + "kg�̰� �ٸ� ������ " + lion.legs + "���̴�.");
		lion.eat();
		lion.sleep();
		lion.roar();
		
		System.out.println("");
		
		System.out.println(eagle.picture + "�� �����Դ� " + eagle.weight + "kg�̰� ���� ������ " + eagle.wings + "���̴�");
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}

}
