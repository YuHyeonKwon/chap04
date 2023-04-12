package class10;

import class10.vo.Department;
import class10.vo.MakeData;
import class10.vo.Professor;
import class10.vo.Student;
import class10.vo.Takes;

/**
 * 학사 행정 실행클래스 - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보 + 학과정보)
 */
public class SchoolManagermentMain { // class s
	
	public static void main(String[] args) { // main s
		
		MakeData dm = new MakeData();
		Department[] departments = dm.departments;
		Professor[] professors = dm.professors;
		Student[] students = dm.students;
		Takes[] takes = dm.takes;
		
		// 학생 데이터 생성

		// [문제1] 전체 학생 명단을 출력하시오.
		System.out.println("==============================학생명단======================================");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getJumin() + "\t"
					+ students[i].getYear() + "\t" + students[i].getAddress() + "\t" + students[i].getDepartment()
					+ "\t");
			for (int j = 0; j < departments.length; j++) {
				if (students[i].getDepartment() == departments[j].getId()) {
					System.out.println(departments[j].getName());
				}
			}
			
		} // for e

		 //[문제2] 학생 성적
		System.out.println("====================================================================");
		for (Student stu : students) {
			for (Takes tak : takes) {
				if (stu.getId().equals(tak.getId())) {
					System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getJumin() + "\t" + stu.getYear()
							+ "\t" + stu.getAddress() + "\t" + stu.getDepartment() + "\t" + tak.getSubject() + "\t"
							+ tak.getScore());

				}
			}
		}

		// [문제3] 컴퓨터공학과 교수들을 모두 조회하세요.
		// 1. 학과배열에서 컴퓨터공학과 코드 찾기
		// 2. 코드로 교수 배열에 하당하는 교수 찾기

		int num = 0;
		String name = "";
		System.out.println("====================================================================");
		for (Department dpm : departments) {
			if (dpm.getId() == 920) {
				num = dpm.getId();
				name = dpm.getName();
				System.out.println("학과코드: " + num);
			}
		}
		System.out.println("====================================================================");
		for (Professor fps : professors) {
			if (fps.getDepartment() == num) {
				System.out.println(fps.getId() + "\t" + fps.getJumin() + "\t" + fps.getName() + "\t"
						+ fps.getDepartment() + "\t" + fps.getGrade() + "\t" + fps.getHiredate() + "\t" + name);

			}
		}
		System.out.println("====================================================================");

	} // main e

} // class e
