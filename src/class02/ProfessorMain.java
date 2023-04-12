package class02;

public class ProfessorMain{
// class s

	public static void main(String[] args) { // main s

		Professor[] professors = new Professor[6];

		professors[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		professors[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		professors[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		professors[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		professors[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		professors[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");

		// 교수들의 목록을 출력해주는 메소드를 호출
		printProfessor(professors);

		// 910 학과 교수중 입사년도가 2005년인 교수는?(2조건)
		getHireDate2005(professors);

		// 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 새로 입사한 선명규 고수를 그 자리에 저장하세요
		// (빈객체 생성후 setter 메소드로 값저장)
		// "96031", "790208-1884203", "선명규", 920, "부교수", "2021"
		
		newProfessor(professors);	// 이태규교슈 -> 선명규교수로 교체메소드
		
	} // main e

	private static void newProfessor(Professor[] professor2) {
		for (int i = 0; i < professor2.length; i++) {
			if ( professor2[i].equals("이태규")) {
				// 새로운 교수 객체 생성
				Professor sun = new Professor();
				sun.setId("96031");
				sun.setJumin("790208-1884203");
				sun.setName("선명규");
				sun.setDepartment(920);
				sun.setGrade("부교수");
				sun.setHiredate("2021");
				// 기존 이태규 교수 자리에 새로운 선명규 교수 객체 저장
				professor2[i] = sun;
			}
		}
		printProfessor(professor2);
}// newProfessor

	private static void getHireDate2005(Professor[] professors) {
		for (Professor professor : professors) {
			if (professor.getHiredate().equals("2005") && professor.getDepartment() == 910) {
				System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t"
						+ professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
			}
		}
		System.out.println();
	}

	// 교수 목록 출력 메소드
	private static void printProfessor(Professor[] professors) {
		for (Professor professor : professors) {
			System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t"
					+ professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
		}
		System.out.println();
	}

} // class e
