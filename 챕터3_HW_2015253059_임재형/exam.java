public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car("����", 0);
		//myCar1.color = "����";
		//myCar1.speed = 0;
		
		Car myCar2 = new Car(0);
		myCar2.color = "�Ķ�";
		//myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "�ʷ�";
		myCar3.speed = 0;
		
		myCar1.upSpeed(50);
		System.out.println("�ڵ��� 1�� ������ " + myCar1.getColor() + "�̸�, �ӵ��� " + myCar1.getSpeed() + "km�Դϴ�.");
		
		myCar2.downSpeed(20);
		System.out.println("�ڵ��� 2�� ������ " + myCar2.getColor() + "�̸�, �ӵ��� " + myCar2.getSpeed() + "km�Դϴ�.");
		
		myCar3.upSpeed(250);
		System.out.println("�ڵ��� 2�� ������ " + myCar3.getColor() + "�̸�, �ӵ��� " + myCar3.getSpeed() + "km�Դϴ�.");
		
		System.out.println("����� ���� ���(���� �ʵ�) ==> " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) ==> " + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ� ==> " + Car.MAX_SPEED);
		
		System.out.println("PI�� �� ==> " + Math.PI);
		System.out.println("3�� 5���� ==> " + Math.pow(3, 5));
	}

}
