package set;

public class mobile {
	private String modelname;
	private int price;
	private int ram;
	public mobile(String modelname,int price,int ram) {
		this.modelname=modelname;
		this.price=price;
		this.ram=ram;
	}
	public String getmodelname() {
		return this.modelname;
	}
	public int getprice() {
		return this.price;
	}
	public int grtram() {
		return this.ram;
	}
	public void setprice(int price){
		if(this.ram<6) {
			this.price=price;
		}
		else {
			throw new IllegalStateException("ram must be lower than before");	
		}	
	}
	@Override
	public String toString() {
		return "modelname="+modelname+",price="+price+",ram="+ram;
	}
	public int hashcode() {
		return this.price;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof mobile) {
			mobile parameterVale=(mobile)o;
			boolean result=this.price==parameterVale.price;
			return result;
		}
		return false;
		
	}
}
	


