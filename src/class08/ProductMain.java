package class08;

public class ProductMain { // class s

	public static void main(String[] args) { // main s

		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;

		// [문제1] 전체 상품 목록 출력
		printProduct(products);

		// [문제2] 세탁기의 가격을 조회하시오.
		String tempStr = "세탁기";
		getWashPrince(tempStr, products);

		// [문제3] 구매한 모든 제품의 총액과 평균 가격을 main 메소드에서 출력하세요.
		int sum = getTotalAmount(products);
		System.out.println("총액:" + sum);
		double avg = getAvg(products);
		System.out.printf("평균:%.0f", avg);
		System.out.println();
		System.out.println();

		// [문제4] 제품 중에서 100만원이 넘는 제품의 목록, 수량 출력
		getProductGrather100(products);
	} // main e

	// [문제4] 제품 중에서 100만원 이상 제품의 목록, 수량, 합계 금액 출력
	public static void getProductGrather100(Product[] products) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() >= 1000000) {
				sum += products[i].getPrice(); // 100만원이 넘는 구매 제품 금액 합산
				count++; // 100만원 넘는 구매 제품 갯수 합산
				System.out.println(products[i].getId() + "\t" + products[i].getName() + "\t" + products[i].getPrice());
			}
		}
		System.out.println("100만원 이상인 제품의 수량은: " + count + "개이며 합계 금액은: " + sum + "원입니다.");
	}

	// [문제1]
	public static void printProduct(Product[] products) {
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
		System.out.println();
	}

	// [문제2]
	public static void getWashPrince(String tempStr, Product[] products) { // 타입과 변수명을 꼭 적어야함
		for (int i = 0; i < products.length; i++) {
			if (products[i].getName().equals(tempStr)) {
				System.out.println(tempStr + products[i].getPrice());
			}
		}
		System.out.println();
	}

	// [문제3] 합계구하는 메소드
	public static int getTotalAmount(Product[] products) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();
		}
//		System.out.println("총액:" +sum);
		return sum;
	}

	// [문제4] 평균구하는 메소드
	public static double getAvg(Product[] products) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();
		}
		avg = (sum + 1.0) / products.length;
		return avg;
	}

} // class e
