package class05;

public class DepartmentMain { // class s

	public static void main(String[] args) { // main s
		
		// DepartmentData 객체생성
		DepartmentData dtd = new DepartmentData();		// DepartmentData 객체의 주소가 dtd로 저장
		Department[] department = dtd.departments;		// DepartmentData 객체의 필드를 갖고옴

		// 기초데이터 생성
//		initData(department);

		// [문제1] 학과 목록을 출력하시오.
		printDepartment(department);

		// [문제2] 학과 코드(id)가 "923"인 학과의 코드(ID), name, office를 출력하시오
		getDepartment(department);

		// [문제3] 컴퓨터공학과의 교실을 조회해서 main 메소드에서 출력하세요.
		String str1 = getOffice(department);
		System.out.println(str1);

	} // main e

	private static String getOffice(Department[] departments) {
		String strName = "";
		for (Department department : departments) {
			if (department.getOffice().equals("201호")) {
				strName = department.getOffice();
			}
		}
		return strName;
	}

	private static void getDepartment(Department[] departments) {
		for (Department department : departments) {
			if (department.getId() == 923) {
				System.out.println(department.getId() + "\t" + department.getName() + "\t" + department.getOffice());
			}
		}
		System.out.println();
	}

	private static void printDepartment(Department[] department) {
		for (Department department2 : department) {
			System.out.println(department2.getId() + "\t" + department2.getName() + "\t" + department2.getOffice());
		}
		System.out.println();
	}

//	private static void initData(Department[] department) {
//		department[0] = new Department(920, "컴퓨터공학과", "201호");		// department 부서객체 입력
//		department[1] = new Department(923, "산업공학과   ", "207호");
//		department[2] = new Department(925, "전자공학과   ", "308호");
//	}

} // class e
