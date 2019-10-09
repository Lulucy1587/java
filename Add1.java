
public class Add {
	
	public static void main(String args[]) {
		Actual actual=new Actual(1,2);
		Complex complex= new Complex(1,2,3,4);
		float ans=actual.add1();
		System.out.println(ans);
		float ans1=complex.add2();
		float ans2=complex.add3();
		System.out.println(ans1+"+"+ans2+"i");
			
		}
		
	}

------------------------------------------------------------------------------------------------

public class Actual{

	float c;
		Actual(float a,float b) {
			
			c=a+b;
		}
		float add1() {
			return c;
		}
		
}


---------------------------------------------------------------------------------------------

public class Complex{

	float p,q;
	Complex(float a,float b,float c,float d) {
		p=a+c;
		q=b+d;
	}
	float add2() {
		return p;
	}
	
	float add3() {
		return q;
	}
}
	