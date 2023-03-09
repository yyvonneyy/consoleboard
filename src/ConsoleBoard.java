import java.util.Scanner;

public class ConsoleBoard {

	public static void main(String[] args) {
		BoardFunction func = new BoardFunction();
		Scanner sc = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("번호                제목              작성자              작성일");
		System.out.println("--------------------------------------");

		while (true) {
			try {
				System.out.print("1.목록          2.등록          3.내용          4.삭제          0.종료 >>");
				int input = sc.nextInt();
				sc.nextLine();

				if (input == 0) {
					System.out.println("게시판 탐색을 종료합니다.");
					break;
				} else if (input == 1) {
					func.BoardList();
				} else if (input == 2) {
					func.BoardAdd();
				} else if (input == 3) {
					System.out.print("조회할 게시글 번호 입력>>");
					int cNum = sc.nextInt();
					func.BoardContent(cNum);
				} else if (input == 4) {
					System.out.print("삭제할 게시글 번호 입력>>");
					int dNum = sc.nextInt();
					func.BoardDelete(dNum);
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
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
//				System.out.print("조회할 게시글 번호 입력>>");
//				int cNum = sc.nextInt();
//				func.BoardContent(cNum);
//				break;
//			case 4:
//				System.out.print("삭제할 게시글 번호 입력>>");
//				int dNum = sc.nextInt();
//				func.BoardDelete(dNum);
//				break;
//			case 0:
//				System.out.println("게시판 탐색을 종료합니다.");
//				break;
//			default:
//				System.out.println("잘못된 입력입니다.");
//				break;
//			}
