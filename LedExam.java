
public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV(); //인터페이스도 인스턴스의 타입이 될 수 있다.
		tv.turnOn();
		tv.changeVolume(10);
		tv.changeChannel(7);
		tv.turnOff();

	}

}
