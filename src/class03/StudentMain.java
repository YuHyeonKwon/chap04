package class03;

public class StudentMain { // class s

	public static void main(String[] args) { // main s
		Student[] student = new Student[8];

		// 학생 데이터를 생성해주는 메소드를 만드세요.
		initDate(student);

		// [문제1] 학생 목록을 출력하는 메소드를 만드세요.
		printStudent(student);

		// [문제2] 여학생들의 명단을 출력하시오.
		printWomanStudent(student);

		// [문제3] 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받는 이름을 main 메소드에서 출력하세요.
		String[] seoulSt = getSeoulStudent(student); // 반환받은 문자열 저장 변수 선언
		for (String string : seoulSt) {
			System.out.println(string);
		}
	} // main e

	// 서울 사는 3학년 학생들 이름을 구해서 반환하는 메소드
	private static String[] getSeoulStudent(Student[] student) {
		String arrName = "";
		for (Student student2 : student) {
			if (student2.getAddress().equals("서울") && student2.getYear() == 3) {
				arrName += student2.getName() + ",";
			}
		}
		String[] resultName = arrName.split(",");
		return resultName;
	}

	// 여학생들 목록을 출력하는 메소드
	private static void printWomanStudent(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			if (student[i].getJumin().substring(7, 8).equals("2")) {
				System.out.println(student[i].getId() + "\t" + student[i].getJumin() + "\t" + "\t"
						+ student[i].getName() + "\t" + student[i].getYear() + "\t" + student[i].getAddress() + "\t"
						+ student[i].getDepartment());
			}
		}
		System.out.println();
	}

	// 학생 목록을 출력하는 메소드
	private static void printStudent(Student[] student) {
		for (Student student2 : student) {
			System.out.println(student2.getId() + "\t" + student2.getJumin() + "\t" + "\t" + student2.getName() + "\t"
					+ student2.getYear() + "\t" + student2.getAddress() + "\t" + student2.getDepartment());
		}
		System.out.println();
	}

	private static void initDate(Student[] student) {
		student[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		student[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		student[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		student[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		student[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		student[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		student[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		student[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);
	}

} // class e
