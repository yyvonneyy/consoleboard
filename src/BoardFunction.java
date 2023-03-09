import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class BoardFunction {
	ArrayList<BoardContent> arr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	/* �Խñ� �߰� �޼ҵ� */
	public void BoardAdd() {
		System.out.print("����>>");
		String title = sc.nextLine();

		System.out.print("����>>");
		String content = sc.nextLine();

		System.out.print("�ۼ���>>");
		String name = sc.nextLine();

		BoardContent ct = new BoardContent();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String date = dt.format(new Date());

		ct.setTitle(title);
		ct.setContent(content);
		ct.setName(name);
		ct.setDate(date);

		arr.add(ct); // BoardContent�� �迭�� ���
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");

	}

	/* ���� ��ȸ �޼ҵ� */
	public void BoardContent(int num) {
		if (arr.isEmpty()) {
			System.out.println("�Խñ��� �����ϴ�.");
		}
		if (((BoardContent) arr.get(num - 1)).equals(null)) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		} else {
			System.out.println("--------------����--------------");
			System.out.println("����: " + ((BoardContent) arr.get(num - 1)).getTitle());
			System.out.println("����: " + ((BoardContent) arr.get(num - 1)).getContent());
			System.out.println("�ۼ���: " + ((BoardContent) arr.get(num - 1)).getName());
			System.out.println("�ۼ���: " + ((BoardContent) arr.get(num - 1)).getDate());
			System.out.println("-------------------------------");
		}
	}

	/* �Խñ� ���� �޼ҵ� */
	public void BoardDelete(int num) {
		if (((BoardContent) arr.get(num - 1)).equals(null)) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		} else {
			arr.remove(arr.get(num - 1));
			System.out.println(num + "�� �Խñ��� �����Ǿ����ϴ�.");
		}
	}

	/* �Խñ� ��� ��ȸ */
	public void BoardList() {
		BoardContent ct = new BoardContent();
		System.out.println("======================================");
		System.out.println("��ȣ                ����              �ۼ���              �ۼ���");
		System.out.println("--------------------------------------");
		if (arr.size() > 0) { // '�Խñ��� ������'
			int count = 1;
			for (int i = 0; i < arr.size(); i++) {
				System.out.print(count + "   ");
				System.out.print(((BoardContent) arr.get(i)).getTitle() + "   ");
				System.out.print(((BoardContent) arr.get(i)).getName() + "   ");
				System.out.print(((BoardContent) arr.get(i)).getDate());
				System.out.println();
				count++;
			}
		} else {
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}
}
