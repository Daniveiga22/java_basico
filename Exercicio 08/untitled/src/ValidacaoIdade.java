import java.util.Scanner;

public class ValidacaoIdade {
    static void validarIdade(int idade) throws IllegalArgumentException{

        if(idade < 0)
            throw new IllegalArgumentException("Idade negativa: "+idade);

        if(idade > 150)
            throw new IllegalArgumentException("Idade improvável: " + idade);

        System.out.println("Idade válida: " + idade);
    }

    static int calcularAno(int idade){
        validarIdade(idade);
        return 2025 - idade;
    }

    public static void main(String[] args) {
        int[] idades = {25, -5, 200, 0};

        for (int i : idades) {
            try {
                System.out.printf("Idade %4d -> nasceu em %d%n", i, calcularAno(i));
            }catch (IllegalArgumentException e) {
                System.out.printf("Idade %4d -> INVÁLIDA: %s%n", i, e.getMessage());
            }
        }

    }
}
