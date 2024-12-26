/*
85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String [] nomes = new String[5];
        char [] sexos = new char[5];
        float [] salarios = new float[5];
        int quantMulheresQueGanharMaisDe5k = 0;

        for(int i = 0; i < nomes.length; i++){
            System.out.print("informe um nome: ");
            String nome = leia.nextLine();
            nomes[i] = nome;

            System.out.print("Informe o sexo [F/M]: ");
            char sexo = leia.next().charAt(0);
            sexos[i] = sexo;

            System.out.print("Informe o valor da salário: ");
            float salario = leia.nextFloat();
            leia.nextLine();
            salarios[i] = salario;

            if(sexo == 'F' || sexo == 'f' & salario > 5000){
                quantMulheresQueGanharMaisDe5k++;
            }
        }

        if(quantMulheresQueGanharMaisDe5k > 0) {
            System.out.println("\nDados das mulheres que ganham mais de R$5 mil");
        }
        else{
            System.out.println("\nNenhuma mulher que ganha mais de R$5 mil foi cadastrada");
        }
        for(int i = 0; i < salarios.length; i++){
            if(sexos[i] == 'F' || sexos[i] == 'f' &&  salarios[i] > 5000){
                System.out.printf("\nNome: " + nomes[i] + "\nSalário R$:%.2f \n" , salarios[i]);
            }
        }
        leia.close();
    }
}