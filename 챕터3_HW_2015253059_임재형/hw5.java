import java.util.ArrayList;
import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("이름 명단을 출력하는 프로그램입니다. 출력을 입력시 명단을 보여줍니다.\n");
		do {
			System.out.print("이름을 입력하세요 : ");
			text = sc.nextLine();
			list.add(0,text);
		}while(!text.equals("출력"));
		
		list.remove(0);
		
		for(String str : list)
			System.out.println(str);
	}

}
