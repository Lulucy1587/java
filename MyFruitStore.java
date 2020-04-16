package Single;

import java.util.Hashtable;

public class MyFruitStore {
	private static Hashtable<Integer, MyFruit> fruittable=null;
	private static MyFruitStore fruitstore=new MyFruitStore(); 
	//¶öººÊ½
	
	private MyFruitStore() {
		fruittable=new Hashtable<Integer, MyFruit>();
	} 
	
	public static MyFruitStore GetFruitStore() {
		return fruitstore;
	}
	
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
	}
	public static MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit)fruittable.get(key);
		return (MyFruit)fruit.clone();
	}

}
