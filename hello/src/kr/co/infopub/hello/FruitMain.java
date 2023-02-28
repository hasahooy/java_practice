package kr.co.infopub.hello;
import java.util.Arrays;
enum Fruit{
	Apple,Banana,MANGO;
}

public class FruitMain {

	public static void main(String[] args) {
		Fruit pear = Fruit.Apple;
		Fruit pear2 =Fruit.Banana;
		Fruit pear3 = Fruit.MANGO;
//		System.out.println(pear);
//		System.out.println(pear.name());
		Fruit[] fruit = Fruit.values();
		System.out.println(Arrays.toString(fruit));
		
	}

}
