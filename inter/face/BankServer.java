package inter.face;

public class BankServer {

	public static void main(String[] args) {
		Bank suresh=new SBI();
		Bank kumar=new KVB();
		//suresh.RateofInterest();
		//kumar.RateofInterest();
		//float venkat=suresh.RateofInterest();
		System.out.println(suresh.RateofInterest());
		System.out.println(kumar.RateofInterest());
	}

}
