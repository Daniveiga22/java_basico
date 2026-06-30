import java.util.Scanner;

public class Modificacao {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] quad = new int[5];

        for (int i = 0; i < quad.length; i++)
        {
            quad[i] = i * i;
        }

        for (int n : quad)
        {
            System.out.println(n + " ");
        }

        input.close();
    }
}
