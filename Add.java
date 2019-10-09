
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

