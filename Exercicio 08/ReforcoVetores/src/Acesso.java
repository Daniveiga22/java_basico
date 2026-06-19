import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Exercício 02
        //Dado o vetor int[] v = {5, 3, 8, 1, 9, 4, 7}, imprima:
        //o primeiro elemento, o ultimo elemento (usando lenght)
        //e o elemento central.

        int [] v = { 5, 3, 8, 1, 9, 4 , 7 };

        System.out.println("Primeiro : " + v[0]);
        System.out.println("Último: " + v[v.length - 1]);
        System.out.println("Central: " + v[]);
    }
}
