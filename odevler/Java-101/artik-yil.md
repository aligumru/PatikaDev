## Artık Yıl Hesaplama

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, mod;
        String burc = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = sc.nextInt();

        if (((year % 4) == 0) && ((year % 400) == 0))
            mod = 1;
        else
            mod = 0;

        switch (mod) {
            case 0 -> burc = " bir artık yıl değildir !";
            case 1 -> burc = " bir artık yıldır !";
            default -> System.out.print("Hatalı Veri Girdiniz!");
        }
        System.out.print("\n" + year + burc);
    }
}
