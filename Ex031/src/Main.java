/*
31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
*/

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static String maquinaJogou;
    public static String usuarioJogou;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        //Escolhendo número aleatório
        int numeroInteiro = random.nextInt(3);

        //Definindo com base no número aleatório qual será a opcão atribuida ao computador
        if (numeroInteiro == 0){
            maquinaJogou = "PEDRA";
        }
        if (numeroInteiro == 1){
            maquinaJogou = "PAPEL";
        }
        else if (numeroInteiro == 2){
            maquinaJogou = "TESOURA";
        }

        //Recebendo a opção do usuário
        System.out.print("Informe: \n1 para PEDRA\n2 para PAPEL\n3 para TESOURA\nopção: ");
        int opcao = leia.nextInt();

        if (opcao == 1){
            usuarioJogou = "PEDRA";
        }
        else if (opcao == 2){
            usuarioJogou = "PAPEL";
        }
        else if (opcao == 3){
             usuarioJogou = "TESOURA";
        }
         else {
            System.out.println("Opção inválida!");
            return;
        }

        //Definindo o resultado da partida
        if (maquinaJogou.equals("PEDRA") && usuarioJogou.equals("PEDRA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("EMPATE");
        }
        else if (maquinaJogou.equals("PEDRA") && usuarioJogou.equals("PAPEL")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você GANHOU");
        }
        else if(maquinaJogou.equals("PEDRA") && usuarioJogou.equals("TESOURA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você PERDEU");
        }

        else if (maquinaJogou.equals("PAPEL") && usuarioJogou.equals("PEDRA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você PERDEU");
        }
        else if (maquinaJogou.equals("PAPEL") && usuarioJogou.equals("PAPEL")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("EMPATE");
        }
        else if(maquinaJogou.equals("PAPEL") && usuarioJogou.equals("TESOURA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você GANHOU");
        }

        else if (maquinaJogou.equals("TESOURA") && usuarioJogou.equals("PEDRA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você GANHOU");
        }
        else if (maquinaJogou.equals("TESOURA") && usuarioJogou.equals("PAPEL")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("Você PERDEU");
        }
        else if(maquinaJogou.equals("TESOURA") && usuarioJogou.equals("TESOURA")){
            System.out.print("Você jogou " + usuarioJogou +
                    " e o computador jogou " + maquinaJogou + "\n");
            System.out.print("EMPATE");
        }

        leia.close();
    }
}