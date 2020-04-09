

public class Client {
	public static void main(String[] args) {
		MealBuilder mb=(MealBuilder)XMLUtil.getBean();
		KFCWaiter waiter =new KFCWaiter();
//		MealBuilder mb=new SubMealBuilderA();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		
		System.out.println("Ì×²ÍÎª£º");
		System.out.println(meal.getFood());
		System.out.println(meal.getFood());
		System.out.println("×£ÄúÓÃ²ÍÓä¿ì£¡");
	}
}
