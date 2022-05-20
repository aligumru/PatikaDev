## Bir sayının basamak sayılarının toplamı

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int b,result=0,a=sc.nextInt();

        while (a != 0) {
            b=a%10;
            result+=b;
            a = a / 10;
        }
        System.out.print("Basamakların toplamı : "+result);
    }
}