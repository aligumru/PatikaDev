Switc ile Atm Ödevi

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int a, balance = 1500;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = sc.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = sc.nextLine();

        if ((userName.equals("patika") && (password.equals("java123")))) {
            System.out.println("\nKodluyoruz Bankasına Hoşgeldiniz. ");
            do {

                System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz.");
                System.out.println("""
                        1- Para Yatırma
                        2- Para Çekme
                        3- Bakiye Sorgula
                        4- Çıkış Yap""");

                a = sc.nextInt();

                switch (a) {
                    case 1 -> {
                        System.out.print("Para Miktarı : ");
                        int price = sc.nextInt();
                        balance += price;
                    }
                    case 2 -> {
                        System.out.print("Para Miktarı : ");
                        int price2 = sc.nextInt();
                        if (price2 > balance) {
                            System.out.println("Bakiye Yetersiz");
                        } else {
                            balance -= price2;
                        }
                    }
                    case 3 -> System.out.println("Bakiyeniz : " + balance);
                    default -> System.out.println("Hatalı seçim yaptınız!");
                }
            } while (a != 4);
            System.out.println("Tekrar görüşmek üzere.");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre.");
        }
    }
}