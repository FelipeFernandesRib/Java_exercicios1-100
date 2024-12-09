/*
55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.
 */

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random numAleatorio = new Random();

        int numSorteado = numAleatorio.nextInt(1,11);
        System.out.print("Tente acertar o número que computador sorteou: ");
        int numDoUsuario = leia.nextInt();

        int tentativas = 1;

        while (numDoUsuario != numSorteado && tentativas < 4) {
                System.out.print("Resposta errada tente novamente: ");
                numDoUsuario = leia.nextInt();
                tentativas++;
        }
        if (tentativas == 4) {
            System.out.print("\n\nSEU NÚMERO DE TENTATIVAS ACABOU\nNúmero sorteado: " + numSorteado);
        }
        else if (numDoUsuario == numSorteado) {
            System.out.print("ACERTOU!");
        }

        leia.close();
    }
}