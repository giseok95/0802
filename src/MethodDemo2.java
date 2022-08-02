
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is starting......");
		MethodDemo2 md = new MethodDemo2();
		int start = 1, last = 100;
		int result = md.makesum(start, last);
		System.out.println(start + "부터" + last + " 까지의 합은" + result);
		start = 30;
		last = 50;
		result = md.makesum(start, last);
		System.out.println(start + "부터" + last + " 까지의 합은" + result);
		System.out.println("Program is over......");
	}

	int makesum(int j, int k) { // call by Value
		System.out.println("Method is starting......");
		int sum = 0;
		for (int i = j; i <= k; i++) {
			sum += i;
		}
		System.out.println("Method is over......");
		return sum;
	}
}