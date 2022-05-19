## Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, s = 0, l = 0, m = 0;

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        if(k>0) {
            while (s < k) {
                s++;
                if ((s % 3 == 0) && (s % 4 == 0)) {
                    l += s;
                    m++;
                }
            }
        }else  System.out.println("Negatif Sayı Girdiniiz!");

        System.out.println(l / m);
    }
}
