import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiploCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Índice do aray (0-4): ");
            int idx = input.nextInt();

            int[] nums = {10, 20, 30, 40, 50};
            System.out.println(nums[idx]);

            System.out.println(100 / nums[idx]);

        }catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro!");

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora do intervalo [0-4]!");

        }catch (ArithmeticException | RuntimeException e) {

            System.out.println("Erro inesperado : " + e.getClass().getSimpleName());

        }finally {

            input.close();
        }
    }
}
