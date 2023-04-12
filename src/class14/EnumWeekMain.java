package class14;

import java.util.Calendar;

public class EnumWeekMain { // class s

	public static void main(String[] args) { // main s
		//Week 열거 타입 변수 선언
		Week today = null;	// 객체를 담을수 있는 클래스 변수
		
		//Calendar 얻기	// 캘린더 객체
		Calendar cal = Calendar.getInstance();		// 클래스 이름으로 바로 접근 정적메소드
		
		//오늘의 요일 얻기(1~7)
		//일-1, 월-2, 화-3, 수-4, 목-5, 금-6, 토-7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
		case 1: today = Week.SUNDAY ; break;		// Week enum 타입변수만 받을 수 있음
		case 2: today = Week.MONDAY ; break;
		case 3: today = Week.TUESDAY ; break;
		case 4: today = Week.WEDNESDAY ; break;
		case 5: today = Week.THURSDAY ; break;
		case 6: today = Week.FRIDAY ; break;
		case 7: today = Week.SATURDAY ; break;
		} // switch end

		// 열거 타입 변수를 사용
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}

	} // main e

} // class e
