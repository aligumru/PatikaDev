## Kullanıcın girdiği değerler ile üslü sayı hesaplama
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        long n = sc.nextLong();
        System.out.print("Üs olacak sayı : ");
        long m=sc.nextLong(),total=1;

        for (int i = 1; i <= m; i++)
            total *= n;

        System.out.println("Cevap : "+total);
    }
}
