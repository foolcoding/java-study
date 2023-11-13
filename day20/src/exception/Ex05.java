package exception;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// try : 예외 발생 가능성이 있는 코드를 작성한다
		// catch : try 에서 예외가 발생하면 지정한 타입의 예외를 받아서 처리한다
		//			하나의 try에 여러 catch를 작성할 수도 있다
		//			이때, 순서는 상세한 것부터 포괄적인예외순으로 작성해야 한다
		//			맨 아래에 catch(Exception e) 를 작성하면 모든 예외에 대한 처리가 된다
		// finally : 예외 발생 여부에 상관없이 항상 실행되는 코드를 작성한다, 주로 마무리 코드를 작성한다
		// throw : 임의로 예외 객체를 생성한다음, 생성된 예외 객체를 catch에게 넘기는 것으로 사용한다
		// throws : 메서드 매개변수 옆에 작성하여 해당 함수에서 발생하는 예외를 caller 에게 전가한다
		
		// 예외 타입에 따라서, try ~ catch로 처리하지 않아도 실행은 가능한 예외가 있고
		// 특정 예외는 반드시 예외처리를 해야만 실행되는 코드도 있다
		// 주로, 입출력 및 네트웤 ㅡ통신에 관련된 예외는 반드시 예외처리를 진행해야 하는 경우가 있다
		
		URL url = new URL("https://www.naver.com");
		// throws MalformedURLException
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// throws IOException
		
		Scanner sc = new Scanner(System.in);
		// throws IOException
		
		String str = "";
		while(sc.hasNextLine()) {
			str += sc.nextLine();
		}
		str = str.replace(">", ">\n");
		sc.close();
		conn.disconnect();
		System.out.println(str);
		System.out.println(str.length());
	}
}
