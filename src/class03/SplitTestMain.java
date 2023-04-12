package class03;

/**
 * split(",") 메소드 : 콤머는 구분자
 */
public class SplitTestMain { // class s

	public static void main(String[] args) { // main s
		String csv = "홍길동;이규희;문소정;서규리;민중호";
		String[] arrTemp = csv.split(";");
		for (String string : arrTemp) {
			System.out.printf("%s ", string);

		}
	} // main e

} // class e
