import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = sc.nextInt(), n1 = 0, n2 = 1, n3;

        System.out.print(n1 + ", " + n2);

        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
        }

    }
}