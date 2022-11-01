package com.polymorphism;

public class Moviescreen {
	static void putads(movie m) {
		m.playad();
	}
//}

	public static void main(String[] args) {
		movie s1=new TwoDmovies();
		s1.playmusic();
		movie s2=new ThreeDmovie();
		s2.playmusic();
		TwoDmovies suresh=new TwoDmovies();
		ThreeDmovie kumar=new ThreeDmovie();
		putads(suresh);
		putads(kumar);

}
}