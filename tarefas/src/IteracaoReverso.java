import java.util.Scanner;

public class IteracaoReverso {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] v = { 10, 20, 30, 40, 50 };

        for (int i = v.length - 1; i >= 0; i--)
        {
            System.out.println(v[i] + " ");
        }

        input.close();
    }
}
