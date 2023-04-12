package class01;

public class EmplyoeeMain { // class s

	public static void main(String[] args) { // main s

		// Employee type Array 선언(10칸짜리)
		Emplyoee[] EmplyoeeArray = new Emplyoee[10];

		// 각 배열에 객체를 생성해서 저장
		EmplyoeeArray[0] = new Emplyoee("A", 28, 400, "KR", 10, "정규");
		EmplyoeeArray[1] = new Emplyoee("B", 27, 600, "KR", 15, "정규");
		EmplyoeeArray[2] = new Emplyoee("C", 26, 280, "JP", 1, "비정규");
		EmplyoeeArray[3] = new Emplyoee("D", 25, 360, "JP", 2, "비정규");
		EmplyoeeArray[4] = new Emplyoee("E", 23, 270, "RU", 1, "정규");
		EmplyoeeArray[5] = new Emplyoee("F", 27, 390, "AM", 4, "정규");
		EmplyoeeArray[6] = new Emplyoee("G", 31, 330, "SI", 3, "정규");
		EmplyoeeArray[7] = new Emplyoee("H", 35, 280, "CA", 2, "비정규");
		EmplyoeeArray[8] = new Emplyoee("I", 38, 450, "FR", 10, "정규");
		EmplyoeeArray[9] = new Emplyoee("J", 45, 600, "JP", 15, "정규");

		// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드 생성
		System.out.println("1. 전 사원들의 목록");
		printEmplyoee(EmplyoeeArray);
		System.out.println();

		// 2. 정규직 평균급여를 구해주는 메소드 생성(결과 반환)
		double avg = getSalAvg(EmplyoeeArray); // 값을 받아야함
		System.out.println("2. 정규직 직원들의 평균 급여는: " + Math.round(avg * 100) / 100.0);
		System.out.println();

		// 3. 한국(KR) 사원들의 평균 급여
		double avg1 = getSalAvg1(EmplyoeeArray);
		System.out.println("3. 정규직 직원들의 평균 급여는: " + Math.round(avg1 * 100) / 100.0);
		System.out.println();

	} // end main

	public static void printEmplyoee(Emplyoee[] EmplyoeeArray) {
		for (Emplyoee emplyoee : EmplyoeeArray) {
			System.out.println(emplyoee.getName() + "\t" + emplyoee.getAge() + "\t" + emplyoee.getSalart() + "\t"
					+ emplyoee.getLocal() + "\t" + emplyoee.getTerms() + "\t" + emplyoee.getGubun());
		}
	}

	public static double getSalAvg(Emplyoee[] EmplyoeeArray) {
		int sum = 0;
		int count = 0;
		double salAvg = 0.0;

		for (Emplyoee emplyoee : EmplyoeeArray) {
			if (emplyoee.getGubun().equals("정규")) {
				sum += emplyoee.getSalart();
				count++;
			}
		}
		salAvg = (double) sum / count;
		return salAvg;
	}

	public static double getSalAvg1(Emplyoee[] EmplyoeeArray) {
		int sum = 0;
		int count = 0;
		double localAvg = 0.0;

		for (Emplyoee emplyoee : EmplyoeeArray) {
			if (emplyoee.getLocal().equals("KR")) {
				sum += emplyoee.getSalart();
				count++;
			}
		}
		localAvg = (double) sum / count;
		return localAvg;
	}

} // end class
