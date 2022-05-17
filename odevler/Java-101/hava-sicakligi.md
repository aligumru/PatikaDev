## Hava Sıcaklığına Göre Etkinlik Önerme
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;
        Scanner sc = new Scanner(System.in);
        heat = sc.nextInt();
        String out = heat < 5 ? "Kayak Yapabilirsiniz." : (heat >= 5 && heat < 15 ? "Sinemaya Gidebilirsiniz" :
                (heat >= 15 && heat <= 25 ? "Piknik Yapabilirsiniz" : (heat > 25 ? "Yüzmeye Gidebilirsiniz" : "Hata")));
        System.out.println(out);
    }
}
