import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Exercício 01
        //Declare um vetor de 5 inteiros chamado numeros, atribua os valores 10,
        //20, 30, 40 e 50 usando a sintaxe literal e imprima cada elemento com
        //seu índice no formato : numeros[0] = 10

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeros.length; i++){
            System.out.println("numeros[" + i +"] = " + numeros[i]);
    }
        input.close();
    }
}
