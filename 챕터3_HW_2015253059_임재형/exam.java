public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car("빨강", 0);
		//myCar1.color = "빨강";
		//myCar1.speed = 0;
		
		Car myCar2 = new Car(0);
		myCar2.color = "파랑";
		//myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "초록";
		myCar3.speed = 0;
		
		myCar1.upSpeed(50);
		System.out.println("자동차 1의 색상은 " + myCar1.getColor() + "이며, 속도는 " + myCar1.getSpeed() + "km입니다.");
		
		myCar2.downSpeed(20);
		System.out.println("자동차 2의 색상은 " + myCar2.getColor() + "이며, 속도는 " + myCar2.getSpeed() + "km입니다.");
		
		myCar3.upSpeed(250);
		System.out.println("자동차 2의 색상은 " + myCar3.getColor() + "이며, 속도는 " + myCar3.getSpeed() + "km입니다.");
		
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAX_SPEED);
		
		System.out.println("PI의 값 ==> " + Math.PI);
		System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));
	}

}
