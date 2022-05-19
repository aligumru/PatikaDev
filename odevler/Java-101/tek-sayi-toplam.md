## 4'e Tam Bölünen Sayıları Toplama
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, total = 0;
        Scanner sc = new Scanner(System.in);

        do {
            n = sc.nextInt();
            if (n % 4 == 0)
                total += n;
        } while (n % 2 == 0);
        System.out.println("\nToplam : " + total);
    }
}
