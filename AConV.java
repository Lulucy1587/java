package AbstractFactory;

public class AConV implements AFruitAndVegetables{
	public Vegetables CreateV() {
		return new Cabbage();
	}
	public Fruit CreateF() {
		return null;
	}
}
