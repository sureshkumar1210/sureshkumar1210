package com.polymorphism;

public class TwoDmovies extends movie{
	int time=2;
	String listan="watching timing";
	@Override
	void playmusic() {
		System.out.println("TwoDmovies");
		System.out.println(listan+"--"+time);
	}
	@Override
	void playad() {
		System.out.println("2d add");
	}
	

}
