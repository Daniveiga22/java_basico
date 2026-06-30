import java.util.Scanner;

public class OperacoesCopia {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] original = { 1, 2, 3, 4, 5 };
        int[] copia = new int[original.length];

        for (int i = 0; i < original.length; i++)
        {
            copia[i] = original[i];
        }

        copia[0] = 99;

        System.out.println("original[0] = " + original[0]);
        System.out.println("copia[0]    = " + copia[0]);

        input.close();
    }
}
