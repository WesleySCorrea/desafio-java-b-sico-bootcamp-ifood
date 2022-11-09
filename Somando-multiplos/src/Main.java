import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N, soma;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        soma = 0;

        for(int i = A; i <= N ; i++) {
            if (i % A == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}