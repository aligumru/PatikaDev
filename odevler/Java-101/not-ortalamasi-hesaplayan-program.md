# Java 101 Not Ortalamasi Hesaplayan Program Odevi
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz: ");
        a=inp.nextDouble();
        System.out.println("Fizik Notunuzu Giriniz: ");
        b=inp.nextDouble();
        System.out.println("Kimya Notunuzu Giriniz: ");
        c=inp.nextDouble();
        System.out.println("Türkçe Notunuzu Giriniz: ");
        d=inp.nextDouble();
        System.out.println("Tarih Notunuzu Giriniz: ");
        e=inp.nextDouble();
        System.out.println("Müzik Notunuzu Giriniz: ");
        f=inp.nextDouble();
        System.out.println("Matematik Notunuzu Giriniz: ");

        double toplam =(a+b+c+d+e+f);
        double sonuc = toplam/6;
        boolean gectimi = sonuc>=60;
        String str = gectimi ? " Geçtiniz" : " Kaldınız";
        System.out.println("Ortalama Notunuz " + sonuc+ str);
    }
}
```
