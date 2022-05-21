## EBOB-EKOK While Döngüsü
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = sc.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = sc.nextInt();
        int i = 1;

        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("EKOK : " + i);
                System.out.println("EBOB : " + (n1 * n2) / i);
                break;
            }
            i++;
        }


    }
}