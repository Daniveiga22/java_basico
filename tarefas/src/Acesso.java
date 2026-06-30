import java.util.Scanner;

public class Acesso {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] v = { 5, 3, 8, 1, 9, 4, 7 };

        System.out.println("Primeiro : " + v[0]);
        System.out.println("Último :   " + v[v.length - 1]);
        System.out.println("Central :  " + v[v.length / 2]);

        input.close();
    }
}
