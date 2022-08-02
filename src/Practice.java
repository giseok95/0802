
public class Practice {
	public static void main(String[] args) {
		int jimin[]= {1,2,2,4,2,2,3,4,1,2};
		result(jimin);
	}

	static void result(int[] student) {
		int result[] = {1,2,3,4,1,2,3,4,1,2 };
		for (int i = 0; i <= result.length; i++) {
			if (result[i] == student[i])
				System.out.print("o\t");
			else
				System.out.print("x\t");
		}

	}
}
