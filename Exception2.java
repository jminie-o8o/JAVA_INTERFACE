
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

	// throws�� ���ܰ� �߻������� ���ܸ� ȣ���� �ʿ��� ó���ϵ��� �����ش�.
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�.");
		}
		
		int k = i / j;
		return k;
	}
 
}

