## Harmonic mean

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] list = {34, 55, 67, 44, 200, 55, 84};
        double harmonic, sum = 0;

        for (int i = 0; i < list.length; i++)
            sum += 1 / list[i];
        harmonic = list.length / sum;
        System.out.println(harmonic);

    }
}
