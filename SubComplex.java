
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
	