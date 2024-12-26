/*
82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float [] notas = new float[10];
        float media = 0, quantAlunosAcimaDaMedia = 0, maiorNota = Float.MIN_VALUE;
        StringBuilder posicaoMaiornota = new StringBuilder();

        for(int i = 0; i < notas.length; i++){
            System.out.print("Informe a nota do aluno: ");
            float nota = leia.nextFloat();
            notas[i] = nota;

            media += nota;

            if(nota > maiorNota){
                maiorNota = nota;
            }
        }
        media /= 10;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                quantAlunosAcimaDaMedia++;
            }
            if(notas[i] == maiorNota){
                posicaoMaiornota.append(i).append(", ");
            }
        }

        System.out.println("\nResultados: ");
        System.out.println("Média de notas da turma: " + media);
        System.out.println("Número de alunos acima da média: " + quantAlunosAcimaDaMedia);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Posições que a maior nota aparece: " + posicaoMaiornota);

        leia.close();
    }
}