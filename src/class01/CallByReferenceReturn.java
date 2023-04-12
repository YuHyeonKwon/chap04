package class01;

/**
 * 메소드간 파라미터 전달(배열, 객체와 같은 여러개 값을 담는 객체의 주소값 전달) - 콜바이 레퍼런스 (Call by reference):
 * 참조 주소값 복사
 */
public class CallByReferenceReturn { // class s

	public static void main(String[] args) { // main s

		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] newNumbers = addTen(numbers); // 메소드 호출하고 반환된 값을 받음
		//// 전달받은 배열의 요소에 10을 더해주는 메소드
//		addTen(numbers); // 메소드 호출하고 반환된 값을 받음
//		for (int i = 0; i < numbers.length; i++) {	// 주소값은 하나여서 출력가능
//			System.out.println(numbers[i]);
//		}

		for (int i = 0; i < newNumbers.length; i++) {
			System.out.println(newNumbers[i]);
		}
//		}
	} // main e
		// 전달받은 배열의 요소에 10을 더해주는 메소드

	public static int[] addTen(int[] numbers) { // 주소값복사 (변수이름은 달라도 상관없음)
//		numbers[0] = numbers[0] + 10;
//		numbers[1] = numbers[1] + 10;
//		numbers[2] = numbers[2] + 10;
//		numbers[3] = numbers[3] + 10;
//		numbers[4] = numbers[4] + 10;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 10;
			System.out.println("일반for문: " + numbers[i]);
		}

		int[] numArr = null; // 메모리공간 확보 안됨 (배열은 참조자료형이여서 null 값 가능)
		numArr = new int[numbers.length]; // 5칸짜리 새로운 배열이 만들어짐.

		numArr[0] = numbers[0] + 10;
		numArr[1] = numbers[1] + 10;
		numArr[2] = numbers[2] + 10;
		numArr[3] = numbers[3] + 10;
		numArr[4] = numbers[4] + 10;

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] += 10;
		}
		return numArr; // 값 반환
	}
} // class e
