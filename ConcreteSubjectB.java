package Obv;

public class ConcreteSubjectB extends SubjectS {
	public ConcreteSubjectB() {
		super();
	}

	public void notifyObserver() {
		System.out.println("B目标发生了改变");
		for(ObserverO obs:observers)
		{
			obs.response();
		}

	}
}
