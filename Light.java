package Fac;

public class Light {
	String position;
	public Light(String position) {
		this.position=position;
	}

	public void on() {
		System.out.println(position+"�ŵƿ���");
	}
	public void off() {
		System.out.println(position+"�ŵƹ���");
	}
}
