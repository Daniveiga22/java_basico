import java.util.Scanner;

public class TryCatchBasico {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dividendo: ");
        int a = input.nextInt();
        System.out.println("Divisor: ");
        int b = input.nextInt();

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());


        } finally {
            System.out.println("Operaçao encerrada.");
        }

        input.close();

    }

}
