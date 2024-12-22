/*
59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maiorIdade = 0, totHomens = 0, mulherMaisNova = Integer.MAX_VALUE;
        float mediaHomens = 0;

        boolean flag = true;

        while (flag){
            System.out.print("Informe o sexo [F/M]: ");
            String sexo = leia.nextLine();

            System.out.print("Informe a idade: ");
            int idade = leia.nextInt();
            leia.nextLine();

            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            if (sexo.equals("M") || sexo.equals("m")){
                totHomens++;
                mediaHomens += idade;
            }
            else if (sexo.equals("F") || sexo.equals("f")){
                if(mulherMaisNova == 0){
                    mulherMaisNova = idade;
                }
                else if (idade < mulherMaisNova){
                    mulherMaisNova = idade;
                }
            }

            System.out.print("Deseja cadastrar outra pessoa? [S/N]: ");
            String cadastro = leia.nextLine();

            if (cadastro.equalsIgnoreCase("N")){
                flag = false;
            }
        }
        mediaHomens /= totHomens;

        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Total de homens cadastrados: " + totHomens);
        if (mulherMaisNova == Integer.MAX_VALUE){
            System.out.println("Nenhuma mulher cadastrada");
        }
        else{
            System.out.println("Idade da mulher mais nova: " + mulherMaisNova);
        }
        System.out.println("Média de idade dos homens: " + mediaHomens);
    }
}