import java.util.Scanner;

public class OperacoesBuscar {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] v = { 12, 5, 33, 7, 28, 14, 9 };
        int alvo = 28;
        int posicao = -1;

        for (int i = 0; i < v.length; i++)
        {
            if (v[i] == alvo)
            {
                posicao = 1;
                break;
            }
        }
        System.out.println(posicao == -1
        ? "Não Encontrado"
        : "Encontrado em v[" + posicao + "]");

        input.close();
    }

}
