package Dec;

public class Cream extends Decorating {

	public Cream(IBirthdayCake birthdayCake) {
		super(birthdayCake);
	}
	public void PutCream() {
		System.out.println("Add Cream...");
	}
	public void Show() {
		System.out.println("Cream");
	}

}
