## Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 4, j = 5; i <= n; i *= 4) {
            System.out.print(i + "," + j + ",");
            j *= 5;
        }
    }
}
