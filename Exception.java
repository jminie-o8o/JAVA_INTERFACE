
public class Exception {

	public static void main(String[] args) {
		// try : ������ �ڵ�, ���� �߻� ���ɼ��� �ִ� ���
		// catch : ���� ó�� ���, catch����� ������ ��� ����
		// finally : ���� �߻� ���ο� ������� �ݵ�� ���صǴ� ��� (����������)
		int i = 10;
		int j = 5;
		try {
		int k = i/j;
		System.out.println(k);
		} catch(ArithmeticException e) {  //0���� �������� ���� ����Ŭ���� :ArithmeticException
			System.out.println("0���� ���� �� �����ϴ�"+e.toString());
		}finally {
			System.out.println("������ �߻��ϵ� ���� ����");
		}
		System.out.println("Main End!!!");
	}

}
