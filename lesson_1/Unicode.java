import java.util.*;
public class Unicode {
	public static void main(String[] args) {
	Random rand_char = new Random();
	int number = 12615;
	int unicode = rand_char.nextInt(number) + 10111;
	char smile = (char)(unicode);
	System.out.println(unicode);
	System.out.println(smile);
	}
}