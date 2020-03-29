package SimpleFactory;

public class Client {
	public static void main(String[] args) {
		Factory fac=new Factory();
		Fruit fru=fac.CreateFruit("B");
		fru.eat();
	}

}
