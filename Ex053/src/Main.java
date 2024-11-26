/*
53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int contador = 1, totHomens = 0, totMulheres = 0, mulheresComMaisDe20 = 0;
        float mediaGrupo = 0, mediaHomens = 0;

        while(contador <= 5){
            System.out.print("Informe a idade da " + contador + "º pessoa: ");
            int idade = leia.nextInt();

            System.out.printf("Informe o sexo da " + contador + " º pessoa [M/F]");
            String sexo = leia.next();

            if(sexo.equals("M") || sexo.equals("m")){
                totHomens++;
                mediaHomens += idade;
            }
            else if(sexo.equals("F") || sexo.equals("f")){
                totMulheres++;

                if(idade > 20){
                    mulheresComMaisDe20++;
                }
            }
            mediaGrupo += idade;
            contador++;
        }

        mediaHomens = mediaHomens / totHomens;
        mediaGrupo = mediaGrupo / 5;

        System.out.println("\n\nHomens cadastrados: " + totHomens);
        System.out.println("Mulheres cadastrados: " + totMulheres);
        System.out.println("Média de idade dos homens: " + mediaHomens);
        System.out.println("Média de grupo: " + mediaGrupo);
        System.out.println("Mulheres com mais de 20: " + mulheresComMaisDe20);

        leia.close();
    }
}