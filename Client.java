package Single;

public class Client {

	public static void main(String[] args) {
		MyFruit fu1=new Apple();
		MyFruit fu2=new Banana();
		
		MyFruitStore mfs1=MyFruitStore.GetFruitStore();
		mfs1.Add(1, fu1);
		mfs1.Add(2, fu2);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitStore mfs2=MyFruitStore.GetFruitStore();
		
		MyFruit fruit=(MyFruit)MyFruitStore.Get(1);
		fruit.display();
		System.out.println("mfs1:"+mfs1.toString());
		System.out.println("mfs2:"+mfs2.toString());
		//两个水果商店是一样的地址，是因为在水果店类中用private将构造函数new隐藏了，想要得到水果店只能用GetFruitStore()方法
		
		
	}
}
