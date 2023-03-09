import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class BoardFunction {
	ArrayList<BoardContent> arr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	/* 게시글 추가 메소드 */
	public void BoardAdd() {
		System.out.print("제목>>");
		String title = sc.nextLine();

		System.out.print("내용>>");
		String content = sc.nextLine();

		System.out.print("작성자>>");
		String name = sc.nextLine();

		BoardContent ct = new BoardContent();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String date = dt.format(new Date());

		ct.setTitle(title);
		ct.setContent(content);
		ct.setName(name);
		ct.setDate(date);

		arr.add(ct); // BoardContent를 배열에 담기
		System.out.println("등록이 완료되었습니다.");

	}

	/* 내용 조회 메소드 */
	public void BoardContent(int num) {
		if (arr.isEmpty()) {
			System.out.println("게시글이 없습니다.");
		}
		if (((BoardContent) arr.get(num - 1)).equals(null)) {
			System.out.println("조회할 내용이 없습니다.");
		} else {
			System.out.println("--------------내용--------------");
			System.out.println("제목: " + ((BoardContent) arr.get(num - 1)).getTitle());
			System.out.println("내용: " + ((BoardContent) arr.get(num - 1)).getContent());
			System.out.println("작성자: " + ((BoardContent) arr.get(num - 1)).getName());
			System.out.println("작성일: " + ((BoardContent) arr.get(num - 1)).getDate());
			System.out.println("-------------------------------");
		}
	}

	/* 게시글 삭제 메소드 */
	public void BoardDelete(int num) {
		if (((BoardContent) arr.get(num - 1)).equals(null)) {
			System.out.println("조회할 내용이 없습니다.");
		} else {
			arr.remove(arr.get(num - 1));
			System.out.println(num + "번 게시글이 삭제되었습니다.");
		}
	}

	/* 게시글 목록 조회 */
	public void BoardList() {
		BoardContent ct = new BoardContent();
		System.out.println("======================================");
		System.out.println("번호                제목              작성자              작성일");
		System.out.println("--------------------------------------");
		if (arr.size() > 0) { // '게시글이 있으면'
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
			System.out.println("등록된 글이 없습니다.");
		}
	}
}
