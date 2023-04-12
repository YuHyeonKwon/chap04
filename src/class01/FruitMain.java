package class01;

/**
 * 실행클래스
 */
public class FruitMain { // class s

	public static void main(String[] args) { // main s

		// 객체 한개 생성

		Fruit peach = new Fruit(); // 생성자: 필드초기화
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);

		printFruit(peach); // 메소드 호출

		// 객체 5개 생성
		Fruit apple = new Fruit("사과", 2000, 5); // 공간3개, 공간을 한번에 보낼수 없기때문에 주소를 보낸다.

		Fruit mango = new Fruit("망고", 1000, 2);

		Fruit banna = new Fruit("바나나", 2500, 3);

		Fruit pineapple = new Fruit("파인애플", 5000, 1);

		Fruit orange = new Fruit("오렌지", 6000, 4);

		printFruit1(apple, mango, banna, pineapple, orange); // 5개 메소드

		
		// 과일 객체 5개 담을 수 있는 Array 선언

		Fruit[] fruitArr = new Fruit[5];
		fruitArr[0] = new Fruit("사과", 2000, 5);
		fruitArr[1] = new Fruit("망고", 1000, 2);
		fruitArr[2] = new Fruit("바나나", 2500, 3);
		fruitArr[3] = new Fruit("파인애플", 5000, 1);
		fruitArr[4] = new Fruit("오렌지", 6000, 4);
		
		printFruit2(fruitArr);

	} // main e

	public static void printFruit(Fruit peach) {

		System.out.println(peach.getName() + "\t" + peach.getPrice() + "\t" + peach.getQuantity());
	}

	public static void printFruit1(Fruit apple, Fruit mango, Fruit banna, Fruit pineapple, Fruit orange) {

		System.out.println(apple.getName() + "\t" + apple.getPrice() + "\t" + apple.getQuantity());
		System.out.println(mango.getName() + "\t" + mango.getPrice() + "\t" + mango.getQuantity());
		System.out.println(banna.getName() + "\t" + banna.getPrice() + "\t" + banna.getQuantity());
		System.out.println(pineapple.getName() + "\t" + pineapple.getPrice() + "\t" + pineapple.getQuantity());
		System.out.println(orange.getName() + "\t" + orange.getPrice() + "\t" + orange.getQuantity());
		System.out.println("=================");
	}

	public static void printFruit2(Fruit[] fruitArr) {
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i].getName() + "\t" + fruitArr[i].getPrice() + "\t" + fruitArr[i].getQuantity());
		}
	}
} // class e
