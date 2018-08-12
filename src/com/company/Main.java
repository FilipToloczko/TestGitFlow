package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WyswietlTekst("TEST");
        int [] testowaTablica = new int [] {3, 4, 5};
        int wynik = sumowanieablicy(testowaTablica);
        WyswietlTekst(Integer.toString(wynik));

    }
    public static void WyswietlTekst(String tekst){
        System.out.println(String.format("Tekst: " + tekst));
    }
    public static int sumowanieablicy(int [] tab){
        int suma = 0;
        for(int i =0; i < tab.length; i++){
    }
    return suma;
}
}
