## Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

* Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
* Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
* Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
* Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
* Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar = 0.0, km, age, price = 0.1;
        int type;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = sc.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        age = sc.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        type = sc.nextInt();

        switch (type) {
            case 1 -> tutar = km * price;
            case 2 -> tutar = (km * price * 2) * 0.8;
            default -> System.out.println("Hatalı Veri Girdiniz!");
        }

        if (age < 12)
            System.out.println("\nToplam Tutar = " + (tutar * 0.5) + " TL");
        else if (age >= 12 && age < 24)
            System.out.println("\nToplam Tutar = " + (tutar * 0.9) + " TL");
        else if (age > 65)
            System.out.println("\nToplam Tutar = " + (tutar * 0.7) + " TL");

        else if (age >= 24 && age < 65)
            System.out.println("\nToplam Tutar = " + (tutar) + " TL");
        else
            System.out.println("\nHatalı Veri Girdiniz!");
    }
}
