import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); 
        int tentativas = 0;
        int numeroDigitado = 0;
        
        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;
            
            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
             System.out.println("Você nao conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}