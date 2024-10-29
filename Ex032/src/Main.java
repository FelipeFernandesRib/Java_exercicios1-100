/*
32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
*/

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random numAleatorio = new Random();

        int numSorteado = numAleatorio.nextInt(6);

        System.out.print("Tente acertar o número que computador sorteou: ");
        int numDoUsuario = leia.nextInt();

        while (numDoUsuario != numSorteado) {
            System.out.print("Resposta errada tente novamente: ");
            numDoUsuario = leia.nextInt();
        }

        System.out.print("ACERTOU!");

        leia.close();
    }
}