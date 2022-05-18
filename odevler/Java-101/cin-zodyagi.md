## Çin Zodyağı Hesaplama
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year, mod;
        String burc = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = sc.nextInt();
        mod = year % 12;

        switch (mod) {
            case 0 -> burc = "Maymun";
            case 1 -> burc = "Horoz";
            case 2 -> burc = "Köpek";
            case 3 -> burc = "Domuz";
            case 4 -> burc = "Fare";
            case 5 -> burc = "Öküz";
            case 6 -> burc = "Kaplan";
            case 7 -> burc = "Tavşan";
            case 8 -> burc = "Ejderha";
            case 9 -> burc = "Yılan";
            case 10 -> burc = "At";
            case 11 -> burc = "Koyun";
            default -> System.out.print("Hatalı Veri Girdiniz!");
        }
        System.out.print("\nÇin Zodyağı Burcunuz : " + burc);
    }
}
