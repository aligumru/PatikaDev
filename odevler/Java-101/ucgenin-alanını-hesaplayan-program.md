## Üç Kenar Uzunluğu Alınan Üçgenin Alanı
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,alan,u;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        a=inp.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        b=inp.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        c=inp.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        
        String ucgenMi = alan>0 ? "" : " Girdiğiniz Değerler Bir Üçgen Oluşturmadı!! ";
        System.out.println("\n"+"Üçgenin Alanı : "+ alan+ ucgenMi);

    }
}

```
`String ucgenMi =alan>0 ? "a" : "b"` alan sıfırdan büyükse ucgenMi="a", değilse ucgenMi="b" karakterini atar.