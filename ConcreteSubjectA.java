package Obv;

public class ConcreteSubjectA extends SubjectS {
	public ConcreteSubjectA() {
		super();
	}

	public void notifyObserver() {
		System.out.println("A目标发生了改变");
		for(ObserverO obs:observers)
		{
			obs.response();
		}

	}

}
