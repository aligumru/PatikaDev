## Basit Hesap Makinesi Java Kodları
Örnekte if yerine switch yapısı tercih edilmiştir.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        double a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = sc.nextInt();
        System.out.println("1-Toplama" + "\n" + "2-Çıkarma" + "\n" + "3-Çarpma" + "\n" + "4-Bölme");
        System.out.print("Seçiminiz : ");
        select = sc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Tanımsız : Bir sayı sıfıra bölünemez! ");
                        break;
                    default:
                        a = n1;
                        b = n2;
                        System.out.println("Bölme : " + (a / b));
                }
                break;
            default:
                System.out.println("Lütfen Yapmak İstediğiniz İşlemin Numarasını Doğru Seçin!");
        }

    }
}
