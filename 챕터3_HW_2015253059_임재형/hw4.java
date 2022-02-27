abstract class Calculate {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

class Add extends Calculate{
	int calculate() {
		return a+b;
	}
}

class Sub extends Calculate{
	int calculate() {
		return a-b;
	}
}

class Mul extends Calculate{
	int calculate() {
		return a*b;
	}
}

class Div extends Calculate{
	int calculate() {
		return a/b;
	}
}

public class hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		add.setValue(7, 2);
		sub.setValue(7, 2);
		mul.setValue(7, 2);
		div.setValue(7, 2);
		
		System.out.println("µ¡¼À : " + add.calculate());
		System.out.println("»¬¼À : " + sub.calculate());
		System.out.println("°ö¼À : " + mul.calculate());
		System.out.println("³ª´°¼À : " + div.calculate());
	}

}
