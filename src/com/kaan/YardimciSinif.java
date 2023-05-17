package com.kaan;

public class YardimciSinif {
	// public: butun packagelardan erisimi saglar.
	// protected: ayni package icindeki tum classlardan erisimi saglar(default)
	// private : ayni class icinden erisim saglar.
	public static int topla(int a, int b) {
		return a + b;
	}

	protected static double topla(double a, double b) {
		return (a + b);
	}

	public static int topla(int... sayilar) {// var args ile girilen tum sayilari toplatabilirsin sinir belirlemeden
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static int topla(int a, int b, int c) {

		return a + b + c;

	}

	public static void helloYaz() { // static yapman lazim metodu static bir mainin icerisinde calistirmak
		// istiyorsan
		System.out.println("Hello");
		// topla(1, 0, 0)//private tanimlarsan sadece o classta calisir
	}
}
