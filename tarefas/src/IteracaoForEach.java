import java.util.Scanner;

public class IteracaoForEach {
    static void main() {

        Scanner input = new Scanner(System.in);

        String[] cidades = { "São Paulo", "Rio", "Curitiba", "Salvador", "Fortaleza" };

        for (String cidade : cidades)
        {
            System.out.println(cidade.toUpperCase());
        }

        input.close();
    }
}
