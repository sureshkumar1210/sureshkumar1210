package oops;

public class Polymorphism {
	int priceA;
	int priceB;
	void BlasticChair() {
		System.out.println(priceA);
	}
	void Steelchair() {
		System.out.println(priceB);
	}
	void details(String type,double Quality) {
		System.out.println("chairType:"+type+"\n"+"chiar Quality:"+Quality);
	}
	void details(String type,float Quality) {
		System.out.println("chairType:"+type+"\n"+"chiar Quality:"+Quality);
	}

}
