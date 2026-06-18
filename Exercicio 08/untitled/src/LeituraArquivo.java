import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    static String lerPrimeiraLinha(String caminho) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(caminho));
        try {
            return br.readLine();

        }finally {
            br.close();
        }
    }
}

public static void main(String[] args) {

    try {
        String linha = lerPrimeiraLinha("dados.txt");
        System.out.println("Primeira linha: " + linha);

    }catch (FileNotFoundException e) {

        System.out.println("Arquivo não encontrado: " + e.getMessage());

    }catch (IOException e) {
        System.out.println("Erro de leitura: " e.getMessage());
    }
}