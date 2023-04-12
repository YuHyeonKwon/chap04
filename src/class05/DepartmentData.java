package class05;

public class DepartmentData { // class s
	
	// 필드생성
	public Department[] departments = new Department[3];
	
	// 기본생성자
	public DepartmentData() {
		
		departments[0] = new Department(920, "컴퓨터공학과", "201호");		// department 부서객체 입력
		departments[1] = new Department(923, "산업공학과   ", "207호");		// <- 오버로딩 생성자
		departments[2] = new Department(925, "전자공학과   ", "308호");
	}
} // class e
