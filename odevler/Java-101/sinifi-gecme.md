## Sınıfı Geçme Durumu
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, kim, fiz, tr, msc, sayac = 0;
        double toplam = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = sc.nextInt();
        if (0 < mat && mat < 100) {
            toplam += mat;
            sayac++;
        } else
            System.out.println("0 - 100 aralıgında girmediniz. Matematik notunuz ortalamaya dahil edilmeyecek!");

        System.out.print("Kimya Notunuzu Giriniz : ");
        kim = sc.nextInt();
        if (0 < kim && kim < 100) {
            toplam += kim;
            sayac++;
        } else
            System.out.println("0 - 100 aralıgında girmediniz. Kimya notunuz ortalamaya dahil edilmeyecek!");

        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = sc.nextInt();
        if (0 < fiz && fiz < 100) {
            toplam += fiz;
            sayac++;
        } else
            System.out.println("0 - 100 aralıgında girmediniz. Fizik notunuz ortalamaya dahil edilmeyecek!");

        System.out.print("Türkçe Notunuzu Giriniz : ");
        tr = sc.nextInt();
        if (0 < tr && tr < 100) {
            toplam += tr;
            sayac++;
        } else
            System.out.println("0 - 100 aralıgında girmediniz. Türkçe notunuz ortalamaya dahil edilmeyecek!");

        System.out.print("Müzik Notunuzu Giriniz : ");
        msc = sc.nextInt();
        if (0 < msc && msc < 100) {
            toplam += msc;
            sayac++;
        } else
            System.out.println("0 - 100 aralıgında girmediniz. Müzik notunuz ortalamaya dahil edilmeyecek!");

        if (toplam / sayac >= 55) {
            System.out.println("\nNot Ortalamanız : " + toplam / sayac + " Tebrikler Sınıfı Geçtiniz.");
        } else
            System.out.println("\nNot Ortalamanız : " + toplam / sayac + " Sınıfta Kaldınız.");

    }
}
