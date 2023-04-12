package class01;

/**
 * 메소드간 파라미터 전달 - 콜바이 밸류(call by value) : 값전달(값복사)
 */
public class CallByValue { // class s
	public static void main(String[] args) { // main s

		int num1 = 5;
		int num2 = 10;

		int sum = addNumbers(num1, num2); // 다른 메소드 호출

		System.out.println("정수" + num1 + " 더하기 " + num2 + " 은 " + sum);

		// 덧셈 메소드

	} // main e

	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
} // class e
