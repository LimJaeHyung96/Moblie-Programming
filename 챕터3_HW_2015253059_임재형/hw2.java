class Animal {
	int weight;
	String picture;
	
	void eat() {
		System.out.println("음식을 먹는다 (Animal 클래스에서 호출)");
	}
	
	void sleep() {
		System.out.println("잠을 잔다 쿨쿨 (Animal 클래스에서 호출)");
	}
}

class Lion extends Animal{
	int legs;

	void roar() {
		System.out.println("사자가 으르렁 (Lion 클래스에서 호출)");
	}
}

class Eagle extends Animal{
	int wings;
	
	void sleep() {
		System.out.println("독수리는 잠을 어떻게 잘까? (Eagle 클래스에서 호출)");
	}

	void fly() {
		System.out.println("독수리가 훨훨 (Eagle 클래스에서 호출)");
	}
}

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		lion.weight = 190;
		lion.picture = "사자";
		lion.legs = 4;
		
		Eagle eagle = new Eagle();
		eagle.weight = 4;
		eagle.picture = "독수리";
		eagle.wings = 2;
		
		System.out.println(lion.picture + "의 몸무게는 " + lion.weight + "kg이고 다리 갯수는 " + lion.legs + "개이다.");
		lion.eat();
		lion.sleep();
		lion.roar();
		
		System.out.println("");
		
		System.out.println(eagle.picture + "의 몸무게는 " + eagle.weight + "kg이고 날개 갯수는 " + eagle.wings + "개이다");
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}

}
