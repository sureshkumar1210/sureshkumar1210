package com.polymorphism;

public class ThreeDmovie extends movie{
	String audiotype="mp3";
	@Override
	void playmusic() {
		System.out.println("ThreeDmovie");
		System.out.println("Audiotype:"+" "+audiotype);

}
	@Override
	void playad() {
		System.out.println("3d add");
	}
}
