
public class Exception {

	public static void main(String[] args) {
		// try : 수행할 코드, 예외 발생 가능성이 있는 블록
		// catch : 예외 처리 블록, catch블록은 여러개 사용 가능
		// finally : 예외 발생 여부에 상관없이 반드시 실해되는 블록 (생략가능함)
		int i = 10;
		int j = 5;
		try {
		int k = i/j;
		System.out.println(k);
		} catch(ArithmeticException e) {  //0으로 나누었을 때의 예외클래스 :ArithmeticException
			System.out.println("0으로 나눌 수 없습니다"+e.toString());
		}finally {
			System.out.println("오류가 발생하든 말든 실행");
		}
		System.out.println("Main End!!!");
	}

}
