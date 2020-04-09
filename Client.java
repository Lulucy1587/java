package Copy;

public class Client {

	public static void main(String[] args) {
		MyFruit fu1=new Apple();
//		MyFruit fu2=fu1;
		MyFruit fu2=(Apple)fu1.clone();
		fu1.display();
		fu2.display();
		System.out.println("fu1:"+fu1.hashCode());
		System.out.println("fu2:"+fu2.hashCode());
	}
}
