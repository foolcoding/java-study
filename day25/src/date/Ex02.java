package date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) throws ParseException {
		
		// java.sql.Date toString()은 yyyy-mm-dd형식으로 출력하게 되어있다
		// java.sql.Date의 생성자는 반드시 long값을 전달해야만 한다 (기본생성자 없음)
		java.sql.Date d1 = new java.sql.Date(0);
		System.out.println("d1 : " + d1);
		
		// java.sql.Date는 java.util.Date의 서브클래스이다
		java.util.Date d2 = new java.util.Date();
		System.out.println("d2 : " + d2);
		
		java.sql.Date d3 = new java.sql.Date(d2.getTime());
		System.out.println("d3 : " + d3);
		
		// java.text.SimpleDateFormat 을 이용하여 문자열 <-> 날짜 형식을 활용할 수도 있다
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d4 = sdf.parse("1993-05-16");		// 문자열을 util.Date로 변환
		System.out.println("d4 : " + d4);
		java.sql.Date d5 = new java.sql.Date(d4.getTime());
		System.out.println("d5 : " + d5);	
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String s1 = sdf2.format(d5);	// Date를 String으로
		System.out.println("s1 : " + s1);
		
		String s2 = sdf2.format(new java.util.Date());
		System.out.println("s2 : " + s2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s3 = sdf3.format(d5);
		d4.setTime(d4.getTime() + (1000 * 60 * 60 * 14));
		String s4 = sdf3.format(d4);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
	}
}
