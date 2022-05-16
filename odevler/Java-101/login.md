## Kullanıcı Parola Değiştirme
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = sc.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123"))
            System.out.print("\n" + userName + " hoşgeldiniz.");
        else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Hatalı şifre girdiniz! \n Şifrenizi sıfırlamak ister misiniz?\n 1-Evet \n 2-Hayır");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1: {
                    System.out.println(" Yeni Şifrenizi Giriniz");
                    newPassword = sc.nextLine();
                    if (newPassword.equals("java123"))
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    else
                        System.out.println("Şifre oluşturuldu.");
                    break;
                }
                case 2:
                    System.out.println("Şifre oluşturmak istemediniz. Tekrar deneyin.");
                    break;
                default:
                    System.out.println("Lütfen '1' veya '2' değerlerini seçiniz!");
            }
        } else {
            System.out.println("Kullanıcı adınızı yanlış girdiniz!");
        }
    }
}
