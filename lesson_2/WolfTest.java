public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("sex = " + wolfOne.sex);
		System.out.println("name = " + wolfOne.name);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}