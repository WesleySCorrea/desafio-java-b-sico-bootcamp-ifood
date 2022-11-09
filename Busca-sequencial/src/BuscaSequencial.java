import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int X = leitor.nextInt();
        int Y = 0;

        for (int i = 0; i<elementos.length; i++) {
            if (X == elementos[i]) {
                System.out.print("Achei " + X + " na posicao " + i);
                Y = 1;
            }
        }
        if (Y == 0 ) {
            System.out.print("Numero " + X + " nao encontrado!");
        }
    }
}