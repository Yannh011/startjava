public class Circle {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			System.out.println(i);
		}
		
		int a = -6;
		while (a<=6) {
			System.out.println(a);
			a = a + 2;
		}
		
		int b = 13;
		int result = 11;
		do {
			result += b;
			System.out.println(result);
			b = b + 2;
		} while (b <= 20);
	}
}
