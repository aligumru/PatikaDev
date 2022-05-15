## Manav Kasa Programı
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,armut=2.14,b,elma=3.67,c,domat=1.1,d,muz=0.95,e,ptlcn=5,tutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        a=inp.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        b=inp.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        c=inp.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        d=inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        e=inp.nextDouble();

        tutar=a*armut+b*elma+c*domat+d*muz+e*ptlcn;
        System.out.print("\n"+"Toplam Tutar : "+ tutar +" TL");

    }
}
