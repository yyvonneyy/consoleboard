import java.util.Scanner;

public class ConsoleBoard {

	public static void main(String[] args) {
		BoardFunction func = new BoardFunction();
		Scanner sc = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("��ȣ                ����              �ۼ���              �ۼ���");
		System.out.println("--------------------------------------");

		while (true) {
			try {
				System.out.print("1.���          2.���          3.����          4.����          0.���� >>");
				int input = sc.nextInt();
				sc.nextLine();

				if (input == 0) {
					System.out.println("�Խ��� Ž���� �����մϴ�.");
					break;
				} else if (input == 1) {
					func.BoardList();
				} else if (input == 2) {
					func.BoardAdd();
				} else if (input == 3) {
					System.out.print("��ȸ�� �Խñ� ��ȣ �Է�>>");
					int cNum = sc.nextInt();
					func.BoardContent(cNum);
				} else if (input == 4) {
					System.out.print("������ �Խñ� ��ȣ �Է�>>");
					int dNum = sc.nextInt();
					func.BoardDelete(dNum);
				} else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				sc.nextLine();
			}

		}

	}
}

//			switch (input) {
//			case 1:
//				func.BoardList();
//				break;
//			case 2:
//				func.BoardAdd();
//				break;
//			case 3:
//				System.out.print("��ȸ�� �Խñ� ��ȣ �Է�>>");
//				int cNum = sc.nextInt();
//				func.BoardContent(cNum);
//				break;
//			case 4:
//				System.out.print("������ �Խñ� ��ȣ �Է�>>");
//				int dNum = sc.nextInt();
//				func.BoardDelete(dNum);
//				break;
//			case 0:
//				System.out.println("�Խ��� Ž���� �����մϴ�.");
//				break;
//			default:
//				System.out.println("�߸��� �Է��Դϴ�.");
//				break;
//			}
