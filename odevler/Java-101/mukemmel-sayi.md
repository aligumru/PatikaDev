## Mükemmel Sayı Bulan Program
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = sc.nextInt(), toplam = 0;

        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n)
            System.out.println(n + " Mükemmel sayıdır.");
        else
            System.out.println(n + " Mükemmel sayı değildir.");
    }
}