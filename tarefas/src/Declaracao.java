import java.util.Scanner;

public class Declaracao {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        input.close();
    }
}
