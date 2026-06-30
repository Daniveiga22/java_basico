import java.util.Scanner;

public class OperacoesSomaMedia {
    static void main() {

        Scanner input = new Scanner(System.in);

        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5 };

        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / notas.length;

        System.out.println("Soma :  " + soma);
        System.out.println("Média : " + media);

        int acimaDaMedia = 0;
        for (double n : notas)
        {
            if (n > media) acimaDaMedia++;

        }
        System.out.println("Acima da média : " + acimaDaMedia);

        input.close();


    }
}
