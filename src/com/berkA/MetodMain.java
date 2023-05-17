package com.berkA;

import com.kaan.YardimciSinif; //import etmeyip assagiya bunu yazabilirsin ama sadece o satirda isler o yuzden import ediyoruz.

public class MetodMain {
	// static metodlar ve degiskenler sinifa baglidir, nesneye degil.
	static int sayi1 = 10;// static yazmazsan icerde gormuyor. static bellekte yer tutuyor o yuzden
							// bulabiliyor, yazmazsan goremiyor

	public static void main(String[] args) {
		System.out.println("Main calisiyor....");

		double sonuc = YardimciSinif.topla(2, 5, 8, 10, 32, 3);// degiskene gore kararini verip double calistiriyor
		System.out.println(sonuc);
		YardimciSinif.helloYaz();// public sinif oldugundan sinifi cagirip kullaniyosun static oldugundan

		// Math.ceil(sonuc); //static olan metodlar icin nesne yazmana gerek yok direk
		// kullanabiliyorsun

	}

}
