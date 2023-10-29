import java.util.Random;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner auxiliar = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); //comando para gerar números aleatórios
        int tentativas = 0;

        System.out.println("Olá! Qual o seu nome? ");
        String nome = auxiliar.nextLine();

        System.out.println("Olá " + nome + "! Vamos brincar do jogo da advinhação de números!" +
                "\nPara brincar é simples, vou gerar um número aleatório que você deve advinhar!");

        while (tentativas < 5) {
            System.out.println("\nDigite um número entre 0 e 100");
            int numeroDigitado = auxiliar.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Você escolheu um número menor do que o desejado!");
            } else {
                System.out.println("Você escolheu um número maior do que o desejado!");
            }
        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }
    }
}
