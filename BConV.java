
package AbstractFactory;

public class BConV implements BFruitAndVegetables {

	public Vegetables CreateV() {
		return new Cabbage();
	}
	public Fruit CreateF() {
		return null;
	}

}
