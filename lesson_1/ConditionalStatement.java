public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 27;
		int height = 170;
		String man = "man";
		String firstLetter = "Y";
		
		if (age > 20) {
			System.out.println("Ты старше, чем он.");
		}
		
		if (man == man) {
			System.out.println("Ты мужчина.");
		}
		
		if (man != man) {
			System.out.println("Ты не мужчина.");
		}
		
		if (height < 180) {
			System.out.println("Ты маленький.");
		} else {
			System.out.println("Ты высокий.");
			}
		
		if (firstLetter == "M") {
			System.out.println("Неправильное начало имени.");
		} else if (firstLetter == "K") {
			System.out.println("Снова неправильное начало имени.");
		} else {
			System.out.println("Правильное начало имени.");
			}
	}
}
