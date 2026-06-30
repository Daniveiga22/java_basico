import java.util.Scanner;

public class AvancadoMatriz {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[][] m = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.println(m[i][j] + "  ");
            }
            System.out.println();
        }
        int diag = 0;

        for (int i = 0; i < m.length; i++)
        {
            diag += m[i][i];
        }
        System.out.println("Diagonal : " + diag);

        input.close();
    }
}
