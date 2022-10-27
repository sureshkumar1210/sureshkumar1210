class BassHeads1 extends BoatHeadSets1 {
	String type;
	int warranty;
	
	public BassHeads1() {
		super("red",450);
		System.out.println("child cons");
	}

	public BassHeads1(String t, int w) {
		super("green",400);
		type = t;
		warranty = w;
		System.out.println(type);
	}

	public static void main(String[] ar) {
		BassHeads1 bh = new BassHeads1("wired",1);
		BassHeads1 bh1 = new BassHeads1();
        bh.playMusic();
	}
}
