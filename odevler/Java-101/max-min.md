## En büyük ve en küçük sayıları bulan program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n1 = sc.nextInt();


        for (int i = 1; i <= n1; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int n2 = sc.nextInt();
            if (i == 1) {
                max = n2;
                min = n2;
            }
            if (n2 > max) {
                max = n2;
            } else if (n2 < min) {
                min = n2;
            }

        }
        System.out.println("En büyük sayı : " + max + "\nEn küçük sayı : " + min);


    }
}