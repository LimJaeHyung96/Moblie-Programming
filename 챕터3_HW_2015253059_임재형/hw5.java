import java.util.ArrayList;
import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("�̸� ����� ����ϴ� ���α׷��Դϴ�. ����� �Է½� ����� �����ݴϴ�.\n");
		do {
			System.out.print("�̸��� �Է��ϼ��� : ");
			text = sc.nextLine();
			list.add(0,text);
		}while(!text.equals("���"));
		
		list.remove(0);
		
		for(String str : list)
			System.out.println(str);
	}

}
