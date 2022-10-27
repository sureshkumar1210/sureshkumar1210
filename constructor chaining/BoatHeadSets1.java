class BoatHeadSets1 {
	String color;
	int price;

	public BoatHeadSets1() {
		System.out.println("parent cons");
	}

	public BoatHeadSets1(String c, int p) {
		color = c;
		price = p;
		System.out.println("parent param cons "+color);
	}

	void playMusic() {
		System.out.println("playing song"+"\n"+color+"\n"+price);
	}
}
