package day37_static;

public class Araba_Call {
    public static void main(String[] args) {

        //araba classindan nesne olusturucaz
        Araba nesne = new Araba();//new araba bizim cocntructor'imiz..

        System.out.println(nesne.model);
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
        //nesne icinden bilgi cagirmak icin nesne. kullaniyoruz

        //constructorlar classla ayni ismi tasimak zorunda
    }
}
