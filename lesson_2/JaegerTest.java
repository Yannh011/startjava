public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Striker Eureka");
		System.out.println("Егерь: " + jaegerOne.getModelName());
		jaegerOne.setHeight(76.2f);
		System.out.println("Рост: " + jaegerOne.getHeight());
		jaegerOne.setWeight(1.850f);
		System.out.println("Вес: " + jaegerOne.getWeight());
		jaegerOne.setKaijuKilled(11);
		System.out.println("Убитых Кайдзю: " + jaegerOne.getKaijuKilled());

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Crimson Typhoon");
		System.out.println("Егерь: " + jaegerTwo.getModelName());
		jaegerTwo.setHeight(76.2f);
		System.out.println("Рост: " + jaegerTwo.getHeight());
		jaegerTwo.setWeight(1.722f);
		System.out.println("Вес: " + jaegerTwo.getWeight());
		jaegerTwo.setKaijuKilled(7);
		System.out.println("Убитых Кайдзю: " + jaegerTwo.getKaijuKilled());
	}
}