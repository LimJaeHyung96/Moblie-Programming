class Bank{
	double getInterestRate() {
		return 0.05;
	}
}

class BadBank extends Bank{
	double getInterestRate() {
		return 0.03;
	}
}

class NormalBank extends Bank{
	
}

class GoodBank extends Bank{
	double getInterestRate() {
		return 0.1;
	}
}

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money = 1000000.00;
		
		BadBank bank1 = new BadBank();
		NormalBank bank2 = new NormalBank();
		GoodBank bank3 = new GoodBank();

		System.out.println("100���� ���ڽ� 1�� ������ ���ڴ� " + money * bank1.getInterestRate());
		System.out.println("100���� ���ڽ� 2�� ������ ���ڴ� " + money * bank2.getInterestRate());
		System.out.println("100���� ���ڽ� 3�� ������ ���ڴ� " + money * bank3.getInterestRate());
	}

}
