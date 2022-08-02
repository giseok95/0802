
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Program is starting......");
		MethodDemo1 md = new MethodDemo1();
		md.makesum(1,100);
		md.makesum(30,50);
		
		System.out.println("Program is over......");
	}

	void makesum(int j, int k) { // call by Value
		System.out.println("Method is starting......");
		int sum = 0;
		for (int i = j; i <= k; i++) {
			sum += i;
		}
		System.out.println(j+"부터" +k+" 까지의 합은"+sum);
		System.out.println("Method is over......");
	}
}