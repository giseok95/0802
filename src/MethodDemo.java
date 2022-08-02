
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is starting......");
		MethodDemo md = new MethodDemo();
		md.makesum();
		System.out.println("Program is over......");
	}

	void makesum() { // call by name
		System.out.println("Method is starting......");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
		System.out.println("Method is over......");
	}
}