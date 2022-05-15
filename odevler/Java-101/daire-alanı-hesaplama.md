## Yarıçapı ve merkez açısı girilen daire diliminin alanı
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,a,alan,pi=3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r=inp.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a=inp.nextInt();

        alan= (pi * (r*r) * a) / 360;

        System.out.println("\n"+"Dairenin alanı: "+ alan);

    }
}
