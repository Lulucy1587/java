
public class Subtraction {
	
	public static void main(String args[]) {
		SubActual actual=new SubActual(2,1);
		SubComplex complex= new SubComplex(4,3,2,1);
		float ans=actual.sub1();
		System.out.println(ans);
		float ans1=complex.sub2();
		float ans2=complex.sub3();
		System.out.println(ans1+"+"+ans2+"i");
			
		}
		
	}

--------------------------------------------------------------------------------------------------

public class SubActual{

	float c;
		SubActual(float a,float b) {
			
			c=a-b;
		}
		float sub1() {
			return c;
		}
		
}

------------------------------------------------------------------------------------

public class SubComplex{

	float p,q;
	SubComplex(float a,float b,float c,float d) {
		p=a-c;
		q=b-d;
	}
	float sub2() {
		return p;
	}
	
	float sub3() {
		return q;
	}
}
	