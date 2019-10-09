
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
