package class06;

public class TakesMain { // class s

	public static void main(String[] args) { // main s
		
		TakesData tkd = new TakesData();
		Takes[] takes = tkd.takes;

		// 성적 객체를 담을
//		Takes[] takes = new Takes[12];

		// 기초데이터 생성
		initData(takes);

		// 1.전학생 성적 출력(toString 메소드 이용)
		printTakes(takes);

		// 2. 성적이 "A+"인 학생의 id를 반환받아서 출력하세요.
		String[] arrId = getAplus(takes);
		for (String string : arrId) {
			System.out.println(string);
		}
	} // main e

	public static void initData(Takes[] takes) {

		// 객체생성
//		takes[0] = new Takes("1292001", "C101-01", "B+");
//		takes[1] = new Takes("1292001", "C103-01", "A+");
//		takes[2] = new Takes("1292001", "C301-01", "A");
//		takes[3] = new Takes("1292002", "C102-01", "A");
//		takes[4] = new Takes("1292002", "C103-01", "B+");
//		takes[5] = new Takes("1292002", "C502-01", "C+");
//		takes[6] = new Takes("1292003", "C103-02", "B");
//		takes[7] = new Takes("1292003", "C501-02", "A+");
//		takes[8] = new Takes("1292301", "C102-01", "C+");
//		takes[9] = new Takes("1292303", "C102-01", "C");
//		takes[10] = new Takes("1292303", "C103-02", "B+");
//		takes[11] = new Takes("1292303", "C501-01", "A+");
	}

	// 전학생 성적 출력
	public static void printTakes(Takes[] takes) {
		for (int i = 0; i < takes.length; i++) {
			System.out.println(takes[i].getId() + "\t" + takes[i].getSubject() + "\t" + takes[i].getScore());
		}
		System.out.println();
	}

	// 성적이 A+인 학생
	public static String[] getAplus(Takes[] department) {
		String names = "";
		for (Takes takes : department) {
			if (takes.getScore().equals("A+")) {
				names = names + takes.getId() + ",";
			}
		}
		String[] arrName = names.split(",");
		return arrName;
	}
} // class e
