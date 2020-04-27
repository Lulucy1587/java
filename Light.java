package Fac;

public class Light {
	String position;
	public Light(String position) {
		this.position=position;
	}

	public void on() {
		System.out.println(position+"号灯开了");
	}
	public void off() {
		System.out.println(position+"号灯关了");
	}
}
