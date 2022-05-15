## Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m,vki;
        int kg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg=inp.nextInt();

        vki= kg/(m*m);

        System.out.print("\n"+"Vücut Kitle İndeksiniz : "+ vki);

    }
}
