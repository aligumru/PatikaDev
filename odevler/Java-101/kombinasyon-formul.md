## Kombinasyon Hesaplayan Program
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ilk sayı : ");
        long n = sc.nextLong();
        System.out.print("ikinci sayı : ");
        long total = 1, total2 = 1, nEksiN2 = 1, n2 = sc.nextLong();

        if (n >= n2) {
            for (int i = 1; i <= n; i++)
                total = total * i;
            for (int i = 1; i <= n2; i++)
                total2 = total2 * i;
            for (int i = 1; i <= (n - n2); i++)
                nEksiN2 = nEksiN2 * i;
            
            System.out.println( total / (total2 * nEksiN2));

        } else System.out.println("Hata!! İlk Sayı İkinci Sayıdan Büyük Olmalı");


    }
}
