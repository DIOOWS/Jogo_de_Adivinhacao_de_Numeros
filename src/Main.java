import java.util.Random;
import java.util.Scanner;


public class Main {

    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int tentativas = 0;
        int palpites;
        int maxTentativas = 5;
        String nome;

        System.out.println("=== === ===-Bem vindo ao Game-=== === ===");
        System.out.println();

        System.out.println("=== === ===-Tente adivinhar o número entre 1 e 100 você tem 5 tentativas- === === ===" );
        System.out.println();

        System.out.print("Agora digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println();
        System.out.print("Bem vindo " + nome + " Agora digite seu palpite abaixo");
        System.out.println();
        System.out.println();

        while (tentativas < maxTentativas){
            tentativas++;
            System.out.print("Tentativa " + tentativas + " de " + maxTentativas + ". Digite seu palpite: ");

            palpites = scanner.nextInt();

            if(palpites < numeroSecreto ){
                System.out.println("O número secreto é maior !" );
            } else if (palpites > numeroSecreto) {
                System.out.println("O número secreto é menor !");
            }else  {
                System.out.println("Parabéns você acertou o número: " + numeroSecreto);
                break;
            }

            if (tentativas == maxTentativas){
                System.out.println("Suas chances acabaram. O número secreto era " + numeroSecreto + ".");
                System.out.println("Tentativas excedidas! Você não acertou o número.");
            }
        }
        scanner.close();
    }
}