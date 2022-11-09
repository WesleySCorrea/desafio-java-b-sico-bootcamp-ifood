import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();
        int somatório = 0;

        for (int i = N; i > 0 ; i--) {
            somatório += i;
        }

        System.out.print(somatório);

    }
}