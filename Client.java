

public class Client {
	public static void main(String[] args) {
		MealBuilder mb=(MealBuilder)XMLUtil.getBean();
		KFCWaiter waiter =new KFCWaiter();
//		MealBuilder mb=new SubMealBuilderA();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		
		System.out.println("�ײ�Ϊ��");
		System.out.println(meal.getFood());
		System.out.println(meal.getFood());
		System.out.println("ף���ò���죡");
	}
}
