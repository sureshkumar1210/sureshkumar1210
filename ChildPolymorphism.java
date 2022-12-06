package oops;

public class ChildPolymorphism extends Polymorphism {
	@Override
	void BlasticChair() {
		System.out.println("Blastic Chairprice is:");
		System.out.println(priceA);
	}
	@Override
	void Steelchair() {
		System.out.println("Steel Chair price is:");
		System.out.println(priceB);
	}
	public static void main(String[] args) {
		ChildPolymorphism sk=new ChildPolymorphism();
		sk.priceA=800;
		sk.priceB=2500;
		sk.BlasticChair();
		sk.details("siting",50);
		sk.Steelchair();
		sk.details("sleeping",100);
		

	}

}
