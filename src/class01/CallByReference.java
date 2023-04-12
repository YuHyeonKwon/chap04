package class01;
/**
 * 메소드간 파라미터 전달(배열,객체와 같은 여러개 값을 담는 개체의 주소값 전달)
 * - 콜바이 레퍼런스(call by reference) :참조 주소값 복사
 * 여러개값 복사
 */
public class CallByReference { // class s

	public static void main(String[] args) { // main s
		int[] numbers = { 1, 2, 3, 4, 5 };
		// int 자료형 변수 5개 선언
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		printArray(numbers); // 배열 출력 메소드 호출 , 값을전달
		
		printArray(a,b,c,d,e);	
	} // main e

	private static void printArray(int a, int b, int c, int d, int e) {	// 파라미터(매개변수)
		System.out.println(a + " " + b + " " + c + d + e);
}
	// 배열을 전달 받아서 출력해주는 메소드
	public static void printArray(int[] numbers) { // numbers 메모리번지수 전달
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}
	
	
} // class e
