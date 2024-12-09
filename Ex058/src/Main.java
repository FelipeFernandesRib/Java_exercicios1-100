/*
58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, totAlunos = 0;
        float media = 0;
        boolean flag = true;

        while (flag){
            System.out.print("Informe a idade do aluno: ");
            idade = leia.nextInt();

            totAlunos++;
            media += idade;

            if (idade == 999){
                flag = false;
            }
        }
        media /= totAlunos;
        System.out.print("Total de alunos: " + totAlunos + "\nMedia de idade do grupo: " + media);
        leia.close();
    }
}