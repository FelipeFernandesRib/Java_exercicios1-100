/*
60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomePessoaMaisVelha = "", nomeMulherMaisJovem = "";
        float mediaIdadeGrupo = 0;
        int quantHomensTemMaisDe30Anos = 0, quantMulheresTemMenosDe18Anos = 0,
                maisVelhaAux = Integer.MIN_VALUE,contPessoas = 0, idadeAux = 0;

        boolean flag = true;

        while (flag) {
            System.out.print("Informe o nome: ");
            String nome = leia.nextLine();

            System.out.print("Informe a idade: ");
            int idade = leia.nextInt();
            leia.nextLine();

            System.out.print("Informe o sexo [F/M]: ");
            String sexo = leia.nextLine();

            contPessoas++;
            mediaIdadeGrupo += idade;

            if(idade > maisVelhaAux){
                nomePessoaMaisVelha = nome;
                maisVelhaAux = idade;
            }
            if(contPessoas == 1 && sexo.equalsIgnoreCase("F")){
                nomeMulherMaisJovem = nome;
                idadeAux = idade;
            }
            else if (contPessoas > 1 && sexo.equalsIgnoreCase("F") && idade < idadeAux){
                nomeMulherMaisJovem = nome;
            }
            if(sexo.equalsIgnoreCase("M") && idade > 30){
                quantHomensTemMaisDe30Anos ++;
            }
            if(sexo.equalsIgnoreCase("F") && idade < 18){
                quantMulheresTemMenosDe18Anos ++;
            }


            System.out.print("Deseja cadastrar outra pessoa? [S/N]: ");
            String cadastro = leia.nextLine();

            if (cadastro.equalsIgnoreCase("N")){
                flag = false;
            }
        }
        mediaIdadeGrupo /= contPessoas;

        System.out.println("\nResultado:");
        System.out.println("Nome da pessoa mais velha: " + nomePessoaMaisVelha);
        if(nomeMulherMaisJovem != "") {
            System.out.println("Nome da mulher mais jovem: " + nomeMulherMaisJovem);
        }
        else{
            System.out.println("Nenhuma mulher cadastrada");
        }
        System.out.println("Média de idade do grupo: " + mediaIdadeGrupo);
        if(quantHomensTemMaisDe30Anos > 0){
        System.out.println("Homens com mais de 30 anos: "+ quantHomensTemMaisDe30Anos);
        }
        else{
            System.out.println("Nenhum homem com mais de 30 anos foi cadastrado");
        }
        if(quantMulheresTemMenosDe18Anos > 0){
        System.out.println("Mulheres com menos de 18 anos: " + quantMulheresTemMenosDe18Anos);
        }
        else{
            System.out.println("Nenhuma mulher com menos de 18 anos foicadastrada");
        }

        leia.close();
    }
}