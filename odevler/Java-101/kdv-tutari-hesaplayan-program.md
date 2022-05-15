## Kdv Tutarı Hesaplayan Program
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvliTutar,kdvMiktari;

        Scanner inp = new Scanner(System.in);
        System.out.print("Para Miktarını Giriniz: ");
        tutar=inp.nextDouble();

        double kdvOrani = tutar>1000 ? 1.08 : 1.18;

        kdvliTutar= tutar*kdvOrani;
        kdvMiktari= kdvliTutar-tutar;
        System.out.println("\nKDV'siz Fiyat "+ tutar);
        System.out.println("KDV'li Fiyat "+kdvliTutar);
        System.out.println("KDV tutarı "+ kdvMiktari +"\n");
        System.out.println("KDV oranı "+kdvOrani+" alınmıştır.");
    }
}
