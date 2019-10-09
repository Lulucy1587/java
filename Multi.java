public class Multiplication{
	
	public static void main(String args[]) {
		MultiActual actual=new MultiActual(2,1);
		MultiComplex complex= new MultiComplex(4,3,2,1);
		float ans=actual.multi1();
		System.out.println(ans);
		float ans1=complex.multi2();
		float ans2=complex.multi3();
		System.out.println(ans1+"+"+ans2+"i");
			
		}
		
	}


-------------------------------------------------------------------------------------------------------

public class MultiActual{

	float c;
		MultiActual(float a,float b) {
			
			c=a*b;
		}
		float multi1() {
			return c;
		}
		
}


-----------------------------------------------------------------------------------------------

public class MultiComplex{

	float p,q;
	MultiComplex(float a,float b,float c,float d) {
		p=a*c;
		q=b*d;
	}
	float multi2() {
		return p;
	}
	
	float multi3() {
		return q;
	}
}
	

