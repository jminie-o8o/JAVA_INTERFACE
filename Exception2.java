
public class Exception2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		} catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}

	// throws는 예외가 발생했을때 예외를 호출한 쪽에서 처리하도록 던져준다.
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		
		int k = i / j;
		return k;
	}
 
}

